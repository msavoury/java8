package com.codinghabit.java8;

/**
 * Created by msavoury on 9/1/15.
 */
public class MultiDimArrays {
    public static int[][] matrix = {
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    {0,1,2,3,4,5,6,7,8,9},
                                    };

    public static void main(String [] args) {
        printLRTD();
        printRLTD();
        printTDLR();
        printTDRL();
    
    }

    public static void printLRTD() {
        System.out.println("\n *Printing LRTD*");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void printRLTD() {
        System.out.println("\n *Printing RLTD*");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void printTDLR() {
        System.out.println("\n *Printing TDLR*");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println("");
        }
    }

    public static void printTDRL() {
        System.out.println("\n *Printing TDRL");
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println("");
        }
    }

}
