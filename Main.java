import java.util.Scanner;

/**
 * This is the example code for nested if statements and swithch statements
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the Scanner for user input
    Scanner input = new Scanner (System.in);

    // ask the user if the animal has feathers 
    System.out.println("Does the animal have feathers? yes/no");
    String feathers = input.nextLine();

    // does the animal have feathers 
    if(feathers.equals("yes")){
      // what colour are the feathers 
      System.out.pintln("Are the feathers blue or red?");
      String featherColour = input.nextLine();
      // check to which colour they entered 
      if(featherColour.equals("red")) {
        System.out.println("This is a cardinal");
      }else if{featherColour.equals("blue")){
        SYstem.out.println("This is a blue jay");
      }
    }else{
     // Fur or Scales?
     System.out.println("Does the animal have scales or fur?");
     String outside = input.nextLine();

     // scales?
     if(outside.equals("scales")){

     }else if(outside.equals("fur")){

     }
    }



    // switch case example
    // vending machine code
    System.ot.println("Please select a choice from 1 to 6");
    int choice = input.nextInt();


    if(choice == 1){
       System.out.println("Here is your choclate bar");
    }else if(choice == 2){
       System.out.println("Here is your bubble gum");
    }else if(choice == 3){
       System.out.println("Here is your licorice");
    }else if (choice == 4){
       System.out.println("Here are your Skittles");
    }else{
       System.out.println("That is an invalid choice");
    }

    switch(choice){
      case 1:
       System.out.println("Here is your choclate bar");
       break; 
       case 2: 
         System.out.println("Here is your bubble gum");
         break;
        case 3: 
          System.out.println("Here is your licorice");
          break;
        case 4:
          System.out.println("Here are your Skittles");
          break;
        default:
           System.out.println("That is an invalid choice");
           break;
    }

    System.out.println("All done!");
  }
}
