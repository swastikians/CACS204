package interface_example;

public class Banking {
    public static void main(String[] args) {
        NICAsia nic = new NICAsia();
        System.out.println(nic.getName() + " gives " + nic.getInterestRate() + "% interest");

        Sanima sanima = new Sanima();
        System.out.println(sanima.getName() + " gives " + sanima.getInterestRate() + "% interest");

        Prabhu prabhu = new Prabhu();
        System.out.println(prabhu.getName() + " gives " + prabhu.getInterestRate() + "% interest");
    }
}

interface Bank {
    String getName();
    float getInterestRate();
}

class NICAsia implements Bank {
    public String getName() {
        return "NIC Asia Bank";
    }

    public float getInterestRate() {
        return 9.3f;
    }
}

class Sanima implements Bank {
    public String getName() {
        return "Sanima Bank";
    }

    public float getInterestRate() {
        return 7.2f;
    }
}

class Prabhu implements Bank {
    public String getName() {
        return "Prabhu Bank";
    }

    public float getInterestRate() {
        return 8.22f;
    }
}
