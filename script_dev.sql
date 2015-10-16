CREATE database if not exists `FORMATION_DEV`;

use FORMATION_DEV;



CREATE TABLE if not exists `LOCATION`(

 `location_id` int not null auto_increment,

 `city` varchar(50) not null,

 primary key (`location_id`)

 );



 CREATE TABLE if not exists `COURSE`(

 `course_code` varchar(4) not null,

 `title` varchar(100) not null,

 primary key (`course_code`)

 );



 CREATE TABLE if not exists `COURSE_SESSION`(

 `course_session_id` int not null AUTO_INCREMENT,

 `start_date` date not null,

 `end_date` date not null,

 `course_code` varchar(4) not null,

 `location_id` int not null,

 primary key(`course_session_id`),

 foreign key(course_code) references COURSE(course_code),

 foreign key(location_id) references LOCATION(location_id)

 );



  CREATE TABLE if not exists `CLIENT`(

 `client_id` int not null AUTO_INCREMENT,

 `lastname` varchar(50) not null,

 `firstname` varchar(50) not null,

 `address` varchar(50) not null,

 `phone` varchar(10) not null,

 `email` varchar(50) not null,

 `course_session_id` int not null,

 primary key(`client_id`),

 foreign key(course_session_id) references COURSE_SESSION(course_session_id)

 );