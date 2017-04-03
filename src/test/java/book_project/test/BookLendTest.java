package book_project.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.dto.BookLend;
import kr.or.dgit.book_project.service.BookLendService;

public class BookLendTest {
	private static BookLendService booklendService;
	
	@BeforeClass
	   public static void setUpBeforeClass() throws Exception {
		booklendService = BookLendService.getInstance();
	   }

	   @AfterClass
	   public static void tearDownAfterClass() throws Exception {
		   booklendService = null;
	   }
	   
	   @Test
	   public void TestSelectIslending(){
		  /* BookInfo bookinfo = new BookInfo();
		   bookinfo.setbCode("J001");
		   bookinfo.setbSubCode("1");
		   BookLend booklend = new BookLend();
		   booklend.setLending(false);
		   booklend.setBookInfo(bookinfo);*/
		   List<BookLend> SelectIslending = booklendService.selectIslending();
		   Assert.assertNotNull(SelectIslending);
		   /*
		   booklendService.selectIslending(booklend);*/
	   }
	   
	   @Test
	   public void TestSelectIslendingInsert(){
		   BookInfo bookinfo = new BookInfo();
		   bookinfo.setbCode("J001");
		   bookinfo.setbSubCode("0");
		   BookLend booklend = new BookLend();
		   booklend.setBookInfo(bookinfo);
		   BookLend selectIslendingInsert = booklendService.selectIslendingInsert(booklend);
		   Assert.assertNotNull(selectIslendingInsert);
	   }
}
