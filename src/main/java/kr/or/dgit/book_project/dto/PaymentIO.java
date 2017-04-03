package kr.or.dgit.book_project.dto;

import java.util.Date;

public class PaymentIO {
	private int no;					// 출납번호
	private BookInfo bCode; 		// 도서코드
	private BookInfo bSubCode;		// 도서중복코드
	private MemberInfo mCode;		// 회원코드
	private String lendDate;			// 대여일  스트링 바꿈
	private String returnDate;		// 반납일
	
	public PaymentIO() {	}

	public PaymentIO(int no, BookInfo bCode, BookInfo bSubCode, MemberInfo mCode, String lendDate, String returnDate) {
		super();
		this.no = no;
		this.bCode = bCode;
		this.bSubCode = bSubCode;
		this.mCode = mCode;
		this.lendDate = lendDate;
		this.returnDate = returnDate;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public MemberInfo getmCode() {
		return mCode;
	}

	public void setmCode(MemberInfo mCode) {
		this.mCode = mCode;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return String.format("PaymentIO [no=%s, bCode=%s, bSubCode=%s, mCode=%s, lendDate=%s, returnDate=%s]", no,
				bCode, bSubCode, mCode, lendDate, returnDate);
	}
}
