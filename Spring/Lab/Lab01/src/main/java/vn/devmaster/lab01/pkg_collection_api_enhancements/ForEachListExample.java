package vn.devmaster.lab01.pkg_collection_api_enhancements;

import java.util.Arrays;
import java.util.List;

public class ForEachListExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java Spring", "C#", "NetCore API", "PHP Laveral", "JavaScript");

        System.out.println("Sử dụng biểu thức Lambda: ");
        languages.forEach(lang -> System.out.println(lang));

        System.out.println("Sử dụng method reference: ");
        languages.forEach(System.out::println);
    }
}
