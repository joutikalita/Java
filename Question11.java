import java.util.*;
class Question11{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter the number of lines :- ");
        a=s.nextInt();
        for(int i =1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}