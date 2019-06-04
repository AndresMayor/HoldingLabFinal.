package model;
import java.util.ArrayList;
public class Technology extends ServiceCompany{


public static final String CONSULTANCY ="Consultoria";
public final static String TRAINING = "Capacitacion";
public static final String DEVELOP_SOFTW = "Desarrollo de Software";
public static final String INFRASTRUC_SERVIC = "Infraestructura como servicio";
public static final String SOFTWARE = "Software";
public static final String PLATAFORM = "Plataforma";

private String typeOfService;




private ArrayList<String> services;

public Technology(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower,char type,String typeOfService){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower,type);

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