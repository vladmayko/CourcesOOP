package streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by MacUser on 22.03.19.
 */
public class Main {
    public static void main(String[] args){
        int[] array = new int[]{9, -2 ,7, -3, 2, -6, 11};
        System.out.println(absNullDigitsInArray(array));

        System.out.println(maxInFile("text.txt"));

        System.out.println(Arrays.toString(codeOfLetterToArr("Hello World")));
    }

    /**
     *task 2
     */

    public static int absNullDigitsInArray(int[] array){
        int n = Arrays.stream(array)
                .filter(i -> i != 0)
                .reduce((a, b) -> Math.abs(a) < Math.abs(b) ? a : (Math.abs(a) ==  Math.abs(b) ? Math.max(a, b) : b)).getAsInt();
        return n;
    }

    /**
     * task 3
     */

    public static int[] codeOfLetterToArr(String text){
        int[] array = Stream.of(text)
                .flatMapToInt(n -> n.chars())
                .filter(n -> n>='a' && n<='z' || n>='A' && n<='Z')
                .toArray();;
        return array;
    }

    /**
     * task 4
     */

    public static int maxInFile(String fileName){
        String text = "";
        try {
            text = Files.lines(Paths.get(fileName))
                    .collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> list = Arrays.stream(text.split(" "))
                .map(Integer::new).collect(Collectors.toList());
        return Collections.max(list);
    }
}
