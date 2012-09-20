drop table if exists t_user;
create table t_user (
   id BIGINT NOT NULL AUTO_INCREMENT,
   email VARCHAR(100) not null,
   name VARCHAR(100) not null unique,
   password VARCHAR(128) not null,
   primary key (id)
);
