import org.junit.Assert;
import org.junit.Test;

public class AutomationTest {

    @Test
    public void scenariu1() {
        Angajat e = new Angajat();
        e.name = "bogdan";
        e.salary = 1000;
        e.age = 20;
        e.calcBonus();
        int bonus = e.calcBonus();
        Assert.assertEquals(1000, bonus);
    }



    @Test
    public void scenariu2() {
        Angajat e = new Angajat();
        e.name = "bogdan";
        e.salary = 1000;
        e.age = 45;
        e.calcBonus();
        int bonus = e.calcBonus();
        Assert.assertEquals(3000, bonus);
    }
}