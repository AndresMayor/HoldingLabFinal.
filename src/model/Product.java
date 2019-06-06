package model;

public class Product{

	private String name;
	private String code;
	private double waterAmount;
	private int numUnits;

	public Product(String name, String code,double waterAmount,int numUnits){
		this.name=name;
		this.code=code;
		this.waterAmount=waterAmount;
		this.numUnits=numUnits;


	}



	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}



	public String getCode(){
		return code;
	}

	public void setCode(String code){
		this.code=code;
	}

	public double getWaterAmount(){
		return waterAmount;
	}
	public void setWaterAmount(double waterAmount){
		this.waterAmount=waterAmount;
	}


	public int getNumUnits(){
		return numUnits;
	}
	public void setNumUnits(int numUnits){
		this.numUnits=numUnits;
	}

	public String toString(){
		String msg ="";
       
		msg+="Nombre del Producto: "+name+"\n";
		msg+="Codigo del Producto: "+code+"\n";
		msg+="Cantidad de agua gastada: "+waterAmount+"\n";
		msg+="Cantidad de unidades disponibles: "+numUnits+"\n";


		return msg;
	}




}