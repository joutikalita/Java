import java.util.*;
class Question14{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a;
        int b,c;
        System.out.println("Enter 1st Number :- ");
        b=s.nextInt();
        System.out.println("Enter 2nd Number :- ");
        c=s.nextInt();
        System.out.println("Enter Add for Addition, Sub for Substraction , Mul for Multiplication and Div for Divide :- ");
        s.nextLine();
        a=s.nextLine();
        switch(a){
            case "Add":
                System.out.println("Addition :- " + (b+c));
                break;
                case "Sub":
                System.out.println("Substraction :- " + (b-c));
                    break;
                    case "Mul":
                        System.out.println("Multiplication " + (b*c));
                        break;
                        case "Div":
                            System.out.println("Div: " + (b/c));
                            break;
        }
        s.close();
        
    }
}