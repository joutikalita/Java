import java.util.*;
class Question6{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a;
        int count=1;
        System.out.println("Enter the Number till you want the factorial :- ");
        a=s.nextInt();
        for(int i=1;i<=a;i++){
            count*=i;
        }
        System.out.println("The factorial till last digit is :- " + count );
        s.close();
    }
}