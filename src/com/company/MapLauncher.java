package com.company;

import java.util.*;

public class MapLauncher {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] token = string.split(" ");
        for (String tokens: token) {
            String word = tokens.toLowerCase();
            Integer count = map.get(word);
            if(count == null){
                map.put(word,1);
            }else {
                map.put(word, count+1);
            }
        }
        print(map);
    }
    private static void print(Map<String, Integer> map){
        Map<String, Integer> mapTree = new TreeMap<>(map);
        Set<String> key = mapTree.keySet();
        for (String keys: key) {
            System.out.printf("\n",keys, map.get(keys));
        }
    }
}
