--bài1
CREATE DATABASE Lab11
GO
USE Lab11
go
CREATE VIEW ProductList
AS
SELECT ProductID, Name FROM AdventureWorks2019.Production.Product
GO
SELECT * FROM ProductList
GO
--bài2
CREATE VIEW SalesOrderDetail
AS
SELECT pr.ProductID, pr.Name, od.UnitPrice, od.OrderQty,
od.UnitPrice*od.OrderQty as [Total Price]
FROM AdventureWorks2019.Sales.SalesOrderDetail od
JOIN AdventureWorks2019.Production.Product pr  ON od.ProductID=pr.ProductID
GO
SELECT * FROM SalesOrderDetail
GO

--bài3
--Tạo khung hình lấy ra thông tin cơ bản trong bảng Person.Contact
USE AdventureWorks2019
CREATE VIEW V_Contact_Info AS
SELECT FirstName, MiddleName, LastName
FROM Person.Person
GO
--Tạo khung nhìn lấy ra thông tin về nhân viên 
CREATE VIEW V_Employee_Contact AS
SELECT p.FirstName, p.LastName, e.BusinessEntityID, e.HireDate
FROM HumanResources.Employee e
JOIN Person.Person AS p ON e.BusinessEntityID = p.BusinessEntityID;
GO
--Xem một khung hình
SELECT * FROM V_Employee_Contact
GO
--Thay đổi khung hình V_Employee_Contact bằng viết thêm cột Bỉthdate
ALTER VIEW V_Employee_Contact AS
SELECT p.FirstName, p.LastName, e.BusinessEntityID, e.HireDate, e.Birthdate
FROM HumanResources.Employee e
JOIN Person.Person AS p ON e.BusinessEntityID = p.BusinessEntityID
WHERE p.FirstName like '%B';
GO

--Xóa một khung hình 
DROP VIEW V_Contact_Info
GO

--Xem định nghĩa khung hình V_Employee_Contact
EXECUTE sp_helptext 'V_Employee_Contact'
GO

--Xem các thành phần mà khung hình phụ thuộc
EXECUTE sp_depends 'V_Employee_Contact'
GO

--Tạo khung hình ẩn mà định nghĩa bị ẩn đi ( không xem được định nghiwxa khung nhìn)
CREATE VIEW OederRejects
WITH ENCRYPTION
AS
SELECT PurchaseOrderID, ReceivedQty, RejectedQty,
RejectedQty / ReceivedQty AS RejectRatio, DueDate
FROM Purchasing.PurchaseOrderDetail
WHERE ReceivedQty / ReceivedQty > 0
AND DueDate > CONVERT(DATETIME,'20020526',101);
GO

--Không xem được định nghĩa khung hình V_Contact_Info
sp_helptext 'OrderRejects'
GO

--Thay đổi khung nhìn thêm tùy chọn CHECK OPTION
ALTER VIEW V_Employee_Contact AS
SELECT p.FirstName, p.LastName, e.BusinessEntityID, e.HireDate
FROM HumanResources.Employee e
JOIN Person.Person AS p ON e.BusinessEntityID = p.BusinessEntityID
WHERE p.FirstName LIKE 'A%'
WITH CHECK OPTION
GO
SELECT * FROM V_Employee_Contact
GO

--Cập nhật được khung hình khi FirstName bắt đầu bằng ký tự 'A'
UPDATE V_Employee_Contact SET FirstName='Atest' Where LastName='Amy'
GO

--KHông cập nhật được khung nhìn khi FirstName bắt đầu băng ký tự khác'A'
UPDATE V_Employee_Contact SET FirstName='BCD' WHERE LastName='Atest'
GO

--Phải xóa khung nhìn trước
DROP VIEW V_Contact_Info
GO

--Tạo khung hình có giản đồ 
CREATE VIEW V_Contact_Info WITH SCHEMABINDING AS
SELECT FirstName, MiddleName, LastName, EmailAddress
FROM Person.Contact
GO

--Không thể truy vấn được khung hình có tên là V_Contact_Info
SELECT*FROM V_Contact_Info
GO

--Tạo chỉ mục duy nhất trên cột EmailAddress trên khung nhìn V_Contact_Info
CREATE UNIQUE CLUSTERED INDEX IX_Contact_Email
ON V_Contact_Info(EmailAddress)
GO
--Thực hiện đổi tên khung hình
exec sp_rename V_Contact_Info, V_Contact_Infomation
GO
--Truy vấn khung hình
SELECT* FROM V_Contact_Infomation
GO

--Không thể thêm bản ghi vào khung hình
--vì có cột không cho phép Null trong bảng Contact
INSERT INTO V_Contact_Infomation values ('ABC','DEF','GHJ', 'abc@yahoo.com')
GO
--Không thể cóa bản ghi của khung hình V_Contact_Infotion
--vì bảng Person.Contact còn có các khóa ngoại
DELETE FROM V_Contact_Infotion WHERE LastName='Gilbert' and FirstName='Guy'
GO



