create table user(
	id int(5) auto_increment primary key,
	firstName varchar(50) not null,
	lastName varchar(50),
	dob DATE,
	email varchar(50) not null,
	fatherName varchar(50),
	gender tinyint(1)
);