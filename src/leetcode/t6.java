package leetcode;
/*
 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 输入: s = "PAYPALISHIRING", numRows = 4
输出: "PINALSIGYAHRPI"
解释:

P     I    N
A   L S  I G
Y A   H R
P     I
 
ABCDEFGHIJKLMNOPQRST
AGMSBGHMNSTCGIMOSDJP
 算法推论
 n=4
0     6       12       18      
1   5 7    11 13    17 19
2 4   8 10    14 16    20 
3     9       15       21

0   i+k(n+n-2)
1   i+k(n+n-2)    (n+n-2-i)+k(n+n-2)
.
.
n-1 i+k(n+n-2) 
 */

import java.util.Scanner;

public class t6 {
	public String convert(String s, int numRows) {
		if(numRows <2){
			return s;
			}
		String result = "";
		for (int i = 0; i < numRows && i < s.length(); i++) {
			if (i == 0) {
				for (int k = 0; (k * (2 * numRows - 2)) < s.length(); k++) {
					result += s.charAt(i + k * (2 * numRows - 2));
				}
			} else if (i == numRows - 1) {
				for (int k = 0; (i + k * (2 * numRows - 2)) < s.length(); k++) {
					result += s.charAt(i + k * (2 * numRows - 2));
				}
			} else {
				for (int k = 0; (i + k * (2 * numRows - 2)) < s.length(); k++) {
					result += s.charAt(i + k * (2 * numRows - 2));
					if ((2 * numRows - 2 - i) + k * (2 * numRows - 2) < s.length()) {
						result += s.charAt((2 * numRows - 2 - i) + k * (2 * numRows - 2));
					}
				}
			}
		}
		return result;
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int i = in.nextInt();
		t6 t = new t6();
		String result = t.convert(s, i);
		System.out.println(result);
	}

}
