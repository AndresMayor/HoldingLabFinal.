package model;
import java.util.ArrayList;
public abstract class ServiceCompany extends Company{


//Relation
private ArrayList<Poll> polls;



public ServiceCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors,char type){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);
polls = new ArrayList<Poll>();






}

public ArrayList<Poll> getPolls(){

return polls;

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

	return msg;
}


}
