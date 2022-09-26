import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//  1. - Write a program to print whether a number is even or odd, also take input from the user.
//        int num = 0;
//        System.out.print("Enter the number which you want to check: ");
//        Scanner s = new Scanner(System.in);
//        num = s.nextInt();
//        if(num % 2 == 0){
//            System.out.println("The Number which you have entered is: EVEN");
//        } else {
//            System.out.println("The Number which you have entered is: ODD");
//        }

//  2. - Take name as input and print a greeting message for that particular name.
//        String name = "";
//        System.out.print("Please enter your Full Name: ");
//        Scanner s = new Scanner(System.in);
//        name = s.nextLine();
//        System.out.println("Hello " + name + ". Welcome Back! Have a Nice Day.");

//  3. - Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        int principal, rate, time, simpleInterest;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Principal Value: ");
//        principal = s.nextInt();
//        System.out.print("Enter the Rate: ");
//        rate = s.nextInt();
//        System.out.print("Enter the Time: ");
//        time = s.nextInt();
//        simpleInterest = (principal * rate * time)/100 ;
//        System.out.print("The Simple Interest for the above Principal amount, for the given Rate and for the given Time would be: " + simpleInterest);

//  4. - Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        char operation;
//        int n1, n2, result;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the First Number: ");
//        n1 = s.nextInt();
//        System.out.print("Enter the Second Number: ");
//        n2 = s.nextInt();
//        System.out.println("list of operations: +, -, *, /");
//        System.out.print("Enter the operation you want to perform : ");
//        operation = s.next().charAt(0);
//
//        if(operation == '+'){
//            result = n1 + n2;
//            System.out.println("The sum of the given two numbers is: " + result);
//        } else if (operation == '-') {
//            result = n1 - n2;
//            System.out.println("The Difference of the given two numbers is: " + result);
//        } else if (operation == '*') {
//            result = n1 * n2;
//            System.out.println("The Product of the given two numbers is: " + result);
//        } else if(operation == '/') {
//            result = n1 / n2;
//            System.out.println("The Division of the given two numbers is: " + result);
//        } else {
//            System.out.println("Invalid Operation");
//        }

//  5. - Take 2 numbers as input and print the largest number.
//        int n1,n2,res;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Please Enter the First Number: ");
//        n1 = s.nextInt();
//        System.out.print("Please Enter the Second Number: ");
//        n2 = s.nextInt();
//        res = n1 > n2 ? n1 : n2;
//        System.out.println("The Largest among this two numbers is: " + res);

//  6. - Input currency in rupees and output in USD.
//        double currency, res;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Please Enter the Amount in Rupees: ");
//        currency = s.nextDouble();
//        res = currency * 0.013;
//        System.out.print("Entered Amount after converting to USD: " + res);

//  7. - To calculate Fibonacci Series up to n numbers.
//        int i,c=0,n;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number to generate fibonacci series till nth term: ");
//        n=s.nextInt();
//        int a=0;
//        int b=1;
//
//        System.out.print("Fibonacci series till "+n+" is :- ");
//        while(c<=n)
//        {
//            System.out.print(c+", ");
//            a=b;
//            b=c;
//            c=a+b;
//        }

//  8. - To find out whether the given String is Palindrome or not.
//        String rev = "", str;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Please Enter the Text Word you want to check for Palindrome: ");
//        str = s.next();
//        str = str.toLowerCase();
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            rev = rev + str.charAt(i);
//        }
//
//        if(str.equals(rev)){
//            System.out.println("The Entered String is Palindrome.");
//        } else {
//            System.out.println("The Entered String is not a Palindrome.");
//        }

//  9. - To find Armstrong Number between two given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range : ");
        int low = sc.nextInt();
        System.out.print("Enter upper range : ");
        int high = sc.nextInt();

        System.out.println("Armstrong numbers between "+ low + " and " + high + " are : ");

        for(int num = low ; num <= high ; num++)
        {
            int sum = 0, temp, digit, len;
            len = getOrder(num);
            temp = num;

            while(temp != 0)
            {
                digit = temp % 10;
                sum = sum + (int) Math.pow(digit,len);
                temp /= 10;
            }

            if(sum == num)
                System.out.print(num + " ");

        }
    }

    private static int getOrder(int num) {
        int len = 0;
        while (num!=0)
        {
            len++;
            num = num/10;
        }
        return len;
    }
}
