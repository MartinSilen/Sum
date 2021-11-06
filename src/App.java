import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double sum = 0;
        Scanner inp =  new Scanner(System.in);
        while(true){
            System.out.println("I will add up numbers you enter. Print \"exit\" to stop");
            try {
                String com = inp.nextLine();
                if (com.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye");
                    break;
                }
                
                sum += Double.parseDouble(com);} catch (Exception e){System.out.println("This is not a number!"); continue;}
            System.out.println("Current sum is: " + sum);

        }


        }
    }
