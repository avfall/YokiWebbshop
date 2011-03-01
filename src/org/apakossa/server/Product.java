package org.apakossa.server;

public class Product {

	private String size;
	private String color;
	private String name;
	private int price;
	private int sold;
	private String url;
	private int stock;
	
	public Product(String name, String color, String size, int price, int sold, int stock, String url) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
		this.sold = sold;
		this.stock = stock;
		this.url = url;
	}
	
	public void setSize(String size) {
		this.size = size;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setPrice(int price) {
		this.price = price;

	}

	public void setNrSold(int sold) {
		this.sold = sold;

	}

	public void setPic(String url) {
		this.url = url;

	}
	
	public void setNrStock(int stock) {
		this.stock = stock;
	}
	
	public String getSize() {
		return this.size;
	}

	public String getColor() {
		return this.color;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public int getNrSold() {
		return this.sold;
	}

	public String getPic() {
		return this.url;
	}
	
	public int getNrStock() {
		return this.stock;
	}

}
