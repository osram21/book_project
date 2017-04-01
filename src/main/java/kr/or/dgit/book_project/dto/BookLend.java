package kr.or.dgit.book_project.dto;

public class BookLend {
	private BookInfo bCode;			// 도서코드
	private BookInfo bSubCode;		// 도서 중복 코드
	private boolean isLending;		// 대여 여부
	private int bLendCount;			// 총 대여횟수
	private BookInfo bookinfo; // 도서
	private PublisherInfo publisherinfo; // 출판사
	
	public BookLend() {		}

	public BookLend(BookInfo bCode, BookInfo bSubCode, boolean isLending, int bLendCount) {
		this.bCode = bCode;
		this.bSubCode = bSubCode;
		this.isLending = isLending;
		this.bLendCount = bLendCount;
	}

	
	public BookLend(BookInfo bCode, BookInfo bSubCode, boolean isLending, int bLendCount, BookInfo bookinfo,
			PublisherInfo publisherinfo) {
		super();
		this.bCode = bCode;
		this.bSubCode = bSubCode;
		this.isLending = isLending;
		this.bLendCount = bLendCount;
		this.bookinfo = bookinfo;
		this.publisherinfo = publisherinfo;
	}

	public BookInfo getBookinfo() {
		return bookinfo;
	}

	public void setBookinfo(BookInfo bookinfo) {
		this.bookinfo = bookinfo;
	}

	public PublisherInfo getPublisherinfo() {
		return publisherinfo;
	}

	public void setPublisherinfo(PublisherInfo publisherinfo) {
		this.publisherinfo = publisherinfo;
	}

	public BookInfo getbCode() {
		return bCode;
	}

	public void setbCode(BookInfo bCode) {
		this.bCode = bCode;
	}

	public BookInfo getbSubCode() {
		return bSubCode;
	}

	public void setbSubCode(BookInfo bSubCode) {
		this.bSubCode = bSubCode;
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

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s", bCode, bSubCode,	isLending, bLendCount);
	}
}
