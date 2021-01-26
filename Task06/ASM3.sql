CREATE DATABASE ASM3
GO
USE ASM3
GO
create table subscription(
subscripId int,
number int,
species varchar(2423),
date datetime
)
go

insert into subscription(number,species,date) values (123456789,'trả trước','2000/06/29')
insert into subscription(subscripId,number,species,date) values (2,0343619450,'trả sau','2000/06/29')
insert into subscription(subscripId,number,species,date) values (1,123456789,'trả trước','2000/06/29')
insert into subscription(number,species,date) values (0379784029,'trả sau','2021/01/28')

go

select * from subscription
go

create table customer_ok(
customerId int,
name nvarchar(355),
number int,
address nvarchar(2355)
)
go


insert into customer_ok(name,number,address) values ('NGUYEN MINH HIEP ',123456789,'hà nội')
insert into customer_ok(name,number,address) values ('TRAN THI THU',123454789,'hà nội')
insert into customer_ok(name,number,address) values ('NGUYEN VAN HUY',123456749,'hà nội')
insert into customer_ok(name,number,address) values ('NGUYEN TH HIEN',123456789,'hà nội')
insert into customer_ok(name,number,address) values ('NGUYEN THI PHUONG THAO ',123456789,'hà nội')
go

select * from customer_ok
go

--4. Viết các câu lênh truy vấn để
--A hiển thị toàn bộ thông tin khách hàng
select * from subscription
go
--B hiển thị toàn bộ thông tin số thuê bao
select * from customer_ok
go

--5. Viết các câu lệnh truy vấn để lấy
--A hiển thị toàn bộ thông tin khách hàng có số 123456789
select * from subscription
where number = '123456789'
go
--B hiển thị toàn bộ số thuê bao có số 123456789
select * from customer_ok 
where number = '123456789'
go
--C liệt kê các thuê bao đăng kí vào ngày 29/06/2000
select * from subscription
where date = '2000/06/29'
go
--D liệt kê các thuê bao có địa chỉ hà nội
select * from customer_ok
where address = 'hà nội'
go

--6. Viết các câu lệnh truy vấn để lấy
--A tổng số thuê bao của công ty là
select sum(subscripId) from subscription
go
--B tổng khách hàng của công ty là
select sum(customerId) from customer_ok
go
--C tổng thuê bao đăng kí ngày 2000/06/29
select sum(customerId) from customer_ok
go
--7. Thay đổi những thay đổi sau trên cơ sở dữ liệu
--a) Viết câu lệnh để thay đổi trường ngày đăng ký là not null.