import java.util.Scanner ; 
       public class IT24103527Lab4Q3 {
       public static void main(String[] args) {
//declaring the variables
          int TheNumber ;
          String signed ; 
//create an object called create to Scanner class
          Scanner input = new Scanner(System.in);
//Take user inputs
          System.out.println("Enter a number:") ; 
          TheNumber = input.nextInt() ; 
//Checking the conditions
        signed = (TheNumber>0)? "positive" : (TheNumber<0)? "Negative" : "zero" ;
 //Display the output
        System.out.println("The number is :" +signed) ; 
     }
}
