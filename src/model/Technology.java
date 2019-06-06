package model;
import java.util.ArrayList;
public class Technology extends ServiceCompany implements Consuption {


public static final String CONSULTANCY ="Consultoria";
public final static String TRAINING = "Capacitacion";
public static final String DEVELOP_SOFTW = "Desarrollo de Software";
public static final String INFRASTRUC_SERVIC = "Infraestructura como servicio";
public static final String SOFTWARE = "Software";
public static final String PLATAFORM = "Plataforma";

private String typeOfService;
private int kiloWatts;




private ArrayList<String> services;

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
public String getTypeOfService(){
	return typeOfService;
}
public void setTypeOfService(String typeOfService){
	this.typeOfService=typeOfService;
}
public int getKiloWatts(){
	return kiloWatts;
}
public void setKiloWatts(int kiloWatts){
	this.kiloWatts=kiloWatts;
}


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
public String toString(){

	String msg ="";
	
	msg += super.toString()+"\n";
	msg +="El tipo de servicio es: "+typeOfService+"\n";
	msg +="La cantidad de kiloWatts registrada es: "+kiloWatts+"\n";
	msg +="Cantidad de arboles que deben plantar: "+calculatedConsuption()+"\n";

   return msg;
}

}