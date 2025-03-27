package com.hemmouda.java_util.structs;

import java.util.LinkedList;
import java.util.List;

/**
 * A simple node structure to
 * construct a tree with.
 * Fields are publicly accessible.
 */
public class Node <T> {

    /**
     * The parent of this node
     */
    public Node <T> parent;
    /**
     * The value itself of this node
     */
    public T value;
    /**
     * Children of this node
     */
    public List<Node <T>> children;

    public Node (Node<T> parent, T value, List<Node <T>> children) {
        this.parent = parent;
        this.value = value;
        this.children = children;
    }

    public Node (Node<T> parent, T value) {
        this(parent, value, new LinkedList<>());
    }

    public Node () {
        this(null, null);
    }
}
