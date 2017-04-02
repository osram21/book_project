package kr.or.dgit.book_project.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dto.BookInfo;

public class BookInfoMapperImpl implements BookInfoMapper {
	private String namespace="kr.or.dgit.book_pjt.dao.BookInfoMapper.";
	private static final Log log = LogFactory.getLog(BookInfoMapper.class);
	private SqlSession sqlSession;	
	public BookInfoMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public BookInfo selectBookLendisLending(BookInfo bookinfo) {
		log.debug("selectBookLendisLending");
		return sqlSession.selectOne(namespace+"selectBookLendisLending",bookinfo);
	}
	
	
	
	
	

}
