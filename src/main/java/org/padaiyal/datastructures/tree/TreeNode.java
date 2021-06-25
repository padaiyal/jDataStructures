package org.padaiyal.datastructures.tree;

import java.util.List;

/**
 * Tree node object.
 *
 * @param <T> TreeNode data type.
 */
public class TreeNode<T> {

  /**
   * Tree node data.
   */
  public T data;

  /**
   * Tree node parent.
   */
  public TreeNode<T> parent;

  /**
   * Tree node children.
   */
  public List<TreeNode<T>> children;

  /**
   * Constructor for the tree node object.
   *
   * @param data    The data of the current node.
   * @param parent   The parent of the current node.
   * @param children The children of the current node.
   */
  public TreeNode(T data, TreeNode<T> parent, List<TreeNode<T>> children) {
    this.data = data;
    this.parent = parent;
    this.children = children;
  }
}
