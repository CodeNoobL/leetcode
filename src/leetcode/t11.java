package leetcode;
/*
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。画 n 条垂直线，使得垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
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
