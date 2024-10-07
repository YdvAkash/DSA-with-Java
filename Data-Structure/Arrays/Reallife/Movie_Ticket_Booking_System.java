// 1. Movie Ticket Booking System
// In a cinema, seats are arranged in rows and columns. You need to develop a system where users can:

// Array Use Case: Keep track of booked seats (1 for booked, 0 for available) using a 2D array.
// Problem: Write a program that allows users to book a seat, check if a seat is available, and display the seating arrangement.

import java.util.Scanner;
import java.util.Arrays;

public class Movie_Ticket_Booking_System {
    public static void main(String[] args) {
        int[][] Seats =new int[10][10];
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n1. Display Seating Arrangement");
            System.out.println("2. Book a Seat");
            System.out.println("3. Check if Seat is Available");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                   displaySeating(Seats);
                   break;
                case 2:
                   System.out.println("Enter Row Number  (0 - 9) : ");
                   int  row = sc.nextInt();
                   System.out.println("Enter Column Number  (0 - 9) : ");
                   int column =sc.nextInt();
                   bookSeat(Seats, row, column);
                   break;
                case 3:
                   System.out.println("Enter Row Number  (0 - 9) : ");
                   int  CheckRow = sc.nextInt();
                   System.out.println("Enter Column Number  (0 - 9) : ");
                   int CheckColumn =sc.nextInt();
                   checkAvailability(Seats, CheckRow, CheckColumn);
                   break;
                case 4:
                   System.out.println("Exiting...");
                   return;
                case 5:
                   System.out.println("Invalid choice. Please try again.");

            }
        }

    }

public static void displaySeating(int[][] seats)  {
    System.out.println("\nCurrent Seating Arrangement:");
    for (int i = 0; i < seats.length; i++) {
        for (int j = 0; j < seats[i].length; j++) {
            System.out.print(seats[i][j] + " ");
        }
        System.out.println();
    }

}  

public static void bookSeat(int[][] seats, int row, int col) {
    if (row >= 0 && row < seats.length && col >= 0 && col < seats[row].length) {
        if (seats[row][col] == 0) {
            seats[row][col] = 1;  // Mark the seat as booked
            System.out.println("Seat at row " + row + ", column " + col + " has been booked.");
        } else {
            System.out.println("Seat is already booked! Please choose another seat.");
        }
    } else {
        System.out.println("Invalid seat number. Please enter a valid row and column.");
    }

}

public static void checkAvailability(int[][] seats, int row, int col) {
    if (row >= 0 && row < seats.length && col >= 0 && col < seats[row].length) {
        if (seats[row][col] == 0) {
            System.out.println("Seat at row " + row + ", column " + col + " is available.");
        } else {
            System.out.println("Seat is already booked.");
        }
    } else {
        System.out.println("Invalid seat number. Please enter a valid row and column.");
    }
}

}