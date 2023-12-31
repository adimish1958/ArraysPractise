public static int searchInRotatedArray(int arr[], int key) {
        // Write your code here.
        int r=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                r=i+1;
                break;
            }
        }

        int l=0;
        int h=arr.length-1;
        if(r!=-1){
        if(arr[l]>key){
            l=r;
        }
        else if(arr[l]<key){
            h=r-1;
        }
        else if(arr[l]==key){
            return l;
        }
        }
        
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key) {
                h=mid-1;
            }
            else if(arr[mid]<key){
                l=mid+1;
            }
        }
        return -1;
    }
