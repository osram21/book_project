package book_project.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.dto.BookLend;
import kr.or.dgit.book_project.service.BookInfoService;

public class BookInfoTest {
	private static BookInfoService bookInfoService;
	
	@BeforeClass
	   public static void setUpBeforeClass() throws Exception {
		bookInfoService = BookInfoService.getInstance();
	   }

	   @AfterClass
	   public static void tearDownAfterClass() throws Exception {
		   bookInfoService = null;
	   }
	   
	   @Test
	   public void TestSelectBookLendisLending(){
		   BookInfo bookinfo = new BookInfo();
		   bookinfo.getBooklend().setLending(false);
		   BookInfo selectbookinfo = bookInfoService.selectBookLendisLending(bookinfo);
	   }
}
