package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba"也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"
 */
public class t5 {
    public String longestPalindrome(String s) {
         List<Character> p = new ArrayList<Character>();
         for(int i =0;i<s.length();i++){
        	 p.add('#');
        	 p.add(s.charAt(i));
         }
         p.add('#');                                          //将每个字符串中的字符以#分隔，并在首尾添加#
         int[] count = new int[p.size()];                     //用以记录每个位置的回文长度
         for(int i = 0;i<count.length;i++){
         count[i] = setCount(p,i);                      // 计算每个位置的回文长度
         }
         int id = 0;                  //最长回文中心的下标
         int length = 0;              //回文长度
         for(int i = 0;i<count.length;i++ ){
        	 if(count[i] > length){
        		 length = count[i];
        		 id = i;
        	 }
         }                           //确认id和length
         String result = "";
         for(int i = -length;i<=length;i++){
        	 if(p.get(id+i)!='#'){
        		 result += p.get(id+i);
        	 }
         }
         return result;
    }
    //计算中心回文长度
    public int setCount(List<Character> p,int j ){
    	int count = 0;
    	for(int i =1;i+j<p.size()&&j-i>=0;i++){
    		if(p.get(j+i) == p.get(j-i)){
    			++count;
    		}else{
    			return count;
    		}
    	}
    	return count;
    }
    public static void main(String args[]){
    	 Scanner in = new Scanner(System.in);
    	 String s = in.nextLine();
    	 t5 t = new t5();
    	 String result = t.longestPalindrome(s);	
    	 System.out.println(result);
     }
    
}
