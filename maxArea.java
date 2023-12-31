public static int maxArea(int[] height) {
	    // Max area of water contained
		int max=0;
		int n=height.length;
		int l=0;
		int r=n-1;
		while(l<r){
			
			int val=height[l]<height[r]?height[l]:height[r];
			int area=val*(r-l);
			if(area>max){
				max=area;
			}
			if(height[l]<height[r]){
				l++;
			}
			else{
				r--;
			}
		
	}
	return max;
	}
