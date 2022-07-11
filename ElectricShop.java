package com.codingassignment5;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ElectricShop")
public class ElectricShop {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int price;

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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "ElectricShop [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
	public ElectricShop(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public ElectricShop() {
		super();
	}
   
}
