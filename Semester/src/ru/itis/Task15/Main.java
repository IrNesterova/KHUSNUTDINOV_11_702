package ru.itis.Task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).next().split("");
        if (Integer.parseInt(input[0]) + Integer.parseInt(input[2]) + Integer.parseInt(input[4])
                == Integer.parseInt(input[1]) + Integer.parseInt(input[3]) + Integer.parseInt(input[5])){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
