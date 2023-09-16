select * from member;
Drop table member;
CREATE TABLE member
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

insert into member(name) values('페이커');
insert into member(name) values('구마유시');