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
*Personality Juridic constructor
*@param name the Personality Juridic name
*@param nit the Personality Juridic  nit
*@param addreess the Personality Juridic addreess
*@param phone the Personality Juridic phone
*@param employees number of employees in the Personality Juridic 
*@param valueAseets value in pesos of the Personality Juridic 
*@param constitucionDate date of incorporation of the Personality Juridic
*@param legalRepresentative legal name of the Personality Juridic
*@param tower   company Building
*/
public PersonalityJuridic(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors ){
	this.name=name;
	this.nit=nit;
	this.addreess=addreess;
	this.phone=phone;
	this.employees=employees;
	this.valueAseets=valueAseets;
	this.constitucionDate=constitucionDate;
	this.legalRepresentative=legalRepresentative;
	tower = new Building[floors][20];
}
/**
*Gets the name
*@return the name
*/
public String getName(){
	return name;

}
/**
*Sets the name 
*@param name the name 
*/
public void setName(String name){
	this.name=name;
}

/**
*Gets the nit
*@return the nit 
*/
public String getNit(){
	return nit;
}
/**
*Sets the nit 
*@param nit the nit 
*/
public void setNit(String nit){
	this.nit = nit;
}
/**
*Gets the Address
*@return the address
*/
public String getAddreess(){
	return addreess;
}
/**
*Sets the Addreess
*@param addreess the Addreess
*/
public void setAddreess(String addreess){
	this.addreess=addreess;
}
/**
*Gets the Phone 
*@return the phone                                                                          
*/
public String getPhone(){
	return phone;
}
/**
*Sets phone
*@param phone the phone
*/
public void setPhone(String phone){
	this.phone=phone;
}
/**
*Gets the employee
*@return the employees
*/
public int getEmployees(){
	return employees;
}
/**
*Sets the employees
*@param employees the employees
*/
public void setEmployees(int employees){
	this.employees=employees;
}
/**
*Gets ValueAseets
*@return the valueAseets
*/
public double getValueAseets(){
	return valueAseets;
}
/**
*Sets the valueAseets
*@param valueAseets the valueAseets
*/
public void setValueAseets(double valueAseets){
	this.valueAseets=valueAseets;
}
/**
*Gets the ConstitucionDate
*@return the constitucionDate
*/
public String getConstitucionDate(){
	return constitucionDate;
}
/**
*Sets the ConstitucionDate
*@param constitucionDate the constitucionDate 
*/
public void setConstitucionDate(String constitucionDate){
	this.constitucionDate=constitucionDate;
}
/**
*Gets the LegatRepresentative
*@return legalRepresentative
*/
public String getLegalRepresentative(){
	return legalRepresentative;
}
/**
*Sets the legalRepresentative
*@param legalRepresentative the legalRepresentative
*/
public void setLegalRepresentative(String legalRepresentative){
	this.legalRepresentative=legalRepresentative;
}
/**
*Gets the Tower
*@return the tower
*/
public Building[][] getTower(){
	return tower;
}
/**
*Sets the Tower
*@param tower the tower
*/
public void setTower(Building[][] tower){
	this.tower=tower;
}




}







