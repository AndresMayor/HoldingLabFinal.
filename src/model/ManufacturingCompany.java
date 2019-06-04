package model;

import java.util.ArrayList;
public class ManufacturingCompany extends Company {

private ArrayList<Product> products;


public ManufacturingCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower,char type){
	super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower,type);
	products = new ArrayList<Product>();

}


public ArrayList<Product> getProducts(){
	return products;
}

public void setProducts(ArrayList<Product> products){
	this.products=products;
}



}