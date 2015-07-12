
create database knowledge_forum character set =utf8;
use knowledge_forum;
create table  t_user(
    userid bigint(20) NOT NULL AUTO_INCREMENT,
    uname varchar(20) NOT NULL DEFAULT '' ,
	email varchar(50) NOT NULL DEFAULT '' ,
	upassword varchar(20) NOT NULL,
	udescription varchar(40) NOT NULL DEFAULT '',
	ustaus  varchar(10) DEFAULT 'NEW',
	uscore	int DEFAULT 0,
	ulevel	VARCHAR(10) DEFAULT 'normal',
    PRIMARY KEY (userid)
	 );
	 
	 
create table t_question(
	questionid bigint(20) NOT NULL AUTO_INCREMENT ,
	qtitle  varchar(50)  NOT NULL DEFAULT '' ,
	qcontent varchar(500) NOT NULL DEFAULT '',
	qcreateuserid bigint(20) NOT NULL ,
	qupdateuserid bigint(20) NOT NULL ,
	qcreatetime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	qupdatetime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    qgoodnum  int NOT NULL DEFAULT 0,
	qbadnum  int NOT NULL DEFAULT 0,
	qlabel varchar(100) NOT NULL DEFAULT '',
	qstaus  varchar(10) DEFAULT 'NEW',
	qviewtimes int  DEFAULT 0,
	PRIMARY KEY (questionid)
	);
	
create table t_answer(
	answerid bigint(20) NOT NULL AUTO_INCREMENT ,
	areferenceqid bigint(20) NOT NULL  ,
	atitle  varchar(50)  NOT NULL DEFAULT '' ,
	acontent varchar(500) NOT NULL DEFAULT '',
	aqcreateuserid bigint(20) NOT NULL ,
	aupdateuserid bigint(20) NOT NULL ,
	acreatetime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	aupdatetime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    agoodnum  int NOT NULL DEFAULT 0,
	abadnum  int NOT NULL DEFAULT 0,
	astaus  varchar(10) DEFAULT 'NEW',
	PRIMARY KEY (answerid)
	);	
	
create table t_lablel(
	labelid bigint(20) NOT NULL AUTO_INCREMENT,
	labelname  varchar(20)  NOT NULL DEFAULT '' ,
    ldecription varchar(20)  
	PRIMARY KEY (labelid)
	);
	
	
create table  t_manager(
    managerid bigint(20) NOT NULL AUTO_INCREMENT,
    mname varchar(20) NOT NULL DEFAULT '' ,
	memail varchar(50) NOT NULL DEFAULT '' ,
	mpassword varchar(20) NOT NULL,
	mstatus int DEFAULT 0,
	PRIMARY KEY (managerid)
	);
	 
create table t_log(
	logid bigint(20) NOT NULL AUTO_INCREMENT,
	lcontent varchar(200) NOT NULL DEFAULT '',
	lcreatetime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (logid)


)	 