package com.attila;

public class Main {

    public static void main(String[] args) {

        int apple[][] = new int[4][5];
        // 0 based, so it starts counting from 0
        apple[1][2] = 56;
        System.out.println(apple[1][2]);

        // 4 arrays meaning 4 rows
        int storage[][] = new int[4][5];
        storage[1][1] = 25;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(storage[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();

        int house[][] = new int[4][];
        house[0] = new int[1];
        house[1] = new int[2];
        house[2] = new int[3];
        house[3] = new int[4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 1+i; j++){
                System.out.print(house[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();
        // 3 multidimensional arrays, each have 4 rows, each have 6 elements
        int bank[][][] = new int[3][4][5];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 5; k++){
                    System.out.print(bank[i][j][k] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
