import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Creating an iterator for the list
        Iterator<String> iterator = list.iterator();

        try {
            // This loop will throw a NoSuchElementException
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        }
    }
}
