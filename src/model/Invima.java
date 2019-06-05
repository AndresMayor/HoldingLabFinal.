package model;
import java.util.ArrayList;
public class Invima extends ManufacturingCompany implements Consuption{


public static final char MANUFACTURE_EXPORT = 'A';
public final static char MANUFACTURE_SELL = 'B';
public final static char IMPORT_SELL = 'C';

private String sanitaryRegistration;
private String status;
private String expiration;
private char modality;


public Invima(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower,char type,String sanitaryRegistration,String status,String expiration,char modality){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower,type);

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


}