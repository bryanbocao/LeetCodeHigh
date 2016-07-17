/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author dingwen
 * 
 * TreeNode class is used in Leetcode. 
 * It has a public static class treeGenerate which can generate a tree from raw string
 * the utility function help you generate a tree from raw test case.
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode treeCustructFromStringArray(String[] inputList) {
        if(inputList.length==0 || "".equals(inputList[0]) || inputList[0]==null) return null;
        TreeNode root = new TreeNode(Integer.valueOf(inputList[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode tm = queue.poll();

            if (i<inputList.length && inputList[i] != null) {
                tm.left = new TreeNode(Integer.valueOf(inputList[i]));
                queue.add(tm.left);
            }
            i++;
            
            if (i<inputList.length && inputList[i] != null) {
                tm.right = new TreeNode(Integer.valueOf(inputList[i]));
                queue.add(tm.right);
            }
            i++;
        }
        return root;
    }
    
    public static TreeNode treeConstructFromIntArray(Integer[] inputList) {
        if(inputList.length==0 || inputList[0]==null) return null;
        TreeNode root = new TreeNode(inputList[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode tm = queue.poll();

            if (i<inputList.length && inputList[i] != null) {
                tm.left = new TreeNode(inputList[i]);
                queue.add(tm.left);
            }
            i++;
            
            if (i<inputList.length && inputList[i] != null) {
                tm.right = new TreeNode(inputList[i]);
                queue.add(tm.right);
            }
            i++;
        }
        return root;
    }
}
