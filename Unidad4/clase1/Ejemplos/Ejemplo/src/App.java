import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new LinkedList<>();

        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        //agregar un elemento intermedio
        list.add(1, "Element 1.1");
        list.add(3, "Element 2.1");


        for (String element : list) {
            System.out.println(element);
        }

        List<String> arrayList = new ArrayList<>(list);
        System.out.println("ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        //a partir de aqui ya puedo sacarle provecho a la implentación de ArrayList



    }
}
