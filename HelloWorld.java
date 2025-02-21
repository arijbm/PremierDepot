import java.util.scanner;
public class calculatrice{
    public double addition (double a,double b){
        return a+b;
    }
    public double soustraction(double a, double b){
        return a-b;
    }
    public double division(double a, double b){
        if(b==0){
            throw new ArithmeticException("Erreur: division par 0");
        }
        return a/b;
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        calculatrice cal=new calculatrice();
        System.out.println("donner le premier entier");
        double a=scanner.nextInt();
        System.out.printDouble("donner l'operation");
        double operation=scanner.next.charAt(0);
        System.out.println("donner le deuxieme entier");
        double b=scanner.nextDouble();
        double res=0;
        try{
            switch(operation){
                case '+':
                    res=calculatrice.addition(a,b);
                case '-':
                    res=calculatrice.soustraction(a,b);

                case '*':
                    res=calculatrice.multiplication(a,b);
                case '/':
                    res=calculatrice.division(a,b);
                default:
                    System.out.println("operation introvable");
                    return;
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    scanner.close();
}
