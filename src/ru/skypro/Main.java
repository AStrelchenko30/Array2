package ru.skypro;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100_000) + 100_000);
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        int max = 20;
        int min = 200_000;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            } else if (array[j] < min) {
                min = array[j];
            }
        }
        double middle = 0;
        middle = sum / array.length;


        System.out.println("����� ���� �� ����� ���������: " + sum + " ������");
        System.out.println("������������ ����� ������ �� ����� " + max + " ������");
        System.out.println("����������� ����� ������ �� ����� " + min + " ������");
        System.out.println("������� ����� ���� �� ����� " + middle + " ������");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}




