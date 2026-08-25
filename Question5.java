import java.util.*;
class Question5{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a , b=0 ,c=1;
        System.out.println("Enter the n terms of the Series :- ");
        a=s.nextInt();
        System.out.print("Fibonnaci Series :- ");
        for(int i =1;i<=a;i++){
            System.out.print(b + " ");
            int d=b+c;
           b=c;
           c=d;
        
        }
       s.close();
    }
}