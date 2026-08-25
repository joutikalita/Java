import java.util.*;
class Question13{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        double p,r,t,SI,c=1,b;
        System.out.println("Enter 1 for Calculating Simple Interest ,Enter 2 for Compounding Interest :-  ");
        int a=s.nextInt();
        switch (a){
        case 1:
        System.out.println(" Enter the Principal Amount :- ");
        p=s.nextDouble();

        System.out.println(" Enter the Rate of Interest :- ");
        r=s.nextDouble();
        
        System.out.println(" Enter the Tenure of loan :- ");
        t=s.nextDouble();
        SI=(p*r*t)/100;
        double Amt=0;
         Amt= p+SI;
        System.out.println(" Total Interest :- " + SI) ;
        System.out.println("Total Amount to be paid :- " + Amt);
        break;
            case 2:
                 System.out.println("Enter the principle amount :- ");
        p=s.nextDouble();  
        
        System.out.println("Enter the Rate of Interest :- ");
        r=s.nextDouble();
        
        System.out.println("Enter the tenure of loan :- ");
        t=s.nextDouble();
        for(int i = 1;i<t;i++){
            c*=(1+(r/100));
        }
        b=p*c;
        double C_I=a-p;
        System.out.println("Total Amount Calculated :- " + b);
        System.out.println("Total Compound Interest :- " + C_I);

        }

        s.close();
    }
}