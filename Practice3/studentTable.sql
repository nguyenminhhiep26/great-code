create database if not exists School;
use school;
create table students(
    StudentID varchar(10) primary key not null,
    StudentName varchar(50) not null,
    Address varchar(50),
    Phone varchar(10)
);
insert into students values
    (B01010,"Nguyen Tuan Anh","Ha Noi", 0904818238),
    (B10394, "Nguyen Hoang Hai","Hai Duong",0494949494);
