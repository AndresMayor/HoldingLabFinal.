package model;
/**
*This class contains the informations of the Company 
*/
public class Company extends PersonalityJuridic{


public final static char FARM_HUNT_SILVI_FISH ='A';
public final static char MINE_EXPLO_QUARR ='B';
public final static char INDUSTRY_MANUFAC = 'C';
public final static char ELECTRY_GAS_STEAM= 'D';
public final static char BUILDING = 'E';
public final static char COMMERSE_HIGHER_LESS = 'F';
public final static char TRANSP_STORAGE_COMMU = 'G';
public final static char STATEFINAN_SAFE_ESTATE = 'H';
public final static char SOCIAL_COMUNALS = 'I';

//Attribute

private  char type;

/**
*Holding constructor
*@param name the Personality Juridic name
*@param nit the Personality Juridic  nit
*@param addreess the Personality Juridic addreess
*@param phone the Personality Juridic phone
*@param employees number of employees in the Personality Juridic 
*@param valueAseets value in pesos of the Personality Juridic 
*@param constitucionDate date of incorporation of the Personality Juridic
*@param legalRepresentative legal name of the Personality Juridic
*@param tower   company Building
*@param type the type of the company 
*/
public Company(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower,char type){
	super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower);
	this.type=type;

}

/**
*Gets of the type company
*@return type of the company 
*/
public char getType(){
	return type;
}
/**
*Sets of the type company
*@param type type of the company 
*/
public void setType(char type){
	this.type=type;
}



}