# person_spending

create database person_spending;
use person_spending;

drop table person;
create table person(
id bigint primary key auto_increment,
name varchar(50),
birthplace varchar(50),
birth_time date,
email varchar(50)
);

drop table spending;
create table spending(
id bigint primary key auto_increment,
where_spent varchar(10),
howmuch_spent bigint,
person_id bigint,
foreign key (person_id) references person(id)
);
