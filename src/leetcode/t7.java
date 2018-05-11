package leetcode;

/*
  ����һ�� 32 λ�з����������������е����ֽ��з�ת��

ʾ�� 1:

����: 123
���: 321
 ʾ�� 2:

����: -123
���: -321
ʾ�� 3:

����: 120
���: 21
 */
/*   ˼·
 *1. �ж���������Xת��Ϊ���� 
 *2. �ж����ֵ�λ��figures 
 *3. ������洢ÿ��λ�õ����� 
 *4. ����ֵ
 *5. ���ӷ���
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
	
	public static void main(String[] arg){
		t7 t = new t7();
		System.out.println(t.reverse(1534236469));
		System.out.println( (long) (9 * Math.pow(10, 9)));
	}
}
