public class FourthQuestion{
	
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				int array[]= {23,45,56,67,8,12,3,5,7,9,102,34,4,5};
				int countEven=0;
				int primeCount=0;
				
				for(int j=0;j<array.length;j++){
					int n=array[j],count=0;
			if(n<2){
				count+=1;
			}
			for(int i=2;i<n;i++){
				if(n%i==0){
				count+=1;
				}
			}
			if(count>0){
				
			}else{
				primeCount++;
			}
				}
				for(int i=0;i<array.length;i++) {
					if(array[i]%2==0) {
						countEven+=1;
					}
				}
				System.out.println("Array length "+array.length);
				System.out.println("Even numbers count:"+countEven+" Odd numbers count:"+(array.length-countEven));
				System.out.println("No of Prime number "+primeCount);
			}
		}