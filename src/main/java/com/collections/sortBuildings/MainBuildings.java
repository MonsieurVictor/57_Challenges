package com.collections.sortBuildings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class MainBuildings {

    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("DBDir/buildings.csv");
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);

        String text = new String(data);

        List<String[]> lineWords = new ArrayList<>();
        String[] lines = text.split("\n");

        for (String line : lines) {
            String[] words = line.split(",");
            lineWords.add(words);
//
//            System.out.println(line);
//            System.out.println("");
        }

        TreeMap<String, Integer> map = new TreeMap <String, Integer>();



        for (String[] words : lineWords) {
            if(map.containsKey(words[9])){
                Integer houseCount = map.get(words[9]);
                houseCount = houseCount + 1;
                map.put (words[9], houseCount);
            } else {
                map.put(words[9], 1);
            }
        }

        System.out.println("1820 year house count" + map.get("1820"));

        for (String key : map.keySet()) {
            System.out.println("Year: " + key + " Quantity : " + map.get(key));
        }
//       for (String[] words : lineWords) {
//            if (words[9].equals("1820")) {
//                for (String word : words) {
//                    System.out.print(word);
//                    System.out.print("|");
//                }
//                System.out.println();
//            }
//        }
    }
}
