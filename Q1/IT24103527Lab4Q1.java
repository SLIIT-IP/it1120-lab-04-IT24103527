import java.util.Scanner ; 
       public class IT24103527Lab4Q1 {
       public static void main(String[] args) {

//Declaring variableas
        int TheNumber;

//Create an object called input to Scanner
        Scanner input = new Scanner(System.in);

//Taking user inputs
        System.out.println("Enter a number:") ;
        TheNumber = input.nextInt() ; 

//Checking the conditions 
        if(TheNumber>0)
   {
       System.out.println("The number is:positive") ; }
        
        else if(TheNumber<0)
   {
        System.out.println("The number is:Negative") ; }

       else 
   {    
        System.out.println("The nuber is Zero") ; }
 }
}