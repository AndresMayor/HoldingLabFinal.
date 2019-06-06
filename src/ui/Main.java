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
  System.out.println("1.Agregar una empresa              ");
  System.out.println("                                                                          |");
  System.out.println("2.Imformacion de las empresas                ");
  System.out.println("                                                                          |");
  System.out.println("3.Agregar Productos            ");
  System.out.println("                                                                          |");
  System.out.println("4.Agregar Encuestas              ");
  System.out.println("                                                                          |");
  System.out.println("5.               ");
  System.out.println("                                                                          |");
  System.out.println("6.               ");
  System.out.println("                                                                          |");
  System.out.println("7.               ");
  System.out.println("                                                                          |");
  System.out.println("8.Exit the program.                                                        ");
  System.out.println("---------------------------------------------------------------------------");


    }
    /**
    *This method is used to select a menu option
    */
    public void showMenu(){
    	int userInput=0;
   while (userInput != 8){
        showOptions();
        userInput = reader.nextInt();
        reader.nextLine();
    
    if(userInput == 1){
//public PersonalityJuridic(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower){
        
        
    	System.out.println("Nombre de la empresa:");
    	String name = reader.nextLine();
    	System.out.println("Nit de la empresa:");
    	String nit =reader.nextLine();
    	System.out.println("Direccion de la empresa");
    	String addreess = reader.nextLine();
    	System.out.println("Telefono de la empresa:");
    	String phone =reader.nextLine();
    	System.out.println("Numero de empleados");
    	int employees = reader.nextInt();
    	reader.nextLine();
    	System.out.println("Valor en pesos de los activos");
    	double valueAseets = reader.nextDouble();
    	reader.nextLine();
    	System.out.println("Fecha de Consitucion");
    	String constitucionDate = reader.nextLine();
    	System.out.println("Nombre del representante legal:");
    	String legalRepresentative = reader.nextLine();
    	System.out.println("Cuantos pisos tiene la empresa:");
    	int floors = reader.nextInt();
    	reader.nextLine();
    	
    	System.out.println("Que tipo de Organizacion es:");
    	System.out.println("A. Agricultura,Caza,Silvicultura,Pezca");
    	System.out.println("B. Explotacion de minas y canteras.");
    	System.out.println("C. Industria Manufacturera ");
    	System.out.println("D. Electricidad,gas y vapor ");
    	System.out.println("E. Construccion");
    	System.out.println("F. Comercio al por mayor y al por menor");
    	System.out.println("G. Transporte, almacenamiento y comunicaciones");
    	System.out.println("H. Est.F/Cieros ,Seguros,B.Inmuebles ");
    	System.out.println("I. Comunales Sociales");
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
    	System.out.println("Que tipo de empresa desea agregar");
        System.out.println("1.Empresa de educacion");
        System.out.println("2.Empresa de Servicios Publicos ");
        System.out.println("3.Empresa de tecnologia");
        System.out.println("4.Empresa de Medicamentos");
        System.out.println("5.Empresa de Alimentos ");
        int valor= reader.nextInt();
        reader.nextLine();
        
        if (valor== 1){
        	System.out.println("Digite el numero de registro de aprobacion ante el MEN");
        	String numRegistry = reader.nextLine();
        	System.out.println("Digite el numero de años acreditados como entidad de alta calidad:");
        	int acreeditedYears = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Digite el puesto nacional Segun examenes saber11");
        	int positionSaber11 = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Digite el puesto nacional Segun examenes saberPro");
        	int  positionSaberPro = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Nombre del rector");
        	String rectorName = reader.nextLine();
        	System.out.println("Seleccione el sector educativo:");
        	System.out.println("1.Bachillerato");
        	System.out.println("2.Universidad");
        	int estatustype = reader.nextInt();
        	reader.nextLine();
        	String estatus = "";
        	if (type == 1){
        		estatus= Education.HIGHSCHOOL;
        	}
        	else if (type == 2){
        		estatus = Education.UNIVERSITY;
        	}
        	System.out.println("Cantidad de estudiantes activos estrato 1 y 2 ");
        	int strataOneandTwo = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Cantidad total de estudiantes activos");
        	int qualityTotal = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Se ha registrado correctamente la empresa");
        	Education educations = new Education(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,numRegistry,acreeditedYears,positionSaber11,positionSaberPro,rectorName,estatus,strataOneandTwo,qualityTotal);

            user.addCompany(educations);

        }
        //String typeOfService, int subscribersActual,int subscribersOneandTwo)
        else if (valor==2){
        	System.out.println("Por favor seleccione el tipo de servicio que prestan:");
        	System.out.println("1.Alcantarillado");
        	System.out.println("2.Energia");
        	System.out.println("3.Acueducto");
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
        	System.out.println("Cantidad total de suscriptores");
        	int subscribersActual = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Cantidand de suscriptores de estarto 1 y 2");
        	int subscribersOneandTwo= reader.nextInt();
        	reader.nextLine();
        	PublicService services = new PublicService(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,typeOfService,subscribersActual,subscribersOneandTwo);
        	user.addCompany(services);





        }
        else if (valor==3){
        	
        	System.out.println("Seleccione el tipo de servicio:");
        	System.out.println("1.Consultoria");
        	System.out.println("2.Capacitacion");
        	System.out.println("3.Desarrollo de Software");
        	System.out.println("4.Infraestructura como servicio.");
        	System.out.println("5.Software como servicio.");
        	System.out.println("6.Plataforma como servicio");
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
        
        	System.out.println("Cantidad de energia Consumida en kiloWatts");
        	int kiloWatts = reader.nextInt();
        	reader.nextLine();


        	Technology tecnologia = new Technology(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,typeOfService,kiloWatts);


        	user.addCompany(tecnologia);
        }
        else if (valor==4){
        	
        	System.out.println("Seleccione el tipo de modalidad  ");
        	System.out.println("1.Exportacion Manufacturada");
        	System.out.println("2.Venta Manufacturada");
        	System.out.println("3.Venta Importada");
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
        	System.out.println("Digite el registro sanitario ");
        	String sanitaryRegistration = reader.nextLine();
        	System.out.println("Estado del medicamento");
        	String status = reader.nextLine();
        	System.out.println("Vencimiento");
        	String expiration = reader.nextLine();

        	Invima medicament = new Invima(name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,floors,typeofservice,sanitaryRegistration,status,expiration,nn);
        	user.addCompany(medicament);      	

        }
        else if (valor == 5){
        	//boolean imported ,String importer,String conservation
        	System.out.println("El importador es :");
        	String imported = reader.nextLine();
        	System.out.println("Nombre de la importadora");
        	String importer = reader.nextLine();
        	System.out.println("Tipo de conservacion del alimento");
        	System.out.println("1.Temperatura de Ambiente ");
        	System.out.println("2.Refrigeracion");
        	System.out.println("3.Congelacion");
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
            System.out.println("Se registro correctamente la empresa");

        }

    	
}

    


    else if (userInput == 2){

    	System.out.println(user.showCompanys());

    }
    else if (userInput == 3){

    	System.out.println("A que empresa de manufactura le desea agregar productos ?");
    	System.out.println(user.showNameCompanys()+"\n");
    	String company = reader.nextLine();
    	user.verific(company);
    	System.out.println("Cuantos productos desea agregar: ");
    	int cantProduct= reader.nextInt();
    	reader.nextLine();
    	for (int i = 0; i<cantProduct;i++){
    	System.out.println("Product "+(i+1)+":");
    	System.out.println("Digite el nombre del producto:");
    	String name =reader.nextLine();
    	System.out.println("digite el codigo del producto:");
    	String code = reader.nextLine();
    	System.out.println("Digite la cantidad de agua:");
    	double water = reader.nextDouble();
    	reader.nextLine();
    	System.out.println("Numero de unidades del producto:");
    	int numUnits = reader.nextInt();
    	reader.nextLine();
    	
        Product p = new Product(name,code,water,numUnits);
        if(user.verific(company) != null){
         user.verific(company).add(p);
     }
 }

}
    else if(userInput== 4){


    	System.out.println("A que Empresa de Servicios le desea agregar encuestas:");
    	System.out.println(user.showCompanysNameService());
    	String verific =reader.nextLine();
    	user.verificService(verific);
    	System.out.println("CALIFICA DE 1 A 5 LAS SIGUIENTES PREGUNTAS  SIENDO 1 NADA SATISFECHO Y 5 MUY SATISFECHO ");
    	System.out.println("1.El servicio Prestado ?");
    	int pregunt1 = reader.nextInt();
    	reader.nextLine();
    	System.out.println("2.El tiempo de respuesta dado?");
    	int pregunt2 = reader.nextInt();
    	reader.nextLine();
    	System.out.println("3.La relacion costo/Beneficio alquirido?");
    	int pregunt3 = reader.nextInt();
    	reader.nextLine();

    	Poll pollPrincipal = new Poll (pregunt1,pregunt2,pregunt3);
    	if (user.verificService(verific)!=null){
    	user.verificService(verific).add(pollPrincipal);

    	}

    }

    	}  	
    }


    public void init(){


    }





}