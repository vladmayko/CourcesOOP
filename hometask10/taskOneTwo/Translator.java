package hometask10.taskOneTwo;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by MacUser on 25.03.19.
 */
public class Translator {
    private Vocabulary vocabulary;

    public Translator() {
    }

    public Translator(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    public Vocabulary getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

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
        return result.toLowerCase();
    }

    private String getTranslation(List<String> list){
        String translationText = "";
        try {
            for (String word : list) {
                for (String key : vocabulary.getVocabulary().keySet()) {
                    if (key.contains(word)) {
                        translationText += vocabulary.getVocabulary().get(key) + " ";
                    }
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return translationText;
    }

    public void translateFromFile(File file){
        String textFromFile = null;
        try {
            textFromFile = getStringFromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> list = Stream.of(textFromFile.split("\\s"))
                .map(String::new).collect(Collectors.toList());

         saveTranslationToFile(getTranslation(list));
    }

    private void saveTranslationToFile(String text){
        try (FileWriter writer = new FileWriter("Russian.out", false)){
            writer.write(text);
        }catch (IOException e){

        }
    }
}
