package kr.or.dgit.book_project.dto;

import java.util.Date;
import java.util.List;

public class BookInfo {		 		// 도서
	private String bCode;			// 도서코드
	private String bSubCode;		// 도서 중복 코드
	private String bName;			// 도서명	
	private String author;			// 저자
	private int price;				// 가격
	private String insertDate;		// 도서등록일
	private boolean isDel;			// 도서폐기여부
	private Coden coden;			// 분류 (일단 고침)
	private PublisherInfo publisherinfo;	// 출판사 코드 (일단 고침)
	
	
	public BookInfo() {		}
	
	// 일단 생성자 다 생성
	public BookInfo(String bCode, String bSubCode, String bName, String author, int price, String insertDate,
			boolean isDel, Coden coden, PublisherInfo publisherinfo) {
		super();
		this.bCode = bCode;
		this.bSubCode = bSubCode;
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.insertDate = insertDate;
		this.isDel = isDel;
		this.coden = coden;
		this.publisherinfo = publisherinfo;
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

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public boolean isDel() {
		return isDel;
	}

	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}

	public Coden getCoden() {
		return coden;
	}

	public void setCoden(Coden coden) {
		this.coden = coden;
	}

	public PublisherInfo getPublisherinfo() {
		return publisherinfo;
	}

	public void setPublisherinfo(PublisherInfo publisherinfo) {
		this.publisherinfo = publisherinfo;
	}

	@Override
	public String toString() {
		return String.format(
				"BookInfo [bCode=%s, bSubCode=%s, bName=%s, author=%s, price=%s, insertDate=%s, isDel=%s, coden=%s, publisherinfo=%s]",
				bCode, bSubCode, bName, author, price, insertDate, isDel, coden, publisherinfo);
	}
}
