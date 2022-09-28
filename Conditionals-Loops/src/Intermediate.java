import java.util.*;

public class Intermediate {
    public static void main(String[] args) {

//  1. - Factorial Program
//      Scanner s = new Scanner(System.in);
//      System.out.print("Enter the Number you want to find the Factorial of: ");
//      int num = s.nextInt();
//      if(num > 0) {
//          int fact = 1;
//          for (int i = 1; i <= num; i++) {
//              fact = fact * i;
//          }
//          System.out.print("The Factorial of the Given Number is: " + fact);
//      } else {
//          System.out.println("Invalid Input");
//      }

//  2. - Calculate Electricity Bill
//      Scanner s = new Scanner(System.in);
//      System.out.print("Please Enter the Total Number of Units: ");
//      double units = s.nextDouble();
//      double eCharge, fCharge, eSum = 0, fSum = 0,eBill = 0;
//      if(units < 0) {
//          System.out.println("Invalid Input");
//      } else {
//          if (units >= 0 && units <= 40) {
//              eCharge = 1.15;
//              fCharge = 2.55;
//              eSum = units * eCharge;
//              fSum = units * fCharge;
//              eBill = eSum + fSum;
//              System.out.print("Electric Bill Charge: Rs " + eBill);
//          } else if (units >= 41 && units <= 200) {
//              eCharge = 1.20;
//              fCharge = 2.60;
//              eSum = units * eCharge;
//              fSum = units * fCharge;
//              eBill = eSum + fSum;
//              System.out.print("Electric Bill Charge: Rs " + eBill);
//          } else if (units >= 201 && units <= 600) {
//              eCharge = 1.90;
//              fCharge = 3.40;
//              eSum = units * eCharge;
//              fSum = units * fCharge;
//              eBill = eSum + fSum;
//              System.out.print("Electric Bill Charge: Rs " + eBill);
//          } else {
//              eCharge = 2.45;
//              fCharge = 4.90;
//              eSum = units * eCharge;
//              fSum = units * fCharge;
//              eBill = eSum + fSum;
//              System.out.print("Electric Bill Charge: Rs " + eBill);
//          }
//      }

//  3. - Calculate Average of N Numbers
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Number until which you want to find the Average: ");
//        int num = s.nextInt();
//        int temp = num;
//        double sum = 0, average = 0;
//        for(int i = 1; i <= temp; i++){
//            sum = sum + i;
//        }
//        average = sum/num;
//        System.out.println("The Average of First " + num + " Numbers is: " + average);

//  4. - Calculate Discount of Product
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Marked Price of the Product: ");
//        double mPrice = s.nextDouble();
//        System.out.print("Enter the Discount Percentage (%) of the Product: ");
//        double dPercentage = s.nextDouble();
//        double discount = 0, dAmount = 0;
//        double d = dPercentage / 100;
//        discount = mPrice * d;
//        dAmount = mPrice - discount;
//        System.out.println("The Discount Amount of the Product is: " + discount);
//        System.out.println("The Discounted Price of the Product is: " + dAmount);

//  5. - Calculate Distance Between Two Points
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the X-Coordinate of the First Point: ");
//        double x1 = s.nextDouble();
//        System.out.print("Enter the Y-Coordinate of the First Point: ");
//        double y1 = s.nextDouble();
//        System.out.print("Enter the X-Coordinate of the Second Point: ");
//        double x2 = s.nextDouble();
//        System.out.print("Enter the Y-Coordinate of the Second Point: ");
//        double y2 = s.nextDouble();
//        double calc = (Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
//        double distance = Math.sqrt(calc);
//        System.out.print("The Distance between the points " + "(" + x1 + " , " + y1 + ") and (" + x2 + " , " + y2 + ") is : " + distance );

//  6. - Calculate Commission Percentage
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Total Sales Amount done by a Salesman: ");
//        double sales = s.nextDouble();
//        System.out.print("Enter the Total Commission Earned by the Salesman: ");
//        double commission = s.nextDouble();
//        double cPercentage = (commission / sales) * 100;
//        System.out.println("The Commission Percentage is: " + cPercentage);

//  7. - Power In Java
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Number: ");
//        int base = s.nextInt();
//        System.out.print("Enter the Exponential Power of that Number: ");
//        int exponent = s.nextInt();
//        long result = 1;
//        while (exponent != 0) {
//            result *= base;
//            --exponent;
//        }
//        System.out.println("Answer = " + result);

//  8. - Calculate Depreciation of Value
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Initial Value: ");
//        double v1 = s.nextDouble();
//        System.out.print("Enter the Rate of Depreciation: ");
//        double r = s.nextDouble();
//        System.out.print("Enter the Time in Years: ");
//        double t = s.nextDouble();
//        double v2 = (v1 * Math.pow((1 - (r / 100)), t));
//        double depreciation = v1 - v2;
//        System.out.println("The Depreciation in Value is: " + depreciation);
//        System.out.println("The Depreciated Value: " + v2);

//  9. - Calculate Batting Average
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Total Number of Runs Batsman Scored till date: ");
//        int runs = s.nextInt();
//        System.out.print("Enter the Total Number of times the Batsman was OUT: ");
//        int out = s.nextInt();
//        double average = (runs / out);
//        System.out.println("The Batting Average of the Batsman is: " + average);

// 10. - Calculate CGPA
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Percentage Obtained: ");
//        float percentage = s.nextFloat();
//        float cgpa = (percentage / 9.5f);
//        System.out.println("CGPA is: " + cgpa);

// 11. - Compound Interest
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Principle: ");
//        double principle = s.nextDouble();
//        System.out.print("Enter the Rate: ");
//        double rate = s.nextDouble();
//        System.out.print("Enter the Time in years: ");
//        double time = s.nextDouble();
//        double CI = principle * (Math.pow((1 + rate / 100), time));
//        System.out.println("Compound Interest is: "+ CI);

// 12. - Calculate Average Marks
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Total Marks Obtained in all Subjects: ");
//        float tMarks = s.nextFloat();
//        System.out.print("Enter the Total Number of Subjects: ");
//        int subjects = s.nextInt();
//        float aMarks = (tMarks / subjects);
//        System.out.println("The Average Marks Obtained is: " + aMarks);

// 13. - Sum Of N Numbers
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Number until where you want to find the Sum: ");
//        int num = s.nextInt();
//        int sum = 0;
//        for(int i = 1; i <= num; i++){
//            sum = sum + i;
//        }
//        System.out.println("The Sum of First " + num + " is: " + sum);

// 14. - Armstrong Number In Java
//        Same as I did in First-Java-Program Module

// 15. - Find Ncr & Npr
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the total number of items in the set: ");
//        int n = s.nextInt();
//        System.out.print("Enter the total items taken for the permutation: ");
//        int r = s.nextInt();
//        int diff, nFactorial = 1, n_rFactorial = 1,  rFactorial = 1;
//        double npr = 0, ncr = 0;
//        diff = n - r;
//        for(int i = 1; i <= n; i++){
//            nFactorial = nFactorial * i;
//        }
//        for(int j = 1; j <= r; j++){
//            rFactorial = rFactorial * j;
//        }
//        for(int k = 1; k <= diff; k++){
//            n_rFactorial = n_rFactorial * k;
//        }
//        ncr = nFactorial / (rFactorial * n_rFactorial);
//        npr = nFactorial / n_rFactorial;
//        System.out.println("The Ncr is: " + ncr + " and the Npr is: " + npr);

// 16. - Reverse A String In Java
//        String rev = "", str;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Please Enter the String you want to reverse: ");
//        str = s.nextLine();
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            rev = rev + str.charAt(i);
//        }
//
//        System.out.println("Reverse String is: " + rev);

// 17. - Find if a number is palindrome or not
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

// 18. - Future Investment Value
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Investment Amount: ");
//        double i = s.nextInt();
//        System.out.print("Enter the Interest Rate: ");
//        double r = s.nextInt();
//        System.out.print("Enter the Number of years: ");
//        double t = s.nextInt();
//        double fV = (i * (1 + (r * t)));
//        System.out.println("Future Investment Value: " + fV);

// 19. - HCF Of Two Numbers Program
//        Scanner sc = new Scanner(System.in);
//        int a, b, i, hcf = 0;
//        System.out.println("Enter first number :: ");
//        a = sc.nextInt();
//        System.out.println("Enter second number :: ");
//        b = sc.nextInt();
//        for(i = 1; i <= a || i <= b; i++) {
//            if( a%i == 0 && b%i == 0 )
//                hcf = i;
//        }
//        System.out.println("HCF of given two numbers is: " + hcf);

// 20. - LCM Of Two Numbers
//        Scanner sc = new Scanner(System.in);
//        int a, b, max, step, lcm = 0;
//        System.out.println("Enter first number: ");
//        a = sc.nextInt();
//        System.out.println("Enter second number: ");
//        b = sc.nextInt();
//        if(a > b){
//            max = step = a;
//        }
//        else{
//            max = step = b;
//        }
//        while(a!= 0) {
//            if(max % a == 0 && max % b == 0) {
//                lcm = max;
//                break;
//            }
//            max += step;
//        }
//        System.out.println("LCM of given numbers is: " + lcm);

// 21. - Java Program Vowel Or Consonant
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any Alphabet: ");
//        String ch = s.nextLine();
//        ch = ch.toLowerCase();
//        if(ch.charAt(0) == 'a' || ch.charAt(0) == 'e' || ch.charAt(0) == 'i' || ch.charAt(0) == 'o' || ch.charAt(0) == 'u' ) {
//            System.out.println(ch + " is vowel");
//        }
//        else {
//            System.out.println(ch + " is consonant");
//        }

// 22. - Perfect Number In Java
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the number you want to check for Perfect Number: ");
//        int n = s.nextInt();
//        int i,sum = 0;
//        if(n > 0){
//            for(i = 1; i < n; i++){
//                if(n % i == 0)
//                    sum = sum + i;
//            }
//            if(sum == n) {
//                System.out.println("The Entered Number is a Perfect Number");
//            } else {
//                System.out.println("The Entered Number is not a Perfect Number");
//            }
//        } else if (n == 0) {
//            System.out.println("The Entered Number is not a Perfect Number");
//        } else {
//            System.out.println("Invalid Input");
//        }

// 23. - Check Leap Year Or Not
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the year you want to check: ");
//        int year = s.nextInt();
//        if (year % 400 == 0) {
//            System.out.print("The Entered Year is a Leap year");
//        } else if (year % 100 == 0) {
//            System.out.print("The Entered Year is not a Leap year");
//        } else if (year % 4 == 0) {
//            System.out.print("The Entered Year is a Leap year");
//        } else {
//            System.out.print("The Entered Year is not a Leap year");
//        }

// 24. - Sum Of A Digits Of Number
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int num = s.nextInt();
//        int temp = num;
//        int rem, sum = 0;
//        while (temp != 0){
//            rem = temp % 10;
//            sum = sum + rem;
//            temp = temp / 10;
//        }
//        System.out.println("The Sum of the Digits of the Entered Number is: " + sum);

// 25. - Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//        int days = 31, count = 0;
//        for(int i = 1; i <= days; i++){
//            if(i % 2 == 0)
//            {
//                count++;
//            }
//        }
//        System.out.println("The Total Number of Days he can go out in the Month of August is: " + count);

// 26. - Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
//        Scanner s = new Scanner(System.in);
//        int sumNegative = 0, sumPositiveEven = 0, sumPositiveOdd = 0;
//        System.out.println("Enter the Numbers you want to Add (Press 0 to Print the Sum) : ");
//        while(s.hasNextInt()) {
//            int num = s.nextInt();
//            if (num == 0) {
//                break;
//            } else if (num < 0) {
//                sumNegative = sumNegative + num;
//            } else if (num % 2 == 0) {
//                sumPositiveEven = sumPositiveEven + num;
//            } else {
//                sumPositiveOdd = sumPositiveOdd + num;
//            }
//        }
//        System.out.println("The Sum of Negative Numbers is: " + sumNegative);
//        System.out.println("The Sum of Positive Even Numbers is: " + sumPositiveEven);
//        System.out.println("The Sum of Positive Odd Numbers is: " + sumPositiveOdd);

    }
}
