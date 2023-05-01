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
package org.ckplace.FibbonachiHeapDemo;

import org.ckplace.FibbonachiHeapDemo.api.LinkedContents;
import org.ckplace.FibbonachiHeapDemo.api.Member;

public class MasterArray implements LinkedContents<Integer> {

    /**
     * Returns the element at the specified index in this collection.
     *
     * @param index the index of the element to return
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public Member<Integer> get(int index) {
        return null;
    }

    /**
     * Removes the element at the specified index in this collection.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     *
     * @param index the index of the element to remove
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public void remove(int index) {

    }

    /**
     * Inserts the specified element at the specified position in this collection.
     * Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
     *
     * @param index the index at which to insert the element
     * @param m     the element to insert
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    @Override
    public void insert(int index, Member<Integer> m) {

    }

    /**
     * Appends the specified element to the end of this collection.
     *
     * @param m the element to append
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    @Override
    public void append(Member<Integer> m) {

    }
}
