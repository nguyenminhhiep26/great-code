CREATE DATABASE ASM2
GO
USE ASM2
GO
--Bảng sản phẩm 
CREATE TABLE Productes(
ProID int,
Name varchar(40),
Motahang varchar(40),
Namehang varchar(40),
Donvi varchar(40),
Gia money,
SoLuong int,
CatID int
)
GO

INSERT INTO Productes(ProID,Name,Motahang,Namehang,Donvi,Gia,SoLuong,CatID) VALUES (123,'MAY TINH T450','MAY NHAP CU','Asus','Chiec',$1000, 10, 111)
INSERT INTO Productes(ProID,Name,Motahang,Namehang,Donvi,Gia,SoLuong,CatID) VALUES (456,'DIEN THOAI NOKIA5670','DIEN THOAI DANG HOT','Asus','Chiec',$200, 200, 222)
INSERT INTO Productes(ProID,Name,Motahang,Namehang,Donvi,Gia,SoLuong,CatID) VALUES (789,'MAY IN SAMSUNG450','MAY IN DANG LOAI BINH','Asus','Chiec',$100, 10, 333)

GO

SELECT * FROM Productes
GO

--BẢNG THỂ LOẠI
CREATE TABLE Category(
CatID int,
Namehang varchar(40)
)
GO

INSERT INTO Category(CatID,Namehang) VALUES (111, 'Asus')
INSERT INTO Category(CatID,Namehang) VALUES (222, 'TORANO')
INSERT INTO Category(CatID,Namehang) VALUES (333, 'OUT')
GO 

SELECT * FROM Category
GO

--BẢNG HÃNG HÀNG
CREATE TABLE GOODS(
GOODSID int,
Namehang varchar(40),
ADDRESS varchar(40),
Tel int
)
GO

INSERT INTO GOODS(GOODSID,Namehang,ADDRESS,Tel) VALUES (789,'Asus', 'USE', 983232)
GO

SELECT * FROM GOODS
GO

--4 .các câu lênh truy vấn để
--a) Hiển thị tất cả các hãng sản xuất.
SELECT Namehang FROM Category
GO
--b) Hiển thị tất cả các sản phẩm.
SELECT NAME FROM Productes
GO

--5 Viết các câu lệnh truy vấn để
--a) Liệt kê danh sách hãng theo thứ thự ngược với alphabet của tên.
SELECT * FROM Category
ORDER BY  Namehang DESC
GO
--b) Liệt kê danh sách sản phẩm của cửa hàng theo thứ thự giá giảm dần.
SELECT * FROM Productes
ORDER BY Name DESC
GO
--c) Hiển thị thông tin của hãng Asus.
SELECT * FROM GOODS
GO
--d) Liệt kê danh sách sản phẩm còn ít hơn 11 chiếc trong kho
SELECT * FROM Productes
WHERE SoLuong < 11
GO
--e) Liệt kê danh sách sản phẩm của hãng Asus
SELECT Namehang FROM Category
GO

--6 Viết các câu lệnh truy vấn để lấy
--a) số hãng sản phẩm mà cửa hàng có
SELECT GOODSID FROM GOODS
GO
--b) số mặt hàng mà cửa hàng bán 
SELECT Name FROM Productes
GO
--C) Tổng số loại sản phẩm của mỗi hãng hàng có trong cửa hàng
SELECT sum(ProID)FROM Productes
GO
--d) Tổng số đầu sản phẩm của toàn cửa hàng
SELECT sum(ProID) FROM Productes
WHERE ProID <=1
GO

--7. Thay đổi những thay đổi sau trên cơ sở dữ liệu
--a) Viết câu lệnh để thay đổi trường giá tiền của từng mặt hàng là dương(>0)
update Productes set Gia = $3000
where ProID = 2
SELECT * FROM Productes
GO
--b) Viết câu lệnh để thay đổi số điện thoại phải bắt đầu bằng 0.
update GOODS set Tel = 0
SELECT * FROM GOODS
GO
--c) Viết các câu lệnh để xác định các khóa ngoại và khóa chính của các bảng.


