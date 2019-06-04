
package model;
import java.util.ArrayList;

public class Holding extends PersonalityJuridic {


private ArrayList<Company> company;

public Holding(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower){
	super(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower);
    company = new ArrayList<Company>();
}
}