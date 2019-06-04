package model;

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



private  char type;




public Company(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][]tower,char type){
	super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower);
	this.type=type;

}




public char getType(){
	return type;
}

public void setType(char type){
	this.type=type;
}



}