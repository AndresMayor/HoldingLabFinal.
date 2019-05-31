package model;

public class Education extends ServiceCompany{


public static final String HIGHSCHOOL = "Bachillerato";
public final static String UNIVERSITY = "Universidad";

private String numRegistry;
private int acreeditedYears;
private int positionSaber11;
private int positionSaberPro;
private String rectorName;
private String educationSector;
private int strataOneandTwo;
private int qualityTotal;


public Education(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,char type,String legalRepresentative,String numRegistry,int acreeditedYears,int positionSaber11,int positionSaberPro,String rectorName,String educationSector,int strataOneandTwo,int qualityTotal){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,type,legalRepresentative);


this.numRegistry=numRegistry;
this.acreeditedYears=acreeditedYears;
this.positionSaber11=positionSaber11;
this.positionSaberPro=positionSaberPro;
this.rectorName=rectorName;
this.educationSector=educationSector;
this.strataOneandTwo=strataOneandTwo;
this.qualityTotal=qualityTotal;

}


public String getNumRegistry(){
	return numRegistry;
}


public void setNumRegistry(String numRegistry){
	this.numRegistry=numRegistry;
}


public int getAcreeditedYears(){
	return acreeditedYears;
}


public void setAcreeditedYears(int acreeditedYears){
	this.acreeditedYears=acreeditedYears;
}


public int getPositionSaber11(){
	return positionSaber11;
}


public void setPositionSaber11(int positionSaber11){
	this.positionSaber11=positionSaber11;
}



public int getPositionSaberPro(){
	return positionSaberPro;
}
public void setPositionSaberPro(int positionSaberPro){
	this.positionSaberPro=positionSaberPro;
}


public String getRectorName(){
	return rectorName;
}
public void setRectorName(String rectorName){
	this.rectorName=rectorName;
}

public String getEducationSector(){
	return educationSector;

}
public void setEducationSector(String educationSector){
	this.educationSector=educationSector;
}


public int getStrataOneandTwo(){
	return strataOneandTwo;
}
public void setStrataOneandTwo(int strataOneandTwo){
	this.strataOneandTwo=strataOneandTwo;
}



public int getQualityTotal(){
	return qualityTotal;
}
public void setQualityTotal(int qualityTotal){
	this.qualityTotal=qualityTotal;
}





}






