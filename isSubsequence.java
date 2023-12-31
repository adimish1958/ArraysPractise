  //subsequence exist
    
    public static String isSubsequence(String str1, String str2) {    
    	// Write your code here.
			int s1=str1.length();
			int s2=str2.length();

			int i=0;
			int j=0;
			while(j<s2&&i<s1){
				if(str2.charAt(j)==str1.charAt(i)){
					i++;
					j++;
				}
				else{
					j++;
				}
			}
			if(i==s1)
			return "True";
			return "False";

	}
