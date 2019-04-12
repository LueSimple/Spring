package com.spring403.domain;

public class Product {
  private int proID;
  private String proName;
  private int proNo;
  private String proPic;
  private int proCID;
  private double proPrice;
  private String proDetail;
  public Product() {
	  
  }
public int getProID() {
	return proID;
}
public void setProID(int proID) {
	this.proID = proID;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public int getProNo() {
	return proNo;
}
public void setProNo(int proNo) {
	this.proNo = proNo;
}
public String getProPic() {
	return proPic;
}
public void setProPic(String proPic) {
	this.proPic = proPic;
}
public int getProCID() {
	return proCID;
}
public void setProCID(int proCID) {
	this.proCID = proCID;
}
public double getProPrice() {
	return proPrice;
}
public void setProPrice(double proPrice) {
	this.proPrice = proPrice;
}
public String getProDetail() {
	return proDetail;
}
public void setProDetail(String proDetail) {
	this.proDetail = proDetail;
}
@Override
public String toString() {
	return "Product [proID=" + proID + ", proName=" + proName + ", proNo=" + proNo + ", proPic=" + proPic + ", proCID="
			+ proCID + ", proPrice=" + proPrice + ", proDetail=" + proDetail + "]";
}


}
