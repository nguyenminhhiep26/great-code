USE  Task5
GO
--bảng sản phẩm
CREATE TABLE Product(
STT INT IDENTITY,
TENHANG varchar(40),
MOTAHANG varchar(40),
DONVI varchar(40),
GIA money
)
GO

INSERT INTO Product(TENHANG,MOTAHANG,DONVI,GIA) VALUES ('May Tinh T450', 'May nhap moi 456', 'Chiec', 1000)
INSERT INTO Product(TENHANG,MOTAHANG,DONVI,GIA)  VALUES ('Đien Thoai Nokia5670','Dien thoai dang hot 123 ', 'Chiec',200)
INSERT INTO Product(TENHANG,MOTAHANG,DONVI,GIA)  VALUES ('May in SAMSung 450', 'May in dang e 111','Chiec',100)
GO 

SELECT *FROM Product
GO

--bảng thể loại
CREATE TABLE Category(
STT INT IDENTITY,
TENSP varchar(40)
)
GO

INSERT INTO Category(TENSP) VALUES ( 'May Tinh')
INSERT INTO Category(TENSP) VALUES ( 'Dien Thoai')
INSERT INTO Category(TENSP) VALUES ( 'May In')
GO

SELECT * FROM Category
GO
--bảng đặt hàng
CREATE TABLE  Orders(
STT INT IDENTITY,
orderer varchar(40),
orderdate DATETIME
)
GO

 INSERT INTO Orders(orderer,orderdate) VALUES ( 'NGUYEN MINH HIEU', '2020/5/4')
 INSERT INTO Orders(orderer,orderdate) VALUES ('NGUYEN MINH HIEP', '2021/6/5')
 INSERT INTO Orders(orderer,orderdate) VALUES ( 'NGUYEN MINH HIEN', '2022/7/6')
 INSERT INTO Orders(orderer,orderdate) VALUES ( 'NGUYEN MINH HIET', '2023/8/7')
 GO

 SELECT * FROM Orders
 GO
 --bảng chi tiết đơn hàng
 CREATE TABLE OrderDetails(
 STT INT IDENTITY,
 Motahang varchar(40)
 )
 GO

 INSERT INTO OrderDetails(Motahang) VALUES ( 'May nhap moi')
 INSERT INTO OrderDetails(Motahang) VALUES ('Dien thoai dang hot')
 INSERT INTO OrderDetails(Motahang) VALUES ( 'May in dang e')
 GO

 SELECT * FROM  OrderDetails
 GO
 --BẢNG khach hàng
 CREATE TABLE Customer(
STT INT IDENTITY,
 NGUOIDATHANG varchar (40),
 DIACHI varchar(40),
 PHONE int
 )
 GO 


 INSERT INTO Customer(NGUOIDATHANG, DIACHI, PHONE) VALUES ( 'NGUYEN VAN AN ' , 'CAUGIAY-HANOI', 344047379)
 GO 

 SELECT * FROM Customer
 GO

 --4. các câu lênh truy vấn để
 --a) Liệt kê danh sách khách hàng đã mua hàng ở cửa hàng
 Select NGUOIDATHANG  from customer
go
--b) Liet ke danh sach san pham cua cua hang
Select TENSP from Category
go
--C) Liet ke cac don dat hang cua cua hang
Select orderer ,orderdate  from orders
GO

--5 các câu lệnh truy vấn để
--a) Liet ke danh sach khach hang theo van alphabet
select * from customer
order by NGUOIDATHANG
go
--b) Liet ke danh  SACH san pham cua cua hang theo thu tu giam dan 
select * from Category
Order by TENSP DESC
go
--c) Liet ke san pham ma khach hang nguyen van an da mua
select *from Category
where TENSP =  'May Tinh'
go

--6 các câu lệnh truy vấn
--a) Số khách hàng đã mua ở cửa hàng.
select NGUOIDATHANG from customer
go
--b) So mat hang ma cua hang ban
select sum( TENSP) AS 'So mat hang dang ban' from Category
go
