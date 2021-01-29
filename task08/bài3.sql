CREATE DATABASE PHAN3
GO
USE PHAN3
GO
CREATE TABLE Class
(
ClassCode varchar(10) Primary Key,
HeadTeacher varchar(40),
Room varchar(30),
TimeSlot char,
CloseDate datetime
)
GO

INSERT INTO Class(ClassCode,HeadTeacher,Room,TimeSlot,CloseDate) VALUES ('A1010','KIM THI','CL201','A','10/8/02')
INSERT INTO Class(ClassCode,HeadTeacher,Room,TimeSlot,CloseDate) VALUES ('A1011','KIM THI1','CL202','B','10/8/03')
INSERT INTO Class(ClassCode,HeadTeacher,Room,TimeSlot,CloseDate) VALUES ('A1012','KIM THI2','CL203','C','10/8/04')
INSERT INTO Class(ClassCode,HeadTeacher,Room,TimeSlot,CloseDate) VALUES ('A1013','KIM THI3','CL204','D','10/8/05')
INSERT INTO Class(ClassCode,HeadTeacher,Room,TimeSlot,CloseDate) VALUES ('A1014','KIM THI4','CL205','E','10/8/06')
GO

SELECT*FROM Class
GO

CREATE TABLE Student
(
RollNo varchar(10) Primary Key,
ClassCode varchar(10),
FullName varchar(30),
Male bit,
BirthDate datetime,
Address varchar(30),
Province char(2),
Email varchar(30)
)
GO

INSERT INTO Student(RollNo,ClassCode,FullName,Male,BirthDate,Address,Province,Email) VALUES ('111','A1010','NGUYEN MINH HIEP',1,'10/05/02','CAUGIAY-HANOI','HN','NMH@GMAIL.COM')
INSERT INTO Student(RollNo,ClassCode,FullName,Male,BirthDate,Address,Province,Email) VALUES ('222','A1011','NGUYEN MINH HIEP1',1,'2/05/02','CAUGIAY-HANOI1','HP','NMH1@GMAIL.COM')
INSERT INTO Student(RollNo,ClassCode,FullName,Male,BirthDate,Address,Province,Email) VALUES ('333','A1012','NGUYEN MINH HIEP2',1,'6/05/02','CAUGIAY-HANOI2','ND','NMH2@GMAIL.COM')
INSERT INTO Student(RollNo,ClassCode,FullName,Male,BirthDate,Address,Province,Email) VALUES ('444','A1013','NGUYEN MINH HIEP3',1,'5/05/02','CAUGIAY-HANOI3','TB','NMH3@GMAIL.COM')
INSERT INTO Student(RollNo,ClassCode,FullName,Male,BirthDate,Address,Province,Email) VALUES ('555','A1014','NGUYEN MINH HIEP4',1,'9/05/02','CAUGIAY-HANOI4','HY','NMH4@GMAIL.COM')
GO

SELECT * FROM Student
GO

CREATE TABLE Subjects
(
SubjectsCode varchar(10) primary key,
SubjectName varchar(40) ,
WTest bit,
PTest bit,
WTest_per int,
PTest_per int
)
GO 

INSERT INTO Subjects(SubjectsCode,SubjectName,WTest,PTest,WTest_per,PTest_per) VALUES ('AI','PRG C',1,1,8,9)
INSERT INTO Subjects(SubjectsCode,SubjectName,WTest,PTest,WTest_per,PTest_per) VALUES ('AIT','PRG C1',1,1,7,9)
INSERT INTO Subjects(SubjectsCode,SubjectName,WTest,PTest,WTest_per,PTest_per) VALUES ('AIB','PRG C2',1,1,6,9)
INSERT INTO Subjects(SubjectsCode,SubjectName,WTest,PTest,WTest_per,PTest_per) VALUES ('AIN','PRG C2',1,1,5,9)
INSERT INTO Subjects(SubjectsCode,SubjectName,WTest,PTest,WTest_per,PTest_per) VALUES ('AIM','PRG C4',1,1,4,9)
GO

SELECT*FROM Subjects
GO

CREATE TABLE Marks(
RollNo varchar(10) primary key,
SubjectCode varchar(10),
WMark float,
PWark float,
Mark float
)
GO

INSERT INTO Marks(RollNo,SubjectCode,WMark,PWark,Mark) VALUES ('111','AI',10,9,8.5)
INSERT INTO Marks(RollNo,SubjectCode,WMark,PWark,Mark) VALUES ('222','AIT',5,9,6)
INSERT INTO Marks(RollNo,SubjectCode,WMark,PWark,Mark) VALUES ('333','AIB',8,9,6.5)
INSERT INTO Marks(RollNo,SubjectCode,WMark,PWark,Mark) VALUES ('444','AIN',7,9,8)
INSERT INTO Marks(RollNo,SubjectCode,WMark,PWark,Mark) VALUES ('555','AIM',4,9,5)
GO

SELECT * FROM Marks
GO

--2. Tạo một khung nhìn chứa danh sách các sinh viên đã có ít nhất 2 bài thi (2 môn học khác nhau).
CREATE VIEW HS AS
SELECT FULLName , SubjectName
from Student,Subjects
GO
SELECT * FROM HS
GO

--3. Tạo một khung nhìn chứa danh sách tất cả các sinh viên đã bị trượt ít nhất là một môn.
CREATE VIEW HST AS
SELECT FULLName, SubjectName
from Student,Subjects
go
select * from HST
go

--4. Tạo một khung nhìn chứa danh sách các sinh viên đang học ở TimeSlot E.
CREATE VIEW SVDH AS
SELECT FullName,TimeSlot='E'
FROM Student, Class
GO

SELECT * FROM SVDH
GO
--5. Tạo một khung nhìn chứa danh sách các giáo viên có ít nhất 3 học sinh thi trượt ở bất cứ môn nào.
