import java.util.Scanner;
class task2_Grade_marks {
   public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Marks Of English  ");
int e =sc.nextInt();
System.out.println("Enter the Marks Of Maths");
int m =sc.nextInt();
System.out.println("Enter the Marks Of Science");
int s =sc.nextInt();
int total= e+m+s;
float avg = (e+m+s)/3.0f;
if(total >=1 &&  total <=300){
if(avg > 90 &&  avg <= 100){
    System.out.println("Grade : A");
    
}
else if(avg > 75 &&  avg <= 90){
    System.out.println("Grade : B");
}
else if(avg > 50 &&  avg <= 75){
    System.out.println(" Grade : C");
}
else if(avg > 33 &&  avg <= 50){
    System.out.println(" Grade : D");
}
else if(avg > 1 &&  avg <= 33){
    System.out.println("Grade : F");
}
else{
    System.out.println("Wrong Input marks");
}
System.out.println("Total Marks Obtained by Student :"+total);
System.out.println("Average Percentage of Total marks obtained :"+avg +"%");
}
else
System.out.println(" Please Enter the marks between 1 to 100");

   } 
} 