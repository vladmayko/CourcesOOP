package hometask10.taskOneTwo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MacUser on 25.03.19.
 */
public class Vocabulary {
    private Map<String, String> vocabulary = new HashMap<>();

    public Vocabulary() {
        dictionaryContent();
    }

    public Map<String, String> getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(Map<String, String> vocabulary) {
        this.vocabulary = vocabulary;
    }

    private void dictionaryContent(){
        vocabulary.put("we", "мы");
        vocabulary.put("must", "должен");
        vocabulary.put("keep", "держать");
        vocabulary.put("cup", "чашка");
        vocabulary.put("books", "книги");
        vocabulary.put("part", "часть");
        vocabulary.put("clean", "чистый");
        vocabulary.put("and", "и");
        vocabulary.put("tidy", "аккуратный");
    }

    public void addWordToVocabulary(String englishWord, String russianTranslate){
        vocabulary.put(englishWord, russianTranslate);
    }

    public void saveVocabularyToDisk(){
        try(FileWriter writer =  new FileWriter("vocabulary.txt", false)){
            for (String key: vocabulary.keySet()) {
                writer.write(key + " - " + vocabulary.get(key) + System.lineSeparator());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vocabulary)) return false;

        Vocabulary that = (Vocabulary) o;

        return vocabulary != null ? vocabulary.equals(that.vocabulary) : that.vocabulary == null;
    }

    @Override
    public int hashCode() {
        return vocabulary != null ? vocabulary.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Vocabulary{" + "vocabulary=" + vocabulary + '}';
    }
}
