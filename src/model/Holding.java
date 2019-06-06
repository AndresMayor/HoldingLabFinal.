
package model;
import java.util.ArrayList;
/**
*This class contains the informations of the Holding
*/
public  class Holding extends PersonalityJuridic {

//Relation
private ArrayList<Company> company;

/**
*Holding constructor
*@param name the Personality Juridic name
*@param nit the Personality Juridic  nit
*@param addreess the Personality Juridic addreess
*@param phone the Personality Juridic phone
*@param employees number of employees in the Personality Juridic 
*@param valueAseets value in pesos of the Personality Juridic 
*@param constitucionDate date of incorporation of the Personality Juridic
*@param legalRepresentative legal name of the Personality Juridic
*@param tower   company Building
*/
public Holding(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors){
	super(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors);
    company = new ArrayList<Company>();
}


public void addCompany(Company  company1){
        company.add(company1);
}
public String showCompanys(){
	String msg="";

	for(int i=0;i<company.size();i++){
		msg+= company.get(i).toString();

	}
	return msg;
}



public String showNameCompanys(){

	String msg = "";

	for(int i = 0; i<company.size();i++){
		if (company.get(i) instanceof ManufacturingCompany){

		msg+=  company.get(i).getName()+"\n";

}
	}
	return msg;



}



public ArrayList<Product> verific (String m){
   ArrayList <Product> msg =null;
    for (int i =0;i<company.size() ;i++){
      if (company.get(i) instanceof ManufacturingCompany ){
      	if( company.get(i).getName().equals(m)){      	
      	  msg = ((ManufacturingCompany)company.get(i)).getProducts();
    }
}
}
return msg;
}




public String infoProductos(){
	String msg = "";

	for (int i  = 0 ; i <company.size();i++){


	}
	return msg;
}
public String showCompanysNameService(){

  String msg="";


  for (int i =0 ; i <company.size();i++){
  	if (company.get(i) instanceof ServiceCompany){
  		msg+= company.get(i).getName()+"\n";
  	}
  }

return msg ;

}
public ArrayList<Poll> verificService(String name ){
	ArrayList<Poll> mgs = null;
	for (int i =0;i<company.size();i++){
		if(company.get(i) instanceof ServiceCompany){
		  if (company.get(i).getName().equals(name)){
			mgs = ((ServiceCompany) company.get(i)).getPolls();

		}
	}
}
	return mgs ;
}




}