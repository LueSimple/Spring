package com.spring403.domain;

public class ProductClass {
    private int proCID;
    private String proCName;
    private String proCDetail;
   public  ProductClass() {
	   
   }
public int getProCID() {
	return proCID;
}
public void setProCID(int proCID) {
	this.proCID = proCID;
}
public String getProCName() {
	return proCName;
}
public void setProCName(String proCName) {
	this.proCName = proCName;
}
public String getProCDetail() {
	return proCDetail;
}
public void setProCDetail(String proCDetail) {
	this.proCDetail = proCDetail;
}
@Override
public String toString() {
	return "ProductClass [proCID=" + proCID + ", proCName=" + proCName + ", proCDetail=" + proCDetail + "]";
}

   
}
