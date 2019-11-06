class Binary{
	public static void main(String []abcd){
		char A[]={'a','b','d','r','x','y','z'};
		int n=A.length;
		char x='d';
		boolean Notfound=false;
		int lowerBound=1;
		int upperBound=n;
		
		while(!Notfound){
			if(upperBound < lowerBound)
				{System.out.print("Doesn't exitst");
				break;}
			int midPoint=lowerBound+(upperBound-lowerBound)/2;
			if((int)A[midPoint]<(int)x)
				lowerBound=midPoint+1;
			if((int)A[midPoint]>(int)x)
				upperBound=midPoint-1;
			if((int)A[midPoint]==(int)x)
				{System.out.print(x+" at:"+midPoint);
				Notfound=true;
				break;}
		}
		
	}
}