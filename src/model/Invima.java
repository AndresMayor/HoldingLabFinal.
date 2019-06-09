package model;
import java.util.ArrayList;
/**
*this class contains the information of the Medicamet Company (Invima)
*/

public class Invima extends ManufacturingCompany implements Consuption{


public static final char MANUFACTURE_EXPORT = 'A';
public final static char MANUFACTURE_SELL = 'B';
public final static char IMPORT_SELL = 'C';

private String sanitaryRegistration;
private String status;
private String expiration;
private char modality;
/**
*Invima constructor 
*@param name the name of the invima  company
*@param nit the nit of the invima  company
*@param addreess the address of the invima  company
*@param phone the phone of the invima  company 
*@param employees total employees of the  invima  company 
*@param valueAseets value in pesos of the assets
*@param constitucionDate date of incorporation of the invima company 
*@param legalRepresentative legal name of the invima company 
*@param floors   floors of the company 
*@param sanitaryRegistration health registration of the invima company 
*@param status  status of the medicament 
*@param expiration expiration of the medicament 
*@param modality type of the modality the medicament 
*/

public Invima(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors,char type,String sanitaryRegistration,String status,String expiration,char modality){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);

this.sanitaryRegistration=sanitaryRegistration;
this.status=status;
this.expiration=expiration;
this.modality=modality;

}

/**
*Gets the health registration 
*@return the health registration of the invima  
*/
public String getSanitaryRegistration(){
	return sanitaryRegistration;
}
/**
*Sets the health registration
*@param sanitaryResgistration the health registratio of the invima company 
*/
public void setSanitaryRegistration(String sanitaryRegistration){
	this.sanitaryRegistration=sanitaryRegistration;
}

/**
*Gets the status of the medicament 
*@return the estatus of the medicament 
*/
public String getStatus(){
	return status;
}
/**
*Sets the status of the medicament 
*@param status  the status of the medicament 
*/
public void setStatus(String status){
	this.status=status;
}
/**
*Gets the expiration of the medicament 
*@return the expiration of the medicament 
*/
public String getExpiration(){
	return expiration;
}
/**
*Sets the expiration of the medicament 
*@param expiration  the expiration of the medicament  
*/
public void setExpiration(String expiration){
	this.expiration=expiration;
}
/**
*Gets type of the modality the medicament 
*@return the type of the modality yhe medicament 
*/
public char getModality(){
	return modality;
}
/**
*Sets the type of the modality the medicamet  
*@param modality the type of the medicament 
*/
public void setModality(char modality){
	this.modality=modality;
}
/**
*this method calculates the amount of trees thar the company must plant
*@return  number of trees that the company has to plant 
*/

public double calculatedConsuption(){
	int tressToSow=0;
    int liters =0;
	for (int i =0;i<getProducts().size();i++){
		liters += getProducts().get(i).getWaterAmount();

		if (liters >= 1  &&  liters <= 140){
			tressToSow = 6;
		}
		else if (liters >= 141 && liters <=800){
			tressToSow = 25;
		}
		else if (liters >800){
			tressToSow = 200;
		}
	}
	return tressToSow;

}


/**
*This method gives the invima  company report
*@return the report of the invima  company
*/
public String toString(){

String msg = "";

 msg += super.toString();
 msg +="Numero del registro sanitario: "+sanitaryRegistration+"\n";
 msg +="El estado es: "+status+"\n";
 msg +="La Expiracion es: "+expiration+"\n";
 msg +="La modalidad es: "+modality+"\n";
 msg += "---------------------------------------------------------";

return msg;


}


}