package model;
import java.util.ArrayList;
/**
*this class contains the information of the Service Company
*/
public abstract class ServiceCompany extends Company{


//Relation
private ArrayList<Poll> polls;

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

public ServiceCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors,char type){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);
polls = new ArrayList<Poll>();






}
/**
*Gets the polls
*@return the polls
*/
public ArrayList<Poll> getPolls(){

return polls;

}

/**
*This method gives the company
*@return the report of the company
*/
public String toString(){

	String msg = "";
    msg += "---------------------------------------------------------";
	msg += "El nombre de la empresa es: "+getName()+"\n";
	msg += "Nit de la empresa: "+getNit()+"\n";
	msg += "Direccion de la empresa: "+getAddreess()+"\n";
	msg += "El telefono de le empresa: "+getPhone()+"\n";
	msg += "Cantidad de empleados: "+getEmployees()+"\n";
	msg += "Valor en pesos de los activos: "+getValueAseets()+"\n";
	msg += "Fecha de Cosntitucion: "+getConstitucionDate()+"\n";
	msg += "Representante legal: "+getLegalRepresentative()+"\n";
	msg += "Pisos del edificio: "+getFloors()+"\n";
	msg += "Tipo de organizacion: "+getType()+"\n";

	return msg;
}


}
