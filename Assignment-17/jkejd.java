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
      public void removeLeaves(){ //removesLeaves()
    	  overallRoot = removeLeaves(overallRoot);
      }
      private SearchTreeNode<E> removeLeaves(SearchTreeNode<E> root){
    	  if (root == null) {
    		  return null;
    	  }
    	  else if (root != null && root.left == null && root.right == null) {
    		  root = null;
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
              root.data = ((root.right).left).data;
              root.right = remove(root.right, root.data);
            }
          }
        return root;
      } 
}
