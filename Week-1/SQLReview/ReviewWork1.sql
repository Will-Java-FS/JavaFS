SET search_path TO testtable1;
-- This is a Comment in PostgreSQL

create table movies(
	id serial,
	title varchar(50),
	price numeric(12, 2),
	available bool,
	return_date bigint
);

-- we need to learn how execute the
-- CRUD operations within SQL.

-- CRUD -> Create, Read, Update, Delete

-- Add data into a Table
insert into movies values 
(default, 'The Avengers', 10, true, 0);
insert into movies values 
(default, 'Iron Man', 7, true, 0);
insert into movies values 
(default, 'Black Widow', 12, true, 0);
insert into movies values 
(default, 'Thor', 5, true, 0);
insert into movies values 
(default, 'Black Panther', 12, true, 0);
insert into movies values 
(default, 'Ant-Man', 6, true, 0);

insert into movies values
(default, 'Captain America', 8, true, 0),
(default, 'Iron Man 2', 9, true, 0);







