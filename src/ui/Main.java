/** | Name :Andrés Mayor Aldana    |
    | Algoritmos y Programacion    |
    | Univesidad Icesi             |
    | A00359333                    |
    | Camilo Barrios               |
    | Laboratorio Final               |    
**/

package ui;
import model.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
*This class contains information from the main 
*/
public class Main{

  /**
  *Relation
  */
	private Holding  user;
   
   //Initializer

	private Scanner reader;

	//Constructor

	public Main(){
		init();
		//String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower)
		reader = new Scanner(System.in);
		user = new Holding ("emcali123","1234","cra33a#29-47","304567894",167,200.4003,"20/02/2014","Andres Mayor",3);

	} 
	/**
    *Start of the program 
    */

    public static void main (String[] args){
    	Main m = new Main();
    	m.menu();
    	m.showMenu();
    }
    public void menu(){
    	welcome();
    }
    /**
    *This method is used to create the title of the progam 
    */
    public void welcome(){
    System.out.println(".............................................................................");
    System.out.println("--------------------               Holding               --------------------");
    System.out.println(".............................................................................");

    }
    /**
    *This method serves to show the user the options panel
    */
    public void showOptions(){
  System.out.println("---------------------------------------------------------------------------");
  System.out.println("PLEASE TYPE THE OPTION YOU WANT TO REVIEW."                                 );
  System.out.println("                                                                          |");
  System.out.println("1.Add a company             ");
  System.out.println("                                                                          |");
  System.out.println("2.Business information               ");
  System.out.println("                                                                          |");
  System.out.println("3.Agregar Productos            ");
  System.out.println("                                                                          |");
  System.out.println("4.Add Products              ");
  System.out.println("                                                                          |");
  System.out.println("5.Add Employee       ");
  System.out.println("                                                                          |");
  System.out.println("6.Search Employee in the L building              ");
  System.out.println("                                                                          |");
  System.out.println("7.Search Employee in the building in Z.              ");
  System.out.println("                                                                          |");
  System.out.println("8.Search Employee in the building in X        ");
  System.out.println("                                                                          |");
  System.out.println("9.Search Employee in the building in E        ");
  System.out.println("                                                                          |");
  System.out.println("10.Search Employee in the building in O        ");
  System.out.println("                                                                          |");
  System.out.println("11.Search Employee in the building in Expiral       ");
  System.out.println("                                                                          |");
  System.out.println("12.Exit the program.                                                        ");
  System.out.println("---------------------------------------------------------------------------");


    }
    /**
    *This method is used to select a menu option
    */
    public void showMenu(){
    	int userInput=0;
   while ( userInput != 13){
        showOptions();
        userInput = reader.nextInt();
        reader.nextLine();
    
    if(userInput == 1){
//public PersonalityJuridic(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower){
        
        
    	System.out.println("Company name:");
    	String name = reader.nextLine();
    	System.out.println("Nit of the company:");
    	String nit =reader.nextLine();
    	System.out.println("Company address");
    	String addreess = reader.nextLine();
    	System.out.println("Company phone:");
    	String phone =reader.nextLine();
    	System.out.println("Number of employees");
    	int employees = reader.nextInt();
    	reader.nextLine();
    	System.out.println("Value in pesos of assets:");
    	double valueAseets = reader.nextDouble();
    	reader.nextLine();
    	System.out.println("Date of Consitution DD/MM/AÑO");
    	String constitucionDate = reader.nextLine();
    	System.out.println("Name of the legal representative:");
    	String legalRepresentative = reader.nextLine();
    	System.out.println("Company floors max 7 min 3:");
    	int floors = reader.nextInt();
    	reader.nextLine();
    	
    	System.out.println("What type of Organization is?");
    	System.out.println("A. Agriculture, Hunting, Forestry, Pezca");
    	System.out.println("B. Exploitation of mines and quarries.");
    	System.out.println("C. Manufacturing industry ");
    	System.out.println("D. Electricity, gas and steam");
    	System.out.println("E. Construccion");
    	System.out.println("F. Wholesale and Retail");
    	System.out.println("G. Transportation, storage and communications");
    	System.out.println("H. Est.F / Cieros, Seguros, B.Furniture ");
    	System.out.println("I. Social Communal");
    	char type =reader.nextLine().charAt(0);
    	char typeofservice =' ';
    	if (type == 'A' ){
    		typeofservice = Company.FARM_HUNT_SILVI_FISH;
    	}
    	else if (type == 'B'){
    		typeofservice=Company.MINE_EXPLO_QUARR;
    	}
    	else if (type== 'C'){
    		typeofservice=Company.INDUSTRY_MANUFAC;
    	}
    	else if (type == 'D'){
    		typeofservice=Company.ELECTRY_GAS_STEAM;
    	}
    	else if (type == 'E'){
    		typeofservice=Company.BUILDING;
    	}
    	else if (type== 'F'){
    		typeofservice=Company.COMMERSE_HIGHER_LESS;
    	}
    	else if (type == 'G'){
    		typeofservice=Company.TRANSP_STORAGE_COMMU;
    	}
    	else if (type == 'H'){
    		typeofservice=Company.STATEFINAN_SAFE_ESTATE;
    	}
    	else if (type == 'I'){
    		typeofservice=Company.SOCIAL_COMUNALS;
    	}
    	System.out.println("What type of company you want to add?");
        System.out.println("1.Education company");
        System.out.println("2.Public services company");
        System.out.println("3.Technology company");
        System.out.println("4.Medicines Company");
        System.out.println("5.Food company ");
        int valor= reader.nextInt();
        reader.nextLine();
        
        if (valor== 1){
        	System.out.println("Enter the approval registration number before the MEN");
        	String numRegistry = reader.nextLine();
        	System.out.println("Enter the number of years accredited as a high quality entity:");
        	int acreeditedYears = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Enter the national position According to exams saber11");
        	int positionSaber11 = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Enter the national position According to exams saberPro");
        	int  positionSaberPro = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Name of the rector");
        	String rectorName = reader.nextLine();
        	System.out.println("Select the education sector:");
        	System.out.println("1.high school");
        	System.out.println("2.College");
        	int estatustype = reader.nextInt();
        	reader.nextLine();
        	String estatus = "";
        	if (type == 1){
        		estatus= Education.HIGHSCHOOL;
        	}
        	else if (type == 2){
        		estatus = Education.UNIVERSITY;
        	}
        	System.out.println("Number of active students stratum 1 and 2");
        	int strataOneandTwo = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Total number of active students");
        	int qualityTotal = reader.nextInt();
        	reader.nextLine();
        	System.out.println("The company has been correctly registered");
        	Education educations = new Education(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,numRegistry,acreeditedYears,positionSaber11,positionSaberPro,rectorName,estatus,strataOneandTwo,qualityTotal);

            user.addCompany(educations);

        }
        //String typeOfService, int subscribersActual,int subscribersOneandTwo)
        else if (valor==2){
        	System.out.println("Please select the type of service you provide:");
        	System.out.println("1.Sewerage");
        	System.out.println("2.Energy");
        	System.out.println("3.Aqueduct");
        	int typeSer =reader.nextInt();
        	reader.nextLine();
        	String typeOfService="";
        	if (typeSer ==1){
        		typeOfService=PublicService.SEWERAGE;
        	}
        	else if (typeSer== 2){
        		typeOfService=PublicService.ENERGY;
        	}
        	else if (typeSer ==3){
        		typeOfService=PublicService.AQUEDUCT;
        	}
        	System.out.println("Total number of subscribers");
        	int subscribersActual = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Cantidand of subscribers of estarto 1 and 2");
        	int subscribersOneandTwo= reader.nextInt();
        	reader.nextLine();
        	PublicService services = new PublicService(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,typeOfService,subscribersActual,subscribersOneandTwo);
        	user.addCompany(services);





        }
        else if (valor==3){
        	
        	System.out.println("Select the type of service:");
        	System.out.println("1.Consultancy");
        	System.out.println("2.Training");
        	System.out.println("3.Software development");
        	System.out.println("4.Infrastructure as a service");
        	System.out.println("5.Software as a service");
        	System.out.println("6.Platform as a service");
        	int typeService = reader.nextInt();
        	reader.nextLine();
        	String typeOfService="";
        	
        	if (typeService== 1 ){
        		typeOfService= Technology.CONSULTANCY;
        	}
        	else if (typeService ==2){
        		typeOfService=Technology.TRAINING;
        	}
        	else if (typeService == 3){
        		typeOfService= Technology.DEVELOP_SOFTW;
        	}
        	else if (typeService== 4){
        		typeOfService= Technology.INFRASTRUC_SERVIC;
        	}
        	else if (typeService == 5){
        		typeOfService=Technology.SOFTWARE;
        	}
        	else if (typeService == 6){
        		typeOfService= Technology.PLATAFORM;
        	}
        
        	System.out.println("Amount of energy Consumed in kiloWatts");
        	int kiloWatts = reader.nextInt();
        	reader.nextLine();


        	Technology tecnologia = new Technology(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,typeOfService,kiloWatts);


        	user.addCompany(tecnologia);
        }
        else if (valor==4){
        	
        	System.out.println("Select the type of mode");
        	System.out.println("1.Manufactured Export");
        	System.out.println("2.Manufactured Sale");
        	System.out.println("3.Imported Sale");
        	int modaliti = reader.nextInt();
        	reader.nextLine();
        	char nn = ' ';
        	if (modaliti == 1){
        		nn = Invima.MANUFACTURE_EXPORT;
        	}
        	else if (modaliti == 2){
        		nn = Invima.MANUFACTURE_SELL;
        	}
        	else if (modaliti == 3){
        		nn = Invima.IMPORT_SELL;
        	}
        	System.out.println("Enter the health record ");
        	String sanitaryRegistration = reader.nextLine();
        	System.out.println("State of the medication");
        	String status = reader.nextLine();
        	System.out.println("Expiration");
        	String expiration = reader.nextLine();

        	Invima medicament = new Invima(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,sanitaryRegistration,status,expiration,nn);
        	user.addCompany(medicament);      	

        }
        else if (valor == 5){
        	//boolean imported ,String importer,String conservation
        	System.out.println("The importer is:");
        	String imported = reader.nextLine();
        	System.out.println("Name of the importer");
        	String importer = reader.nextLine();
        	System.out.println("Type of food preservation");
        	System.out.println("1.Ambient Temperature");
        	System.out.println("2.Refrigeration");
        	System.out.println("3.Freezing");
        	int tipo = reader.nextInt();
        	reader.nextLine();
        	String conservacion ="";
        	if (tipo == 1 ){
        		conservacion =Sanitation.ROOM_TEMPERATURE;
        	}
        	else if (tipo == 2 ){
        		conservacion = Sanitation.REFRIGERATION;

        	}
        	else if (tipo == 3 ){
        		conservacion = Sanitation.FREEZING;
        	}
        	Sanitation aliment = new Sanitation(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,imported,importer,conservacion);
            user.addCompany(aliment);
            System.out.println("The company was registered correctly");

        }

    	
}

    


    else if (userInput == 2){

    	System.out.println(user.showCompanys());

    }
    else if (userInput == 3){

    	System.out.println("What manufacturing company do you want to add products to?");
    	System.out.println(user.showNameCompanys()+"\n");
    	String company = reader.nextLine();
    	user.verific(company);
    	System.out.println("How many products do you want to add: ");
    	int cantProduct= reader.nextInt();
    	reader.nextLine();
    	for (int i = 0; i<cantProduct;i++){
    	System.out.println("Product "+(i+1)+":");
    	System.out.println("Type the name of the product:");
    	String name =reader.nextLine();
    	System.out.println("type the product code:");
    	String code = reader.nextLine();
    	System.out.println("Enter the amount of water:");
    	double water = reader.nextDouble();
    	reader.nextLine();
    	System.out.println("Number of product units:");
    	int numUnits = reader.nextInt();
    	reader.nextLine();
    	
        Product p = new Product(name,code,water,numUnits);
        if(user.verific(company) != null){
         user.verific(company).add(p);
     }
 }

}
    else if(userInput== 4){


    	System.out.println("To which Service Company would you like to add surveys:");
    	System.out.println(user.showCompanysNameService());
    	String verific =reader.nextLine();
    	user.verificService(verific);
    	System.out.println("FOLLOWING QUESTIONS BEING 1 NOTHING SATISFIED AND 5 VERY SATISFIED ");
    	System.out.println("1.The service Provided?");
    	int pregunt1 = reader.nextInt();
    	reader.nextLine();
    	System.out.println("2.The response time given?");
    	int pregunt2 = reader.nextInt();
    	reader.nextLine();
    	System.out.println("3.The cost / benefit ratio requested?");
    	int pregunt3 = reader.nextInt();
    	reader.nextLine();

    	Poll pollPrincipal = new Poll (pregunt1,pregunt2,pregunt3);
    	if (user.verificService(verific)!=null){
    	user.verificService(verific).add(pollPrincipal);

    	}

    }
    else if(userInput == 5){
        System.out.println("Name of the company");
        String nameComapy=reader.nextLine();
        System.out.println("Enter the name of the employee");
        String nameEmployee = reader.nextLine();
        System.out.println("Enter the employee's position:");
        String cargEmployee=reader.nextLine();
        System.out.println("Type the employee's email");
        String emailEmployee= reader.nextLine();
        user.addEmployeeCompany(nameComapy,nameEmployee,cargEmployee,emailEmployee);


    }



    else if (userInput == 6){
        System.out.println("Enter the name of the company: ");
        String nameComapy = reader.nextLine();
        System.out.println("Enter the name of the employee:");
        String nameEmployee = reader.nextLine();
        System.out.println(user.reportBuildingL(nameComapy,nameEmployee));
    }
     else if (userInput == 7){
        System.out.println("Enter the name of the company: ");
        String nameComapy = reader.nextLine();
        System.out.println("Enter the name of the employee:");
        String nameEmployee = reader.nextLine();
        System.out.println(user.reportBuildingZ(nameComapy,nameEmployee));
    }
     else if (userInput == 8){
        System.out.println("Enter the name of the company:");
        String nameComapy = reader.nextLine();
        System.out.println("Enter the name of the employee:");
        String nameEmployee = reader.nextLine();
        System.out.println(user.reportBuildingX(nameComapy,nameEmployee));
    }
    else if (userInput == 9){
        System.out.println("Enter the name of the company:");
        String nameComapy = reader.nextLine();
        System.out.println("Enter the name of the employee: ");
        String nameEmployee = reader.nextLine();
        System.out.println(user.reportBuildingE(nameComapy,nameEmployee));
    }
    else if (userInput == 10){
        System.out.println("Enter the name of the company: ");
        String nameComapy = reader.nextLine();
        System.out.println("Enter the name of the employee:");
        String nameEmployee = reader.nextLine();
        System.out.println(user.reportBuildingO(nameComapy,nameEmployee));
    }

     else if (userInput == 11){
        System.out.println("Enter the name of the company:");
        String nameComapy = reader.nextLine();
        System.out.println("Enter the name of the employee:");
        String nameEmployee = reader.nextLine();
        System.out.println(user.reportBuildingEspiral(nameComapy,nameEmployee));
    }

    















    	}  	
    }


    public void init(){
        user = new Holding("emcali123","1234","cra33a#29-47","304567894",167,200.4003,"20/02/2014","Andres Mayor",3);
       
        Company company5 = new Sanitation("FRUVER COMPANY","3929483","CRA 98 # 56-04","8359056532",192,403.2020,"30/09/2015","Andres Felipe Alvarez",4,'A',"Alicia Factory","Fruver S.A.S",Sanitation.REFRIGERATION);
        user.addCompany(company5);

        Education berchams = new Education("BERCHAMS","22333333","Calle 18 # 105-99","3146314092",459,450.000,"10/03/2010","Yolanda Aldana",5,'B',"4456778",10,2,4,"Gersain Aldana","Bachillerato",59,356);
        user.addCompany(berchams);

        Invima invi = new Invima("MEDIC PLUS","3232323","CRA 56 #44-67","32123211",500,520.000,"20/04/2019","RICHARD MAYOR",5,'C',"49030930","Excelente","20/04/18",'A');
        Product product1 = new Product("ACEPTAMINOFEN","12",12333,5);
        ArrayList<Product> medic = new ArrayList<Product>();
        medic.add(product1);
        user.addCompanyProducts(invi,medic);




    }





}