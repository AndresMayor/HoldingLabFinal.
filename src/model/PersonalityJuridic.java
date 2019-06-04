package model;
/**
*This class contains the informations of the PersonalityJuridic
*/
public abstract class PersonalityJuridic {


//Atrinutes 


private  String name;
private  String nit;
private  String addreess;
private  String phone;
private  int employees;
private  double valueAseets;
private  String constitucionDate;
private  String legalRepresentative;


// Relation
private Building [][] tower;
/**
*Company constructor
*@param name the Company  name
*@param nit the Comapny  nit
*@param addreess the Company addreess
*@param phone the Company phone
*@param employees number of employees in the company 
*@param valueAseets value in pesos of the company 
*@param constitucionDate date of incorporation of the company
*@param legalRepresentative legal name of the company 
*/

public PersonalityJuridic(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower){
	this.name=name;
	this.nit=nit;
	this.addreess=addreess;
	this.phone=phone;
	this.employees=employees;
	this.valueAseets=valueAseets;
	this.constitucionDate=constitucionDate;
	this.legalRepresentative=legalRepresentative;
	tower = new Building[7][20];
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


public String getLegalRepresentative(){
	return legalRepresentative;
}

public void setLegalRepresentative(String legalRepresentative){
	this.legalRepresentative=legalRepresentative;
}

public Building[][] getTower(){
	return tower;
}
public void setTower(Building[][] tower){
	this.tower=tower;
}


}







