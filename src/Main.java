
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static boolean changeArrayElementPosition (Object[] arrObj, int x1, int x2) {
        if (x1<0 || x1 >= arrObj.length || x2 <0 || x2 >= arrObj.length)
         return false;
          else {
            Object temp = arrObj[x1];
            arrObj[x1] = arrObj[x2];
            arrObj[x2] = temp;
        }
          return true;
    }

    public static <T> ArrayList<T> convertArryToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

        public static void main(String[] args) {

            Object[] arrObj = new SimpleBox[3];
            arrObj[0] = new SimpleBox<>(1);
            arrObj[1] = new SimpleBox<>(3.1d);
            arrObj[2] = new SimpleBox<>(2.0f);

            System.out.println(changeArrayElementPosition(arrObj,0,2));
            System.out.println(changeArrayElementPosition(arrObj,0,3));

            System.out.println(convertArryToList(arrObj).getClass());

            Box<Fruit> boxFruit = new Box<>();
            Box<Apple> boxApple = new Box<>();
            Box<Orange> boxOrange = new Box<>();
            boxApple.addFruit(new Apple());
            boxApple.addFruit(new Apple());
            boxOrange.addFruit(new Orange());
            System.out.println(boxOrange.compareWaigth(boxApple) + " App = " + boxApple.getWeight() + " Or = " + boxOrange.getWeight());
            boxApple.shiftFruit(boxFruit);
            System.out.println(boxFruit.getClass().getName() +" waigth = "+ " " + boxFruit.getWeight());

        }
}