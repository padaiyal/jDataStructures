package org.padaiyal.datastructures.tree;

import java.util.ArrayList;

/**
 * Super class for Tree data structures.
 *
 * @param <T> The data type of the tree.
 */
public class Tree<T> {

  /**
   * The root node of the tree.
   */
  public TreeNode<T> root;

  /**
   * Initializes the root node.
   *
   * @param rootValue The value of the root node.
   */
  public Tree(T rootValue) {
    this.root = new TreeNode<>(rootValue, null, new ArrayList<>());
  }
}
