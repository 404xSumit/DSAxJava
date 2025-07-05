/*
Loop or Looping Statements:- This is used when you have to repeat the certain block of code for number of time like actually don't know how many time but lets take it as several time but if you have to write or repeat that you wont write it again and again and again you just give the number oif time you have to repeat and it work for that much time 

There are mainly 3 types of loops in java :- 

1. For loop :- This loop is used when the user know how many time  did he have to run this loop for or we can say that user have the starting value and an ending value

2.While loop :- This loop is used when the user don't know how many time the user will run the loop or the working of the loop is not fixed it run of infinite time and it only stops when the user eneter an input which is required or the user meet the specific condition 

3.Do while :-  This is loop is used when the user wants to run the loop primarily for the first time and then after the loop run single time it depends on the condition and if the user meets the condition then this will help that 


 */


 // Example :- For loop 

// public class Loop{
//     public static void main(String[] args){
//         for (int i = 1 ; i<=10 ; i++){
//             System.out.println("Hello world"+i);
//         }
//     }
// }

// public class Loop {

//     public static void main(String[] args){
//         int a = 77;
//         //(Print the table of 77)
//         for (int i=1; i<11;i++){
//             System.out.println(i*a);
//         }

//     }
// }

// Example :-  While loop

// public class Loop {

//     public static void main (String[] args){
//         int i =1;
//         while (i <=20){
//             System.out.println("Hello guys " +i);
//             i++;
//         }
        
//     }
// }


//Example :- Do while

public class Loop {

    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println("Hello this will defintely run ");
        }
        while (i<=5); {
            System.out.print("Hello "+i);
            i++;
        }
    }
}