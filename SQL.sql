create database dl_library_management;
use dl_library_management;
create table borrow_cards(
card_id int primary key auto_increment ,
book_title varchar(150) not null,
borrower_name varchar(100) not null,
borrow_date timestamp not null,
return_deadline timestamp not null,
quantity int not null, 
status varchar(30) not null );

delimiter $$ 
create procedure getBorrowCards()
begin 
select * from borrow_cards;
end$$
delimiter ;

delimiter $$
create procedure addBorrowCards ( 
in p_book_title varchar(150),
in p_borrower_name varchar(100),
in p_borrow_date timestamp ,
in p_return_deadline timestamp,
in p_quantity int  ,
in p_status varchar(30) )
begin 
insert into borrow_cards(
 book_title ,
borrower_name ,
borrow_date ,
return_deadline ,
quantity ,
status) 
values ( p_book_title, p_borrower_name ,
p_borrow_date ,
p_return_deadline ,
P_quantity ,
p_status );
end $$
delimiter ;

delimiter $$
create procedure getByName(in p_borrower_name varchar(100))
begin 
select * from borrow_cards where borrower_name = p_borrower_name;
end$$
delimiter ;

delimiter $$
create procedure updateById( in p_card_id int, in p_book_title varchar(150),
in p_borrower_name varchar(100),
in p_borrow_date timestamp ,
in p_return_deadline timestamp,
in p_quantity int  ,
in p_status varchar(30) ) 
begin 
update borrow_cards
set 
book_title = p_book_title ,
borrower_name= p_borrower_name,
borrow_date = p_borrow_date,
return_deadline = p_return_deadline,
quantity = p_quantity ,
status = p_status 
where  card_id = p_card_id;
end$$
delimiter ;

delimiter $$
create procedure deleteById( in p_card_id int)
begin 
delete from borrow_cards
where card_id = p_card_id;
end$$
delimiter ;

delimiter $$
create procedure searchByTitle(in p_book_title varchar(150))
begin 
select * from borrow_cards
where lower(book_title)
 like concat('%',lower(p_book_title),'%');
 end $$
 delimiter ;
 


