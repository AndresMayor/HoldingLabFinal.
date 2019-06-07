package model;
/**
*this class contains the information of the Manucfacturing Company 
*/
import java.util.ArrayList;
public abstract class ManufacturingCompany extends Company {

private ArrayList<Product> products;
/**
*Invima constructor 
*@param name the name of the  company
*@param nit the nit of the company
*@param addreess the address of the company
*@param phone the phone of the   company 
*@param employees total employees of the company 
*@param valueAseets value in pesos of the assets
*@param constitucionDate date of incorporation of the company 
*@param legalRepresentative legal name of the company 
*@param floors   floors of the company
*@param type type of the company 
*/ 
public ManufacturingCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors,char type){
	super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);
	products = new ArrayList<Product>();

}

/**
*Gets the products
*@return the products
*/
public ArrayList<Product> getProducts(){
	return products;
}
/**
*Sets the products
*@param products  the products 
*/
public void setProducts(ArrayList<Product> products){
	this.products=products;
}
/**
*the imformation of the products 
*@return the resport of the product 
*/
public String getInformation(){

String msj = "";

for(int i = 0; i < products.size();i++){
    msj += products.get(i).toString();
  }
return msj;
}

/**
*This method gives the company
*@return the report of the company
*/
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