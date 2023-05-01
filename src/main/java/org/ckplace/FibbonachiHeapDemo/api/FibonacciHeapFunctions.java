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
 * This interface defines the basic operations that can be performed on a Fibonacci Heap.
 *
 * <p>A Fibonacci Heap is a heap data structure that supports insert, delete, and find-minimum operations
 * in amortized constant time, and supports decrease-key and delete operations in amortized logarithmic time.
 * The structure is named after the Fibonacci sequence because the number of children of each node can
 * be any integer in the range [0, infinity], and the potential number of trees in the heap can grow like
 * the Fibonacci sequence.</p>
 *
 * <p>Implementations of this interface should provide the following functionality:</p>
 * <ul>
 *   <li>{@link #extractMin()} - Remove and return the smallest element in the heap.</li>
 *   <li>{@link #addToQue(int)} - Add a new element to the heap with the given value.</li>
 *   <li>{@link #decreaseKey(SubTree)} - Decrease the key of the given element in the heap.</li>
 *   <li>{@link #removeKey(SubTree)} - Remove the given element from the heap.</li>
 * </ul>
 *
 * @param <T> the type of element stored in the heap
 */

public interface FibonacciHeapFunctions<T> {
    /**
     * Extracts and returns the minimum element from the heap.
     *
     * @return The minimum element in the heap.
     */
    int extractMin();

    /**
     * Adds a new element to the heap.
     *
     * @param val The value to add to the heap.
     */
    void addToQue(int val);

    /**
     * Decreases the key of a node in the heap.
     *
     * @param t The node whose key should be decreased.
     */
    void decreaseKey(SubTree<T> t);

    /**
     * Removes a node from the heap.
     *
     * @param t The node to remove.
     */
    void removeKey(SubTree<T> t);
}
