# Notes

## Big-O notation

We need to learn how to compare the performance different algorithms and choose the best one to solve a particular problem.

- _Time Complexity_ of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input. It tells us how well an algorithm will _scale_.
- The _Big O_ notation is a way of expressing the complexity related to the number of items that an algorithm has to deal with
- _Space Complexity_ of an algorithm quantifies the amount of space or memory taken by an algorithm to run as a function of the length of the input

| Time Complexity  | Name |
| ------------- | ------------- |
| _O(1)_ | Constant  |
| _O(logn)_ | logatirhmic  |
| _O(n)_ | linear |
| _O(n logn)_ | n log-star n |
| _O(n^2)_ | quadratic |
| _O(2^n)_ | exponential |
| _O(n!)_ | factorial |

## Arrays

- contiguous block in memory
- every element occupies the same amount of space in memory
- if we know the index of an element, the time to retrive the element will be the same
- retriving an element from an array is made in constant time _O(1)_ if we know the index! If we don't know the index the time complexity to retrive an element is linear: _O(n)_

| Operation  | Time complexity |
| ------------- | ------------- |
| Retrive with index  | _O(1)_  |
| Retrive without index  | _O(n)_  |
| Add an element to a full array | _O(n)_|
| Add an element to the end of an array (has space) | _O(1_) |
| Insert/Update an element at a specific index | _O(1)_ |
| Delete an element by setting it to _null_ | _O(1)_ |
| Delete an element by shifting an element | _O(n)_ |

## Merge Sort

- See [geek-ref](https://www.geeksforgeeks.org/merge-sort/)
- Divide and Conquere algorithm, _splitting phase_ and _merging phase_
- splitting phase in in place, merging phase use a temp array
- has a time complexit of _O(n logn)_: we are repeatedly dividing the array in half during the splitting phase
- there is a lot temp array created... be carefull if the memomory is an issue

## Quick Sort

- See [geek-ref](https://www.geeksforgeeks.org/quick-sort/)
- Divide and Conquere algo
- It picks an element as pivot and partitions the given array around the picked pivot.
- Target of partitions is, given an array and an element x of array as _pivot_, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x.