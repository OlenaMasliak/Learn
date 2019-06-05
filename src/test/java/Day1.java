import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void testMethod1() {
        System.out.println("Hello, World");

    }

    @Test
    public void testMethod22() {
        System.out.println(" 1820 E 13th street");
        System.out.println("Apt 6 s");
    }

    @Test
    public void testMethod2() {
        int myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void testMethod3() {
        float f = (float) 4.5;
        System.out.println(f);
    }

    @Test
    public void testMethod4() {
        char c = 'g';

        String s2 = "Who who who who!";

        String s3 = "Who let the dogs out?";

        System.out.println(s2 + s3);
    }

    @Test
    public void testMethod5() {
        int num = 66;

        String s = "I have " + num + " cookies";

        System.out.println(s);

    }


    @Test
    public void testMethod9() {
        int[] arrayOfIntegers = new int [] {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int arrayMember = arrayOfIntegers [i];
            System.out.println(arrayMember);

        }
    }
    
};