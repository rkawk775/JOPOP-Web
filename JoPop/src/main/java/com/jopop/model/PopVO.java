package com.jopop.model;

import java.util.Date;

// 팝업-전시 VO
public class PopVO {
	private int pId;   //상품 번호
	private String pName; //상품 명
	private Date startDate; //팝업 시작 일자
	private Date endDate;  //팝업 종료 일자 
	private String pAddr1; // 팝업 주소
	private String pAddr2;
	private String pAddr3;
	private int pPrice;    //팝업 입장료
	private String pIntro; // 이용안내
	private String pContents; // 팝업 소개
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getpAddr1() {
		return pAddr1;
	}
	public void setpAddr1(String pAddr1) {
		this.pAddr1 = pAddr1;
	}
	public String getpAddr2() {
		return pAddr2;
	}
	public void setpAddr2(String pAddr2) {
		this.pAddr2 = pAddr2;
	}
	public String getpAddr3() {
		return pAddr3;
	}
	public void setpAddr3(String pAddr3) {
		this.pAddr3 = pAddr3;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpIntro() {
		return pIntro;
	}
	public void setpIntro(String pIntro) {
		this.pIntro = pIntro;
	}
	public String getpContents() {
		return pContents;
	}
	public void setpContents(String pContents) {
		this.pContents = pContents;
	}
	@Override
	public String toString() {
		return "PopVO [pId=" + pId + ", pName=" + pName + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", pAddr1=" + pAddr1 + ", pAddr2=" + pAddr2 + ", pAddr3=" + pAddr3 + ", pPrice=" + pPrice
				+ ", pIntro=" + pIntro + ", pContents=" + pContents + "]";
	}
	
	
}