public class RandomizedCollection {

    List<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        list = new ArrayList<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if(list.contains(val)){
            list.add(val);
            return false;
        }else{
            list.add(val);
            return true;
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!list.contains(val)) {
            return false;
        }else{
            list.remove(Integer.valueOf(val));
            return true;
        }
    }

    /** Get a random element from the collection. */
    public int getRandom() {

        int index = (int)(list.size()*Math.random());

        return list.get(index);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */