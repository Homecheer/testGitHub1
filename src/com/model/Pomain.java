package com.model;

public class Pomain {
	  private String poid;//�ɹ������
	  private String venderCode; 
	  private String createTime; 
	  private String account; 
	  
	  private String accountName; 
	  private String venderName;
	  private float tipFee;//���ӷ��� 
	  private float productTotal;//��Ʒ�ܼ� 
	  private float poTotal;//�ܼ۸� 
	  private String payType; 
	  private float prePayFee;//���Ԥ������ 
	  private int status; 
	  private String remark; 
	  private String stockTime;//���Ǽ�ʱ�� 
	  private String stockUser;//���Ǽ��û� 
	  private String payTime;//����Ǽ�ʱ�� 
	  private String payUser;//����Ǽ��û� 
	  private String prePayTime;//Ԥ����Ǽ�ʱ�� 
	  private String prePayUser;// 
	  private String endTime;//�˽�ʱ�� 
	  private String endUser;//�˽��û�
	  private String createUser;//������
	  private String userName;//�ɹ�������
	  
	public Pomain() {
		super();
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVenderCode() {
		return venderCode;
	}

	public void setVenderCode(String venderCode) {
		this.venderCode = venderCode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStockTime() {
		return stockTime;
	}

	public void setStockTime(String stockTime) {
		this.stockTime = stockTime;
	}

	public String getStockUser() {
		return stockUser;
	}

	public void setStockUser(String stockUser) {
		this.stockUser = stockUser;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPayUser() {
		return payUser;
	}

	public void setPayUser(String payUser) {
		this.payUser = payUser;
	}

	public String getPrePayTime() {
		return prePayTime;
	}

	public void setPrePayTime(String prePayTime) {
		this.prePayTime = prePayTime;
	}

	public String getPrePayUser() {
		return prePayUser;
	}

	public void setPrePayUser(String prePayUser) {
		this.prePayUser = prePayUser;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndUser() {
		return endUser;
	}

	public void setEndUser(String endUser) {
		this.endUser = endUser;
	}

	public String getPoid() {
		return poid;
	}
	public void setPoid(String poid) {
		this.poid = poid;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	public float getTipFee() {
		return tipFee;
	}
	public void setTipFee(float tipFee) {
		this.tipFee = tipFee;
	}
	public float getProductTotal() {
		return productTotal;
	}
	public void setProductTotal(float productTotal) {
		this.productTotal = productTotal;
	}
	public float getPoTotal() {
		return poTotal;
	}
	public void setPoTotal(float poTotal) {
		this.poTotal = poTotal;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public float getPrePayFee() {
		return prePayFee;
	}
	public void setPrePayFee(float prePayFee) {
		this.prePayFee = prePayFee;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	
}
