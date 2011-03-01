package org.apakossa.server;

public interface ProductInterface {

	//s�tter alla v�rden
	public void setSize(String size);
	public void setColor(String color);
	public void setName(String name);
	public void setPrice(int price);
	public void setNrSold(int sold);
	public void setPic(String url);
	public void setNrStock(int stock);
	
	//h�mtar alla v�rden
	public String getSize();
	public String getColor();
	public String getName();
	public int getPrice();
	public int getNrSold();
	public String getPic();
	public int getNrStock();
	
}
