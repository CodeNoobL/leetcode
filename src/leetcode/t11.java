package leetcode;
/*
 * ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ���� (i, ai) ���� n ����ֱ�ߣ�ʹ�ô�ֱ�� i �������˵�ֱ�Ϊ (i, ai) �� (i, 0)���ҳ����е������ߣ�ʹ�������� x �Ṳͬ���ɵ�����������������ˮ��
 */
public class t11 {
	
	public int maxArea(int[] height){
		int maxarea = 0;
		
		int start_index = 0;
		int end_index = height.length-1;
		while(start_index < end_index){
			maxarea = Math.max(maxarea,Math.min(height[start_index], height[end_index])*(end_index-start_index) );
	       if(height[start_index]>height[end_index]){
	    	   end_index--;
	       }else{
	    	   start_index++;
	       }
		}
		return maxarea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
