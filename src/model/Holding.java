
package model;
import java.util.ArrayList;
/**
*This class contains the informations of the Holding
*/
public class Holding extends PersonalityJuridic {

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
public Holding(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower){
	super(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower);
    company = new ArrayList<Company>();
}
}