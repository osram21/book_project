package kr.or.dgit.book_project.dto;

import java.util.List;

public class BookLend {
	private BookInfo bookInfo;		
	private boolean isLending;		// 대여 여부
	private int bLendCount;			// 총 대여횟수
	private List<PaymentIO> bookPaymentIO; //추가햇음
	
	public BookLend() {	}

	public BookLend(BookInfo bookInfo, boolean isLending, int bLendCount, List<PaymentIO> bookPaymentIO) {
		super();
		this.bookInfo = bookInfo;
		this.isLending = isLending;
		this.bLendCount = bLendCount;
		this.bookPaymentIO = bookPaymentIO;
	}
	
	public BookInfo getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public boolean isLending() {
		return isLending;
	}

	public void setLending(boolean isLending) {
		this.isLending = isLending;
	}

	public int getbLendCount() {
		return bLendCount;
	}

	public void setbLendCount(int bLendCount) {
		this.bLendCount = bLendCount;
	}

	public List<PaymentIO> getBookPaymentIO() {
		return bookPaymentIO;
	}

	public void setBookPaymentIO(List<PaymentIO> bookPaymentIO) {
		this.bookPaymentIO = bookPaymentIO;
	}

	@Override
	public String toString() {
		return String.format("BookLend [bookInfo=%s, isLending=%s, bLendCount=%s, bookPaymentIO=%s]", bookInfo,
				isLending, bLendCount, bookPaymentIO);
	}
}
