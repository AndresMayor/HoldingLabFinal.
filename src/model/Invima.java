package model;


public class Invima extends ManufacturingCompany{


public static final char MANUFACTURE_EXPORT = 'A';
public final static char MANUFACTURE_SELL = 'B';
public final static char IMPORT_SELL = 'C';

private String sanitaryRegistration;
private String status;
private String expiration;
private char modality;


public Invima(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,char type,String legalRepresentative,String sanitaryRegistration,String status,String expiration,char modality){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,type,legalRepresentative);

this.sanitaryRegistration=sanitaryRegistration;
this.status=status;
this.expiration=expiration;
this.modality=modality;

}



public String getSanitaryRegistration(){
	return sanitaryRegistration;
}
public void setSanitaryRegistration(String sanitaryRegistration){
	this.sanitaryRegistration=sanitaryRegistration;
}


public String getStatus(){
	return status;
}
public void setStatus(String status){
	this.status=status;
}

public String getExpiration(){
	return expiration;
}
public void setExpiration(String expiration){
	this.expiration=expiration;
}

public char getModality(){
	return modality;
}
public void setModality(char modality){
	this.modality=modality;
}



}