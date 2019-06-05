package model;
import java.util.ArrayList;
public class ServiceCompany extends Company{


//Relation
private ArrayList<Poll> polls;



public ServiceCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower,char type){
super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower,type);
polls = new ArrayList<Poll>();




}
}