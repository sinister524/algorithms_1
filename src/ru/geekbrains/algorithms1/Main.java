package ru.geekbrains.algorithms1;

public class Main {

    public static void main(String[] args) {

//        Находим среднее арифмитическое O(8)
                int [] numbers = {37,65,13,55,88,65,99,146};
                int k = 0;
                for (int i = 0; i <numbers.length ; i++) {
                    k+=numbers [i];
                }
                int average;
                average = k / numbers.length;
                System.out.println("Среднее арифмитическое: " + average);
                
    }
}
