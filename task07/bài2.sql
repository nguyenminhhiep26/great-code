CREATE DATABASE CodeLean
GO
USE CodeLean
GO

--Bảng Classes 
CREATE TABLE Classes
(
ClassName char(6),
Teacher varchar(30),
TimeSlot varchar(30),
Clas int,
Lab int
)
GO


INSERT INTO Classes(ClassName,Teacher,TimeSlot,Clas,Lab) VALUES ('T2010A','KIM THI ST1','CHIEUT2',206, 10 )
INSERT INTO Classes(ClassName,Teacher,TimeSlot,Clas,Lab) VALUES ('T2010B','KIM THI ST2','CHIEUT4',207, 11 )
INSERT INTO Classes(ClassName,Teacher,TimeSlot,Clas,Lab) VALUES ('T2010C','KIM THI ST3','CHIEUT5',208, 12 )
INSERT INTO Classes(ClassName,Teacher,TimeSlot,Clas,Lab) VALUES ('T2010D','KIM THI ST4','CHIEUT6',209, 13 )
GO  

SELECT * FROM Classes
GO

--1. Tạo an unique, clustered index tên là MyClusteredIndex trên trường ClassName
--a)an unique
CREATE UNIQUE INDEX MyClusteredIndex ON Classes(ClassName )
GO
--b) clustered index
CREATE CLUSTERED INDEX MyClustered ON Classes(ClassName)
GO

--2. Tạo a nonclustered index tên là TeacherIndex trên trường Teacher
CREATE NONCLUSTERED INDEX TeacherIndex ON Classes(Teacher)
GO

--3. Xóa chỉ mục TeacherIndex
DROP INDEX TeacherIndex ON Classes
GO

--4. Xây dựng lại MyClusteredIndex với các thuộc tính FILLFACTOR
CREATE  INDEX MyClusteredInde ON Classes(ClassName )
WITH(FILLFACTOR=60)
GO

--5. Tạo một composite index tên là ClassLabIndex trên 2 trường Class và Lab.
CREATE INDEX ClassesLabIndex  ON Classes(Clas,Lab)
GO

--6. Viết câu lệnh xem toàn bộ các chỉ mục của cơ sở dữ liệu CodeLean.
