import java.util.*;
class Question4{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int n;
        System.out.print("Enter the last Number till where you want to check :- ");
        n=s.nextInt();
        for(int i=2;i<=n;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if(i % j ==0){
                    count+=1;
                }
            }
            if(count==2){
                System.out.println("The prime numbers are :- " +i + " ");
            }
        }
        s.close();
    }
}