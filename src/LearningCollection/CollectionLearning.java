package LearningCollection;

import java.util.*;

public class CollectionLearning {
    /**
     * Collection  is an interface. it has a number of methods that are not implemented.
     * <p>
     * Collections are used for manipulating the collection or the data that has been stored into a structure.
     */

    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("Noah");
        collection.add("Sarah");
        collection.add("Oyin");
        collection.add("Tobi");
        collection.add("Chidinma");
        collection.add("Raji");
        collection.add("Emperor");
        collection.add("Pelumi");
        collection.add("Ridoh");
        collection.add("Moses");
//        System.out.println(collection.size());
        collection.set(3, "Carpenter");
//        System.out.println(collection.size());
        collection.add(0, "Musa");
//        System.out.println(collection.get(3));

//        for (String list : collection) {
//            System.out.println(list);
//        }
        collection.forEach(n -> System.out.println(n));
        System.out.println("Using the has next method");
        //Iteraing through a list.
         Iterator<String> collectionIterator = collection.iterator();
        while (collectionIterator.hasNext()) {
            System.out.println(collectionIterator.next());
        }
        System.out.println("Using enumeration");

        Enumeration<String> enumeration = Collections.enumeration(collection);
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }


}
