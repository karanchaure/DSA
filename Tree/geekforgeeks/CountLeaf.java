package Tree.geekforgeeks;
//https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1
class Node
{
    int data;
    Node left, right;
}

public class CountLeaf
{
    int count=0;
    int countLeaves(Node node) 
    {
         // Your code 
         inOrder(node);
         return count;
    }
    
    void inOrder(Node node){
        if(node.left == null && node.right == null)
            count++;
        if(node.left != null)
            inOrder(node.left);
        if(node.right != null)
            inOrder(node.right);
    }
}