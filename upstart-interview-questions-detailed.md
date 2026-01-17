# Upstart Online Assessment & Interview Questions - Detailed Guide

## Overview

Upstart typically conducts coding interviews via **CoderPad or Zoom** with real-time problem solving. The focus is on **medium-level LeetCode-style problems** covering data structures and algorithms, particularly **Arrays and Hash Tables**.

## Interview Structure

- 1-2 technical phone screens via CoderPad/Zoom
- Typically 1 medium + 1 hard problem in a 1-hour session
- Full loop includes: coding rounds, system design, project round, hiring manager, and values round

---

# Detailed Problem Descriptions

## Easy Problems (7 total)

### 1. Majority Element (LeetCode #169) - 100% Frequency

**Problem Statement:**
Given an array `nums` of size `n`, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

**Key Points:**
- Find an element that appears more than half the time in the array
- It's guaranteed that such a majority element always exists
- Common approaches include using a hash map, sorting, or the Boyer-Moore Voting Algorithm

**LeetCode Link:** https://leetcode.com/problems/majority-element/

---

### 2. Can Place Flowers (LeetCode #605) - 71% Frequency

**Problem Statement:**
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array `flowerbed` containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer `n`, return `true` if `n` new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and `false` otherwise.

**Examples:**
- Example 1: Input: `flowerbed = [1,0,0,0,1]`, `n = 1` → Output: `true`
- Example 2: Input: `flowerbed = [1,0,0,0,1]`, `n = 2` → Output: `false`

**Constraints:**
- 1 <= flowerbed.length <= 2 * 10^4
- flowerbed[i] is 0 or 1
- There are no two adjacent flowers in flowerbed
- 0 <= n <= flowerbed.length

**LeetCode Link:** https://leetcode.com/problems/can-place-flowers/

---

### 3. Design an Ordered Stream (LeetCode #1656) - 60% Frequency

**Problem Statement:**
There is a stream of `n` (id, value) pairs arriving in an arbitrary order, where id is an integer between 1 and n and value is a string. No two pairs have the same id.

Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion. The concatenation of all the chunks should result in a list of the sorted values.

**Class to Implement:**

1. **Constructor:** `OrderedStream(int n)` - Constructs the stream to take n values
2. **Insert Method:** `String[] insert(int id, String value)` - Inserts the pair (id, value) into the stream, then returns the largest possible chunk of currently inserted values that appear next in the order

**Example:**
```
Input: ["OrderedStream", "insert", "insert", "insert", "insert", "insert"]
       [[5], [3, "ccccc"], [1, "aaaaa"], [2, "bbbbb"], [5, "eeeee"], [4, "ddddd"]]
Output: [null, [], ["aaaaa"], ["bbbbb", "ccccc"], [], ["ddddd", "eeeee"]]
```

**Key Insight:** The stream maintains a pointer and returns contiguous sequences of values starting from the current pointer position when they become available.

**LeetCode Link:** https://leetcode.com/problems/design-an-ordered-stream/

---

### 4. Design HashMap (LeetCode #706) - 49% Frequency

**Problem Statement:**
Design a HashMap without using any built-in hash table libraries.

**Implementation Requirements:**

Implement the `MyHashMap` class with the following methods:
- `MyHashMap()` - Initializes the object with an empty map
- `void put(int key, int value)` - Inserts a (key, value) pair into the HashMap. If the key already exists, update the corresponding value
- `int get(int key)` - Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
- `void remove(key)` - Removes the key and its corresponding value if the map contains the mapping for the key

**Constraints:**
- All keys and values will be in the range of [0, 1000000]
- At most 10^4 calls will be made to put, get, and remove

**LeetCode Link:** https://leetcode.com/problems/design-hashmap/

---

### 5. Reverse Linked List (LeetCode #206) - 41% Frequency

**Problem Statement:**
Given the head of a singly linked list, reverse the list, and return the reversed list.

**Additional Details:**
- The number of nodes in the list is in the range [0, 5000]

**Follow-up:**
A linked list can be reversed either iteratively or recursively. Could you implement both?

**LeetCode Link:** https://leetcode.com/problems/reverse-linked-list/

---

### 6. Merge Sorted Array (LeetCode #88) - 36% Frequency

**Problem Statement:**
You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order. The final sorted array should not be returned by the function, but instead be stored inside the array nums1.

To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

**Examples:**
- Example 1: Input: `nums1 = [1,2,3,0,0,0]`, `m = 3`, `nums2 = [2,5,6]`, `n = 3` → Output: `[1,2,2,3,5,6]`
- Example 2: Input: `nums1 = [1]`, `m = 1`, `nums2 = []`, `n = 0` → Output: `[1]`
- Example 3: Input: `nums1 = [0]`, `m = 0`, `nums2 = [1]`, `n = 1` → Output: `[1]`

**LeetCode Link:** https://leetcode.com/problems/merge-sorted-array/

---

### 7. Pascal's Triangle (LeetCode #118) - 27% Frequency

**Problem Statement:**
Given an integer `numRows`, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

**Examples:**
- Example 1: Input: `numRows = 5` → Output: `[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]`
- Example 2: Input: `numRows = 1` → Output: `[[1]]`

**Constraints:**
- 1 <= numRows <= 30

**LeetCode Link:** https://leetcode.com/problems/pascals-triangle/

---

### 8
Problem Statement: Given an integer array arr, count how many elements x exist such that x + 1 is also in the array.
Duplicate Rule: If there are duplicates of x in the array, each occurrence should be counted separately.
Examples:
arr = [1, 2, 3] → Output: 2 (1 and 2 are counted because 2 and 3 exist).
arr = [1, 1, 2] → Output: 2 (Each 1 is counted because 2 exists).
arr = [1, 1, 3, 3, 5, 5, 7, 7] → Output: 0.
---

### 9
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example 1
Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The contiguous subarray [4, -1, 2, 1] has the largest sum of 6.
---

## Medium Problems (9 total)

### 1. Search Suggestions System (LeetCode #1268) - 82% Frequency

**Problem Statement:**
You are given an array of strings `products` and a string `searchWord`. Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix, return the three lexicographically minimum products.

Return a list of lists of the suggested products after each character of searchWord is typed.

**Example:**
```
Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [
  ["mobile","moneypot","monitor"],
  ["mobile","moneypot","monitor"],
  ["mouse","mousepad"],
  ["mouse","mousepad"],
  ["mouse","mousepad"]
]
Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
After typing m and mo all products match and we show user ["mobile","moneypot","monitor"].
```

**LeetCode Link:** https://leetcode.com/problems/search-suggestions-system/

---

### 2. Zero Array Transformation III (LeetCode #3362) - 79% Frequency

**Problem Statement:**
You are given an integer array `nums` of length n and a 2D array `queries` where `queries[i] = [li, ri]`.

Each `queries[i]` represents the following action on nums: Decrement the value at each index in the range [li, ri] in nums by at most 1. The amount by which the value is decremented can be chosen independently for each index.

A Zero Array is an array with all its elements equal to 0.

Return the maximum number of elements that can be removed from queries, such that nums can still be converted to a zero array using the remaining queries. If it is not possible to convert nums to a zero array, return -1.

**Example:**
```
Input: nums = [2,0,2], queries = [[0,2],[0,2],[1,1]]
Output: 1
Explanation: After removing queries[2], nums can still be converted to a zero array.
- Using queries[0], decrement nums[0] and nums[2] by 1 and nums[1] by 0.
- Using queries[1], decrement nums[0] and nums[2] by 1 and nums[1] by 0.
```

**Topics:** Arrays, Greedy, Sorting, Heap (Priority Queue), Prefix Sum

**LeetCode Link:** https://leetcode.com/problems/zero-array-transformation-iii/

---

### 3. Dot Product of Two Sparse Vectors (LeetCode #1570) - 71% Frequency

**Problem Statement:**
Given two sparse vectors, compute their dot product.

Implement class `SparseVector`:
- `SparseVector(nums)` - Initializes the object with the vector nums
- `dotProduct(vec)` - Compute the dot product between the instance of SparseVector and vec

A sparse vector is a vector that has mostly zero values. You should store the sparse vector efficiently and compute the dot product between two SparseVector.

**Examples:**

- Example 1: `nums1 = [1,0,0,2,3]`, `nums2 = [0,3,0,4,0]` → Output: `8` (1×0 + 0×3 + 0×0 + 2×4 + 3×0 = 8)
- Example 2: `nums1 = [0,1,0,0,0]`, `nums2 = [0,0,0,0,2]` → Output: `0`
- Example 3: `nums1 = [0,1,0,0,2,0,0]`, `nums2 = [1,0,0,0,3,0,4]` → Output: `6`

**Follow-up:** What if only one of the vectors is sparse?

**Key Challenge:** Efficiently handle sparse vectors by only storing and processing non-zero elements.

**LeetCode Link:** https://leetcode.com/problems/dot-product-of-two-sparse-vectors/

---

### 4. Design Snake Game (LeetCode #353) - 57% Frequency

**Problem Statement:**
Design a Snake game that is played on a device with screen size height x width. Play the game online if you are not familiar with the game.

**Initial Setup:**
- The snake is initially positioned at the top left corner (0, 0) with a length of 1 unit
- You are given an array `food` where `food[i] = (ri, ci)` is the row and column position of a piece of food that the snake can eat

**Game Mechanics:**
- When a snake eats a piece of food, its length and the game's score both increase by 1
- Each piece of food appears one by one on the screen (the second piece won't appear until the snake eats the first)
- When food appears, it's guaranteed not to appear on a block occupied by the snake

**Game Over Conditions:**
- The snake goes out of bounds (hits a wall)
- Its head occupies a space that its body occupies after moving (snake runs into itself)

**Methods to Implement:**
- `SnakeGame(int width, int height, int[][] food)` - Initializes the game
- `int move(String direction)` - Returns the score after applying one direction move ('U', 'L', 'R', 'D'). Returns -1 if game over.

**LeetCode Link:** https://leetcode.com/problems/design-snake-game/

---

### 5. House Robber II (LeetCode #213) - 51% Frequency

**Problem Statement:**
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.

All houses at this place are **arranged in a circle**. That means the first house is the neighbor of the last one.

Adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

**Examples:**
- Example 1: `nums = [2,3,2]` → Output: `3` (You cannot rob house 1 and house 3 because they are adjacent)
- Example 2: `nums = [1,2,3,1]` → Output: `4` (Rob house 1 (money = 1) and house 3 (money = 3). Total = 1 + 3 = 4)

**Key Difference:** Unlike the original House Robber problem, houses are now in a circle, meaning you can only rob the first OR the last house, never both.

**LeetCode Link:** https://leetcode.com/problems/house-robber-ii/

---

### 6. Koko Eating Bananas (LeetCode #875) - 48% Frequency

**Problem Statement:**
Koko loves to eat bananas. There are `n` piles of bananas, the ith pile has `piles[i]` bananas.

The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she finishes eating the pile but cannot eat from another pile in the same hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return. Return the minimum integer `k` such that she can eat all the bananas within `h` hours.

**Examples:**
- Example 1: `piles = [1,4,3,2]`, `h = 9` → Output: `2`
- Example 2: `piles = [25,10,23,4]`, `h = 4` → Output: `25`

**Approach:** This is a binary search problem where you need to find the minimum eating speed that allows Koko to finish all banana piles within the given time.

**LeetCode Link:** https://leetcode.com/problems/koko-eating-bananas/

---

### 7. Move Pieces to Obtain a String (LeetCode #2337) - 45% Frequency

**Problem Statement:**
You are given two strings `start` and `target`, both of length n. Each string consists only of the characters 'L', 'R', and '_' where:
- The characters 'L' and 'R' represent pieces
- 'L' can move to the left only if there is a blank space directly to its left
- 'R' can move to the right only if there is a blank space directly to its right
- The character '_' represents a blank space that can be occupied by any piece

Return `true` if it is possible to obtain the string target by moving the pieces of the string start any number of times. Otherwise, return `false`.

**Examples:**

Example 1:
```
Input: start = "_L__R__R_", target = "L______RR"
Output: true
```

Example 2:
```
Input: start = "R_L_", target = "__LR"
Output: false
Explanation: The 'R' piece can move one step right to obtain "_RL_", but cannot obtain target.
```

Example 3:
```
Input: start = "_R", target = "R_"
Output: false
Explanation: The piece can only move right, so it's impossible to obtain target.
```

**Key Insight:** 'L' pieces can only move left and 'R' pieces can only move right, and they cannot cross over each other.

**LeetCode Link:** https://leetcode.com/problems/move-pieces-to-obtain-a-string/

---

### 8. Max Consecutive Ones III (LeetCode #1004) - 44% Frequency

**Problem Statement:**
Given a binary array `nums` and an integer `k`, return the maximum number of consecutive 1's in the array if you can flip at most `k` 0's.

**Examples:**

Example 1:
```
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

Example 2:
```
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

**Approach:** Typically solved using a sliding window technique to efficiently find the longest contiguous subarray containing at most k zeros.

**LeetCode Link:** https://leetcode.com/problems/max-consecutive-ones-iii/

---

### 9. Zero Array Transformation II (LeetCode #3356) - 33% Frequency

**Problem Statement:**
You are given an integer array `nums` of length n and a 2D array `queries` where `queries[i] = [li, ri, vali]`.

Each `queries[i]` represents the following action on nums: Decrement the value at each index in the range [li, ri] in nums by at most vali. The amount by which each value is decremented can be chosen independently for each index.

A Zero Array is an array with all its elements equal to 0.

Return the minimum possible non-negative value of `k`, such that after processing the first k queries in sequence, nums becomes a Zero Array. If no such k exists, return -1.

**Example:**
```
Input: nums = [2,0,2], queries = [[0,2,1],[0,2,1],[1,1,3]]
Output: 2
Explanation: After processing the first 2 queries optimally, the array becomes [0, 0, 0]
```

**Approach:** Uses techniques like difference arrays and binary search to efficiently determine the minimum number of queries needed.

**LeetCode Link:** https://leetcode.com/problems/zero-array-transformation-ii/

---

## Hard Problems (4 total)

### 1. Bus Routes (LeetCode #815) - 84% Frequency

**Problem Statement:**
You are given an array `routes` representing bus routes where `routes[i]` is a bus route that the ith bus repeats forever. For example, if `routes[0] = [1, 5, 7]`, this means that the 0th bus travels in the sequence 1 → 5 → 7 → 1 → 5 → 7 → 1 → ... forever.

You will start at the bus stop `source` (you are not on any bus initially), and you want to go to the bus stop `target`. You can travel between bus stops by buses only.

Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.

**Example:**
```
Input: routes = [[1,2,7],[3,6,7]], source = 1, target = 6
Output: 2
Explanation: The best strategy is take the first bus to bus stop 7, then take the second bus to bus stop 6.
```

**Approach:** This is a classic Breadth-First Search (BFS) problem, where each level of BFS represents taking another bus.

**LeetCode Link:** https://leetcode.com/problems/bus-routes/

---

### 2. Binary Tree Maximum Path Sum (LeetCode #124) - 58% Frequency

**Problem Statement:**
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.

**Examples:**

Example 1:
```
Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
```

Example 2:
```
Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
```

**Constraints:**
- The number of nodes in the tree is in the range [1, 3 * 10^4]
- -1000 <= Node.val <= 1000 (node values can be negative)

**LeetCode Link:** https://leetcode.com/problems/binary-tree-maximum-path-sum/

---

### 3. Word Ladder (LeetCode #127) - 48% Frequency

**Problem Statement:**
You need to convert a beginning word to an ending word by a sequence of transformations. You can transform a word x to a word y if y is in the wordList, and x and y differ by exactly one character. Your goal is to convert the beginning word to the ending word with a minimum number of transformations, and return that number plus one if it's possible. If it's impossible, return 0.

**Key Constraints:**
- All strings are the same size, between 1 and 10 characters
- It's ok for the beginning word not to be in wordList
- The ending word must be in wordList, or you'll return 0
- All words in wordList are unique

**Problem Approach:**
Each word is treated as a node in a graph. There's an edge between two words if they differ by exactly one letter. BFS from the beginning word will find the shortest path to the ending word.

**LeetCode Link:** https://leetcode.com/problems/word-ladder/

---

### 4. Shortest Palindrome (LeetCode #214) - 32% Frequency

**Problem Statement:**
You are given a string `s`. You can convert `s` to a palindrome by adding characters in front of it. Return the shortest palindrome you can find by performing this transformation.

**Examples:**
- Example 1: `s = "aacecaaa"` → Output: `"aaacecaaa"`
- Example 2: `s = "abcd"` → Output: `"dcbabcd"`

**Constraints:**
- 0 <= s.length <= 5 * 10^4
- s consists of lowercase English letters only

**LeetCode Link:** https://leetcode.com/problems/shortest-palindrome/

---

## Additional Reported Questions

### Simplify Path (LeetCode #71) - Medium

**Problem Statement:**
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

**Unix-Style File System Rules:**
- A single period '.' represents the current directory
- A double period '..' represents the previous/parent directory
- Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'
- Any sequence of periods that doesn't match the rules above should be treated as a valid directory or file name (e.g., '...' and '....' are valid)

**Simplified Canonical Path Rules:**
- The path must start with a single slash '/'
- Directories within the path must be separated by exactly one slash '/'
- The path must not end with a slash '/', unless it is the root directory
- The path must not have any single or double periods ('.' and '..') used to denote current or parent directories

**LeetCode Link:** https://leetcode.com/problems/simplify-path/

**Note:** Reported in phone screen for Full Stack Developer role

---

### Find the First Non-Repeating Character in a String - Easy

**Problem Statement:**
Identify the initial character lacking repetition in a string, returning its index or -1 if none exists.

---

## System Design Questions

### 1. Real-Time Transaction Streaming (Hard)
**Focus:** Redesigning batch credit card processing to enable real-time streaming for fraud detection

### 2. Real-Time Hashtag Partitioning (Hard)
**Challenge:** Architecting a data pipeline to efficiently partition incoming tweets by hashtag in real time

### 3. Create a Recommendation Engine
**Task:** Design a recommendation engine that processes data in real-time

---

## Technical Assessment Focus Areas

- **Data Structures & Algorithms**
- **System Design** scenarios
- **API Design and Versioning**
- **REST vs. gRPC**
- **Distributed System Debugging**
- **Scalability Concepts**

---

## Preparation Tips

1. Focus on **Arrays and Hash Tables** - most commonly tested
2. Practice **medium-level LeetCode problems**
3. Prioritize problems with **high frequency scores** (above 50%)
4. Be prepared for **1 medium + 1 hard** in a single session
5. Practice on **CoderPad** to familiarize yourself with the interface
6. Review the Boyer-Moore Voting Algorithm for Majority Element
7. Practice sliding window technique for problems like Max Consecutive Ones III
8. Review binary search applications (Koko Eating Bananas)
9. Practice BFS/DFS for graph problems (Bus Routes, Word Ladder)

---

## Difficulty Breakdown

- **Easy**: 7 problems (35%)
- **Medium**: 9 problems (45%)
- **Hard**: 4 problems (20%)

---

## Sources

### Problem Descriptions
- [Majority Element - Algo.Monster](https://algo.monster/liteproblems/169)
- [Bus Routes - Algo.Monster](https://algo.monster/liteproblems/815)
- [Search Suggestions System - Algo.Monster](https://algo.monster/liteproblems/1268)
- [Can Place Flowers - Algo.Monster](https://algo.monster/liteproblems/605)
- [Dot Product of Two Sparse Vectors - Algo.Monster](https://algo.monster/liteproblems/1570)
- [Design an Ordered Stream - Algo.Monster](https://algo.monster/liteproblems/1656)
- [Binary Tree Maximum Path Sum - Algo.Monster](https://algo.monster/liteproblems/124)
- [Design Snake Game - Algo.Monster](https://algo.monster/liteproblems/353)
- [House Robber II - Algo.Monster](https://algo.monster/liteproblems/213)
- [Design HashMap - Algo.Monster](https://algo.monster/liteproblems/706)
- [Word Ladder - Algo.Monster](https://algo.monster/liteproblems/127)
- [Koko Eating Bananas - Algo.Monster](https://algo.monster/liteproblems/875)
- [Move Pieces to Obtain a String - Algo.Monster](https://algo.monster/liteproblems/2337)
- [Max Consecutive Ones III - Algo.Monster](https://algo.monster/liteproblems/1004)
- [Reverse Linked List - Algo.Monster](https://algo.monster/liteproblems/206)
- [Merge Sorted Array - Algo.Monster](https://algo.monster/liteproblems/88)
- [Pascal's Triangle - Algo.Monster](https://algo.monster/liteproblems/118)
- [Zero Array Transformation II - Algo.Monster](https://algo.monster/liteproblems/3356)
- [Zero Array Transformation III - LeetCode](https://leetcode.com/problems/zero-array-transformation-iii/)
- [Shortest Palindrome - Algo.Monster](https://algo.monster/liteproblems/214)
- [Simplify Path - Algo.Monster](https://algo.monster/liteproblems/71)

### Interview Information
- [Upstart LeetCode Interview Questions](https://interviewsolver.com/interview-questions/upstart)
- [Upstart Software Engineer Interview Guide](https://www.interviewquery.com/interview-guides/upstart-software-engineer)
- [Upstart Interview Questions on Prepfully](https://prepfully.com/interview-questions/upstart/software-engineer)
- [Upstart Interview Experience on Glassdoor](https://www.glassdoor.com/Interview/Upstart-Interview-Questions-E962297.htm)
- [Upstart on LeetCode](https://leetcode.com/company/upstart/)
- [1Point3Acres Upstart Questions](https://www.1point3acres.com/interview/company/upstart)
