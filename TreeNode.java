public class TreeNode<T>{
    
    T item;
    TreeNode<T> parent;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T item, TreeNode<T> parent, TreeNode<T> left, TreeNode<T> right){
        this.item= item;
        this.parent=parent;
        this.left=left;
        this.right=right;
    }

    TreeNode(T item){
        this.parent=null;
        this.left=null;
        this.right=null;
        this.item=item;
    }

    TreeNode(T item, TreeNode<T> left, TreeNode<T> right){
        this.parent=null;
        this.item=item;
        this.left=left;
        this.right=right;
    }
}