/**
https://leetcode.com/problems/insert-delete-getrandom-o1/
380. Insert Delete GetRandom O(1)  QuestionEditorial Solution  My Submissions
Total Accepted: 113 Total Submissions: 283 Difficulty: Medium
Design a data structure that supports all following operations in O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
Example:

// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 1 is the only number in the set, getRandom always return 1.
randomSet.getRandom();
 */
package algorithms.num380_InsertDeleteGetRandomO1;

import java.util.ArrayList;
import java.util.List;

public class RandomizedSet {

	List<Integer> ls = null;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        ls = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (ls.contains(val)) return false;
        else {
        	ls.add(val);
        	return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (ls.contains(val)) {
        	ls.remove(new Integer(val));
        	return true;
        } else return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return ls.get(ls.size() * (int)Math.random());
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
//20160803Wed21:57 duration:5m45s99 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
