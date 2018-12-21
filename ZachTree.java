public class ZachTree<T>{

    TreeNode<T> root;

    //creates an empty tree.
    public ZachTree(){

    }
    
    public ZachTree(T item){
        root = new TreeNode<T>(item);
        root.left=null;
        root.right=null;
    }

    public ZachTree(TreeNode<T> item){
        root = item;
        root.left=null;
        root.right=null;
    }

    public ZachTree(T rootitem, TreeNode<T> leftitem, TreeNode<T> rightitem){
        root = new TreeNode<T>(rootitem);
        root.left=leftitem;
        root.right=rightitem;
    }

    public void attachLeftSubtree(ZachTree<T> left){
        if(root==null){
            throw new TreeException("Cannot attach a tree to an empty tree.");
        }
        if (left==null){
            return;
        }

        root.left = left.root;
        left.root.parent = root;
        left=null;

    }

    public void attachRightSubtree(ZachTree<T> right){
        if (root==null){
            throw new TreeException("Cannot attach a tree to an empty tree.");
        }
        if(right==null){
            return;
        }

        root.right = right.root;
        right.root.parent = root;
        right =null;
    }

    public boolean isEmpty(){
        if(root==null){
            return true;
        }

        return false;
    }

    public int height(){
        TreeNode<T> temp = root;
        int theHeight = height(temp);

        return theHeight;
    }

    public int height(TreeNode<T> node){
        //if node is null, return value 0;
        if (node==null){
            return 0;
        }

        //if node is not null, compute height of left and right branches.
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        //compare left and right branches. Return larger value plus one.
        if(leftHeight>rightHeight){
            return leftHeight+1;
        }
        if(rightHeight>leftHeight){
            return rightHeight+1;
        }
        
        //if both heights are the same, then return leftHeight+1.
        return leftHeight+1;
        
    }

    public static void main(String[] args) {
        System.out.println("TreeOne created with integer 4 placed as root.");
        ZachTree<Integer> TreeOne = new ZachTree<Integer>(4);
        System.out.println("Is the Tree empty?: " + TreeOne.isEmpty());
        System.out.println("TreeTwo created with no items in it.");
        ZachTree<Integer> TreeTwo = new ZachTree<Integer>();
        System.out.println("Is TreeTwo empty?: " + TreeTwo.isEmpty());

    }


    
}