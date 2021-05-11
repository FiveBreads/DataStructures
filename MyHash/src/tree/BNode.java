package tree;

public class BNode {
  private int data;
  private BNode left;
  private BNode right;

  public BNode(){
    left = null;
    right = null;
  }

  public BNode(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }

  @Override
  public String toString() {
    return "BNode{" +
        "data=" + data +
        ", left=" + left +
        ", right=" + right +
        '}';
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public BNode getLeft() {
    return left;
  }

  public void setLeft(BNode left) {
    this.left = left;
  }

  public BNode getRight() {
    return right;
  }

  public void setRight(BNode right) {
    this.right = right;
  }
}
