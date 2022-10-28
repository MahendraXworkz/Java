public static void main(String []args){
	    int n = 234, reverse=0,remainder=0;
		int sum=0;
		  while(n!=0){
			  remainder=n%10;
			 sum+=remainder;
			 n/=10;
		  }
		  System.out.println(sum);
    }
	}