import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Task 1: Enter two numbers");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        
        System.out.println(a > b ? "a > b" : a < b ? "a < b" : "a = b");
        System.out.println("a+b=" + (a+b) + " a-b=" + (a-b) + " a*b=" + (a*b) + " a/b=" + (b!=0?(double)a/b:"Error"));
        
        System.out.println("\nTask 2: Enter two strings");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(s1.equals(s2) ? "Strings identical" : "Strings different");
        
        System.out.println("\nTask 3: Even numbers");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int n:arr) if(n%2==0) System.out.print(n + " ");
        
        scanner.close();
    }
}