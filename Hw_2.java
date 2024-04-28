//You will be given an array and you need to find the third largest 

package list;

public class Hw_2 {

	

	public static void main(String[] args) {
		int arr1[] = new int[] {1,54,2,55,12,87,34,90,100};
		
		int a = arr1[0];
		int b = arr1[1];
		int c = arr1[2];
		
		if(b>a) {
			int temp1 =a;
			a=b;
			b=temp1;
		}
		
		if(c>a) {
			int temp1 =a;
			a=c;
			c=temp1;
		}
		if(c>b) {
			int temp1 = b;
			b=c;
			c = temp1;
		}
		
		for(int i=3;i<arr1.length;i++) {
			int d = arr1[i];
			
			if(d>a) {
				int temp1 =a;
				int temp2 =b;
				int temp3=c;
				a=d;
				b=temp1;
				c=temp2;
				arr1[i]=temp3;
			}
			
			else if(d>b) {
				int temp1=b;
				int temp2=c;
				b=d;
				c=temp1;
				arr1[i]=temp2;
			}
			else if(d>c) {
				int temp1=c;
				c=d;
				arr1[i]=temp1;
			}
		}
		
		
		System.out.println("Third highest is " + c);	
	}

}
