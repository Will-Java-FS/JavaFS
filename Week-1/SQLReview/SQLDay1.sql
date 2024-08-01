
create table actors (
	a_id serial primary key,
	name varchar(50) unique not null,
	age smallint check (age >= 0),
	worth int
);

insert into actors values 
(default, 'Chris Evans', 50, 30000000);
insert into actors values 
(default, 'Scarlett Johannson', 30, 31000000),
(default, 'Elizabeth Olsen', 35, 32000000);

select * from actors;
select a_id from actors;
select name,age from actors;

select * from actors where age < 40;
select * from actors where age < 40 and worth > 31000000;
select * from actors where age between 30 and 35;
select * from actors where age in (30,33,36,39);

update actors set age = 31 where age = 30;
update actors set worth = 32000000 where worth < 32000000;
update actors set worth = 33000000 where name = 'Elizabeth Olsen';

select * from actors where name = 'Elizabeth';
select * from actors where name like 'Elizabeth%';
select * from actors where name like '%Evans';
select * from actors where name like '%e%';
select * from actors where lower(name) like '%e%';
select lower(name) from actors where lower(name) like '%e%';

