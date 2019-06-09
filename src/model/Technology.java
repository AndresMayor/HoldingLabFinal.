package model;
import java.util.ArrayList;
/**
*this class contains the information of the Technology
*/
public class Technology extends ServiceCompany implements Consuption {


public static final String CONSULTANCY ="Consultoria";
public final static String TRAINING = "Capacitacion";
public static final String DEVELOP_SOFTW = "Desarrollo de Software";
public static final String INFRASTRUC_SERVIC = "Infraestructura como servicio";
public static final String SOFTWARE = "Software";
public static final String PLATAFORM = "Plataforma";

private String typeOfService;
private int kiloWatts;

//Relations 
private ArrayList<String> services;

/**
*Technology  Constructor
*@param name the name of the Technology  company
*@param nit the nit of the Technology company
*@param addreess the address of the Technology company
*@param phone the phone of the Technology company 
*@param employees total employees of the  Technology company 
*@param valueAseets value in pesos of the assets
*@param constitucionDate date of incorporation of the Technology company 
*@param legalRepresentative legal name of the Technology company
*@param floors   floors of the company 
*@param typePfService type of the service the technology
*@param kiloWatts kilowatts consumed of the technology company 
*/

public Technology(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors,char type,String typeOfService,int kiloWatts){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);

this.typeOfService=typeOfService;
this.kiloWatts=kiloWatts;

  services =new ArrayList<String>();
  services.add(CONSULTANCY);
  services.add(TRAINING);
  services.add(DEVELOP_SOFTW);
  services.add(INFRASTRUC_SERVIC);
  services.add(SOFTWARE);
  services.add(PLATAFORM);

	}
/**
*Gets the type of the service the technology 
*@return the type of service 
*/

public String getTypeOfService(){
	return typeOfService;
}
/**
*Sets the type of the service the technology 
*@param typeOfService the type of the service 
*/
public void setTypeOfService(String typeOfService){
	this.typeOfService=typeOfService;
}
/**
*Gets the kilowatts consumed of the technology company 
*@return the kilowatts 
*/

public int getKiloWatts(){
	return kiloWatts;
}
/**
*Sets the  type of the service the technology 
*@param kilowatts  the  type of the service 
*/
public void setKiloWatts(int kiloWatts){
	this.kiloWatts=kiloWatts;
}

/**
*this method calculates the amount of trees thar the company must plant
*@return  number of trees that the company has to plant 
*/
public double calculatedConsuption(){
int tressToSow=0;

if (getKiloWatts() >=1 && getKiloWatts() <= 1000){
	tressToSow = 8;
}
else if (getKiloWatts() >=1001 && getKiloWatts ()<=3000){
	tressToSow = 35;
}
else if (getKiloWatts() > 3000){
	tressToSow=500;
}
return tressToSow;
}
/**
*This method gives the Technology company
*@return the report of the Technology  company
*/
public String toString(){

	String msg ="";

	msg += super.toString()+"\n";
	msg +="El tipo de servicio es: "+typeOfService+"\n";
	msg +="La cantidad de kiloWatts registrada es: "+kiloWatts+"\n";
	msg +="Cantidad de arboles que deben plantar: "+calculatedConsuption()+"\n";
	msg += "---------------------------------------------------------";


   return msg;
}

}