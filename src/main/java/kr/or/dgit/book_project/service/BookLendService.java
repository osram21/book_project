package kr.or.dgit.book_project.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.book_project.dao.BookLendMapper;
import kr.or.dgit.book_project.dao.BookLendMapperImpl;
import kr.or.dgit.book_project.dto.BookLend;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class BookLendService {
	private static final Logger logger = Logger.getLogger(BookLendService.class);
	private static final BookLendService instance = new BookLendService();
	
	private BookLendService() {}
	
	public static BookLendService getInstance() {
		return instance;
	}
	
	public List<BookLend> selectIslending(){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			BookLendMapper booklendMapper = new BookLendMapperImpl(sqlSession);
			return booklendMapper.selectIslending();
		}
	}
	
	
}
