/**
https://leetcode.com/problems/implement-stack-using-queues/
225. Implement Stack using Queues My Submissions QuestionEditorial Solution
Total Accepted: 43235 Total Submissions: 140748 Difficulty: Easy
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
Update (2015-06-11):
The class name of the Java function had been updated to MyStack instead of Stack.
 */
package algorithms.num225_ImplementStackUsingQueues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	Queue<Integer> q = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
        	int popi = it.next();
        	if (!it.hasNext()) q.remove(popi);
        }
    }

    // Get the top element.
    public int top() {
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
        	int popi = it.next();
        	if (!it.hasNext()) return popi;
        }
        return 0;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}
//20160628Tue09:51 duration:7m22s36 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao