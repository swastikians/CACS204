package inheritance;

public class FinalKeyword {
    public static void main(String[] args) {
        final int n = 2;

        // The final local variable n cannot be assigned.
        // It must be blank and not using a compound assignment Java(536870970)
        n = 3;
    }
}

// The type Tesla cannot subclass the final class Vehicle Java(16777529)
class Tesla extends Vehicle {}

final class Vehicle {

}
