import java.util.*;
class Question8{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :- ");
        int a=s.nextInt();
        int original=a;
        int sum=0;
        while(a>0){
            int digit = a % 10;
            sum=sum+(digit*digit*digit);
            a=a/10;
        }
        if(sum==original){
            System.out.println(original + " is a Armstrong Number ");
        }
        else{
            System.out.println(original + "is not a Armstrong Number");
        }
        s.close();
    }
}