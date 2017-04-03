package kr.or.dgit.book_project.dto;

import java.util.Date;
import java.util.List;

public class MemberLend {
	private MemberInfo memberinfo;	// 회원코드
	private boolean isPosbl;		// 대여가능여부
	private int delayCount;			// 연체 횟수
	private int mLendCount;			// 총 대여 횟수	
	private int mNowCount;			// 현재 대여 권수
	private Date blackDate;			// 대여금지일
	private List<PaymentIO> paymentIo;
	
	public MemberLend() {	}

	public MemberLend(MemberInfo mCode, boolean isPosbl, int delayCount, int mLendCount, int mNowCount,	Date blackDate) {
		this.mCode = mCode;
		this.isPosbl = isPosbl;
		this.delayCount = delayCount;
		this.mLendCount = mLendCount;
		this.mNowCount = mNowCount;
		this.blackDate = blackDate;
	}

	public MemberInfo getmCode() {
		return mCode;
	}

	public void setmCode(MemberInfo mCode) {
		this.mCode = mCode;
	}

	public boolean isPosbl() {
		return isPosbl;
	}

	public void setPosbl(boolean isPosbl) {
		this.isPosbl = isPosbl;
	}

	public int getDelayCount() {
		return delayCount;
	}

	public void setDelayCount(int delayCount) {
		this.delayCount = delayCount;
	}

	public int getmLendCount() {
		return mLendCount;
	}

	public void setmLendCount(int mLendCount) {
		this.mLendCount = mLendCount;
	}

	public int getmNowCount() {
		return mNowCount;
	}

	public void setmNowCount(int mNowCount) {
		this.mNowCount = mNowCount;
	}

	public Date getBlackDate() {
		return blackDate;
	}

	public void setBlackDate(Date blackDate) {
		this.blackDate = blackDate;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s", mCode, isPosbl, delayCount, mLendCount, mNowCount, blackDate);
	}
}
