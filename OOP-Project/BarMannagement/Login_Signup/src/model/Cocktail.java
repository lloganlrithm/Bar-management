package model;

public class Cocktail {
	private String name;
	private String ImgSrc;
	private String price;
	private String color;
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImgSrc() {
		return ImgSrc;
	}
	
	public void setImgSrc(String imgSrc) {
		this.ImgSrc = imgSrc;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
