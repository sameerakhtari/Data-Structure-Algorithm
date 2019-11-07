class Binary{
	public static void main(String []abcd){
		String A[]={"Sameer","ali","dude","fayaz","taha","hadi","sami"};
		int n=A.length;
		String x="dude";
		boolean Notfound=false;
		int lowerBound=1;
		int upperBound=n;
		
		while(!Notfound){
			if(upperBound < lowerBound)
				{System.out.print("Doesn't exitst");
				break;}
			int midPoint=lowerBound+(upperBound-lowerBound)/2;
			if(A[midPoint].compareTo(x)<0)
				lowerBound=midPoint+1;
			if(A[midPoint].compareTo(x)>0)
				upperBound=midPoint-1;
			if(A[midPoint].compareTo(x)==0)
				{System.out.print(x+" at:"+midPoint);
				Notfound=true;
				break;}
		}
		
	}
}