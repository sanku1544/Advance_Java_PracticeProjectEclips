package com.tka.feb14;

public class Logical {
	
	void m1(int n) {
		int count=0;
		System.out.println("factors:- ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count is :- "+count);
	}
	
	void m2(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
	
	
	void m3(int range) {
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<range;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	void m4(int n) {
		int j=1;
		int count=1;
		for(int i=0;i<n;i++) {
			System.out.print(j+" ");
			count*=10;
			j+=count;
		}
	}
	
	void m5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>0;k--) {
				System.out.print(k);
			}
			System.out.print(" ");
		}
	}
	void m6(int n) {
		int a=1;
		int b=2;
		
//		System.out.print(a+" ");
//		System.out.print(a+""+b);
		for(int i=1;i<n;i++) {
//			System.out.print(a+" ");
//			System.out.print(a+""+b);
			System.out.print(a+""+i+" ");
//			System.out.print(i+" "+i+1);
		}
	}
	void m7(int n) {
		int count=1;
		for(int i=1;i<n;i++) {
			System.out.print(count+" ");
			count*=10;
		}
	}
	void m8(int n) {
		int k=1;
		int c=4;
		for(int i=1;i<n;i++) {
			if(c>i) {
			System.out.print(k+" ");
			k*=10;
			}else{
				k=k/10;
				System.out.print(k+" ");
			}
		}

	}
	void m9(int n) {
		int k=1;
		int count=1;
		int c=4;
		for(int i=0;i<n;i++) {
			if(4>i) {
			System.out.print(k+" ");
			count*=10;
			k+=count;
			}else {
				k=k-count;
				System.out.print(k+" ");
				count/=10;
			}
		}

	}
	 void m10(int n) {
		 int a=0;
		 int b=1;
		 int c=1;
		 System.out.print(a+" "+b+" "+c);
		 for(int i=0;i<n;i++) {
			 int temp=a+b+c;
			 System.out.print(" "+temp +" ");
			 a=b;
			 b=c;
			 c=temp;
		 }
	 }
	 void m11(int n) {
		 int k=1;
		 for(int i=0;i<n;i++) {
			 if(i%2!=0 && i!=1) {
				 System.out.print(i+" ");
			 }else if(i%2==0){
				 System.out.print(k+" ");
				 k*=2;
			 }
		 }
	 }
	 
	 void m12(int n) {
		 
		 for(int j=1;j<=n;j++) {
		 int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n);
				break;
			}
			n++;
		 }
	 }
	 void m13(int n) {
		 int c=n;
		 for(int j=1;j<=c;j++) {
			 int count=0;
			 for(int i=1;i<=n;i++) {
				 if(n%i==0) {
					 count++;
				 }
			 }
			 if(count==2) {
				 System.out.println(n);
				 break;
			 }
			 n--;
		 }
	 }
	 void m14(int n) {
		 int c=100;
		 for(int j=1;j<=c;j++) {
			 int count=0;
			 for(int i=1;i<=n;i++) {
				 if(n%i==0) {
					 count++;
				 }
			 }
			 if(count==2) {
				 System.out.println(n);
			 }
			 n++;
			 
		 }
	 }
	 void m15(int n) {
		 int c=15;
		 for(int j=1;j<=c;j++) {
			 int count=0;
			 for(int i=1;i<=n;i++) {
				 if(n%i==0) {
					 count++;
				 }
			 }
			 if(count==2) {
				 System.out.println(n);
//				 break;
			 }
			 n++;
		 }
	 }
}
