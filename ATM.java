import java.util.Scanner;

public class Main {
     private final Double balance = 10000.0;
     
     public void start(){
        Scanner scanner  = new Scanner (System.in);
        while(true){
            System.out.println("\n1 Check Balance \n2 Deposit \n3 WithDraw \n4 Exit");
            int ch = scanner.nextInt();
            switch(ch){
                case 1 -> System.out.println("Balance :"+ balance);
                case 2 -> {
                    System.out.println("Enetr Amount :");
                    Double balance  = scanner.nextDouble();
                    
                }
            }
        }
     }
}