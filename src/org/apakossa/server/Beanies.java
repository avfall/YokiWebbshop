package org.apakossa.server;

public class Beanies implements ProductInterface {
	private String size;
	private String color;
	private String name;
	private int price;
	private int sold;
	private String url;
	private int stock;
	
	public Beanies(String name, String color, String size, int price, int sold, int stock, String url) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
		this.sold = sold;
		this.stock = stock;
		this.url = url;
	}
	
	@Override
	public void setSize(String size) {
		this.size = size;

	}

	@Override
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setPrice(int price) {
		this.price = price;

	}

	@Override
	public void setNrSold(int sold) {
		this.sold = sold;

	}

	@Override
	public void setPic(String url) {
		this.url = url;

	}

	@Override
	public String getSize() {
		return this.size;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getNrSold() {
		return this.sold;
	}

	@Override
	public String getPic() {
		return this.url;
	}

	@Override
	public void setNrStock(int stock) {
		this.stock = stock;
		
	}

	@Override
	public int getNrStock() {
		return this.stock;
	}

}
