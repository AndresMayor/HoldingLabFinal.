package model;


public class PublicService extends ServiceCompany implements Tax{

	public static final String SEWERAGE = "Alcantarillado";
	public final static String ENERGY = "Energia";
	public static final String AQUEDUCT = "Acueducto";

	private String typeOfService;
    private int subscribersActual;
    private int subscribersOneandTwo;

    public PublicService(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower,char type,String typeOfService, int subscribersActual,int subscribersOneandTwo){
    	super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,tower,type);
    	this.typeOfService=typeOfService;
    	this.subscribersActual=subscribersActual;
    	this.subscribersOneandTwo=subscribersOneandTwo;
    }

    public String getTypeOfService(){
    	return typeOfService;
    }
    public void setTypeOfService(String typeOfService){
    	this.typeOfService=typeOfService;
    }

    public int getSubscribersActual(){
    	return subscribersActual;
    }
    public void setSubscribersActual(int subscribersActual){
    	this.subscribersActual=subscribersActual;
    }


    public int getSubscribersOneandTwo(){
    	return subscribersOneandTwo;
    }
    public void setSubscribersOneandTwo(int subscribersOneandTwo){
    	this.subscribersOneandTwo=subscribersOneandTwo;
    }


    public double calculatedProCultured(){
    	double porcenProCulture=0.0;

    	porcenProCulture += 40 - (subscribersActual/100);

     	if (porcenProCulture<0){

    		porcenProCulture = 0.0;
    	}

    	return porcenProCulture;
    }





}