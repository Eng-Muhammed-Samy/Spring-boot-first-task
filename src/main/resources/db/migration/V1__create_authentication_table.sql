
DROP table if exists auth_user;

create table auth_user(
    id int not null primary key,
    name varchar(50)
);