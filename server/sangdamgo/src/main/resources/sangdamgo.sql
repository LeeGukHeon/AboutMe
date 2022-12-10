use sangdamgo;

create table users(
    idx bigint primary key auto_increment,
    uId varchar(100),
    uPw varchar(255),
    uName varchar(100),
    uNickname varchar(100),
    uPhone varchar(11),
    uEmail varchar(200),
    uBirth varchar(8),
    uType varchar(100),
    uAuth varchar(100),
    uRegdate DATETIME
);