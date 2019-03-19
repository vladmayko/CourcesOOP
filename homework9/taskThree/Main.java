package homework9.taskThree;

import java.io.*;

/**
 * Created by MacUser on 18.03.19.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        Statistic.getStatistic(file);
    }
}
