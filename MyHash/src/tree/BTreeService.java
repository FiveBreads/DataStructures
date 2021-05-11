package tree;

public interface BTreeService {
  public BNode makeBTreeNode();
  public void setNodeData(BNode node, int data);
  public BNode getLeftSubTree(BNode node);
  public BNode getRightSubTree(BNode node);

  public void makeLeftSubTree(BNode parent, BNode child);
  public void makeRightSubTree(BNode parent, BNode child);
}
