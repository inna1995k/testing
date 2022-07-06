package com.company;

import java.util.HashMap;

public class TestA {
    public static void main(String[] args) {
//        A b = new B();
//        b.d();
//        System.out.println();

        String st = "Current java dev java customer";
        String [] words = st.split(" ");
        HashMap<String, Integer> keyValue = new HashMap<>();
        for (int i = 0; i <= words.length-1; i++) {
            if(keyValue.containsKey(words[i])){
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter + 1);
            }else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);

    }
}
