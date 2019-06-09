package model;
/**
*This class contains the informations of the PersonalityJuridic
*/
public abstract class PersonalityJuridic {


//Atrinutes 


private  String name;
private  String nit;
private  String addreess;
private  String phone;
private  int employees;
private  double valueAseets;
private  String constitucionDate;
private  String legalRepresentative;
private int floors;


// Relation
private Building [][] tower;

/**
*Personality Juridic constructor
*@param name the Personality Juridic name
*@param nit the Personality Juridic  nit
*@param addreess the Personality Juridic addreess
*@param phone the Personality Juridic phone
*@param employees number of employees in the Personality Juridic 
*@param valueAseets value in pesos of the Personality Juridic 
*@param constitucionDate date of incorporation of the Personality Juridic
*@param legalRepresentative legal name of the Personality Juridic
*@param floors    floors of the company 
*/
public PersonalityJuridic(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,int floors ){
	this.name=name;
	this.nit=nit;
	this.addreess=addreess;
	this.phone=phone;
	this.employees=employees;
	this.valueAseets=valueAseets;
	this.constitucionDate=constitucionDate;
	this.legalRepresentative=legalRepresentative;
	tower = new Building[floors][20];
}
/**
*Gets the name
*@return the name
*/
public String getName(){
	return name;

}
/**
*Sets the name 
*@param name the name 
*/
public void setName(String name){
	this.name=name;
}

/**
*Gets the nit
*@return the nit 
*/
public String getNit(){
	return nit;
}
/**
*Sets the nit 
*@param nit the nit 
*/
public void setNit(String nit){
	this.nit = nit;
}
/**
*Gets the Address
*@return the address
*/
public String getAddreess(){
	return addreess;
}
/**
*Sets the Addreess
*@param addreess the Addreess
*/
public void setAddreess(String addreess){
	this.addreess=addreess;
}
/**
*Gets the Phone 
*@return the phone                                                                          
*/
public String getPhone(){
	return phone;
}
/**
*Sets phone
*@param phone the phone
*/
public void setPhone(String phone){
	this.phone=phone;
}
/**
*Gets the employee
*@return the employees
*/
public int getEmployees(){
	return employees;
}
/**
*Sets the employees
*@param employees the employees
*/
public void setEmployees(int employees){
	this.employees=employees;
}
/**
*Gets ValueAseets
*@return the valueAseets
*/
public double getValueAseets(){
	return valueAseets;
}
/**
*Sets the valueAseets
*@param valueAseets the valueAseets
*/
public void setValueAseets(double valueAseets){
	this.valueAseets=valueAseets;
}
/**
*Gets the ConstitucionDate
*@return the constitucionDate
*/
public String getConstitucionDate(){
	return constitucionDate;
}
/**
*Sets the ConstitucionDate
*@param constitucionDate the constitucionDate 
*/
public void setConstitucionDate(String constitucionDate){
	this.constitucionDate=constitucionDate;
}
/**
*Gets the LegatRepresentative
*@return legalRepresentative
*/
public String getLegalRepresentative(){
	return legalRepresentative;
}
/**
*Sets the legalRepresentative
*@param legalRepresentative the legalRepresentative
*/
public void setLegalRepresentative(String legalRepresentative){
	this.legalRepresentative=legalRepresentative;
}
/**
*Gets the Tower
*@return the tower
*/
public Building[][] getTower(){
	return tower;
}
/**
*Sets the Tower
*@param tower the tower
*/
public void setTower(Building[][] tower){
	this.tower=tower;
}
/**
*Gets the Floors
*@return the floors of the building
*/
public int getFloors(){
	return floors;
}
/**
*Sets the floors
*@param floors the floors of the building
*/
public void serFloors(int floors){
	this.floors=floors;
}


/**
*
*
*/
public String recorrierL(String name){
	String msj = "";
	int j = 0;
	boolean centi=false;


	for (int i = 0; i<tower.length;i++){
		if (tower[i][j].getEmployee().getNameEmployee().equals(name)){
			msj = "El empleado es:"+tower[i][j].getExtension();
		}
		centi= true;
	}
	if(centi==true){
	for(int m = 1; m <tower[0].length;m++){
		if (tower[j][m].getEmployee().getNameEmployee().equals(name)){
			msj="El empleado es: "+tower[j][m].getExtension();
		}
	}
}

return msj;

}


/**
*
*
*/
public String recorrierZ(String name){
	String msj= "";


	for (int i =0;i<tower.length;i++){
		if (tower[0][i].getEmployee().getNameEmployee().equals(name)){
			msj+= "El empleado es: "+tower [0][i].getExtension();
		}

	}
   for (int j = 1; j < tower.length;j++){
   	if (tower[j][tower.length-j].getEmployee().getNameEmployee().equals(name)){
   		msj+="El empleado es: "+tower[j][tower.length-j].getExtension();

   	}
   }
   for(int g = 1;g<tower.length;g++){
   	if(tower[tower.length-1][g].getEmployee().getNameEmployee().equals(name)){
   		msj+="El empleado es: "+tower[tower.length-1][g].getExtension();
   	}
   }
   return msj;
}
/**
*
*
*/
public String espiralX(String name){

String msg="";
 for (int i = 0;i<tower.length;i++){
 	if (tower[i][i].getEmployee().getNameEmployee().equals(name)){
 		msg+= "El empleado es: "+tower[i][i].getExtension();
 	}
 }
 for (int p = 0; p<tower.length;p++){
 	if( (tower.length%2==0)|| (tower.length %2 != 0 && p != tower.length / 2)){
 		if (tower[p][tower.length-1-p].getEmployee().getNameEmployee().equals(name)){
 			msg ="El empleado es: "+tower[p][tower.length-1-p].getExtension();
 		}
 	} 



}


return msg;
}
/**
*
*
*/

public String espiralE(String name){
	String msj = "";
	int k = 0;

for (int j = 0; j < tower.length;j+= 2){
	for (int i = 0;i<tower.length;i++){
		if (tower[j][i].getEmployee().getNameEmployee().equals(name)){
			msj += "El empleado es: "+tower[j][i].getExtension();
		}
		else if(k % 2 != 0){
			if(tower[j][tower.length-i-1].getEmployee().getNameEmployee().equals(name)){
				msj+= "El empleado es: "+tower[j][tower.length-i-1].getExtension();
			}
		}
	}
	if (k%2== 0 && j <tower.length-1){
		if (tower[j+1][tower.length-1].getEmployee().getNameEmployee().equals(name)){
			msj += "El empleado es: "+tower[j+1][tower.length-1].getExtension();

	}
		}
		else{
			if (tower[j+1][0].getEmployee().getNameEmployee().equals(name)){
				msj+="El empleado es: "+tower[j+1][0].getExtension();
			}
		}
		k++;
}
return msj;
}
/**
*
*
*/


public String espiralO(String name){
String msj="";

  for(int i = 0; i < tower.length;i++){
  	if(tower[0][i].getEmployee().getNameEmployee().equals(name)){
  		msj+="El empleado es: "+tower[0][i].getExtension();
  	}

  }
  for(int p =0;p>tower[0].length;p++){
  	if (tower[tower.length-1][p].getEmployee().getNameEmployee().equals(name)){
  		msj+="El empleado es: "+tower[tower.length-1][p].getExtension();
  	}
  }
  for (int h = 0 ; h< tower.length;h++){
  	if (tower[h][0].getEmployee().getNameEmployee().equals(name)){
  		msj+= "El empleado es: "+tower[h][0].getExtension();
  	}
  	else if (tower[h][tower.length].getEmployee().getNameEmployee().equals(name)){
  		msj+= "el empleado es: "+tower[h][tower.length].getExtension();
  	}
  }
  return msj;
}

/**
*
*
*
*/
public String espiral(String cargo){
	String msj="";
	int contadorFila1=0;
	int contadorFila2=tower.length-1;
	int contadorColumna1=0;
	int contadorColumna2=tower.length-1;


	while(contadorFila1<contadorFila2&& contadorColumna1 <contadorColumna2){
     for (int i= contadorFila1; i <contadorFila2;i++){
     	if (tower[i][contadorColumna1].getEmployee().getBusinessPosition().equals(cargo)){
     		msj+= "El empleado: "+tower[i][contadorColumna1].getEmployee().getEmail();
     	}
     }
     contadorColumna1++;
     for(int i =contadorColumna1;i<contadorColumna2;i++){
     	if (tower[contadorFila2][i].getEmployee().getBusinessPosition().equals(cargo)){
     		msj+="El empleado: "+tower[contadorFila2][i].getEmployee().getEmail();
     	}
     }
     contadorFila2--;
     for (int i = contadorFila2;i>=contadorFila1;i--){
     	if (tower[i][contadorColumna2].getEmployee().getBusinessPosition().equals(cargo)){
     		msj+="el empleado: "+tower[i][contadorColumna2].getEmployee().getEmail();
     	}
     }
     contadorColumna2--;
     for (int i=contadorColumna2;i>=contadorColumna1;i--){
     	if (tower[contadorFila1][i].getEmployee().getBusinessPosition().equals(cargo)){
     		msj+="El empleado: "+tower[contadorFila1][i].getEmployee().getEmail();
     	}
     }

contadorFila1++;

	}
	return msj;
}


public void addEmployee(String nameEmployee,String positionEmployee,String emailEmployee){
boolean t = false;
	for(int i = 0; i < tower.length && !t;i++){
		for(int k = 0; k < tower[0].length && !t;k++){
			if(tower[i][k].getEmployee().getDisponibility() == false){
				tower[i][k].getEmployee().setName(nameEmployee);
				tower[i][k].getEmployee().setBusinessPosition(positionEmployee);
				tower[i][k].getEmployee().setEmail(emailEmployee);
				tower[i][k].getEmployee().setDisponibility(true);
				t = true;
			}
		}
	}
}




}


