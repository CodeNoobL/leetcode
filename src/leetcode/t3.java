package leetcode;
/*
 ����һ���ַ������ҳ��������ظ��ַ�����Ӵ��ĳ��ȡ�

ʾ����

���� "abcabcbb" ��û���ظ��ַ�����Ӵ��� "abc" ����ô���Ⱦ���3��

���� "bbbbb" ������Ӵ����� "b" ��������1��

���� "pwwkew" ����Ӵ��� "wke" ��������3����ע��𰸱�����һ���Ӵ���"pwke" �� ������  �������Ӵ���
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
