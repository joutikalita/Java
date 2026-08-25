import java.util.*;
class Question12{
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
        for(int o=1;o<=a-1;o++){
            for(int p=1;p<=o;p++){
                System.out.print(" ");
            }
            for(int q=1;q<=a-o;q++){
                System.out.print("*");
            }
            for(int r=a-1-o;r>=1;r--){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}