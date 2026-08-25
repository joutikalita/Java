import java.util.*;
class Question2{
    public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     double a,b,c;
     System.out.println("Enter the 1st Number :- ");
     a=s.nextDouble();
     System.out.println("Enter the 2nd Number :- ");
     b=s.nextDouble();
     c=a+b;
     System.out.println("The Sum of Two Numbers are :- " + c);
     s.close();
    }
}