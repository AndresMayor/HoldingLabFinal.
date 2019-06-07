package model;
/**
*this class contains the information of the SanitationCompany 
*/

public class Sanitation extends ManufacturingCompany{



public static final String ROOM_TEMPERATURE="Temperatura de Ambiente";
public final static String REFRIGERATION = "Refrigeracion";
public final static String FREEZING = "CONGELACION";


private String imported;
private String  importer;
private String conservation;

/**
*Sanitation Constructor
*@param name the name of the sanitation company
*@param nit the nit of the sanitation company
*@param addreess the address of the sanitation company
*@param phone the phone of the sanitation company 
*@param employees total employees of the  sanitation company 
*@param valueAseets value in pesos of the assets
*@param constitucionDate date of incorporation of the sanitation company 
*@param legalRepresentative legal name of the sanitation company
*@param floors   floors of the company 
*@param imported name of the imported
*@param importer name of the importer
*@param conservation type of the conservation
*/
public Sanitation(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors ,char type,String imported ,String importer,String conservation){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);

this.imported=imported;
this.importer=importer;
this.conservation=conservation;

}

/**
*Gets the imported
*@return the name of the imported
*/
public String getImported(){
	return imported;
}
/**
*Sets the imported 
*@param imported  the name of the imported 
*/
public void setImported(String imported){
	this.imported=imported;
}
/**
*Gets the importer 
*@return the name of the importer
*/
public String getImporter(){
	return importer;
}
/**
*Sets the importer 
*@param importer  the  name of the importer 
*/
public void setImporter(String importer){
	this.importer=importer;
}
/**
*Gets the conservation
*@return type of the conservation the aliment
*/
public String getConservation(){
	return conservation;
}
/**
*Sets the conservation 
*@param conservation  type of the conservation the aliment 
*/
public void setConservation(String conservation){
	this.conservation=conservation;
}

/**
*This method gives the sanitation company report
*@return the report of the sanitation company
*/
public String toString(){

	String msg = "";

	msg+=super.toString();
	msg+="El importador es: "+imported+"\n";
	msg+="Nombre del fabricador: "+importer+"\n";
	msg+="Tipo de conservacio: "+conservation+"\n";
	return msg;
}

}