import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
       
        int num1, div;

    System.out.println("digite seu numero: ");
    num1 = Scanner.nextInt();

    div = num1 /5 ;
    System.out.println("A quinta parte de " + num1 + " é: " + div); 

    Scanner.close();
    }
}