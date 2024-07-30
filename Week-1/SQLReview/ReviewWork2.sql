SET search_path TO testtable1;
drop table if exists movies;

create table if not exists actors (
	a_id serial primary key,
	name varchar(50) unique not null,
	age smallint check (age >= 0),
	worth int check (worth > 0)
);


insert into actors values
(default, 'Chris Evans', 50, 30000000),
(default, 'Scarlett Johansson', 29, 31000000),
(default, 'Elizabeth Olsen', 29, 32000000);


select * from actors;


create table genre (
	g_id serial primary key,
	name varchar(50) unique not null
);

insert into genre values
(default, 'Action'),
(default, 'Adventure'),
(default, 'Thriller'),
(default, 'Comedy'),
(default, 'Drama');

select * from genre;


create table movies (
	m_id serial primary key,
	title varchar(50) not null,
	price numeric(12,2) check (price >= 0),
	available bool default true,
	return_date bigint default 0,
	genre_id int references genre(g_id) on delete set null
);

-- How to add a constraint after table creation.
alter table movies 
add constraint movies_genre_fk foreign key (genre_id) references genre(g_id) on delete set null;

--drop a constraint after table creation
alter table movies
drop constraint movies_genre_fk;


insert into movies values
(default, 'The Avengers', 7.5, default, default, 1);
insert into movies values
(default, 'Captain America: Civil War', 8, true, 0, 1);

select * from movies;



-- Reference Table - this table will hold values
-- that we can look up later. And the table is likely
-- to have little to no new records after initial
-- data population.
create table actor_movie (
	actor_id int references actors(a_id) on delete set null,
	movie_id int references movies(m_id) on delete set null
);

insert into actor_movie values
(1, 1),
(2, 1);


select * from movies;
select * from actor_movie;

select a_id from actors where name = 'Chris Evans';
select movie_id from actor_movie where actor_id = 1;


select * from movies where m_id in 
(select movie_id from actor_movie where actor_id = 
(select a_id from actors where name = 'Elizabeth Olsen'));




