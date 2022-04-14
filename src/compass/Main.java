package compass;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // задание 1
        int[] array = new int[30];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100_000 + 100_000);
            sum = sum + array[i];
        }
            System.out.print(" symma trat mesyc " + sum);
            System.out.println("\n");

        // задание 2
        int a = 2;
        int[] array1= new int [2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100_000 + 100_000);

        } System.out.print(array1);
        int max = array1[0];
            int min = array1[0];
            int avg = 0;

        for (int b = 0; b < array1.length; b++) {
        if (max < array1[b])
                max = array1[b];
            if (min > array1[b])
                min = array1[b];
            avg = avg + array1[b]/array1.length;
            System.out.println(min);
            System.out.println(max);
            System.out.println(avg);
            System.out.println("\n");
        }
// задание 3
        float c =0;
        for (float sumS: array){
            c += sumS;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
        System.out.println("\n");
        // задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
            if (i>0) System.out.print(" ");
        }
    }
    }

