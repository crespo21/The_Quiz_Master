create table admin (
    adminID         bigint auto_increment primary key,
    adminName       varchar(50)  not null,
    adminSurname    varchar(100) not null,
    adminCohort     int          not null,
    adminDepartment varchar(150) not null,
    adminEmail      varchar(200) not null
);
create table department (
    departmentID         bigint auto_increment primary key,
    departmentName       varchar(50)  not null
);

create table recruit (
    recruitID bigint auto_increment primary key,
    recruitName varchar(50) not null,
    recruitSurname varchar(100) not null,
    recruitCohort int not null,
    recruitDepartment varchar(150) not null,
    recruitEmail varchar (200) not null
);

create table quiz (
    quizId bigint auto_increment primary key,
    questions varchar(1000) not null,
    choices varchar(1000) not null,
    explanation varchar(100) not null
);

