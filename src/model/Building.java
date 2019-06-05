package model;
/**
*This class contains the informations of the Building
*/
public class Building {

//Attribute
private String extension;

//Relation
private Employee employee;

   /**
   *Building Constructor
   *@param extension extension of the building 
   *@param employee employee of the cubicle 
   */
   public Building(String extension,Employee employee){
   	this.extension=extension;


   }

   /**
   *Gets extension of the building 
   *@return extension of the building 
   */
	public String getExtension(){
		return extension;
	}

	/**
   *Sets extension of the building 
   *@param extension extension of the building 
   */
	public void setExtension(String extension){
		this.extension=extension;
	}
	/**
   *Gets of the employees 
   *@return the employee
   */
	public Employee getEmployee(){
		return employee;
	}
	/**
   *Sets of the Employee
   *@param employee the employeee
   */
	public void setEmployee(Employee employee){
		this.employee=employee;
	}






}