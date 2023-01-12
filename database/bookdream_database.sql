create user bookdream identified by bookdream;
grant connect, resource, create view to bookdream;
connect bookdream/bookdream;

drop table USERS;

create table USERS (
  USER_NO        number(10)    not null,
  USER_ID        varchar2(20)  not null UNIQUE,
  USER_PASSWORD  varchar2(20)  not null,
  USER_NAME      varchar2(10)  not null,
  USER_ADDRESS   varchar2(50)  not null,
  USER_TEL       varchar2(20)  not null,
  USER_LEVEL     number(1)     default 0    check(USER_LEVEL in(0,1)),
  BLACKLIST_YN   varchar2(5)   default 'N'  check(BLACKLIST_YN in ('Y','N')),
  USER_EMAIL     varchar2(50)  not null,
  constraint PK_USER primary key (USER_NO)
);

alter table users add USER_EMAIL VARCHAR2(40) default '';
drop sequence user_seq;
create sequence user_seq increment by 1 start with 1;

select * from USERS;

drop table kakao_table;
create table kakao_table(
    k_number number primary key,
    k_name varchar2(20) not null,
    k_email varchar2(50) not null,
    platform varchar2(40) default 'kakao'
);

alter table kakao_table add platform varchar2(40) default 'kakao';
drop sequence seq_id;
create sequence seq_id increment by 1 start with 1;

select * from kakao_table;

drop table review;

create table review(
review_no number(10) not null,
USER_NO number(10) not null,
book_no number(10) not null,
REVIEW_CONTENT varchar2(1000) not null,
REVIEW_DATE date default sysdate,
REVIEW_RECOMMEND number(20),
REVIEW_STAR number(1) not null,
constraint pk_riview PRIMARY KEY (review_no)
);

select * from review;

drop table pay;

CREATE TABLE PAY (
    PAY_NO         number(10) not null,
   PAY_METHOD     varchar2(20)not null,
    PAY_DATE       date DEFAULT SYSDATE not null,
    DISCOUNT_PRICE number(10) DEFAULT 0 not null,
    FINAL_PRICE    number(10) not null,
    SAVE_POINT     number(10) not null,
    constraint PK_PAY primary key(PAY_NO)  
);

select * from pay;

drop table orders;

CREATE TABLE orders(
    order_no number primary key,
    user_no number references users (user_no) not null,
    pay_no number references pay (pay_no) not null,
    order_name varchar2(100) not null,  
    total_price number not null,
    order_comment varchar2(400),
    order_enroll date default sysdate ,
    order_receiver varchar2(20) not null,
    order_address varchar2(100) not null,
    order_tel varchar2(40) not null,
    order_fee number not null
);

select * from orders;

commit