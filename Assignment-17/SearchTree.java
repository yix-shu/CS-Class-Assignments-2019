/*
Name: Yixing Xu
Date: March 9, 2020
Student ID: 950706619
Course: CS211 Online
Objective:

countSameData(SearchTree other)

*/
// Class SearchTree stores and prints a binary search tree of
// objects of type E.  E must implement the Comparable<E>
// interface.  from Reges and Stepp, BJP 3ed.
// modified by W.P. Iverson, to not allow duplicates added
// Bellevue College, January 2020

public class SearchTree<E extends Comparable<E>> {

    private SearchTreeNode<E> overallRoot; // root of overall tree

    // post: constructs an empty search tree
    public SearchTree() {
        overallRoot = null;
    }
    
    // WRITE ADDITIONAL METHODS HERE:
    public boolean isFull(){ //isFull()
      return isFull(overallRoot);
    }
    private boolean isFull(SearchTreeNode<E> root){
      if (root == null){
        return true;
      }
      else if (root.left == null && root.right == null){
        return true;
      }
      else if (root.left != null && root.right != null){
        return (isFull(root.left)&&isFull(root.right)); //returns false if one is false, returns true only if both are true
      }
      else{
        return false;
      }
    }
    public boolean equals(SearchTree<E> tree){ //equals(tree)
      return equals(tree, overallRoot, tree.overallRoot);
    }
    private boolean equals( SearchTree<E> tree, SearchTreeNode<E> root, SearchTreeNode<E> root2){
      if (root2 == null && root == null){
        return true;
      }
      else if ((root2 != null && root == null)||(root2 == null && root != null)){
        return false;
      }
      else if (root.data.compareTo(root2.data) == 0){ //compareTo because of <E> data type
        return (equals(tree, root.left, root2.left) && equals(tree, root.right, root2.right)); //returns false if one is false, returns true only if both are true
      }
      else{
        return false;
      }
    }
    public void removeLeaves(){ //removesLeaves()
      overallRoot = removeLeaves(overallRoot);
    }
    private SearchTreeNode<E> removeLeaves(SearchTreeNode<E> root){
      if (root == null){
        return null;
      }
      else if (root != null && root.left == null && root.right == null){ //checks if the root is a leaf
        root = null;
        return null;
      }
      else{
        root.right = removeLeaves(root.right);
        root.left = removeLeaves(root.left);
      }
      return root;
    }

    public void remove(E value) { //remove(value)
      overallRoot = remove(overallRoot, value);
    }
    private SearchTreeNode<E> remove(SearchTreeNode<E> root, E value) {
      if (root == null) {
        return null;
      } 
      else if (root.data.compareTo(value)>0) {
        root.left = remove(root.left, value);
      } 
      else if (root.data.compareTo(value)<0) {
        root.right = remove(root.right, value);
      } 
      else {  // when root.data == value
          if (root.right == null) {
            return root.left;    
          } 
          else if (root.left == null) {
            return root.right;   
          } 
          else {
            root.data = (E)(root.right).left;
            root.right = remove(root.right, root.data);
          }
        }
      return root;
    }


    public int countSameData(SearchTree<E> other){ //countSameData
      return countSameData(other, other.overallRoot, overallRoot);
    }
    private int countSameData(SearchTree<E> other, SearchTreeNode<E> otherRoot, SearchTreeNode<E> root){
      if (otherRoot == null && root == null){
        return 0;
      }
      else if ((otherRoot != null && root == null)) {	  
    	  /*
    	  if (root.right != null){
    		  return countSameData(other, otherRoot, root.right);
    	  }
    	  else if (root.left != null){
    		  return countSameData(other, otherRoot, root.left);
    	  }
    	  else{
    		  return 0;
    	  }
    	  */
    	  return 0;
      }
      else if (otherRoot == null && root != null) {
    	  /*
    	  if (otherRoot.right != null) {
    		  return countSameData(other, otherRoot.right, root);
    	  }
    	  else if (otherRoot.left != null) {
    		  return countSameData(other, otherRoot.left, root);
    	  }
    	  else{
    		  return 0;
    	  }*/
    	  return 0;
      }
      else{
        if (root.data.compareTo(otherRoot.data)>0) {
        	return countSameData(other, otherRoot.right, root);
        }
        else if (root.data.compareTo(otherRoot.data)<0) {
        	return countSameData(other, otherRoot.left, root);
        }
        else{
        	return 1 + countSameData(other, other.overallRoot, root.left) + countSameData(other, other.overallRoot, root.right);
        }
      }
    }
    
    
    

    // post: value added to tree so as to preserve binary search tree
    public void add(E value) {
        overallRoot = add(overallRoot, value);
    }

    // post: value added to tree so as to preserve binary search tree
    private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
        if (root == null) {
            root = new SearchTreeNode<E>(value);
        } else if (root.data.compareTo(value) > 0) {
            root.left = add(root.left, value);
        } else if (root.data.compareTo(value) < 0) {
            root.right = add(root.right, value);
        }
        return root;
    }

    // post: returns true if tree contains value, returns false otherwise
    public boolean contains(E value) {
        return contains(overallRoot, value);
    }   

    // post: returns true if given tree contains value, returns false otherwise
    private boolean contains(SearchTreeNode<E> root, E value) {
        if (root == null) {
            return false;
        } else {
            int compare = value.compareTo(root.data);
            if (compare == 0) {
                return true;
            } else if (compare < 0) {
                return contains(root.left, value);
            } else {   // compare > 0
                return contains(root.right, value);
            }
        }
    }

    // post: prints the data of the tree, one per line
    public void print() {
        printInorder(overallRoot);
    }

    // post: prints the data of the tree using an inorder traversal
    private void printInorder(SearchTreeNode<E> root) {
        if (root != null) {
            printInorder(root.left);
            System.out.println(root.data);
            printInorder(root.right);
        }
    }

    
    
    // a private inner Class for the search tree nodes
    // there is no use for such nodes outside of the SearchTree Class
    // so a private inner Class is appropriate in this case...
    private static class SearchTreeNode<E> {
        public E data;                   // data stored in this node
        public SearchTreeNode<E> left;   // left subtree
        public SearchTreeNode<E> right;  // right subtree

        // post: constructs a leaf node with given data
        public SearchTreeNode(E data) {
            this(data, null, null);
        }

        // post: constructs a node with the given data and links
        public SearchTreeNode(E data, SearchTreeNode<E> left,
                              SearchTreeNode<E> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
