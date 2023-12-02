import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {

    public static void main(String[] args) throws FileNotFoundException {
        Queue<Nodeee> queue = new LinkedList<>();
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);
        // int data = input();
        // System.out.println("node val :");
        // int data = sc.nextInt();
        // queue.add(node);
        // int stop = 1;
        // while (!queue.isEmpty() && stop != 0) {
        // Nodeee nod = queue.poll();
        // if (nod != null && nod.left == null) {
        // System.out.println("left of " + nod.data);
        // int left = sc.nextInt();
        // nod.left = left == -1 ? null : new Nodeee(left);
        // if (node.left != null)
        // queue.add(nod.left);
        // }
        // if (nod != null && nod.right == null) {
        // System.out.println("right of " + nod.data);
        // int right = sc.nextInt();

        // nod.right = right == -1 ? null : new Nodeee(right);
        // if (node.right != null)
        // queue.add(nod.right);
        // }
        // System.out.println("continue ");

        // stop = sc.nextInt();
        // }
        int n = sc.nextInt();
        int nl;
        int nr;
        Nodeee nod = new Nodeee(n);
        queue.add(nod);
        while (!queue.isEmpty()) {
            // n = sc.nextInt();
            nl = sc.nextInt();
            nr = sc.nextInt();
            Nodeee node = queue.poll();
            node.left = nl == -1 ? null : new Nodeee(nl);
            if (node.left != null)
                queue.add(node.left);
            node.right = nr == -1 ? null : new Nodeee(nr);
            if (node.right != null)
                queue.add(node.right);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Level Order Traversal");
        levelTraverse(nod);
        System.out.println();
        System.out.println("In Order Traversal");
        inorderTraversal(nod);
        System.out.println();
        System.out.println("Pre Order Traversal");
        preOrderTraversal(nod);
        System.out.println();
        System.out.println("Post Order Traversal");
        postOrderTraversal(nod);
        System.out.println();
    }

    public static void inorderTraversal(Nodeee node) {
        if (node.left != null)
            inorderTraversal(node.left);
        System.out.print("\t" + node.data);
        if (node.right != null)
            inorderTraversal(node.right);
    }

    public static void preOrderTraversal(Nodeee node) {
        System.out.print("\t" + node.data);
        if (node.left != null)
            preOrderTraversal(node.left);
        if (node.right != null)
            preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Nodeee node) {
        if (node.left != null)    postOrderTraversal(node.left);
        if (node.right != null)  postOrderTraversal(node.right);
        System.out.print("\t" + node.data);
    }

    public static void levelTraverse(Nodeee node) {
        Queue<Nodeee> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Nodeee nod = queue.poll();
            System.out.print("\t" + nod.data);
            if (nod.left != null)
                queue.add(nod.left);
            if (nod.right != null)
                queue.add(nod.right);

        }

    }
}

class Nodeee {
    int data;
    Nodeee left;
    Nodeee right;

    public Nodeee(int data) {
        this.data = data;

    }

}