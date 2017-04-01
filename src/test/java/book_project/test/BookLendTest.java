package book_project.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
		   BookLend bookLend = new BookLend();
		   bookLend.setbLendCount(0);
		   BookLend seBookLend = booklendService.selectIslending(bookLend);
		   Assert.assertNotNull(seBookLend);
	   }
}
