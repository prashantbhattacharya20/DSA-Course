import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

//  1. - Area of Circle
//        double area = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the radius of the circle: ");
//        double r = s.nextDouble();
//        final double pie = 3.14;
//        area = pie * (r * r);
//        System.out.print("The Area of the Circle of the given radius is: " + area);

//  2. - Area of Triangle
//        Scanner s = new Scanner(System.in);
//        System.out.println("In which way you want to calculate the area of Triangle :");
//        System.out.println("1. Height-Base Method");
//        System.out.println("2. Heron's Formula (Sides are given)");
//        System.out.print("Enter the Option Number to proceed: ");
//        int option = s.nextInt();
//        double area = 0;
//
//        if(option == 1){
//
//            System.out.println("You Have Selected the Option " + option);
//            System.out.print("Enter the height of the Triangle: ");
//            double h = s.nextDouble();
//            System.out.print("Enter the base of the Triangle: ");
//            double ba = s.nextDouble();
//            area = 0.5 * (h * ba);
//            System.out.println("The Area of the Triangle is: " + area);
//
//        } else if (option == 2) {
//
//            System.out.println("You Have Selected the Option " + option);
//            System.out.print("Enter the First Side of the Triangle: ");
//            double a = s.nextDouble();
//            System.out.print("Enter the Second Side of the Triangle: ");
//            double b = s.nextDouble();
//            System.out.print("Enter the Third Side of the Triangle: ");
//            double c = s.nextDouble();
//            double sp = 0;
//            sp = 0.5 * (a + b + c);
//            area = Math.sqrt((sp*(sp-a)*(sp-b)*(sp-c)));
//            System.out.println("The Area of the Triangle is: " + area);
//        } else {
//            System.out.println("Invalid Input");
//        }

//  3. - Area of Rectangle
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Length of the Rectangle: ");
//        double l = s.nextDouble();
//        System.out.print("Enter the Width of the Rectangle: ");
//        double w = s.nextDouble();
//        double area = 0;
//        area = l * w;
//        System.out.println("The Area of the given Rectangle is: " + area);

//  4. - Area of Isosceles Triangle
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Height of the Triangle: ");
//        double h = s.nextDouble();
//        System.out.print("Enter the Base of the Triangle: ");
//        double b = s.nextDouble();
//        double area = 0;
//        area = 0.5 * (h * b);
//        System.out.println("The Area of the given Isosceles Triangle is: " + area);

//  5. - Area of Parallelogram
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Base of the Parallelogram: ");
//        double b = s.nextDouble();
//        System.out.print("Enter the Height of the Parallelogram: ");
//        double h = s.nextDouble();
//        double area = 0;
//        area = b * h;
//        System.out.println("The Area of the given Parallelogram is: " + area);

//  6. - Area of Rhombus
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the First Diagonal of the Rhombus: ");
//        double d1 = s.nextDouble();
//        System.out.print("Enter the Second Diagonal of the Rhombus: ");
//        double d2 = s.nextDouble();
//        double area = 0;
//        area = 0.5 * (d1 * d2);
//        System.out.println("The Area of the given Rhombus is: " + area);

//  7. - Area of Equilateral Triangle
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Side of the Equilateral Triangle: ");
//        double es = s.nextDouble();
//        double area = 0;
//        area = (Math.sqrt(3)/4) * (Math.pow(es,2));
//        System.out.println("The Area of the given Equilateral Triangle is: " + area);

//  8. - Perimeter of Circle
//        double perimeter = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Radius of the Circle: ");
//        double r = s.nextDouble();
//        final double pie = 3.14;
//        perimeter = 2 * pie * r;
//        System.out.print("The Perimeter of the Circle of the given radius is: " + perimeter);

//  9. - Perimeter of Equilateral Triangle
//        double perimeter = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Side of the Equilateral Triangle: ");
//        double si = s.nextDouble();
//        perimeter = 3 * si;
//        System.out.print("The Perimeter of the given Equilateral Triangle is: " + perimeter);

// 10. - Perimeter of Parallelogram
//        double perimeter = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the First Adjacent Side of the Parallelogram: ");
//        double a = s.nextDouble();
//        System.out.print("Enter the Second Adjacent Side of the Parallelogram: ");
//        double b = s.nextDouble();
//        perimeter = 2 * (a + b);
//        System.out.print("The Perimeter of the given Parallelogram is: " + perimeter);

// 11. - Perimeter of Rectangle
//        double perimeter = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Length of the Rectangle: ");
//        double l = s.nextDouble();
//        System.out.print("Enter the Breadth of the Rectangle: ");
//        double b = s.nextDouble();
//        perimeter = 2 * (l + b);
//        System.out.print("The Perimeter of the given Rectangle is: " + perimeter);

// 12. - Perimeter of Square
//        double perimeter = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Side of the Square: ");
//        double si = s.nextDouble();
//        perimeter = 4 * si;
//        System.out.print("The Perimeter of the given Square is: " + perimeter);

// 13. - Perimeter of Square
//        double perimeter = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Side of the Square: ");
//        double si = s.nextDouble();
//        perimeter = 4 * si;
//        System.out.print("The Perimeter of the given Square is: " + perimeter);

// 14. - Perimeter of Rhombus
//        double perimeter = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Side of the Rhombus: ");
//        double si = s.nextDouble();
//        perimeter = 4 * si;
//        System.out.print("The Perimeter of the given Rhombus is: " + perimeter);

// 15. - Volume of Cone
//        double volume = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Radius of the Cone: ");
//        double r = s.nextDouble();
//        System.out.print("Enter the Height of the Cone: ");
//        double h = s.nextDouble();
//        final double pie = 3.14;
//        volume = (0.33 * pie * (Math.pow(r,2)) * h);
//        System.out.print("The Volume of the given Cone is: " + volume);

// 16. - Volume of Prism
//        double volume = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Apothem Height of the Prism: ");
//        double a = s.nextDouble();
//        System.out.print("Enter the Base of the Prism: ");
//        double b = s.nextDouble();
//        System.out.print("Enter the Height of the Prism: ");
//        double h = s.nextDouble();
//        volume = (0.5 * a * b * h);
//        System.out.print("The Volume of the given Prism is: " + volume);

// 17. - Volume of Cylinder
//        double volume = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Height of the Cylinder: ");
//        double h = s.nextDouble();
//        System.out.print("Enter the Radius of the Cylinder: ");
//        double r = s.nextDouble();
//        final double pie = 3.14;
//        volume = (pie * (r * r) * h);
//        System.out.print("The Volume of the given Cylinder is: " + volume);
//
// 18. - Volume of Sphere
//        double volume = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Radius of the Sphere: ");
//        double r = s.nextDouble();
//        final double pie = 3.14;
//        volume = (1.33 * pie * (Math.pow(r,3)));
//        System.out.print("The Volume of the given Sphere is: " + volume);

// 19. - Volume of Pyramid
//        double volume = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Base Width of the Pyramid: ");
//        double w = s.nextDouble();
//        System.out.print("Enter the Base Length of the Pyramid: ");
//        double l = s.nextDouble();
//        System.out.print("Enter the Height of the Pyramid: ");
//        double h = s.nextDouble();
//        volume = ((l * w * h) / 3);
//        System.out.print("The Volume of the given Pyramid is: " + volume);

// 20. - Curved Surface Area of Cylinder
//        double area = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Radius of the Cylinder: ");
//        double r = s.nextDouble();
//        System.out.print("Enter the Height of the Cylinder: ");
//        double h = s.nextDouble();
//        final double pie = 3.14
//        area = (2 * pie * r * l);
//        System.out.print("The Curved Surface Area of the given Cylinder is: " + area);

// 21. - Total Surface of the Cube
//        double area = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Side of the Cube: ");
//        double a = s.nextDouble();
//        area = (6 * (Math.pow(a,2)));
//        System.out.print("The Total Surface Area of the given Cube is: " + area);

// 22. - Fibonacci Series
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the number of terms you want: ");
//        int n = s.nextInt();
//        int firstTerm = 0, secondTerm = 1;
//        System.out.println("Fibonacci Series till " + n + " terms: ");
//
//        for (int i = 1; i <= n; ++i) {
//            System.out.print(firstTerm + ", ");
//
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }

// 23. - Subtract the Product and Sum of Digits of an Integer
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any Integer: ");
//        int num = s.nextInt();
//        int temp, rem, sum = 0, product = 1, diff = 0;
//        temp = num;
//
//        while(temp != 0){
//            rem = temp % 10;
//            sum = sum + rem;
//            product = product * rem;
//            temp = temp / 10;
//        }
//
//        diff = product - sum;
//        System.out.print("The Difference of Product and Sum of Digits of an Integer is: " + diff);

// 24. - Input a number and print all the factors of that number.
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the number you want the factors of: ");
//        int n = s.nextInt();
//        if(n > 0){
//            System.out.print("The factors of " + n + " are: ");
//            for(int i = 1; i <= n; i++){
//                if(n % i == 0){
//                    System.out.print(i + " ");
//                }
//            }
//        } else if (n == 0) {
//            System.out.println("The Factor of the Entered Number is: 0");
//        } else {
//            System.out.println("Invalid Input");
//        }

// 25. - Take integer inputs till the user enters 0 and print the sum of all numbers.
//        Scanner s = new Scanner(System.in);
//        int sum = 0;
//        System.out.println("Enter the Numbers you want to Add (Press 0 to Print the Sum) : ");
//        while(s.hasNextInt()) {
//            int num = s.nextInt();
//            if (num == 0)
//                break;
//
//            sum += num;
//        }
//        System.out.println("Sum: " + sum);

// 26. - Take integer inputs till the user enters 0 and print the largest number from all.
//        Scanner s = new Scanner(System.in);
//        int large = 0;
//        System.out.println("Enter the numbers to find the largest of them");
//        while (s.hasNext()){
//            int num = s.nextInt();
//            if (num == 0)
//                break;
//
//            if (num > large){
//                large = num;
//            }
//        }
//        System.out.println("The Largest Number Entered is: " + large);

// 27. - Addition of two Numbers
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the First Number: ");
//        double a = s.nextDouble();
//        System.out.print("Enter the Second Number: ");
//        double b = s.nextDouble();
//        double sum = a + b;
//        System.out.println("The Sum of " + a + " and " + b + " is: " + sum);

    }
}
