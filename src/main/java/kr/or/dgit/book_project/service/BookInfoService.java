package kr.or.dgit.book_project.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.book_project.dao.BookInfoMapper;
import kr.or.dgit.book_project.dao.BookInfoMapperImpl;
import kr.or.dgit.book_project.dao.BookLendMapperImpl;
import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class BookInfoService {
	private static final Logger logger = Logger.getLogger(BookInfoService.class);
	private static final BookInfoService instance =  new BookInfoService();
	private BookInfoService() {}
	public static BookInfoService getInstance() {
		return instance;
	}
	public BookInfo selectBookLendisLending(BookInfo bookinfo){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			BookInfoMapper bookinfoMapper = new BookInfoMapperImpl(sqlSession);
			return bookinfoMapper.selectBookLendisLending(bookinfo);
		}
	}
}
