CREATE TABLE Students(
StudentNo int,
StudentName varchar(50),
StudentAddress varchar(100),
PhoneNo int
)
GO

GO
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (123,'NGUYEN MINH HIEP','HANOI1','0343619450')
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (124,'NGUYEN MINH HIEP1','HANOI2','0343619451')
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (125,'NGUYEN MINH HIEP2','HANOI3','0343619452')
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (126,'NGUYEN MINH HIEP3','HANOI4','0343619453')
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (127,'NGUYEN MINH HIEP4','HANOI5','0343619454')
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (128,'NGUYEN MINH HIEP5','HANOI6','0343619455')
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (129,'NGUYEN MINH HIEP6','HANOI7','0343619456')
insert into Students(StudentNo,StudentName,StudentAddress,PhoneNo) values (120,'NGUYEN MINH HIEP7','HANOI8','0343619457')
GO
SELECT * FROM Students
GO
-- Bảng Department
CREATE TABLE Department_ok(
DeptNo int Primary Key,
DeptName nvarchar(50),
ManagerName nvarchar(30)
)
GO

INSERT INTO Department_ok(DeptNo,DeptName,ManagerName) VALUES (29,'Mốc','NGUYEN')
INSERT INTO Department_ok(DeptNo,DeptName,ManagerName) VALUES (06,'Meo','MINH')
INSERT INTO Department_ok(DeptNo,DeptName,ManagerName) VALUES (00,'Thóc','HIEP')
INSERT INTO Department_ok(DeptNo,DeptName,ManagerName) VALUES (28,'Thối','TRAN')
INSERT INTO Department_ok(DeptNo,DeptName,ManagerName) VALUES (05,'Ngếch','THI')
INSERT INTO Department_ok(DeptNo,DeptName,ManagerName) VALUES (20,'Mũng','THU')
GO
SELECT * FROM Department_ok
GO
--Bảng AssignmentNo
CREATE TABLE Assignment(
AssignmentNo int Primary key,
Description nvarchar(100)
)
GO

INSERT INTO Assignment(AssignmentNo,Description) VALUES (123,'Giới Thiệu về bạn')
INSERT INTO Assignment(AssignmentNo,Description) VALUES (124,'Giới Thiệu về bạn')
INSERT INTO Assignment(AssignmentNo,Description) VALUES (125,'Giới Thiệu về bạn')
INSERT INTO Assignment(AssignmentNo,Description) VALUES (126,'Giới Thiệu về bạn')
GO
SELECT * FROM Assignment
GO
--Bảng Works_Assign
CREATE TABLE Works_Assign(
JobID INT primary Key,
StudentNo INT,
AssignmentNo INT,
TotalHours INT,
JobDetails nvarchar(450)
)
GO

INSERT INTO Works_Assign(JobID,StudentNo,AssignmentNo,TotalHours,JobDetails) VALUES (244,452,112,4,'bạn phải làm công việc này')
INSERT INTO Works_Assign(JobID,StudentNo,AssignmentNo,TotalHours,JobDetails) VALUES (245,442,212,5,'bạn phải làm công việc này')
INSERT INTO Works_Assign(JobID,StudentNo,AssignmentNo,TotalHours,JobDetails) VALUES (246,432,312,6,'bạn phải làm công việc này')
INSERT INTO Works_Assign(JobID,StudentNo,AssignmentNo,TotalHours,JobDetails) VALUES (247,422,412,7,'bạn phải làm công việc này')
INSERT INTO Works_Assign(JobID,StudentNo,AssignmentNo,TotalHours,JobDetails) VALUES (248,412,512,8,'bạn phải làm công việc này')
GO
SELECT * FROM Works_Assign
GO
--bài 2 tạo clutered Index tên là IX_Student trên cột StudentNo của bảng Student
CREATE CLUSTERED INDEX IX_Student ON Students(StudentNo)
GO
--Bài 3 chỉnh sửa và xây dựng lại(rebuild) IX_Student đã được tạo trên bảng Student
ALTER INDEX IX_Student ON Students REBUILD
GO
--Bài 4 Tạo một chỉ non clustered index tên là IX_Dept trên bảng Department sử dụng 2 trường không khoá DeptName và DeptManagerNo
CREATE NONCLUSTERED INDEX IX_Dept
ON Department_ok(DeptName,ManagerName)
GO