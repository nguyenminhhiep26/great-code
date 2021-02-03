CREATE DATABASE PHAN2_09
GO
USE PHAN2_09
GO

CREATE TABLE Toys
(
ProductCode varchar(5) Primary Key,
Name varchar(30),
Category varchar(30),
Manufaturer varchar(40),
AgeRange varchar(15),
UnitPrice money,
Netweight int,
QtyOnHand int
)
GO 

INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T111','OTO1','Lap Ghep','Minh Hiep1','3-5 tuoi', $50.000, 500, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T112','OTO2','Lap Ghep1','Minh Hiep2','3-6 tuoi', $60.000, 400, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T113','OTO3','Lap Ghep2','Minh Hiep3','3-7 tuoi', $70.000, 600, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T114','OTO4','Lap Ghep3','Minh Hiep4','3-8 tuoi', $80.000, 700, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T115','OTO5','Lap Ghep4','Minh Hiep5','3-9 tuoi', $90.000, 50, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T116','OTO6','Lap Ghep5','Minh Hiep6','3-10 tuoi', $150.000, 540, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T117','OTO7','Lap Ghep6','Minh Hiep7','3-11 tuoi', $520.000, 450, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T118','OTO8','Lap Ghep7','Minh Hiep8','3-12 tuoi', $350.000, 350, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T119','OTO9','Lap Ghep8','Minh Hiep9','3-13 tuoi', $450.000, 150, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T110','OTO10','Lap Ghep9','Minh Hiep10','3-14 tuoi', $550.000, 950, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T121','OTO11','Lap Ghep10','Minh Hiep11','3-15 tuoi', $650.000, 750, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T122','OTO12','Lap Ghep11','Minh Hiep12','3-16 tuoi', $750.000, 350, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T123','OTO13','Lap Ghep12','Minh Hiep13','3-17 tuoi', $850.000, 550, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T124','OTO14','Lap Ghep13','Minh Hiep14','3-18 tuoi', $950.000, 650, 100)
INSERT INTO Toys(ProductCode,Name,Category,Manufaturer,AgeRange,UnitPrice,Netweight,QtyOnHand) VALUES ('T124','OTO15','Lap Ghep14','Minh Hiep14','3-19 tuoi', $510.000, 750, 100)
go 

SELECT * FROM Toys
GO

--2. Viết câu lệnh tạo Thủ tục lưu trữ có tên là HeavyToys cho phép liệt kê tất cả các loại đồ chơi có trọng lượng lớn hơn 500g.
CREATE PROCEDURE HeavyToys AS
SELECT * FROM Toys
WHERE Netweight > 500
go

EXEC HeavyToys
GO

--3. Viết câu lệnh tạo Thủ tục lưu trữ có tên là PriceIncreasecho phép tăng giá của tất cả các loại đồ chơi lên thêm 10 đơn vị giá.
CREATE PROCEDURE PriceIncrease AS
SELECT * FROM Toys
WHERE UnitPrice= UnitPrice + 10
GO 

EXEC PriceIncrease
GO

--4. Viết câu lệnh tạo Thủ tục lưu trữ có tên là QtyOnHand làm giảm số lượng đồ chơi còn trong của hàng mỗi thứ 5 đơn vị.
CREATE PROCEDURE QtyOnHand AS
SELECT * FROM Toys
WHERE QtyOnHand= QtyOnHand - 5
GO

EXEC QtyOnHand 
GO




sp_helptext HeavyToyssp_helptext PriceIncreasesp_helptext QtyOnHandSELECT OBJECT_DEFINITION (OBJECT_ID(N'HeavyToys')) AS [ThucHienLenh]; SELECT OBJECT_DEFINITION (OBJECT_ID(N'PriceIncrease')) AS [ThucHienLenh]; SELECT OBJECT_DEFINITION (OBJECT_ID(N'QtyOnHand')) AS [ThucHienLenh];---------------------2---------------------EXECUTE sp_depends HeavyToysEXECUTE sp_depends PriceIncreasechoEXECUTE sp_depends QtyOnHandGO---------------------3------------------------ALTER PROCEDURE PriceIncrease ASUPDATE Toys SET UnitPrice=UnitPrice+5000GOSELECT *FROM ToysGOALTER PROCEDURE QtyOnHand ASUPDATE Toys SET QtyOnHand=QtyOnHand-5GOSELECT *FROM ToysGO----------------------4--------------------------CREATE PROCEDURE SpecificPriceIncrease ASUPDATE Toys SET UnitPrice=UnitPrice+QtyOnHandGOSELECT *FROM ToysGO----------------------5---------------------------ALTER PROCEDURE SpecificPriceIncrease @number int OUTPUT ASUPDATE Toys SET UnitPrice=UnitPrice+QtyOnHandSELECT ProductCode,Name,UnitPrice as Price,QtyOnHand FROM ToysWHERE QtyOnHand>0SELECT @number = @@RowcountGODECLARE @num intEXECUTE SpecificPriceIncrease @num OUTPUTPRINT @num-----------------------6--------------------------------ALTER PROCEDURE SpecificPriceIncrease@number int OUTPUT ASUPDATE Toys SET UnitPrice=UnitPrice+QtyOnHandSELECT ProductCode,Name,UnitPrice as Price,QtyOnHand FROM ToysWHERE QtyOnHand>0SELECT @number = @@Rowcountexecute HeavyToys----------------------7----------------------------------------PERFECT----------------------8----------------------------------------DROP PROCEDURE HeavyToysDROP PROCEDURE PriceIncreaseDROP PROCEDURE QtyOnHand