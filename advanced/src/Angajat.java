import org.junit.Test;

public class Angajat {

    String name;
    int salary, age;

    public int calcBonus() {
        if (age > 40) {
            return salary * 2;
        }
        if (age > 30) {
            return salary*2;
        }
        return salary;
    }

}

