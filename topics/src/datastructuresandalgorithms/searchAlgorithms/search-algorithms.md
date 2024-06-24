## Linear Search:
- Description: Linear search is the simplest searching algorithm that searches for an element in a list in sequential order.
### Algorithm:
1. Start from the first element of the list.
2. Compare the target element with each element of the list sequentially.
3. If the target element is found, return its index. If not, return -1.

## Binary Search:
- Description: Binary search is a more efficient searching algorithm that works on sorted arrays. It repeatedly divides the search interval in half.
- Algorithm:
1. Compare the target element with the middle element of the array.
2. If the target element matches the middle element, return the index.
3. If the target element is greater than the middle element, continue searching in the right half of the array.
4. If the target element is smaller than the middle element, continue searching in the left half of the array.
5. Repeat steps 1-4 until the element is found or the search interval is empty.

## Depth-First Search (DFS):
- Description: DFS is an algorithm used for traversing or searching tree or graph data structures. It starts at the root node and explores as far as possible along each branch before backtracking.
Algorithm:
1. Start from the initial node.
2. Explore as far as possible along each branch before backtracking.
3. Mark each node that is visited to avoid revisiting it.

## Breadth-First Search (BFS):
- Description: BFS is an algorithm used for traversing or searching tree or graph data structures. It explores all the neighbor nodes at the present depth prior to moving on to the nodes at the next depth level.
Algorithm:
1. Start from the initial node.
2. Explore all neighbor nodes at the present depth level before moving on to the nodes at the next depth level.
3. Mark each node that is visited to avoid revisiting it.

## A Search*:
- Description: A* search is a best-first search algorithm that finds a path with the lowest cost from a given initial node to a goal node.
Algorithm:
1. Initialize an empty priority queue.
2. Enqueue the initial node with a priority equal to its heuristic value.
3. Dequeue the node with the lowest priority.
4. If the dequeued node is the goal node, return the path.
5. Otherwise, enqueue all neighboring nodes with a priority equal to the sum of their heuristic value and the cost to reach them from the current node.
6. Repeat steps 3-5 until the goal node is found or the priority queue is empty.