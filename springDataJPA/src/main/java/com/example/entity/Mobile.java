package com.example.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobile")

public class Mobile {
	@Id
	private int mid;
	private String mobileName;
	private int price;
	@CreationTimestamp
	private String createdBy;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Mobile(int mid, String mobileName, int price, String createdBy) {
		super();
		this.mid = mid;
		this.mobileName = mobileName;
		this.price = price;
		this.createdBy = createdBy;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", mobileName=" + mobileName + ", price=" + price + ", createdBy=" + createdBy
				+ "]";
	}

	

}
