package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ1000��

ʾ�� 1��

����: "babad"
���: "bab"
ע��: "aba"Ҳ��һ����Ч�𰸡�
ʾ�� 2��

����: "cbbd"
���: "bb"
 */
public class t5 {
    public String longestPalindrome(String s) {
         List<Character> p = new ArrayList<Character>();
         for(int i =0;i<s.length();i++){
        	 p.add('#');
        	 p.add(s.charAt(i));
         }
         p.add('#');                                          //��ÿ���ַ����е��ַ���#�ָ���������β���#
         int[] count = new int[p.size()];                     //���Լ�¼ÿ��λ�õĻ��ĳ���
         for(int i = 0;i<count.length;i++){
         count[i] = setCount(p,i);                      // ����ÿ��λ�õĻ��ĳ���
         }
         int id = 0;                  //��������ĵ��±�
         int length = 0;              //���ĳ���
         for(int i = 0;i<count.length;i++ ){
        	 if(count[i] > length){
        		 length = count[i];
        		 id = i;
        	 }
         }                           //ȷ��id��length
         String result = "";
         for(int i = -length;i<=length;i++){
        	 if(p.get(id+i)!='#'){
        		 result += p.get(id+i);
        	 }
         }
         return result;
    }
    //�������Ļ��ĳ���
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
