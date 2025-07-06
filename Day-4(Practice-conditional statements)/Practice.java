/*
 We are going to solve the question here based on the conditional statement 
 */

// 1-> Check for the leap year 


// import java.util.Scanner;
// public class Practice{
//     public static void main(String[] args){
//         System.out.println("Enter the year please");
//         Scanner year = new Scanner(System.in);
//         int y = year.nextInt();
//         if( y % 100 == 0 && y%400 == 0) {
//             System.out.print("It is a leap year");
//         }else if (y%100 != 0 && y%4 ==0 ){
//             System.out.print("It is a leap year");
//         }else{
//             System.out.print("It is not a leap year");
//         }year.close();

//     }
// }


// 2-> Take the integer as an input and print the absolute value :- 


// public class Practice {

//     public static void main (String [] args){
//         int num = -40;
//         if (num < 0){
//             num = num*(-1);
//         }System.out.println("Absolute value is :- "+num);
//     }
// }

// 3-> Determine profit and loss by taking input from the user that Cost price and selling price


// import java.util.Scanner;
// public class Practice {

//     public static void main(String[] args){
//         Scanner margin = new Scanner(System.in);
//         System.out.print("Enter the Cost price:- ");
//         int cp = margin.nextInt();
//         System.out.print("Enter the Selling price:- ");
//         int sp = margin.nextInt();
//         if  (cp > sp){
//             System.out.println("YOU made a loss of:- "+(cp-sp));
//         }else if (sp>cp){
//             System.out.println("You made a profit of:- "+(sp-cp));
//         }else{
//             System.out.println("You neither made a profit nor a loss just the margin");
//         }margin.close();
//     }
// }

// 4-> Take the input as a length and breadth and find the area is greeater or not 

// import java.util.Scanner;

// public class Practice {

//     public static void main(String[] args){
//         Scanner equal = new Scanner(System.in);
//         System.out.print("Enter the lenght:- ");
//         int l = equal.nextInt();
//         System.out.print("Enter the width:- ");
//         int w = equal.nextInt();
//         int p = 2*(l+w);
//         int a = (l*w);
//         if (p > a){
//             System.out.print("The parameter is greater then the area " + p);
//         }else if (p < a){
//             System.out.print("The area is greater then the parameter " + a);
//         }else{
//             System.out.print("The parameter and area both are equal " + p);
//         }equal.close();
//     }
// }

// 5-> Check if the number is 3 digit or not

import java.util.Scanner;
public static void main (String[] args){
    Scanner number = new Scanner(System.in);
    System.out.print("Enter the number:- ");
    int num = number.nextLine();
    int count = 0
    while( num > 0){
        if (num % 10){
            int rem = num %10;
            count++;
        }
        num = num / 10 ;
    }
}