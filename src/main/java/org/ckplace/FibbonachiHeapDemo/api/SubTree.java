/*
        *  A Simple demonstration of a Fibonnachi Heap.
        *  All sources are available at the link below.
        *  <https://github.com/JamesGreen31/FibbonachiHeapDemo></https://github.com/JamesGreen31/FibbonachiHeapDemo>
        *     Copyright (C) 2023 James Green
        *
        *     This program is free software: you can redistribute it and/or modify
        *     it under the terms of the GNU General Public License as published by
        *     the Free Software Foundation, either version 3 of the License, or
        *     (at your option) any later version.
        *
        *     This program is distributed in the hope that it will be useful,
        *     but WITHOUT ANY WARRANTY; without even the implied warranty of
        *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        *     GNU General Public License for more details.
        *
        *     You should have received a copy of the GNU General Public License
        *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
        */
package org.ckplace.FibbonachiHeapDemo.api;
/**

 A simple demonstration of a Fibonnachi Heap.
 This class defines the SubTree interface which represents a subtree in the Fibonnachi Heap.
 It provides methods to determine if the subtree is a root or a tail node, as well as
 whether it is marked.
 It also provides methods to retrieve the left and right subtrees, as well as the content
 of the subtree. Additionally, it provides methods to remove a subtree and mark the subtree.
 @param <T> The type of data stored in the subtree
 @author James Green
 @version 1.0
 @see <a href="https://github.com/JamesGreen31/FibbonachiHeapDemo">https://github.com/JamesGreen31/FibbonachiHeapDemo</a>
 */
public interface SubTree<T> {
    /**
     * Returns true if the subtree is a root node.
     *
     * @return True if the subtree is a root node, false otherwise.
     */
    boolean isRootTree();

    /**
     * Returns true if the subtree is a tail node.
     *
     * @return True if the subtree is a tail node, false otherwise.
     */
    boolean isTailTree();

    /**
     * Returns true if the subtree is marked.
     *
     * @return True if the subtree is marked, false otherwise.
     */
    boolean isMarked();

    /**
     * Returns the right subtree.
     *
     * @return The right subtree.
     */
    SubTree<T> getRight();

    /**
     * Returns the left subtree.
     *
     * @return The left subtree.
     */
    SubTree<T> getLeft();

    /**
     * Removes the specified subtree from the current subtree.
     *
     * @param t The subtree to remove.
     */
    void remove(SubTree<T> t);

    /**
     * Marks the subtree.
     */
    void mark();

    /**
     * Returns the content of the subtree.
     *
     * @return The content of the subtree.
     */
    T getContent();

}
