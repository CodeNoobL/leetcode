package leetcode;
/*
  �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������

ʾ�� 1:

����: 121
���: true
ʾ�� 2:

����: -121
���: false
����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
ʾ�� 3:

����: 10
���: false
����: ���������, Ϊ 01 �����������һ����������
 */
public class t9 {
	 public boolean isPalindrome(int x) {
		 if(x<0){
			 return false;
		 }else if (x == 0){
			 return true;
		 }else{
			 String str = Integer.toString(x);
			 
			 String str2 = new StringBuffer(str).reverse().toString();
			 
			 
			 return str.equals(str2);
		 }
		 
	       
	    }
}
