
import java.util.*;

public class driver {

    //   ArrayList VS Vector

    //ArrayList

   /* public static void main(String[] args)
    {
        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrlist = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrlist.add(i);

        // Printing elements
        System.out.println(arrlist);

        // Remove element at index 3
        arrlist.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrlist);

        // Printing elements one by one
        for (int i=0; i<arrlist.size(); i++)
            System.out.print(arrlist.get(i)+" ");
    }*/

   //  Vector

    /*public static void main(String[] arg)
    {

        // create default vector
        Vector v = new Vector();

        v.add(1);
        v.add(2);
        v.add("Hello");
        v.add("World");
        v.add(3);

        System.out.println("Vector is " + v);
    }*/

    //---------------------------------------------------------------------------------------------------------------------------------------------------

    // HashSet vs SortedSet


    //  HashSet

    /*public static void main(String[]args) {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));

    }*/

    // SortedSet

    /*public static void main(String[] args)
    {
        // Create a TreeSet and inserting elements
        SortedSet<String> sites = new TreeSet<>();
        sites.add("practice");
        sites.add("HelloWorld");
        sites.add("quiz");
        sites.add("code");

        System.out.println("Sorted Set: " + sites);
        System.out.println("First: " + sites.first());
        System.out.println("Last: " + sites.last());

        // Getting elements before quiz (Excluding) in a sortedSet
        SortedSet<String> beforeQuiz = sites.headSet("quiz");
        System.out.println(beforeQuiz);

        // Getting elements between code (Including) and
        // practice (Excluding)
        SortedSet<String> betweenCodeAndQuiz =
                sites.subSet("code","practice");
        System.out.println(betweenCodeAndQuiz);

        // Getting elements after code (Including)
        SortedSet<String> afterCode = sites.tailSet("code");
        System.out.println(afterCode);
    }*/

    //---------------------------------------------------------------------------------------------------------------------------------------------------


    // HashSet Vs TreeSet

    //HashSet

    /*public static void main(String[]args) {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));

    }*/

    //TreeSet

    /*public static void main(String[] args)
    {
        TreeSet<String> ts1 = new TreeSet<String>();

        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");

        // Duplicates will not get insert
        ts1.add("C");

        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
    } */

    //---------------------------------------------------------------------------------------------------------------------------------------------------

    //  Array vs List

    //Array

    /*public static void main (String[] args)
    {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ arr[i]);
    }*/

    //List

    /*public static void main (String[] args)
    {
        // Creating a list
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);  // adds 1 at 0 index
        l1.add(1, 2);  // adds 2 at 1 index
        System.out.println(l1);  // [1, 2]

        // Creating another list
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);
        System.out.println(l1); // [1, 2, 3, 2]

        // Prints element at index 3
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        l1.set(0, 5);
        System.out.println(l1);
    }*/

    //---------------------------------------------------------------------------------------------------------------------------------------------------

    // List vs Set

    //List

    /*public static void main (String[] args)
    {
        // Creating a list
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);  // adds 1 at 0 index
        l1.add(1, 2);  // adds 2 at 1 index
        System.out.println(l1);  // [1, 2]

        // Creating another list
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);
        System.out.println(l1); // [1, 2, 3, 2]

        // Prints element at index 3
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        l1.set(0, 5);
        System.out.println(l1);
    }*/

    //Set

    /*public static void main(String args[])
    {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }*/

    //---------------------------------------------------------------------------------------------------------------------------------------------------

    // NavigableSet vs NavigableMap

    // NavigableSet

    /*public static void main(String[] args)
    {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = ns.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);

        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
        System.out.println("3 or  more:  " + threeOrMore);
        System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("pollLast(): " + ns.pollLast());
    }*/

    // NavigableMap

    /*public static void main(String[] args)
    {
        NavigableMap<String, Integer> nm =
                new TreeMap<String, Integer>();
        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);

        System.out.printf("Descending Set  : %s%n",
                nm.descendingKeySet());
        System.out.printf("Floor Entry  : %s%n",
                nm.floorEntry("L"));
        System.out.printf("First Entry  : %s%n",
                nm.firstEntry());
        System.out.printf("Last Key : %s%n",
                nm.lastKey());
        System.out.printf("First Key : %s%n",
                nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Reverse Map : %s%n",
                nm.descendingMap());
    }*/
}
