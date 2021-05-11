import tree.BNode;
import tree.BTree;

public class Main {
    public static void main(String[] args){
       BTree tree = new BTree();

       BNode node1 = new BNode(1);
       BNode node2 = new BNode(2);
       BNode node3 = new BNode(3);
       BNode node4 = new BNode(4);

       tree.makeLeftSubTree(node1, node2);
       tree.makeRightSubTree(node1, node3);
       tree.makeLeftSubTree(node2, node4);

       System.out.println("in order");
       tree.inOrderTraverse(node1);
      /* System.out.println("pre order");
       tree.preOrderTraverse(node1);
       System.out.println("post order");
       tree.postOrderTraverse(node1);*/
    }
}
