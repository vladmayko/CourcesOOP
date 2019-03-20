package homework9.taskThree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by MacUser on 19.03.19.
 */
public class Statistic {
    private static String getStringFromFile(File file) throws IOException {
        String result = "";
        try(BufferedReader bf = new BufferedReader(new FileReader(file))){
            String temp = "";
            for (; (temp = bf.readLine()) != null;){
                result +=temp +System.lineSeparator();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

    private static int count(String text, char letter){
        int count = 0;
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                count += 1;
            }
        }
        return count;
    }

    public static void getStatistic(File file){
        Map<Character, Double>  map = new HashMap<>();
        String text = "";
        try {
            text = Statistic.getStringFromFile(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        text = text.toLowerCase();
        int count = 0;
        double globalCount = 0;
        for (char letter = 'a'; letter  <=  'z'; letter++) {
             count = count(text,letter);
             globalCount += count;
        }
        for (char letter = 'a'; letter  <=  'z'; letter++) {
            count = count(text,letter);
            if(count > 0){
                map.put(letter, Math.round(count/globalCount * 10000)/ 10000.0d);
            }
        }
        sortMap(map);
    }

    private static void sortMap(Map<Character, Double>  map){
        LinkedHashMap<Character, Double> data =
                map.entrySet().stream().
                        sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                        collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry::getValue,
                                (e1,e2) -> e2, LinkedHashMap::new));

        for (Map.Entry<Character, Double> d: data.entrySet()) {
            System.out.println(d.getKey() + " - " + d.getValue());
        }
        data.forEach((key, value) -> System.out.println(key + " - " + value + "%"));
    }
}
