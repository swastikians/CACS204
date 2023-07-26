package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectedJoin {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Script");
        String str = list.stream().collect(Collectors.joining(""));

        System.out.println(str);
    }
}
