SET search_path TO testtable1;
drop table if exists plan_exercise_junction;
drop table if exists Plan;
drop table if exists Exercise;
drop table if exists "users";



create table if not exists Exercise (
	exercise_id serial primary key,
	"name" varchar(50) unique not null,
	body_Group varchar(50)
);


insert into Exercise values
(default, 'exercise1', 'CHEST'),
(default, 'exercise2', 'CHEST'),
(default, 'excercise3', 'CHEST');


select * from Exercise;

create table "users" (
	user_id serial primary key,
	username varchar(50) unique not null,
	"password" varchar(50),
	"role" varchar(50)
);

insert into "users" values (
	default,'johnu','password','USER'),
	(default,'johna','password','ADMIN');




create table Plan (
	plan_id serial primary key,
	"name" varchar(50) not null,
	"owner" int references "users"(user_id) on delete set null,
);


create table plan_exercise_junction (
	exercise_id int references Exercise(exercise_id) on delete set null,
	plan_id int references Plan(plan_id) on delete set null
);

--insert into plan_exercise_junction values
--(1, 1);
--(1, 4),
--(2, 1);
--(2, 4),
--(3, 4);

SELECT * FROM Exercise;
SELECT * FROM "users";

SELECT * FROM PLAN;

SELECT * FROM plan_exercise_junction;

