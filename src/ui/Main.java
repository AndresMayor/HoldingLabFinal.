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
/**
*This class contains information from the main 
*/
public class Main{

  /**
  *Relation
  */
	private PersonalityJuridic user;
   
   //Initializer

	private Scanner reader;

	//Constructor

	public Main(){
		init();
		reader = new Scanner(System.in);

	} 
	/**
    *Start of the program 
    */

    public static void main (String[] args){
    	Main m =new Main();
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
  System.out.println("2.               ");
  System.out.println("                                                                          |");
  System.out.println("3.               ");
  System.out.println("                                                                          |");
  System.out.println("4.               ");
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
        showOptions();
        userInput = reader.nextInt();
        reader.nextLine();
    
    if(userInput == 1){


    }

    else if (userInput == 2){

    }

    }


    public void init(){

    }





}