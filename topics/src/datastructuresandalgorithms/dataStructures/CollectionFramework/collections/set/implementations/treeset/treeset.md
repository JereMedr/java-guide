# TreeSet
`Treeset` is a collection that does not allow duplicate elements and maintains its elements in a sorted order, either according to their natural order or a comparator provided at the time of construction. It is ideal for storing elements that need to be kept in a specific order and allows for efficient navigation.

## How to Instantiate It
To instantiate a TreeSet, you can simply use its constructor. Here are some examples:
```
// Basic Instantiation:
TreeSet<Integer> treeSet = new TreeSet<>();

//Instantiation with a Collection:
List<Integer> list = Arrays.asList(1, 3, 2, 5, 4);
TreeSet<Integer> treeSetFromList = new TreeSet<>(list);

// Instantiation with a Comparator:
TreeSet<String> treeSetWithComparator = new TreeSet<>(Comparator.reverseOrder());
```

## How It Works
`TreeSet` uses a red-black tree to store its elements, ensuring that basic operations (insertion, deletion, and search) are performed in logarithmic time. As an implementation of *NavigableSet, TreeSet* offers additional methods to navigate and obtain subsets of elements efficiently.

# Methods 
```
// Add elements :
treeSet.add(1);
treeSet.add(2);
treeSet.add(3);

// Remove elements :
treeSet.remove(2);

//Check for the Existence of an Element :
boolean exists = treeSet.contains(1);

//Iterate Over the Set:
for (Integer number : treeSet) {
    System.out.println(number);
}

// Navigation Methods : 
Integer first = treeSet.first(); // Gets the first (lowest) element
Integer last = treeSet.last(); // Gets the last (highest) element
Integer lower = treeSet.lower(3); // Gets the greatest element less than 3
Integer higher = treeSet.higher(3); // Gets the least element greater than 3

// Subsets:
SortedSet<Integer> headSet = treeSet.headSet(3); // Elements less than 3
SortedSet<Integer> tailSet = treeSet.tailSet(3); // Elements greater than or equal to 3
SortedSet<Integer> subSet = treeSet.subSet(2, 4); // Elements between 2 (inclusive) and 4 (exclusive)
```

# When to Use It
- When you need to maintain elements in a sorted order: If you need elements to be kept in their natural order or an order defined by a comparator.
- For efficient range operations: If you need to obtain subsets or navigate through elements efficiently.

# When Not to Use It
- For fast lookups of specific elements: If fast lookup is more important than maintaining order, a HashSet is better.
- When you need to allow duplicate elements: If you need a collection that allows duplicates, TreeSet is not suitable.
- For small collections: The overhead of the red-black tree might not be justified for very small collections, where a simple sorted list might be more efficient.