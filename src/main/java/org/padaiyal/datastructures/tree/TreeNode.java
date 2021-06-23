package org.padaiyal.datastructures.tree;

import java.util.List;

public class TreeNode<T> {
    public T value;
    public TreeNode<T> parent;
    public List<TreeNode<T>> children;

    public TreeNode(T value, TreeNode<T> parent, List<TreeNode<T>> children) {
        this.value = value;
        this.parent = parent;
        this.children = children;
    }

}
