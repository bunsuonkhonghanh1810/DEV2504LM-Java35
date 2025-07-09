package vn.devmaster.lesson01.pkg_LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NoWord {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        languages.sort(String::compareTo);

        for (String language : languages) {
            System.out.println(language);
        }
    }
}
