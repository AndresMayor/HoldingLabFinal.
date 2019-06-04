package model;


public class Building {


private String extension;

//Relation
private Employee employee;


   public Building(String extension,Employee employee){
   	this.extension=extension;


   }

	public String getExtension(){
		return extension;
	}
	public void setExtension(String extension){
		this.extension=extension;
	}

	public Employee getEmployee(){
		return employee;
	}
	public void setEmployee(Employee employee){
		this.employee=employee;
	}






}