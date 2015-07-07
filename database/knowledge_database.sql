
create database knowledge_forum character set =utf8;
use knowledge_forum;
create table  t_user(
    userid bigint(20) NOT NULL AUTO_INCREMENT ,
    uname varchar(20) NOT NULL DEFAULT '' ,
	email varchar(20) NOT NULL DEFAULT '' ,
	upassword varchar(20) NOT NULL,
	udescription varchar(20) NOT NULL DEFAULT '',
    PRIMARY KEY (userid)
	 )