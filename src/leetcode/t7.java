package leetcode;

/*
  给定一个 32 位有符号整数，将整数中的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
 */
public class t7 {
	public int reverse(int x) {
		boolean positive;
		if (x > 0) {
			positive = true;
		} else if (x < 0) {
			positive = false;
			x = -x;
		} else {
			return 0;
		}
		int figures = 0;
		for (int i = 0;; i++) {
			if (x >= Math.pow(10, i) ) {
				figures++;
			} else {
				break;
			}
		}

		int[] tmp = new int[figures];
		for (int i = 0; i < figures; i++) {
			// tmp[i] = (int) (x/Math.pow(10,i)%Math.pow(10, i+1));
			tmp[i] = (int) (x % Math.pow(10, i + 1) / Math.pow(10, i));
		}

		int result = 0;
		for (int i = figures - 1; i >= 0; i--) {
			long tmpp = (int) (tmp[i] * Math.pow(10, figures - i - 1));
			if(tmpp +result >(long)Math.pow(2, 31)){
			    return 0;
			}else{
				
			
			result += tmpp;
			}
			}

		if (positive) {
			return result;
		} else {
            return -result;
		}
	}
	
	public static void main(String[] args){
		t7 t = new t7();
		System.out.println(t.reverse(1534236469));
		System.out.println( (long) (9 * Math.pow(10, 9)));
	}
}
