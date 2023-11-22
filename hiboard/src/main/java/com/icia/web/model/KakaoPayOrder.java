package com.icia.web.model;

import java.io.Serializable;

public class KakaoPayOrder implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	//api 중 요청에 해당
	//api의 결제 준비 단계에 해당하는 것 해준거임
	//이거는 우리 프로그램에서만 사용할려고 만든거라서 카카오페이랑 이름 같지 않아도됨
	//컨트롤러에서 서비스에 보내려고 만든거임
	
	private String partnerOrderId;	 		//가맹점 주문번호, 최대 100자
	private String partnerUserId;			//가맹점 회원 id, 최대 100자
	private String itemName;				//상품명, 최대 100자
	private String itemCode;				//상품코드, 최대 100자
	private int quantity;					//상품 수량
	private int totalAmount;				//상품 총액
	private int taxFreeAmount;				//상품 비과세 금액
	private int vatAmount;					//상품 부가세 금액
											//값을 보내지 않을 경우 다음과 같이 VAT 자동 계산
											//(상품총액 - 상품 비과세 금액)/11 : 소숫점 이하 반올림	

	private String tId;						//결제 고유 번호, 20자
	private String pgToken;					//결제승인 요청을 인증하는 토큰
											//사용자 결제 수단 선택 완료 시, approval_url로 redirection해줄 때 pg_token을 query string으로 전달
	
	//생성자
	public KakaoPayOrder()
	{
		partnerOrderId ="";	 
		partnerUserId ="";		
		itemName ="";
		itemCode ="";	
		quantity = 0;		
		totalAmount = 0;
		taxFreeAmount = 0;
		vatAmount = 0;
		
		tId = "";
		pgToken = "";
	}

	public String getPartnerOrderId() {
		return partnerOrderId;
	}

	public void setPartnerOrderId(String partnerOrderId) {
		this.partnerOrderId = partnerOrderId;
	}

	public String getPartnerUserId() {
		return partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTaxFreeAmount() {
		return taxFreeAmount;
	}

	public void setTaxFreeAmount(int taxFreeAmount) {
		this.taxFreeAmount = taxFreeAmount;
	}

	public int getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(int vatAmount) {
		this.vatAmount = vatAmount;
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public String getPgToken() {
		return pgToken;
	}

	public void setPgToken(String pgToken) {
		this.pgToken = pgToken;
	}

	
}
