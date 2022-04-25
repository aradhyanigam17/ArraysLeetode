kunals
class Solution {
public char nextGreatestLetter(char[] letters, char target) {
int start = 0;
int end = letters.length - 1;
​
//but if target is greatest than the greater element
//
//        if (target > letters[end]) {
//            return -1;// or you can "return arr[end]" too
//        }
​
​
while (start <= end) {
int mid = start + (end - start) / 2;
//            if (letters[mid] == target) {
//                return letters[mid]; //if you want to write the index then " return mid;"
//            }
if (target < letters[mid]) {
end = mid - 1;
} else {
start = mid + 1;
}
}
return letters[start % letters.length];