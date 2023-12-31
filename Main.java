package OOP_HW_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IFibonacciRepository repository = new FibonacciRepository();
        IFibonacciServis manager = new FibonacciServis(repository);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер числа фибоначи: ");
        int index = scanner.nextInt();

        long fibonacciNumber = manager.compute(index);
        System.out.println("Номер числа фибоначи - " + index + ", число фибоначи - " + fibonacciNumber);
    }
}