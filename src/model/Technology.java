package model;
import java.util.ArrayList;
public class Technology extends Company{


public static final String CONSULTANCY ="Consultoria";
public final static String TRAINING = "Capacitacion";
public static final String DEVELOP_SOFTW = "Desarrollo de Software";
public static final String INFRASTRUC_SERVIC = "Infraestructura como servicio";
public static final String SOFTWARE = "Software";
public static final String PLATAFORM = "Plataforma";

private String typeOfService;




private ArrayList<String> services;

public Technology(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,char type,String legalRepresentative,String typeOfService){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,type,legalRepresentative);

this.typeOfService=typeOfService;

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
}