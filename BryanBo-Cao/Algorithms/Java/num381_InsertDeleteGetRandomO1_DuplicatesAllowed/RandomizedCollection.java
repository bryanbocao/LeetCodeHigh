/**
https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
381. Insert Delete GetRandom O(1) - Duplicates allowed  QuestionEditorial Solution  My Submissions
Total Accepted: 160 Total Submissions: 523 Difficulty: Medium
Design a data structure that supports all following operations in average O(1) time.

Note: Duplicate elements are allowed.
insert(val): Inserts an item val to the collection.
remove(val): Removes an item val from the collection if present.
getRandom: Returns a random element from current collection of elements. The probability of each element being returned is linearly related to the number of same value the collection contains.
Example:

// Init an empty collection.
RandomizedCollection collection = new RandomizedCollection();

// Inserts 1 to the collection. Returns true as the collection did not contain 1.
collection.insert(1);

// Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
collection.insert(1);

// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
collection.insert(2);

// getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
collection.getRandom();

// Removes 1 from the collection, returns true. Collection now contains [1,2].
collection.remove(1);

// getRandom should return 1 and 2 both equally likely.
collection.getRandom();
 */
package algorithms.num381_InsertDeleteGetRandomO1_DuplicatesAllowed;

import java.util.ArrayList;
import java.util.List;

public class RandomizedCollection {

	List<Integer> ls;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        this.ls = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
    	if (ls.contains(val)) {
    		ls.add(val);
    		return false;
    	} else {
    		ls.add(val);
    		return true;
    	}
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
    	if (ls.contains(val)) {
    		ls.remove(new Integer(val));
    		return true;
    	} else return false;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return ls.get((int)(ls.size() * Math.random())); 
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
//20160808Mon22:03 CodingDuration:20m16s85 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
