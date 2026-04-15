 import java.util.*;
 class Solution {
    HashMap<Character , String> map = new HashMap<>();
    public Solution(){
    map.put('2' ,"abc");
    map.put('3' ,"def");
    map.put('4' ,"ghi");
    map.put('5' ,"jkl");
    map.put('6' ,"mno");
    map.put('7' ,"pqrs");
    map.put('8' ,"tuv");
    map.put('9' ,"wxyz");
    }
public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;

        solve(ans, "", 0, digits);
        return ans;
    }

    private void solve(List<String> ans, String cur, int i, String digits) {
        if (i == digits.length()) {
            ans.add(cur);
            return;
        }

        String temp = map.get(digits.charAt(i));
        for (int j = 0; j < temp.length(); j++) {
            solve(ans, cur + temp.charAt(j), i + 1, digits);
        }
    }
}

