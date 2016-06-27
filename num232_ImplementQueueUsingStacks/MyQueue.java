/**
https://leetcode.com/problems/implement-queue-using-stacks/
232. Implement Queue using Stacks My Submissions QuestionEditorial Solution
Total Accepted: 47878 Total Submissions: 140000 Difficulty: Easy
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 */
package algorithms.num232_ImplementQueueUsingStacks;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	List<Integer> ls = new ArrayList<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        ls.add(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        ls.remove(0);
    }

    // Get the front element.
    public int peek() {
        return ls.get(0);
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return ls.isEmpty();
    }
}
//20160627Mon13:21 duration:4m41s23 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao