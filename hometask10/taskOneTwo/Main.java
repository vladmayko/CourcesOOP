package hometask10.taskOneTwo;

import java.io.File;

/**
 * Created by MacUser on 25.03.19.
 */
public class Main {
    public static void main(String args[]){
        Vocabulary vocabulary = new Vocabulary();
        vocabulary.addWordToVocabulary("animal", "животное");

        Translator ts = new Translator(vocabulary);

        File file = new File("English.in");
        vocabulary.addWordToVocabulary("lion", "лев");
        vocabulary.saveVocabularyToDisk();

        ts.translateFromFile(file);
    }
}
