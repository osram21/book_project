package kr.or.dgit.book_project.dao;

import java.util.List;

import kr.or.dgit.book_project.dto.BookLend;

public interface BookLendMapper {
	List<BookLend> selectIslending();
	BookLend selectIslendingInsert(BookLend booklend);
}
