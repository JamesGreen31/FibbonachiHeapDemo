/*  A Simple demonstration of a Fibonnachi Heap.
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
 This class defines the Member interface which represents a node in the Fibonnachi Heap.
 It provides methods to retrieve the next and previous member, as well as determine if
 the member is a root or a tail node.
 It also provides a method to retrieve the length of the member's subtree, and get the
 contents of the subtree.

 * <p>Implementations of this interface should provide the following functionality:</p>
 * <ul>
 *   <li>{@link #getNext()} ()} - Return the Member that is next in the list</li>
 *   <li>{@link #getPrev()} - Remove the Member previous in the list</li>
 *   <li>{@link #isRoot()} - Determine if the Member is root</li>
 *   <li>{@link #isTail()} - Determine if the Member is tail</li>
 *   <li>{@link #len()} - Return the length of the list</li>
 *   <li>{@link #getMemberContents()} - Return the Contents of the Member</li>
 * </ul>

 @param <T> The type of data stored in the member
 @author James Green
 @version 1.0
 @see <a href="https://github.com/JamesGreen31/FibbonachiHeapDemo">https://github.com/JamesGreen31/FibbonachiHeapDemo</a>
 */
public interface Member<T> {
    /**
     * Returns the next member in the linked list.
     *
     * @return The next member in the linked list.
     */
    Member<T> getNext();

    /**
     * Returns the previous member in the linked list.
     *
     * @return The previous member in the linked list.
     */
    Member<T> getPrev();

    /**
     * Returns true if the member is a root node.
     *
     * @return True if the member is a root node, false otherwise.
     */
    boolean isRoot();

    /**
     * Returns true if the member is a tail node.
     *
     * @return True if the member is a tail node, false otherwise.
     */
    boolean isTail();

    /**
     * Returns the length of the member's subtree.
     *
     * @return The length of the member's subtree.
     */
    int len();

    /**
     * Returns the contents of the member's subtree.
     *
     * @return The contents of the member's subtree.
     */
    SubTree<T> getMemberContents();

}
