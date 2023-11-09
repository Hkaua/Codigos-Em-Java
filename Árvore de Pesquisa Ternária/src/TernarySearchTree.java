import java.util.*;

class TernarySearchTree {
    static final int MAX = 50;

    class Node {
        char data;
        int isEndOfstring = 0;
        Node left, eq, right;

        Node(char data) {
            this.data = data;
            this.isEndOfstring = 0;
            this.left = null;
            this.eq = null;
            this.right = null;
        }
    }

    Node root;

    TernarySearchTree() {
        root = null;
    }

    void insert(String word) {
        root = insertRec(root, word, 0);
    }

    Node insertRec(Node root, String word, int index) {
        if (root == null) {
            root = new Node(word.charAt(index));
        }

        if (word.charAt(index) < root.data) {
            root.left = insertRec(root.left, word, index);
        } else if (word.charAt(index) > root.data) {
            root.right = insertRec(root.right, word, index);
        } else {
            if (index + 1 < word.length()) {
                root.eq = insertRec(root.eq, word, index + 1);
            } else {
                root.isEndOfstring = 1;
            }
        }
        return root;
    }

    void traverseTSTUtil(Node root, char[] buffer, int depth) {
        if (root != null) {
            traverseTSTUtil(root.left, buffer, depth);

            buffer[depth] = root.data;
            if (root.isEndOfstring == 1) {
                buffer[depth + 1] = '\0';
                System.out.println(new String(buffer, 0, depth + 1));
            }

            traverseTSTUtil(root.eq, buffer, depth + 1);

            traverseTSTUtil(root.right, buffer, depth);
        }
    }

    void traverseTST() {
        char[] buffer = new char[MAX];
        traverseTSTUtil(root, buffer, 0);
    }

    boolean search(String word) {
        return searchRec(root, word, 0);
    }

    boolean searchRec(Node root, String word, int index) {
        if (root == null) {
            return false;
        }

        if (word.charAt(index) < root.data) {
            return searchRec(root.left, word, index);
        } else if (word.charAt(index) > root.data) {
            return searchRec(root.right, word, index);
        } else {
            if (index + 1 == word.length()) {
                return root.isEndOfstring == 1;
            }
            return searchRec(root.eq, word, index + 1);
        }
    }

    public static void main(String[] args) {
        TernarySearchTree tst = new TernarySearchTree();
        tst.insert("cat");
        tst.insert("cats");
        tst.insert("up");
        tst.insert("bug");
        System.out.println("Following is traversal of ternary search tree:");
        tst.traverseTST();
        System.out.println("\nFollowing are search results for cats, bu, and cat repetitively:");
        System.out.println(tst.search("cats") ? "Found" : "Not Found");
        System.out.println(tst.search("bu") ? "Found" : "Not Found");
        System.out.println(tst.search("cat") ? "Found" : "Not Found");
    }
}