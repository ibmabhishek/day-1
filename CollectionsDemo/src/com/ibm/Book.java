//Book class is in different package to be accessible to all other packages
package com.ibm;
public class Book{
	private String title;
	private float price;
	private int publishYear;

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public float getPrice() {
		
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title)  {
		
		this.title = title;
	}
	
	
	//Here we are overiding toString function to return price as well name
	
	@Override
	public String toString() {
		return "{price = " +this.price+ ", title: "+this.title+", publishYear:"+this.publishYear+"}";
		
	}
	
}