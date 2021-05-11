package tree;

public class BTree implements BTreeService{

  @Override
  public BNode makeBTreeNode() {
    return new BNode();
  }

  @Override
  public void setNodeData(BNode node, int data) {
    node.setData(data);
  }

  @Override
  public BNode getLeftSubTree(BNode node) {
    return node.getLeft();
  }

  @Override
  public BNode getRightSubTree(BNode node) {
    return node.getRight();
  }

  @Override
  public void makeLeftSubTree(BNode parent, BNode child) {
    parent.setLeft(child);
  }

  @Override
  public void makeRightSubTree(BNode parent, BNode child) {
    parent.setRight(child);
  }

  public int getLeftData(BNode node){
    return node.getData();
  }

  public int getRightData(BNode node){
    return node.getData();
  }

  public void inOrderTraverse(BNode node){
    if (node == null) return;
    inOrderTraverse(node.getLeft());
    System.out.println(node.getData());
    inOrderTraverse(node.getRight());
  }

  public void preOrderTraverse(BNode node){
    if (node == null) return;
    System.out.println(node.getData());
    preOrderTraverse(node.getLeft());
    preOrderTraverse(node.getRight());
  }

  public void postOrderTraverse(BNode node){
    if (node == null) return;
    postOrderTraverse(node.getLeft());
    postOrderTraverse(node.getRight());
    System.out.println(node.getData());
  }
}
