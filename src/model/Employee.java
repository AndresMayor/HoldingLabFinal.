package model;
public class Employee{

	private String name;
	private String businessPosition;
	private String email;
	



	public Employee(String name, String businessPosition,String email){
		this.name=name;
		this.businessPosition=businessPosition;
		this.email=email;
	}



	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getBusinessPosition(){
		return businessPosition;
	}
	public void setBusinessPosition(String businessPosition){
		this.businessPosition=businessPosition;
	}


	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}


	
}