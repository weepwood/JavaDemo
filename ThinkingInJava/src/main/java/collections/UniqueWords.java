package collections;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author lanqilu
 * @date Created in 2020/10/13  18:50
 * @description
 */
public class UniqueWords {
    public static void main(String[] args) throws Exception {
        // 获取项目路径
        File directory = new File("");
        String courseFile = directory.getCanonicalPath();

        List<String> lines = Files.readAllLines(Paths.get(courseFile +
                "\\ThinkingInJava\\src\\main\\java\\collections\\SetOperations.java"));
        Set<String> words = new TreeSet<>();
        for (String line : lines) {
            for (String word : line.split("\\W+")) {
                if (word.trim().length() > 0) {
                    words.add(word);
                }
            }
        }
        System.out.println(words);
    }
}
