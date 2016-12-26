package com.ngx20080110.bean.ch5;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="person10")
public class Person10 {
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name="first", column=@Column(name="person_first")),
		@AttributeOverride(name="last", column=@Column(name="person_last", length=20))
	})
	private Name10 name;
	
	@Column(name="person_email")
	private String email;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="name", column=@Column(name="cat_name", length=35)),
		@AttributeOverride(name="color", column=@Column(name="cat_color"))
	})
	private Cat10 pet;

	public Name10 getName() {
		return name;
	}

	public void setName(Name10 name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cat10 getPet() {
		return pet;
	}

	public void setPet(Cat10 pet) {
		this.pet = pet;
	}
	
	
}
