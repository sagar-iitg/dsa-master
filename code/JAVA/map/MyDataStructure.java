package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 *
 *  Design a data structure that supports insert, delete, search and getRandom in constant time
 * 
 */

public class MyDataStructure {


    private ArrayList<Integer> arr; // A resizable array to hold the elements
    private Map<Integer, Integer> map; // A hash map to store the indexes of element
    

    
    public MyDataStructure() {
        this.arr = new ArrayList<>();
        this.map = new HashMap<Integer,Integer>();
    }


    // Method to add an element to the data structure
    public void add(int x) {
        // If element is already present, do nothing
        if (!map.containsKey(x)) {
            // Else add element to the end of the array
            int index = arr.size();
            arr.add(x);
            // And store its index in the hash map
            map.put(x, index);
        }

    }

    // Method to remove an element from the data structure
    public void remove(int x) {
        // If element is not present, do nothing
        if (map.containsKey(x)) {
            // Else remove element from the hash map and get its index in the array
            int index = map.get(x);
            map.remove(x);
            // Swap the element with the last element in the array and remove the last element
            int last = arr.size() - 1;
            arr.set(index, arr.get(last));
            arr.remove(last);
            // Update the hash map with the new index of the element that was swapped with the last element
            map.put(arr.get(index), index);
        }
    }

      // Method to search for an element in the data structure
      public int search(int x) {
        // If element is present, return its index in the array from the hash map
        if (map.containsKey(x)) {
            return map.get(x);
        }
        // Else return -1
        return -1;
    }

     // Method to get a random element from the data structure
     public int getRandom() {
        Random rand = new Random();
        // Generate a random index from 0 to size - 1 of the array
        int randomIndex = rand.nextInt(arr.size());
        // Return the element at the randomly picked index
        return arr.get(randomIndex);
    }



    public static void main(String[] args) {
        MyDataStructure ds=new MyDataStructure();
        ds.add(10);
        ds.remove(10);


    }
    
}
