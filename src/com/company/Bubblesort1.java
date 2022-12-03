package com.company;

import java.util.Arrays;

public class Bubblesort1 {

    public static void main(String[] args) {

    int [] numbersArr = new int[] {5, 10, 2, 30, 55, 18, 26, 47};
        System.out.println("Tabela 1:" + Arrays.toString(numbersArr)); //zmienia na string i wyświetla
        int z = numbersArr.length;

        for (int i=0; i < z-1; i++)
        {
            System.out.println("*Tabela i*: " + Arrays.toString(numbersArr));
            for (int j = 0; j < z-1; j++)
            {
                System.out.println("Tabela j: " + Arrays.toString(numbersArr));
                if (numbersArr[j] > numbersArr[j+1])
                {
                    int temp = numbersArr[j];
                    numbersArr[j] = numbersArr[j+1];
                    numbersArr[j+1] = temp;
                }

            }
        }

        System.out.println("Długość tabeli: " + numbersArr.length );

    }
}
