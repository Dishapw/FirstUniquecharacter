package FirstUniqueChar;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        L: for (int i = 0, length = s.length(); i < length; i++) {
            for (int j = 0; j < length; j++)
                if (i != j && s.charAt(i) == s.charAt(j))
                    continue L;
            return i;
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}

