--tao bang SanPham voi mot cot NULL, mot cot NOT NULL
CREATE TABLE SanPham (
MaSP int NOT NULL,
TenSP varchar(40) NULL
)
GO
--tao bang voi thuoc tinh default cho cot Price
CREATE TABLE StoreProduct(
ProductID int NOT NULL,
Name varchar(40) NOT NULL,
Price money NOT NULL DEFAULT (100)
)
GO
--thu kiem tra xem chay duoc ko
INSERT INTO StoreProduct (ProductID,Name) VALUES (111, 'Pivets')
GO
SELECT * FROM StoreProduct
GO
--tao bangn contacPhone voio thuoc tinh IDENTITY
CREATE TABLE ContactPhone (
Person_ID int IDENTITY (500,1) NOT NULL,
MobileNumber bigint NOT NULL
)
INSERT INTO ContactPhone(MobileNumber) VALUES (987112345);

SELECT * FROM ContactPhone
GO
--tao cot nhan dang duy nhat tong the
CREATE TABLE CellularPhone(
Person_ID uniqueidentifier DEFAULT NEWID() NOT NULL,
PersonName varchar(60) NOT NULL
)
--chen mot record vao
INSERT INTO cellularPhone(personName) VALUES('William Smith')
GO

SELECT * FROM CellularPhone
GO
--tao bang contactPhone voi cot mobileNumber co thuoc tinh unique
CREATE TABLE ContactPhonel (
Person_ID int PRIMARY KEY,
MobileNumber bigint UNIQUE,
ServiceProvider varchar(30),
LandlineNumber bigint UNIQUE
)

INSERT INTO ContactPhonel values (101, 983345674, 'Hutch', NULL)
INSERT INTO ContactPhonel values (102, 983345634, 'Alex', 12)
GO
--tao bang PhoneExpenses co mot CHECK o cot Amount
CREATE TABLE PhoneExpenses (
Expense_ID int PRIMARY KEY,
MobileNumber bigint FOREIGN KEY REFERENCES ContactPhonel (MobileNumber),
Amount bigint CHECK (Amount > 0)
)
GO
SELECT * FROM PhoneExpenses
GO
--chinh sua cot trong bang
ALTER TABLE ContactPhone
ALTER COLUMN ServiceProvider varchar(45)
GO
ALTER TABLE ContactPhone
DROP COLUMN ServiceProvider
GO

ALTER TABLE ContactPhone
ADD CONSTRAINT CHK_RC CHECK (RentalCharges > 0)
GO
ALTER TABLE Person.ContactPhone
DROP CONSTRAINT CHK_RC