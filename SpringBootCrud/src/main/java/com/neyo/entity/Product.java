package com.neyo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/
/*
@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int quantity;
	private double price;
	/*
	 * public Integer getId() { // TODO Auto-generated method stub return null; }
	 * public Object getName() { // TODO Auto-generated method stub return null; }
	 * public void setName(Object name2) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	/*
	 * public int getQuantity() { return quantity; } public void setQuantity(int
	 * quantity) { this.quantity = quantity; } public String getName() { return
	 * name; } public void setName(String name) { this.name = name; } public double
	 * getPrice() { return price; } public void setPrice(double price) { this.price
	 * = price; } public Integer getid() { return null; } public void setid(double
	 * price) { this.price = price; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

