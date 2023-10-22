/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2Praktikum;

/**
 *
 * @author EKA
 */
import java.util.Scanner;

public class ConcertTicketSystem {
    private int[][] seatPrices;
    private boolean[][] seatAvailability;
    private int totalRows;
    private int totalCols;
    private int seatsAvailable;

    public ConcertTicketSystem(int rows, int cols) {
        this.totalRows = rows;
        this.totalCols = cols;
        this.seatsAvailable = rows * cols;
        initializeSeatPricesAndAvailability();
    }


    private void initializeSeatPricesAndAvailability() {
        seatPrices = new int[totalRows][totalCols];
        seatAvailability = new boolean[totalRows][totalCols];

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; i++) {
                seatPrices[i][j] = DEFAULT_PRICE;
                seatAvailability[i][j] = true;
            }
        }
    }
    public static final int DEFAULT_PRICE = 50;

    public void showSeatPrices() {
        System.out.println("Seat Prices : ");
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                System.out.println("Row " + (i + 1) + ", Column " + (j + i) + ": $" + seatPrices[i][j]);
            }
        }
    }

    public void showAvailableSeats() {
        System.out.println("Available Seats : ");
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                if(getSeatAvailability()[i][j]){
                    System.out.println("[ " + (i + 1) + "," + (j + 1) + " ] ");
                } else {
                    System.out.println("[ X ]");
                }
            }
            System.out.println();
        }
    }
    public void buyTicket(int row, int col){
        if (isValidSeat(row, col)){
            int price = seatPrices[row - 1][col - 1];
            System.out.println("You have purchased a ticket at row " + row + " and column " + col + " for $" + price);
            seatAvailability[row - 1][col - 1] = false;
            seatsAvailable--;
        } else {
            System.out.println("Invalid seat selection or seat is already taken.");
        }
    }

    public boolean isValidSeat(int row, int col) {
        return row >= 1 && row <= totalRows && col >= 1 && col <= totalCols && getSeatAvailability()[row - 1][col - 1];
    }

    /**
     * @return the seatAvailability
     */
    public boolean[][] getSeatAvailability() {
        return seatAvailability;
    }
}
