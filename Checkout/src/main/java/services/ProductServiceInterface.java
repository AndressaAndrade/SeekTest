package services;

import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import model.Advertising;
import model.Customer;
import model.Deal;
import model.Discount;
import model.Product;


/**Interface to get resouces of REST Apis
 * @author Andressa de Andrade Freitas
 * @return ArrayList<Customer>
 */	
public interface ProductServiceInterface {


	public Product getProduct()throws JAXBException;

	public Advertising getDeal()throws JAXBException;
	
	public ArrayList<Customer> getCostumer()throws JAXBException;


	public Advertising getDiscount()throws JAXBException;
}
