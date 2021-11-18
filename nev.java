package nev;

public class nev {
	//multiplication 2 number
	
	public static void main(String[] args) {
		int a=5;
		int b=6;
		
		int c=mul(a,b);
		System.out.println(" multiplication of 2 number"+c);	
		
		
		double y= multfi(2,3.5f,50000);
		System.out.println(" multiplication of 3 number"+y);
		
		int m=max(5,7,6);
		System.out.print("maximum number" +m);
		
		
		
		
		
		
		
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	
	public static double multfi(int d, float e, long f) {
		return d*e*f;
		
	}
	
	public static int max(int h,int j, int k) {
		if(h>=j && h>=k) {
			return h;
			
		}
		else if(j>=h && j>=k) {
			return j;
		}
		else {
			return k;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	


}
