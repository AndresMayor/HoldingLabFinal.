
package model ;
/**
*This class contains the informations of the Company 
*/
public abstract class Company {


//Atrinutes 

public final static char FARM_HUNT_SILVI_FISH ='A';
public final static char MINE_EXPLO_QUARR ='B';
public final static char INDUSTRY_MANUFAC = 'C';
public final static char ELECTRY_GAS_STEAM= 'D';
public final static char BUILDING = 'E';
public final static char COMMERSE_HIGHER_LESS = 'F';
public final static char TRANSP_STORAGE_COMMU = 'G';
public final static char STATEFINAN_SAFE_ESTATE = 'H';
public final static char SOCIAL_COMUNALS = 'I';


private  String name;
private  String nit;
private  String addreess;
private  String phone;
private  int employees;
private  double valueAseets;
private  String constitucionDate;
private  char type;
private  String legalRepresentative;

/**
*Company constructor
*@param name the Company  name
*@param nit the Comapny  nit
*@param addreess the Company addreess
*@param phone the Company phone
*@param employees number of employees in the company 
*@param valueAseets value in pesos of the company 
*@param constitucionDate date of incorporation of the company
*@param type type of organization
*@param legalRepresentative legal name of the company 
*/

public Company(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,char type,String legalRepresentative){
	this.name=name;
	this.nit=nit;
	this.addreess=addreess;
	this.phone=phone;
	this.employees=employees;
	this.valueAseets=valueAseets;
	this.constitucionDate=constitucionDate;
	this.type=type;
	this.legalRepresentative=legalRepresentative;
}


public String getName(){
	return name;

}
public void setName(String name){
	this.name=name;
}


public String getNit(){
	return nit;
}
public void setNit(String nit){
	this.nit = nit;
}


public String getAddreess(){
	return addreess;
}
public void setAddreess(){
	this.addreess=addreess;
}


public String getPhone(){
	return phone;
}
public void setPhone(String phone){
	this.phone=phone;
}


public int getEmployees(){
	return employees;
}
public void setEmployees(int employees){
	this.employees=employees;
}

public double getValueAseets(){
	return valueAseets;
}
public void setValueAseets(double valueAseets){
	this.valueAseets=valueAseets;
}


public String getConstitucionDate(){
	return constitucionDate;
}
public void setConstitucionDate(String constitucionDate){
	this.constitucionDate=constitucionDate;
}

public char getType(){
	return type;
}

public void setType(char type){
	this.type=type;
}


public String getLegalRepresentative(){
	return legalRepresentative;
}

public void setLegalRepresentative(String legalRepresentative){
	this.legalRepresentative=legalRepresentative;
}



}