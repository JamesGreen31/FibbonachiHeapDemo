# Structure
This document is to depict the structure of the project's classes.

## API

### LinkedContents
LinkedContents is a double linked list comprised of `Member` classes. This allows the LinkedList to behave like a standard 
implementation.

### Member
Each `Member` holds the contents passed in. For this project, these contents are `SubTree` classes. 

### SubTree
Each `SubTree` is a node of a binary tree. Since the nodes of a larger tree are all connected, we only need the root of 
a `SubTree` to traverse to any point in the tree. 

### FibonacciHeapFunctions
This interface helps define the functions we need in order to make the Fibonacci Heap happen.

## Concrete classes
For this project, I have created the `FibonacciHeap` class that implements the interfaces properly and achieves a basic
Fibonacci heap demonstration. For this demonstration, the heap is storing integers, but the interfaces allow for broader 
objects.

Copyright (C) 2023 James Green