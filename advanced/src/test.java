public class test {

    public static void main(String[] args) {
        Angajat marius = new Angajat();
        marius.salary = 100;
        marius.age = 50;
        marius.name = "Marius";
        int b = marius.calcBonus();
        System.out.println(b);
    }
}

