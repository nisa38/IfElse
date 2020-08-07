import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("first number :");
        int a = sc.nextInt();
        System.out.println("second number :");
        int b = sc.nextInt();
        System.out.println("third number :");
        int c = sc.nextInt();

        int max = -1;

        if(a>=b && a>=c)
           max = a;

        else if (b>=a && b>=c)
            max = b;

        else  if(c>=a && c>=b)
            max = b;

        System.out.println(max);

    }
        }

