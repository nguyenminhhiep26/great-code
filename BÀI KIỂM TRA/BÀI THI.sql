CREATE DATABASE KT
GO
USE KT 
GO

CREATE TABLE Categories
(
CateID char(6) Primary Key,
CateName nvarchar(100) Not null,
Description nvarchar(200)
)
GO

INSERT INTO Categories(CateID,CateName,Description) VALUES ('FPT11','RAM','RAT TOT')
INSERT INTO Categories(CateID,CateName,Description) VALUES ('FPT12','CPU','TOT')
INSERT INTO Categories(CateID,CateName,Description) VALUES ('FPT13','HDD','TUYET VOI')
INSERT INTO Categories(CateID,CateName,Description) VALUES ('FPT14','DVD','KHA TOT')
INSERT INTO Categories(CateID,CateName,Description) VALUES ('FPT15','VDV','KHA TOT')
INSERT INTO Categories(CateID,CateName,Description) VALUES ('FPT16','DCD','KHA TOT')
GO

SELECT * FROM Categories
GO

CREATE TABLE Parts
(
PartID INT PRIMARY KEY IDENTITY,
PartName nvarchar(100) Not null,
CateID char(6) ,
Description nvarchar(1000),
Price money not null ,
Quantity INT null,
Warranty INT null,
Photo nvarchar(200)
)

GO

INSERT INTO Parts(PartName,CateID,Description,Price,Quantity,Warranty,Photo) VALUES ('BNT','FPT11','DANG CHAY TOT',$50,10,12,'photo/nophoto1.png')
INSERT INTO Parts(PartName,CateID,Description,Price,Quantity,Warranty,Photo) VALUES ('BNN','FPT12','DANG CHAY BINH THUONG',$200,100,12,'photo/nophoto2.png')
INSERT INTO Parts(PartName,CateID,Description,Price,Quantity,Warranty,Photo) VALUES ('TPC','FPT13','DANG CHAY RAT TOT',$150,1000,12,'photo/nophoto3.png')
INSERT INTO Parts(PartName,CateID,Description,Price,Quantity,Warranty,Photo) VALUES ('POP','FPT14','THU CHAY',$80,100,12,'photo/nophoto4.png')
INSERT INTO Parts(PartName,CateID,Description,Price,Quantity,Warranty,Photo) VALUES ('POP','FPT14','THU CHAY',$90,120,12,'photo/nophoto5.png')
INSERT INTO Parts(PartName,CateID,Description,Price,Quantity,Warranty,Photo) VALUES ('POP','FPT14','THU CHAY',$110,160,12,'photo/nophoto6.png')
GO

SELECT * FROM Parts
GO

--4. Liệt kê tất cả các bộ phận trong cửa hàng với giá > 100 $.
SELECT * FROM Parts
WHERE Price > $100
GO

--5. Liệt kê tất cả các phần của danh mục ‘CPU’.
SELECT * FROM Categories
WHERE CateName = 'CPU';
GO

--6. Tạo một dạng xem v_Parts chứa các thông tin sau (PartID, PartName, CateName, Giá, Số lượng) từ bảng Bộ phận và Danh mục.
CREATE VIEW v_Parts AS
SELECT PartID, PartName,CateName,Price, Quantity
FROM Parts, Categories
GO

SELECT * FROM v_Parts
GO

--7. Tạo view v_TopParts khoảng 5 phần với giá đắt nhất.
CREATE VIEW v_TopPartesID AS
SELECT TOP(5) Price
FROM Parts
WHERE Price > 50
ORDER BY Price ASC
Go

SELECT Price FROM Parts
GO