package model;

import java.util.ArrayList;
public abstract class ManufacturingCompany extends Company {

private ArrayList<Product> products;


public ManufacturingCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors,char type){
	super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);
	products = new ArrayList<Product>();

}


public ArrayList<Product> getProducts(){
	return products;
}

public void setProducts(ArrayList<Product> products){
	this.products=products;
}

public String getInformation(){

String msj = "";

for(int i = 0; i < products.size();i++){
    msj += products.get(i).toString();
  }
return msj;
}

public void addProduct(ArrayList<Product> pro){

products = pro;

}


public String toString(){

	String msg = "";

	msg += "El nombre de la empresa es: "+getName()+"\n";
	msg += "Nit de la empresa: "+getNit()+"\n";
	msg += "Direccion de la empresa: "+getAddreess()+"\n";
	msg += "El telefono de le empresa: "+getPhone()+"\n";
	msg += "Cantidad de empleados: "+getEmployees()+"\n";
	msg += "Valor en pesos de los activos: "+getValueAseets()+"\n";
	msg += "Fecha de Cosntitucion: "+getConstitucionDate()+"\n";
	msg += "Representante legal: "+getLegalRepresentative()+"\n";
	msg += "Dimension del edificio: "+getTower()+"\n";
	msg += "Tipo de organizacion: "+getType()+"\n";


	for(int i = 0 ; i < products.size(); i ++){

		msg+= products.get(i).toString()+"\n";
	}


	return msg;



}


}