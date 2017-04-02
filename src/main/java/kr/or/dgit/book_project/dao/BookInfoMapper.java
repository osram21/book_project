package kr.or.dgit.book_project.dao;

import kr.or.dgit.book_project.dto.BookInfo;

public interface BookInfoMapper {
	BookInfo selectBookLendisLending(BookInfo bookinfo);
}
