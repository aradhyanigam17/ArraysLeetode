class Solution {
    public static char binary_search(char[] letters , char key , char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]==key){
                return key;
            }
            else if(letters[mid]<key){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return target;
    }
    public char nextGreatestLetter(char[] letters, char target) {
        char key = (char)(target+1);
        char ans;
        while(true){
            char ch = binary_search(letters , key , target);
            if(ch!=target){
                ans = ch;
                break;
            }
            if(key=='z'){
                key='`';
            }
            key = (char)(key+1);
        }
        return ans;
    }
}

