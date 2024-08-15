import java.util.Scanner ; 
        public class IT24103527Lab4Q2 {
        public static void main(String[] args) {
//Declaring variables
       double ExamMarks,LabMarks,perOfexamMarks,PerOfLabMarks,FinalMarks ; 
//Create an object called input to Scanner class
       Scanner input = new Scanner(System.in) ; 
//Take user inputs and checking conditions
        System.out.println("please enter exam marks(out of 100):") ; 
        ExamMarks = input.nextDouble() ; 

     if(ExamMarks<0 || ExamMarks>100) 
    {
        System.out.println("invalid input for exam marks,Terminating the program") ; 
        return; }

        System.out.println("please enter the lab submission marks(Out of 100):") ;
        LabMarks = input.nextDouble() ; 

      if(LabMarks<0 || LabMarks>100)
     {
         System.out.println("invalid input for Lab submission marks.Terminating the program") ; 
         return; }

        System.out.println("please enter the percentage given for the exam:") ;
        perOfexamMarks = input.nextDouble() ; 

        System.out.println("please enter the percentage given for lab submission:") ;
        PerOfLabMarks =  input.nextDouble() ; 

     if((perOfexamMarks + PerOfLabMarks) > 100) 
    {  
         System.out.println("The percentages must add up to 100.Terminating the program") ; 
         return ; }

 else 
   {
   //The Equation 
        FinalMarks = (ExamMarks * perOfexamMarks/100) + (LabMarks * PerOfLabMarks/100) ; 
        
            System.out.println("Final marks is:" +FinalMarks) ; }

  }
}

    







