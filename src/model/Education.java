package model;
/**
*This class contains the informations of the Education Company 
*/
public class Education extends ServiceCompany implements Tax{


public static final String HIGHSCHOOL = "Bachillerato";
public final static String UNIVERSITY = "Universidad";
//Attributes 
private String numRegistry;
private int acreeditedYears;
private int positionSaber11;
private int positionSaberPro;
private String rectorName;
private String educationSector;
private int strataOneandTwo;
private int qualityTotal;

/**
*Education constructor
*@param name the Personality Juridic name
*@param nit the Personality Juridic  nit
*@param addreess the Personality Juridic addreess
*@param phone the Personality Juridic phone
*@param employees number of employees in the Personality Juridic 
*@param valueAseets value in pesos of the Personality Juridic 
*@param constitucionDate date of incorporation of the Personality Juridic
*@param legalRepresentative legal name of the Personality Juridic
*@param tower   company Building
*@param type the type of the company 
*@param numRegistry aproval registration number 
*@param acreeditedYears years of high quality
*@param positionSaber11 national position tests know 11
*@param positionSaberPro national stand tests know pro 11
*@param rectorName name of the rector company
*@param educationSector education sector 
*@param strataOneandTwo active students stratum one and two 
*@param qualityTotal total number of active students 
*/
public Education(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors,char type,String numRegistry,int acreeditedYears,int positionSaber11,int positionSaberPro,String rectorName,String educationSector,int strataOneandTwo,int qualityTotal){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,type);


this.numRegistry=numRegistry;
this.acreeditedYears=acreeditedYears;
this.positionSaber11=positionSaber11;
this.positionSaberPro=positionSaberPro;
this.rectorName=rectorName;
this.educationSector=educationSector;
this.strataOneandTwo=strataOneandTwo;
this.qualityTotal=qualityTotal;

}
/**
*Gets aproval registration number 
*@return the numRegistry aproval 
*/
public String getNumRegistry(){
	return numRegistry;
}
/**
*Sets aproval registration number 
*@param numRegistry yhe numRegistry aproval
*/
public void setNumRegistry(String numRegistry){
	this.numRegistry=numRegistry;
}
/**
*Gets  years of high quality
*@return acreeditedYears of the education company 
*/
public int getAcreeditedYears(){
	return acreeditedYears;
}
/**
*Sets years of high quality 
*@param acreeditedYears of the education company 
*/
public void setAcreeditedYears(int acreeditedYears){
	this.acreeditedYears=acreeditedYears;
}
/**
*Gets national position test know 11
*@return positionSaber11 of the education company 
*/
public int getPositionSaber11(){
	return positionSaber11;
}
/**
*Sets national position test know 11
*@param positionSaber11 of the education company 
*/
public void setPositionSaber11(int positionSaber11){
	this.positionSaber11=positionSaber11;
}
/**
*Gets national stand test know pro 11
*@return positionSaberPro of the education company
*/
public int getPositionSaberPro(){
	return positionSaberPro;
}
/**
*Sets national stand test know pro 11
*@param positionSaberPro of the education company
*/
public void setPositionSaberPro(int positionSaberPro){
	this.positionSaberPro=positionSaberPro;
}
/**
*Gets name of the rector company
*@return the name of the rector name 
*/
public String getRectorName(){
	return rectorName;
}
/**
*Sets name of the rector company
*@param rectorName the name of the rector company 
*/
public void setRectorName(String rectorName){
	this.rectorName=rectorName;
}
/**
*Gets education sector 
*@return education sector 
*/
public String getEducationSector(){
	return educationSector;

}
/**
*sets education sector 
*@param educationSector the education sector 
*/

public void setEducationSector(String educationSector){
	this.educationSector=educationSector;
}
/**
*Gets active students stratum one and two
*@return strataOneandTwo of the students 
*/
public int getStrataOneandTwo(){
	return strataOneandTwo;
}
/**
*Sets active students stratum one and two
*@param strataOneandTwo of the active estudents 
*/

public void setStrataOneandTwo(int strataOneandTwo){
	this.strataOneandTwo=strataOneandTwo;
}
/**
*Gets total number of active students 
*@return qualityTotal of the estudents 
*/
public int getQualityTotal(){
	return qualityTotal;
}
/**
*Sets total number of active students 
*@param qualityToltal of the estudents
*/
public void setQualityTotal(int qualityTotal){
	this.qualityTotal=qualityTotal;
}

/**
*This method calculates the pro culture tax
*@return tax pro culture
*/

public double calculatedProCultured(){
	double porcenProCulture=0.0;

	porcenProCulture += 20 -(strataOneandTwo/100);

	if (porcenProCulture < 0 ){
		porcenProCulture = 0.0;
	}
	return porcenProCulture;
}


/**
*This method gives the education company report
*@return the report of the ducation company
*/
public String toString(){
	String msg ="";

	msg+=super.toString()+"\n";
	msg+="Numero del registro: "+numRegistry+"\n";
	msg+="Numero de años acreditados de alta calidad ante el MEN: "+acreeditedYears+"\n";
	msg+="Puesto nacional en la pruebas saber 11: "+positionSaber11+"\n";
	msg+="Puesto nacional en las pruebas saber pro: "+positionSaberPro+"\n";
	msg+="Nombre del rector: "+rectorName+"\n";
	msg+="Sector educativo: "+educationSector+"\n";
	msg+="Cantidad de estudiantes activos estrato 1 y 2: "+strataOneandTwo+"\n";
	msg+="Cantidad total de estudiantes: "+qualityTotal+"\n";
    msg+= "---------------------------------------------------------";


	return msg;
}


}






