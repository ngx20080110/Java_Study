package com.ngx20080110.ch7.service;

public class Chinese implements Person {
	private Axe axe;
	public Axe getAxe() {
		return axe;
	}
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}
}
