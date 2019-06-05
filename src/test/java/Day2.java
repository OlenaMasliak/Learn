import org.testng.annotations.Test;

import java.util.Arrays;

public class Day2 {


    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1, 2, 3, 4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }

    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        for (char eachChar : input.toCharArray()) {
            if (eachChar == 'l') result++;
        }
        System.out.println(result);
    }

    @Test
    public void testClasses() {
        MyClass myClassObject = new MyClass();
        MyClass myClasObject1 = new MyClass("Value from test test");
    }

    @Test
    public void testInterfaceCat() {
        Cat myCat1 = new Cat();

        myCat1.eat();
        myCat1.jump();
    }

    @Test
    public void testInheritance() {
        Kids kids = new Kids();
        System.out.println(kids.name);

        Parents.eat()

    }
}


