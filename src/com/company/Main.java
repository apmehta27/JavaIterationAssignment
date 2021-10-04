package com.company;

public class Main {

    public static void main(String[] args) {
	/*Problem 1: Write a program that uses a for-loop to loop through the numbers 1-10
        and prints out each number.

        for (int i=1; i<=10 ; i++){
            System.out.println("Print the number 1 to 10:  " + i);
        }

    Problem 2: Write a program that uses a while loop to loop through the numbers 0-100
        in increments of 10 and prints out each number.


         int i = 0;
         while (i<=100) {
             System.out.println("The number in increment of 10 is:  "+ i);
             i = i +10;
         }

    Problem 3 : Write a program that uses a do-while-loop to loop through the numbers 1-10
    and prints out each number.

        int i = 1;
        do {
            System.out.println("The number from 0-10 is: " + i );
            i++;
        } while(i<=10);
        Problem 4 : Write a program that uses a for-loop to loop through the numbers 1-100.
        Print out each number if is a multiple of 5, but do not print out any
        numbers between 25 and 75. Use the “continue” statement to accomplish this.



        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i >= 25 && i <= 75) {
                    continue;
                }
                System.out.println("This number is multiple of 5 " + i);
            }

        }

        Problem 5: Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number
        if is a multiple of 5, but do not print out any numbers greater than 50. Use the “break” keyword
        to accomplish this.



        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i > 50) {
                    break;
                }
                System.out.println("This number is multiple of 5 " + i);
            }

        }

        Problem :6 Write a program that uses nested for-loops to output the following:
        Week 1:

        Day 1

        Day 2

        Day 3

        Day 4

        Day 5

        Week 2:

        Day 1

        Day 2

        Day 3

        Day 4

        Day 5


        for(int i =1; i < 53 ; i++){
            System.out.printf("Week "+ i + "\n" + "\n");
            for(int j = 1; j <8; j++ ){
                System.out.printf("Day "+ j + "\n" + "\n");
            }
        }

        Write a program that returns all the available palindromes within 10 and 200. The following
        output will be produced:
        11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,




        boolean result =false;
        String x;
        for (int i = 10 ;i<= 200; i++){
            x = String.valueOf(i);
            if(x.length()==2){
                result= x.charAt(0) == x.charAt(1);
            }
            if(x.length()==3) {
                result = x.charAt(0) == x.charAt(2);
            }
            if(result){
                System.out.print(x+ " ");
            }
        }

        Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be
        produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,


        int k= 0, l = 1, n1 = 0, n2 = 1, n3, count = 8;
        System.out.print(k + " " + ",");

        System.out.print(l + " "+ ",");
        for (int i = 1; i <= count; ++i) {


            n3 = n2 + n1;
            System.out.print(n3 + " "+",");
            n1 = n2;
            n2 = n3;


        }
        Write a program that nests a for-loop inside another. Print out the inner and outer variable
        (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
	 */

        for (int i = 1; i<11 ;i++){
            for(int j=1 ; j <11; j++){
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }

        }



    }
}







