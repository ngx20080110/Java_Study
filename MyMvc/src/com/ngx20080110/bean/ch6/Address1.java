package com.ngx20080110.bean.ch6;

public class Address1 {
	private Integer addressId;
	private String addressDetail;
	public Address1() {}
	public Address1(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
}
