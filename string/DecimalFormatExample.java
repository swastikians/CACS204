package string;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double n = 3732427.6342;

        System.out.println("Before format: " + n);

        DecimalFormat df = new DecimalFormat("####");
        String formatted = df.format(n);

        System.out.println("After formatting: " + formatted);

        // 2
        df = new DecimalFormat("$###,###,###.##");

        formatted = df.format(n);

        System.out.println("After formatting: " + formatted);
    }
}
