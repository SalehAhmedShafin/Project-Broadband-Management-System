Create Database broadBandManagementSystem

Create Table Account
(
UserId int IDENTITY(1,1) Primary Key,
UserName varchar(50),
PhoneNumber varchar(14),
Email varchar(30),
UserPassword varchar(50),
Sec_Q varchar(100),
Answer varchar(100)
);

Select * from Account