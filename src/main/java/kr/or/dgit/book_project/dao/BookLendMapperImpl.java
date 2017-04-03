package kr.or.dgit.book_project.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dto.BookLend;

public class BookLendMapperImpl implements BookLendMapper {
	private String namespace="kr.or.dgit.book_project.dao.BookLendMapper.";
	private static final Log log = LogFactory.getLog(BookLendMapper.class);
	private SqlSession sqlSession;	
	public BookLendMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<BookLend> selectIslending() {
		log.debug("selectIslending");
		return sqlSession.selectList(namespace+"selectIslending");
	}
	@Override
	public BookLend selectIslendingInsert(BookLend booklend) {
		log.debug("selectIslendingInsert");
		return sqlSession.selectOne(namespace+"selectIslendingInsert",booklend);
	}
}
