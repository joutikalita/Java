import java.util.*;
class Question3{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        double a , b , c ;
        System.out.println("Enter the 1st Number :- ");
        a=s.nextDouble();
        System.out.println("Enter the 2nd Number :- ");
        b=s.nextDouble();
        System.out.println("Enter the 3rd Number :- ");
        c=s.nextDouble();
        if(a>b && a>c){
            System.out.println(" The Largest Number is " + a);
        }
        if (b>c){
            System.out.println(" The Largest Number is " + b);
        }
        else{
            System.out.println(" The Largest Number is " + c);
        }
        s.close();
    }
}