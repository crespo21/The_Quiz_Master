drop table if exists Admin;
drop table if exists Department;
drop table if exists Recruit;
drop table if exists quiz;

create table Admin(
    adminID bigint auto_increment primary key,
    adminName varchar(50) not null,
    adminSurname varchar(100) not null,
    adminCohort int not null,
    adminDepartment varchar(150) not null,
    adminEmail varchar (200) not null
);

create table department
(
    departmentID         bigint auto_increment primary key,
    departmentName       varchar(50)  not null
);

create table Recruit
(
    recruitID bigint auto_increment primary key,
    recruitName varchar(50) not null,
    recruitSurname varchar(50) not null,
    recruitCohort int not null,
    recruitDepartment varchar(150) not null,
    recruitEmail varchar (200) not null
);

create table quiz
(
    quizId bigint auto_increment primary key,
    questions varchar(1000) not null,
    choices varchar(1000) not null,
    explanation varchar(100) not null
);
insert into Admin (adminName,adminSurname,adminCohort,
                   adminDepartment, adminEmail) values('dibwe','kalungu',10,'java','dibwe@Kalungu.com');
insert into Admin (adminName,adminSurname,adminCohort,
                   adminDepartment, adminEmail) values('tiffa','jones',12,'strategy','tiffa@jone.com');
insert into Admin (adminName,adminSurname,adminCohort,
                   adminDepartment, adminEmail) values('Lemo','earth',14,'copywriters','lemo@earth.com');
insert into Admin (adminName,adminSurname,adminCohort,
                   adminDepartment, adminEmail) values('lesley','venus',16,'web development','dibwe@Kalungucom');
insert into Admin (adminName,adminSurname,adminCohort,
                   adminDepartment, adminEmail) values('rico','dealer',18,'data science','dibwe@Kalungu.com');
insert into Admin (adminName,adminSurname,adminCohort,
                   adminDepartment, adminEmail) values('doter','farms',20,'data engineering','doter@farms.com');

insert into department (departmentName) values('Ux Design');
insert into department (departmentName) values('UI Design');
insert into department (departmentName) values('Copywriters');
insert into department (departmentName) values('Multimedia');
insert into department (departmentName) values('Web development');
insert into department (departmentName) values('java');
insert into department (departmentName) values('Data Science');
insert into department (departmentName) values('Data Engineering');

insert into Recruit (recruitName,recruitSurname,recruitCohort,
                     recruitDepartment,recruitEmail)  values ('tot', 'bing',10,'java','tot@bingcom');
insert into Recruit (recruitName,recruitSurname,recruitCohort,
                     recruitDepartment,recruitEmail) values ('benny', 'ball',11,'java','benny@ball.com');
insert into Recruit (recruitName,recruitSurname,recruitCohort,
                     recruitDepartment,recruitEmail) values ('bill', 'gates',12,'java','bill@gates.com');
insert into Recruit (recruitName,recruitSurname,recruitCohort,
                     recruitDepartment,recruitEmail) values ('jackie', 'swat',13,'java','jackie@swat.com');
insert into Recruit (recruitName,recruitSurname,recruitCohort,
                     recruitDepartment,recruitEmail) values ('brandy', 'star',14,'java','brandy@star.com');
insert into Recruit (recruitName,recruitSurname,recruitCohort,
                     recruitDepartment,recruitEmail) values ('wendy', 'hugh',15,'java','wendy@hugh.com');
insert into Recruit (recruitName,recruitSurname,recruitCohort,
                     recruitDepartment,recruitEmail) values ('tommy', 'smirch',16,'java','tommy@misch.com');

insert into quiz (questions, choices, explanation) values('questions goes here?','1. these, 2. are 3. choices, 4. to 5. choose, 6.from',
                                                          'this explains the term whether right or wrong');
insert into quiz (questions, choices, explanation) values('questions goes here?','1. these, 2. are 3. choices, 4. to 5. choose, 6.from',
                                                          'this explains the term whether right or wrong');
insert into quiz (questions, choices, explanation) values('questions goes here?','1. these, 2. are 3. choices, 4. to 5. choose, 6.from',
                                                          'this explains the term whether right or wrong');
insert into quiz (questions, choices, explanation) values('questions goes here?','1. these, 2. are 3. choices, 4. to 5. choose, 6.from',
                                                          'this explains the term whether right or wrong');
insert into quiz (questions, choices, explanation) values('questions goes here?','1. these, 2. are 3. choices, 4. to 5. choose, 6.from',
                                                          'this explains the term whether right or wrong');
insert into quiz (questions, choices, explanation) values('questions goes here?','1. these, 2. are 3. choices, 4. to 5. choose, 6.from',
                                                          'this explains the term whether right or wrong');
insert into quiz (questions, choices, explanation) values('questions goes here?','1. these, 2. are 3. choices, 4. to 5. choose, 6.from',
                                                          'this explains the term whether right or wrong');

