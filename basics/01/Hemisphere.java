public class Hemisphere {
    public static void main(String[] args) {
        int r = 5;

        float volume = (float) (4 / 3 * Math.PI * Math.pow(r, 3));

        System.out.printf("Volume is %.2f\n", volume);
    }
}