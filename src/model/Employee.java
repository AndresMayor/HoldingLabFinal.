package model;
/**
*This class contains the informations of the Employee
*/
public class Employee{

	private String name;
	private String businessPosition;
	private String email;
	
/**
*Employee Constructor 
*@param name name of the employee
*@param bussinesPosition position of the employee 
*@param email email of the employee
*/

	public Employee(String name, String businessPosition,String email){
		this.name=name;
		this.businessPosition=businessPosition;
		this.email=email;
	}

	/**
	*Gets of the name employee
	*@return name of the employee
	*/
	public String getName(){
		return name;
	}
	/**
	*Sets of the name employee
	*@param name the name employee
	*/
	public void setName(String name){
		this.name=name;
	}
	/**
	*Gets of the businessPosition
	*@return businessPosition position of the employee
	*/
	public String getBusinessPosition(){
		return businessPosition;
	}
	/**
	*Sets of the businessPosition
	*@param businessPosition position of the employee
	*/	
	public void setBusinessPosition(String businessPosition){
		this.businessPosition=businessPosition;
	}
	/**
	*Gets of the email employee
	*@return the email employee
	*/
	public String getEmail(){
		return email;
	}
	/**
	*Sets of the email employee
	*@param email the email of the employee
	*/
	public void setEmail(String email){
		this.email=email;
	}


	
}