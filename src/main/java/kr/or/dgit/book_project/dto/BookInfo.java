package kr.or.dgit.book_project.dto;

import java.util.Date;

public class BookInfo {		 		// 도서
	private String bCode;			// 도서코드
	private String bSubCode;		// 도서 중복 코드
	private String bName;			// 도서명	
	private String author;			// 저자
	private int price;				// 가격
	private Date insert_date;		// 도서등록일
	private boolean isDel;			// 도서폐기여부
	private Coden coden;			// 분류 (일단 고침)
	private PublisherInfo publisherinfo;	// 출판사 코드 (일단 고침)
	private BookLend booklend; //추가햇음
	
	public BookInfo() {		}

	public BookInfo(String bCode, String bSubCode, String bName, String author,
					int price, Date insert_date, boolean isDel, Coden coden, PublisherInfo publisherinfo) {
		this.bCode = bCode;
		this.bSubCode = bSubCode;
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.insert_date = insert_date;
		this.isDel = isDel;
		this.coden = coden;
		this.publisherinfo = publisherinfo;
	}
	
	// 일단 생성자 다 생성
	public BookInfo(String bCode, String bSubCode, String bName, String author, int price, Date insert_date,
			boolean isDel, Coden coden, PublisherInfo publisherinfo, BookLend booklend) {
		super();
		this.bCode = bCode;
		this.bSubCode = bSubCode;
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.insert_date = insert_date;
		this.isDel = isDel;
		this.coden = coden;
		this.publisherinfo = publisherinfo;
		this.booklend = booklend;
	}
	// 도서대여정보 겟
	public BookLend getBooklend() {
		return booklend;
	}
	// 도서대여정보 셋
	public void setBooklend(BookLend booklend) {
		this.booklend = booklend;
	}

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbSubCode() {
		return bSubCode;
	}

	public void setbSubCode(String bSubCode) {
		this.bSubCode = bSubCode;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}

	public boolean isDel() {
		return isDel;
	}

	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}

	public Coden getcName() {
		return coden;
	}

	public void setcName(Coden coden) {
		this.coden = coden;
	}

	public PublisherInfo getpCode() {
		return publisherinfo;
	}

	public void setpCode(PublisherInfo publisherinfo) {
		this.publisherinfo = publisherinfo;
	}

	@Override
	public String toString() {
		return String.format(
				"%s, %s, %s, %s, %s, %s, %s, %s,%s",
				bCode, bSubCode, bName, author, price, insert_date, isDel, coden, publisherinfo);
	}
}
