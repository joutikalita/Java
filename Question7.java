import java.util.*;
class Question7{
    static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int a;
            System.out.println("Enter the Number till you want the factorial :- ");
            a=s.nextInt();
            System.out.println(" Factorial " + Factorial(a));
            s.close();
        }
        
    }