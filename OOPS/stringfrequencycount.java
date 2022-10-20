/*Count the frequency of charecter in a given string.*/

class Count{
	public static void main(String[] a){
		int i;
		String str=a[0];
		int arr[]=new int[256];
		for(i=0;i<256;i++){
			arr[i]=0;
		}
		for(i=0;i<str.length();i++){
			arr[str.charAt(i)]++;
		}
		for(i=0;i<256;i++){
			if(arr[i]!=0)
				System.out.printf("%c %d\n",i,arr[i]);
		}	
	}
}