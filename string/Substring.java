package string;

public class Substring {
    public static void main(String[] args) {
        String sentence = "Nepal is a beautiful country.";
        String countryName = sentence.substring(0, 5);

        System.out.println(countryName);

        String sliced = sentence.substring(9);
        System.out.println(sliced);
    }
}
