
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

/**
*This method to be to add a new Company
*@param campany1 new company 
*/
public void addCompany(Company  company1){
        company.add(company1);
}

/**
*To return the report of the companys <br>
*post: the resport is generated<br>
*@return the report of the companys 
*/
public String showCompanys(){
	String msg="";

	for(int i=0;i<company.size();i++){
		msg+= company.get(i).toString();

	}
	return msg;
}

/**
*This method to give the names of the manufacturing companies <br>
*@return names of manufacturing companies 
*/
public String showNameCompanys(){

	String msg = "";

	for(int i = 0; i<company.size();i++){
		if (company.get(i) instanceof ManufacturingCompany){

		msg+=  company.get(i).getName()+"\n";

}
	}
	return msg;
}

/**
*This method is useful to add a product to a company<br>
*pre: name of the company must be not null<br>
*post: report of the company products <br>
*@return cmpany products
*/
public ArrayList<Product> verific (String name){
   ArrayList <Product> msg =null;
    for (int i =0;i<company.size() ;i++){
      if (company.get(i) instanceof ManufacturingCompany ){
      	if( company.get(i).getName().equals(name)){      	
      	  msg = ((ManufacturingCompany)company.get(i)).getProducts();
    }
}
}
return msg;
}

/**
*This method to give the names of the service companies <br>
*@return names if service companies 
*/
public String showCompanysNameService(){

  String msg="";


  for (int i =0 ; i <company.size();i++){
  	if (company.get(i) instanceof ServiceCompany){
  		msg+= company.get(i).getName()+"\n";
  	}
  }

return msg ;

}

/**
*This method is useful to add a Polls to a company<br>
*pre: name of the company must be not null<br>
*post: report of the company polls <br>
*@return cmpany polls
*/
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
/**
*
*
*
*/
public void addEmployeeCompany(String nameCompany,String nameEmployee,String cargoEmploye,String email){

	for (int i = 0;i<company.size();i++){
		if(company.get(i).getName().equals(nameCompany)){
			if(company.get(i).getTower()!=null){
				company.get(i).addEmployee(nameEmployee,cargoEmploye,email);
			}
		}
	}
}

/**
*
*
*
*/
public String reportBuildingL(String nameCompany,String nameEmployee){
	String msg="";

	for (int i =0;i<company.size();i++){
		if (company.get(i).getName().equals(nameCompany)){
			msg+=company.get(i).recorrierL(nameEmployee);
		}
	}
	return msg;
}
/**
*
*
*
*/

public String reportBuildingZ(String nameCompany,String nameEmployee){
	String msg="";
	for (int i = 0;i<company.size();i++){
		if (company.get(i).getName().equals(nameCompany)){
			msg+=company.get(i).recorrierZ(nameEmployee);
		}
	}
	return msg;
}
/**
*
*
*/
public String reportBuildingX(String nameCompany,String nameEmployee){
	String msg="";

	for (int i =0;i<company.size();i++){
		if (company.get(i).getName().equals(nameCompany)){
			msg+= company.get(i).espiralX(nameEmployee);
		}
	}
	return msg;
}
/**
*
*
*/
public String reportBuildingE(String nameCompany,String nameEmployee){
  String msg="";

  for (int i = 0;i<company.size();i++){
  	if (company.get(i).getName().equals(nameCompany)){
  		msg+= company.get(i).espiralE(nameEmployee);
  	}
  }
  return msg;

}
/**
*
*
*/
public String reportBuildingO(String nameCompany,String nameEmployee){
  String msg="";

  for (int i = 0;i<company.size();i++){
  	if (company.get(i).getName().equals(nameCompany)){
  		msg+= company.get(i).espiralO(nameEmployee);
  	}
  }
  return msg;

}
/**
*
*
*/

public String reportBuildingEspiral(String nameCompany,String nameEmployee){
  String msg="";

  for (int i = 0;i<company.size();i++){
  	if (company.get(i).getName().equals(nameCompany)){
  		msg+= company.get(i).espiral(nameEmployee);
  	}
  }
  return msg;

}



}