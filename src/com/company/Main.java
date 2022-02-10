package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "Inna I Fdww";
        String [] str = s.split("\\s");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
