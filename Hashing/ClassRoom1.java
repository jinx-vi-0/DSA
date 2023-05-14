import java.util.*;

public class ClassRoom1 {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);

        // System.out.println(set);
        // set.remove(2);

        // if(set.contains(2))
        //     System.out.println("set contains 2");
        
        // set.clear();
        // System.out.println(set.size());
        // System.out.println(set.isEmpty());

// -------------------------------------------------------
        // Iteration on HashSet

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        // // a) using Iterators
        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // // b) using Enhanced for loop
        // for (String city : cities) {
        //     System.out.println(city);
        // }
// -----------------------------------------------------
            // LinkedHashSet
            LinkedHashSet<String> lhs = new LinkedHashSet<>();
            lhs.add("Delhi");
            lhs.add("Mumbai");
            lhs.add("Noida");
            lhs.add("Bengaluru");
            System.out.println(lhs);

            // lhs.remove("Delhi");
            // System.out.println(lhs);
// ------------------------------------------------------
            // TreeSet
            TreeSet<String> ts = new TreeSet<>();
            ts.add("Delhi");
            ts.add("Mumbai");
            ts.add("Noida");
            ts.add("Bengaluru");
            System.out.println(ts);
    }
}
