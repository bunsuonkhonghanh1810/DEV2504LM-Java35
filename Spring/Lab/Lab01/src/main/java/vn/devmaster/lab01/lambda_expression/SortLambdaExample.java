package vn.devmaster.lab01.lambda_expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "C# NetCore", "PHP", "JavaScript");

        list.sort(String::compareTo);

        for (String str : list) {
            System.out.println(str);
        }
    }
}
