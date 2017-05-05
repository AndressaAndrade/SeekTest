package model;

import java.util.ArrayList;

/**Customer Entity
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */

public class Customer {
	
	private CustomerEnum name;
	private ArrayList<Product> product;
	private double total;
	
	public Customer(){
			
		
	}
	

	public CustomerEnum getName() {
		return name;
	}
	public void setName(CustomerEnum name) {
		this.name = name;
	}


	public ArrayList<Product> getProduct() {
		return product;
	}


	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	} 

}
