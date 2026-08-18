# 📝 Day 2 Revision Test — Syntax + Pattern Recognition
### Cover: Arrays, Strings, Two Pointers, Sorting, Prefix Sum
### Problems Covered: Anagram, Contains Duplicate, Concatenation, Running Sum, Move Zeroes, Remove Duplicates

> ⚠️ Rules: No peeking at code! Write answers in your head or on paper first.
> After all 50, check answers at the bottom.

---

## 🔤 SECTION 1 — Fill in the Blank (Syntax) [20 Questions]

**Q1.** Convert String `s` to a char array:
```java
char[] arr = s.();
```

**Q2.** Sort a char array `arr`:
```java
Arrays.________(arr);
```

**Q3.** Check if two char arrays `a` and `b` have the same content:
```java
Arrays.________(a, b);
```

**Q4.** Get the length of a String `s`:
```java
int len = s.________();
```

**Q5.** Get the length of an array `arr`:
```java
int len = arr.________;
```

**Q6.** Get the character at index 2 of String `s`:
```java
char c = s.________(2);
```

**Q7.** Compare content of two Strings `a` and `b`:
```java
a.________(b);
```

**Q8.** What is wrong here?
```java
if (s1 == s2) { ... }  // comparing two Strings
```
Answer: _______________

**Q9.** What is wrong here?
```java
int len = arr.length();  // arr is an int[]
```
Answer: _______________

**Q10.** Fill in: Arrays use `_______` (with/without) parentheses for length.
Strings use `_______` (with/without) parentheses for length.

**Q11.** What does `Arrays.sort()` do to the original array?
Answer: _______________

**Q12.** Fill the loop condition to safely access `nums[i]` and `nums[i+1]`:
```java
for (int i = 0; i < ________; i++) {
    if (nums[i] == nums[i+1]) ...
}
```

**Q13.** What does `return j++` do vs `return j`?
Answer: _______________

**Q14.** Declare a char array of size 5 in Java:
```java
char[] arr = new ________[________];
```

**Q15.** What import is needed to use `Arrays.sort()`?
```java
import ________________;
```

**Q16.** What is the output?
```java
int[] arr = {3, 1, 2};
Arrays.sort(arr);
System.out.println(arr[0]);
```
Answer: _______________

**Q17.** What is the output?
```java
String s = "hello";
System.out.println(s.length());
```
Answer: _______________

**Q18.** What is `nums.length` if `nums = {1, 2, 3, 4, 5}`?
Answer: _______________

**Q19.** Fill in the blank — Running Sum pattern:
```java
runningSum[i] = runningSum[________] + nums[i];
```

**Q20.** What happens if you do `return true` at the end of a method that should return based on a condition?
Answer: _______________

---

## 🐛 SECTION 2 — Spot the Bug (Code Review) [15 Questions]

**Q21.** Find the bug:
```java
char a[] = s.toCharArray();
char b[] = t.toCharArray();
if (a == b) return true;
return false;
```
Bug: _______________

**Q22.** Find the bug:
```java
for (int i = 0; i <= nums.length; i++) {
    if (nums[i] == nums[i+1]) return true;
}
```
Bug: _______________

**Q23.** Find the bug:
```java
public boolean isAnagram(String s, String t) {
    char a[] = s.toCharArray();
    char b[] = t.toCharArray();
    if (Arrays.equals(a, b)) return true;
    return false;
}
```
Bug: _______________
(Hint: what are you forgetting before comparing?)

**Q24.** Find the bug:
```java
int runningSum[] = new int[nums.length];
for (int i = 0; i < nums.length; i++) {
    runningSum[i] = runningSum[i-1] + nums[i];
}
```
Bug: _______________

**Q25.** Find the bug:
```java
public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length-1; i++) {
        if (nums[i] == nums[i+1]) return true;
    }
}
```
Bug: _______________

**Q26.** Find the bug:
```java
int ans[] = new int[nums.length];
for (int i = 0; i < nums.length; i++) {
    ans[i] = nums[i];
    ans[i + nums.length] = nums[i];
}
```
Bug: _______________

**Q27.** Find the bug:
```java
public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[j] = nums[i];
            j++;
        }
    }
}
```
Bug: _______________

**Q28.** Find the bug:
```java
return = true;
```
Bug: _______________

**Q29.** Find the bug:
```java
for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] != nums[i+1]) {
        nums[j] = nums[i];
        j++;
    }
}
nums[j] = nums[nums.length - 1];
return j;  // should return count of unique elements
```
Bug: _______________

**Q30.** What is wrong with this comparison?
```java
char a[] = s.toCharArray();
char b[] = t.toCharArray();
if (s.sort() == t.sort()) ...
```
Bug: _______________

**Q31.** Find the bug:
```java
if (s.length == t.length) ...  // s and t are Strings
```
Bug: _______________

**Q32.** Find the bug:
```java
int runningSum[] = new int[nums.length];
runningSum[0] = nums[0];
for (int i = 0; i < nums.length; i++) {
    runningSum[i] = runningSum[i-1] + nums[i];
}
```
Bug: _______________

**Q33.** Find the bug:
```java
for (int i = 0; i <= nums.length-2; i++) {
    if (nums[i] == nums[i+1]) {
        result = true;
    } else {
        result = false;
    }
}
return result;
```
Bug: _______________

**Q34.** Find the bug:
```java
public int removeDuplicates(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length-1; i++) {
        if (nums[i] != nums[i+1]) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
}
```
Bug: _______________

**Q35.** What is wrong?
```java
Arrays.Issorted(a, b);
```
Bug: _______________

---

## 🧩 SECTION 3 — Pattern Recognition [10 Questions]

**Q36.** What pattern does "Valid Anagram" use?
a) Two Pointers  b) Sorting + Compare  c) Sliding Window  d) Binary Search
Answer: ___

**Q37.** What pattern does "Contains Duplicate" (sort approach) use?
a) HashSet  b) Sorting + Adjacent Check  c) Two Pointers  d) Prefix Sum
Answer: ___

**Q38.** What pattern does "Move Zeroes" use?
a) Sorting  b) Two Pointers  c) Sliding Window  d) Binary Search
Answer: ___

**Q39.** What pattern does "Running Sum" use?
a) Two Pointers  b) Sorting  c) Prefix Sum  d) Hashing
Answer: ___

**Q40.** What pattern does "Remove Duplicates from Sorted Array" use?
a) Binary Search  b) Hashing  c) Two Pointers  d) Sliding Window
Answer: ___

**Q41.** In "Move Zeroes" — pointer `i` does what? Pointer `j` does what?
Answer: _______________

**Q42.** Why does sorting help in "Contains Duplicate"?
Answer: _______________

**Q43.** Why does sorting help in "Valid Anagram"?
Answer: _______________

**Q44.** In "Remove Duplicates" — when do you write to `nums[j]`?
a) When nums[i] == nums[i+1]  b) When nums[i] != nums[i+1]
Answer: ___

**Q45.** In "Concatenation of Array" — `ans[i + nums.length] = ?`
Answer: _______________

---

## 📊 SECTION 4 — Time Complexity [5 Questions]

**Q46.** What is the time complexity of sorting an array of n elements?
Answer: _______________

**Q47.** "Contains Duplicate" with brute force (nested loops) — time complexity?
Answer: _______________

**Q48.** "Contains Duplicate" with sorting — time complexity?
Answer: _______________

**Q49.** "Move Zeroes" with two pointers — time complexity?
Answer: _______________

**Q50.** "Running Sum" — time complexity?
Answer: _______________

---

---
---

# ✅ ANSWERS

## Section 1 — Fill in the Blank
1. `toCharArray()`
2. `sort`
3. `equals`
4. `length()`  ← with parentheses
5. `length`    ← WITHOUT parentheses
6. `charAt`
7. `equals`
8. `==` checks reference equality, not content. Use `.equals()`
9. Arrays use `length` without `()`. `length()` is for Strings
10. Arrays: WITHOUT parentheses | Strings: WITH parentheses
11. It modifies the original array in-place
12. `nums.length - 1`
13. `return j++` returns the old value of j THEN increments. `return j` returns j as-is
14. `char[] arr = new char[5]`
15. `import java.util.Arrays`
16. `1` (smallest after sorting)
17. `5`
18. `5`
19. `i - 1`
20. The method always returns `true` regardless of the actual condition

## Section 2 — Spot the Bug
21. `==` doesn't compare array content. Use `Arrays.equals(a, b)`
22. `i <= nums.length` causes `nums[i+1]` to go out of bounds. Use `i < nums.length - 1`
23. Arrays are NOT sorted before comparing! Add `Arrays.sort(a)` and `Arrays.sort(b)` first
24. When `i=0`, `runningSum[i-1]` = `runningSum[-1]` — out of bounds! Set `runningSum[0] = nums[0]` before loop and start from `i=1`
25. Missing `return false` — method doesn't return if no duplicate found
26. `ans` array is too small! Should be `new int[2 * nums.length]`
27. Missing second loop to fill remaining positions with 0
28. `return` is not an assignment. Remove the `=`. Use `return true`
29. `return j` → last element placed at `nums[j]` but `j` wasn't incremented. Should be `j++` then `return j`
30. Strings don't have `.sort()` method. Convert to char array first, then use `Arrays.sort()`
31. Strings use `length()` with parentheses, not `length`
32. Loop starts at `i=0` but runningSum[0] already set. Loop should start at `i=1`
33. `result = false` in else overwrites previous `true` findings. Return `true` immediately when found, `return false` after loop
34. Missing last element! After loop: `nums[j] = nums[nums.length-1]; j++;`
35. Method doesn't exist. Use `Arrays.equals(a, b)` to compare arrays

## Section 3 — Pattern Recognition
36. b) Sorting + Compare
37. b) Sorting + Adjacent Check
38. b) Two Pointers
39. c) Prefix Sum
40. c) Two Pointers
41. `i` reads every element. `j` only moves forward when a non-zero element is found (write position)
42. After sorting, duplicates are always next to each other — easy to check adjacent elements
43. After sorting, anagrams become identical strings — easy to compare
44. b) When `nums[i] != nums[i+1]` (unique element found)
45. `ans[i + nums.length] = nums[i]`

## Section 4 — Time Complexity
46. O(n log n)
47. O(n²)
48. O(n log n)
49. O(n)
50. O(n)
