package model;

public class Sanitation extends ManufacturingCompany{



public static final String ROOM_TEMPERATURE="Temperatura de Ambiente";
public final static String REFRIGERATION = "Refrigeracion";
public final static String FREEZING = "CONGELACION";


private boolean imported;
private String  importer;
private String conservation;



public Sanitation(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower,char type,boolean imported ,String importer,String conservation){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower,type);

this.imported=imported;
this.importer=importer;
this.conservation=conservation;

}


public boolean getImported(){
	return imported;
}
public void setImported(boolean imported){
	this.imported=imported;
}

public String getImporter(){
	return importer;
}
public void setImporter(String importer){
	this.importer=importer;
}

public String getConservation(){
	return conservation;
}

public void setConservation(String conservation){
	this.conservation=conservation;
}

}