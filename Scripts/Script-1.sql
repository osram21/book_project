select*from booklend;

SELECT b.b_code, b.b_sub_code, b_name, author, p.publisher, price, bl.b_lend_count FROM bookInfo b 
inner join publisherInfo p on b.p_code = p.p_code 
inner join bookLend bl on b.b_code = bl.b_code and b.b_sub_code = bl.b_sub_code
where bl.is_lending = false;

select b.b_code, b_name, author, p.publisher, price, bl.b_lend_count
from bookinfo b join publisherinfo p on b.b_code=p.p_code
join booklend bl on b.b_code = bl.b_code;

SELECT b.b_code, b.b_sub_code, b_name, author, p.publisher, price, bl.b_lend_count FROM bookInfo b 
		inner join publisherInfo p on b.p_code = p.p_code 
		inner join bookLend bl on b.b_code = bl.b_code 
		where bl.is_lending = false;

		
select b.b_code,b.b_sub_code,b_name,b.author,b.price,bl.is_lending
from bookinfo b left join booklend bl on b.b_code=bl.b_code and b.b_sub_code=bl.b_sub_code
where bl.is_lending = false;



