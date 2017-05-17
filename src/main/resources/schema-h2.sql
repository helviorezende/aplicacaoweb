drop table tb_user if exists;
create table tb_user (
  id bigint generated by default as identity,
  name varchar(45),
  email varchar(256),
  password varchar(128),
  primary key (id)
);
