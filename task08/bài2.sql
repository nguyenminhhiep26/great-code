CREATE DATABASE phan2
GO
USE phan2
GO

CREATE TABLE Customer
(
CustomerID int Primary Key,
CustomerName varchar(50),
Address varchar(100),
Phone varchar(12)
)
GO

INSERT INTO Customer(CustomerID, CustomerName,Address,Phone) VALUES (123,'NGUYEN MINH HIEP','CAUGIAY-HANOI1','3440473798')
INSERT INTO Customer(CustomerID, CustomerName,Address,Phone) VALUES (456,'NGUYEN MINH HIEP1','CAUGIAY-HANOI2','3440473797')
INSERT INTO Customer(CustomerID, CustomerName,Address,Phone) VALUES (789,'NGUYEN MINH HIEP2','CAUGIAY-HANOI3','3440473796')
INSERT INTO Customer(CustomerID, CustomerName,Address,Phone) VALUES (111,'NGUYEN MINH HIEP3','CAUGIAY-HANOI4','3440473795')
INSERT INTO Customer(CustomerID, CustomerName,Address,Phone) VALUES (222,'NGUYEN MINH HIEP4','CAUGIAY-HANOI5','3440473794')
GO

SELECT * FROM Customer
GO

CREATE TABLE BOOK
(
Bookcode int Primary Key,
Category varchar(50),
Author varchar(50),
Publisher varchar(50),
Title varchar(100),
Price int,
InStore int
)
GO 

INSERT INTO BOOK(Bookcode,Category,Author,Publisher,Title,Price,InStore) VALUES (333,'TOAN','HIEP','THU1','YEU',$1000,100)
INSERT INTO BOOK(Bookcode,Category,Author,Publisher,Title,Price,InStore) VALUES (444,'VAN','HIEP1','THU2','YEU1',$2000,101)
INSERT INTO BOOK(Bookcode,Category,Author,Publisher,Title,Price,InStore) VALUES (555,'SINH','HIEP2','THU3','YEU2',$3000,102)
INSERT INTO BOOK(Bookcode,Category,Author,Publisher,Title,Price,InStore) VALUES (666,'VATLI','HIEP3','THU4','YEU3',$4000,103)
INSERT INTO BOOK(Bookcode,Category,Author,Publisher,Title,Price,InStore) VALUES (777,'KINHTE','HIEP4','THU5','YEU4',$5000,104)
GO

SELECT * FROM BOOK
GO

CREATE TABLE BOOKSOLD
(
BookSoldID int Primary Key,
CustomerID int,
BookCode int,
Date datetime,
Price int,
Amount int
)
GO

INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (323,123,333,'10/20/02',$1500,90)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (321,456,444,'12/5/02',$1700,50)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (320,789,555,'11/1/02',$1600,60)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (319,111,666,'11/6/03',$1800,70)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (318,222,777,'10/4/04',$1900,50)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (317,141,858,'11/5/01',$1111,40)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (316,151,121,'7/2/06',$100,30)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (315,171,131,'9/10/05',$990,40)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (314,191,141,'6/10/08',$999,50)
INSERT INTO BOOKSOLD(BookSoldID,CustomerID,BookCode,Date,Price,Amount) VALUES (313,101,151, '11/2/09',$5000,10)
GO 

SELECT * FROM BOOKSOLD
GO

--2Tạo một khung nhìn chứa danh sách các cuốn sách (BookCode, Title, Price) kèm theo số lượng đã bán được của mỗi cuốn sách.
--Gợi ý: Trường Amout của bảng BookSold chứa số lượng sách đã bán cho một khách hàng.
CREATE VIEW BOOKS AS
SELECT Bookcode, Title , Price
FROM BOOK
GO
SELECT * FROM BOOKS
GO

--3. Tạo một khung nhìn chứa danh sách các khách hàng (CustomerID, CustomerName, Address) kèm theo số lượng các cuốn sách mà khách hàng đó đã mua.
CREATE VIEW CustomerS AS
SELECT CustomerID, CustomerName, Address
FROM Customer
GO
SELECT * FROM CustomerS
GO

--4. Tạo một khung nhìn chứa danh sách các khách hàng (CustomerID, CustomerName, Address) đã mua sách vào tháng trước, kèm theo tên các cuốn sách mà khách hàng đã mua.
