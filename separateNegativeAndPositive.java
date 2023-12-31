public static int[] separateNegativeAndPositive(int a[]) {
		
		//int array7[]= {1,2,3,-4,0,-1,5,-6};
        int i=0;
        int j=a.length-1;
        if(a.length==0||a.length==1)
        {return a;}

        while(i<j ){
            while(i<a.length && a[i]<0 ){
                i++;
            }
            while(j>=0 && a[j]>=0){
                j--;
            }
            if(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
             j--;
            }

        }
        return a;

    }
