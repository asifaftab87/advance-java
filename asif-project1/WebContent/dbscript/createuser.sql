
create database db1;

use db1;

create table user(
	id int(5) auto_increment primary key,
	firstName varchar(50) not null,
	lastName varchar(50),
	dob DATE,
	email varchar(50) not null,
	fatherName varchar(50),
	gender tinyint(1)
);


create table address(
	id int(5) auto_increment primary key,
	userid int(5) not null,
	street varchar(50),
	city varchar(50),
	state varchar(50),
	country varchar(50),
	pincode varchar(50)
);


INSERT INTO db1.address (userid, street, city, state, country, pincode) VALUES (13, 'loha pool', 'kolkata', 'wb', 'india', '700019');

