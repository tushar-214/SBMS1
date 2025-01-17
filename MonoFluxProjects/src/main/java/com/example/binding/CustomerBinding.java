package com.example.binding;

import java.time.ZonedDateTime;
import java.util.Date;

public class CustomerBinding {
	private String name;
	private ZonedDateTime  createDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ZonedDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(ZonedDateTime createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "CustomerBinding [name=" + name + ", createDate=" + createDate + "]";
	}
	public CustomerBinding() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerBinding(String name, ZonedDateTime createDate) {
		super();
		this.name = name;
		this.createDate = createDate;
	}

	
	
	
}
