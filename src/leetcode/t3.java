package leetcode;
/*
 给定一个字符串，找出不含有重复字符的最长子串的长度。

示例：

给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。

给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。

给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 */
public class t3 {
	  public int lengthOfLongestSubstring(String s) {
	       int max =0;
	       
	        for(int i = 0;i<s.length();i++){
	            String x = ""+s.charAt(i);
	             boolean lzq = true;
	             int result = 1;
	            for(int j = i+1;lzq&&j<s.length();j++){
	                char t =s.charAt(j);
	                if(t3.charequal(x,t)){
	                    x ="";
	                    lzq = false;
	                }else{
	                    ++result;
	                    x = x + s.charAt(j);
	                    }
	                }
	                // max = result>max?result:max;
	                    if(result>max){
	                        max = result;
	                    }
	        }
	        return max;
	        }
	        
	    
	    public static boolean charequal(String s ,char t){
	        for(int i =0;i<s.length();i++){
	            char a =s.charAt(i);
	            if(a==t){
	                return true;
	            }
	        }
	        return false;
	    }
}
