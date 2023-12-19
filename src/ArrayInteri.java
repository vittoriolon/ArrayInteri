import java.util.Scanner;

public class ArrayInteri {


    public static void main(String[] args) throws Exception {
        int numeri;
        int somma = 0;
        int []array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?:");
        numeri = scanner.nextInt();
        array = new int [numeri];
        for (int i = 0; i < numeri ; i++){
            i = i +1;
            System.out.println("Inserisci numero " +i);
            i = i -1;
            array[i] = scanner.nextInt();
        }
            System.out.println("Numeri in array: ");
            for(int i = 0; i < numeri;i++){
            System.out.println("  " +array[i]);
        }
        for(int i = 0; i < numeri; i ++){
            somma = somma + array[i];
        }
        System.out.println("La somma dei numeri e'" +somma);
        scanner.close();
    }
}
