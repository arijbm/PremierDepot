import java.util.scanner;
public class calculatrice{
    public int addition (int a,int b){
        return a+b;
    }
    public int soustraction(int a, int b){
        return a-b;
    }
    public float division(int a, int b){
        if(b==0){
            throw new ArithmeticException("Erreur: division par 0");
        }
        return a/b;
    }
    public int multiplication(int a,int b){
        return a*b;
    }
}
public class test{
    public static void main(String[] args){
        calculatrice cal=new calculatrice();
        System.out.println("donner le premier entier");
        int a=scanner.nextInt();
        System.out.println("donner l'operation");
        int operation=scanner.next.charAt();
        System.out.println("donner le deuxieme entier");
        int b=scanner.nextInt();
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
}
