package JavaSE.Chapter_10_DS_Collections;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        // Java Collection
        // List Set Map Queue
        // Iterable Collection
        
        // Apple Ipad
        
        
        List<String> myList = new ArrayList<>();
        /*
            In this Section Focus on Merging between DS and Collections Framework.
            What is the DataStructure?
            
            Arrays:
                - O(N) Time Complexity

            Java Collections APIs:
            - It is a production-grade implementations for the widely known data structures..
            - Elements of the Array are stored in contiguous memory areas.

            Interfaces: List Set Map   Queue

            * Java Classes:
            In each one we need to define what is it? how it is implemented? What is the data structure behind it?
            What is the real-life usage of it?
            1. List: Ordered (indexed) Collections that allow duplicates.
            - Use List classes when you care about order, you may have duplicates, and want to access elements by index.
            - List is an interface. So, you can't create object directly form it.
                a. ArrayList:
                    -   Resizable (dynamic) array with fast random access that maintains order and allows duplicates.
                    for dynamic Array - Internally uses array to store objects.
                    
                    - Its Methods:
                     * add() Adds an element to the end of the list
                     * get() Returns the element at the specified position
                     * set() Replaces the element at the specified position
                     * remove() Removes the element at the specified position
                     * size() Returns the number of elements in the list

                    - List vs. Array
                    
                        Array               ---------               List
                    Fixed size                              Dynamic size
                    Faster performance for raw data.    More flexible and feature-rich
                    Not part of Collections Framework.  Part of the Collections Framework
              - Sorting List
                
                b. LinkedList:
                    - List with fast insert and remove operations
                    - Like a train of cars you can easily attach or remove
                c. Vector
                d. Stack
            2. Queues: used when we have a resource that can be shared with many consumers.
                a. PriorityQueue
                b. ArrayDeque
            3. Set: Collection of unique elements.
            - Use Set classes when you need to store unique values only.
                a. HashSet:
                    - Unordered collection of unique elements.
                    
                b. TreeSet
                    - Sorted set of unique elements (natural order).
                c. LinkedHashSet
                    - Maintains the order in which elements were inserted
                
                
               
            4. Map: Store Key-value pairs with unique keys.
            - Use Map classes when you need to store pairs of keys and values, like a name and its phone number.
                a. HashMap:
                    - Stores key/value pairs with no specific order
                b. TreeMap:
                    - Sorted map based on the natural order of keys
                c. LinkedHashMap
                    - Maintains the order in which keys were inserted
                d. HashTable
                


            General Notes:
            - Java Iterable isn't belongs to the Collection Framework. instead it belongs to the java.lang package.
            Iterator is used to loop over the list without knowing anything from it's internal implementation.

            Each Collection is Iterable.

            ctrl + P -> to show the method parameter definition

         */
        
        
        List<String> linkedList = new LinkedList<>();
        
        Collections.addAll(myList, "a", "b", "c", "d", "e", "f");
        
        // Collection.toArray(); -> convert Collections to regular Array.
        
        
        // Remember: The anonymous inner class is used to implement eather abstract class or interfaces on the fly
        // without creating stand-alone separate class.
        
        
    }
    
    
}