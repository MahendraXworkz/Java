class Mobile{
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=5;
	static int currentVolume;
	
public static boolean onOrOff(){
	if(isConnected==false){
		isConnected=true;
		System.out.println("Mobile is turned on");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Mobile is turned off");	
	}
	return isConnected;
}
	public static void increaseVolume(){
		System.out.println("Start of increaseVolume()");
		if(isConnected==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("Current Volume :"+currentVolume);
			}else{
				System.out.println("Max Volume reached");
			}
		}else{System.out.println("Turn on Mobile first");
		}
		System.out.println("end of increaseVolume()");
	}
	
	public static void decreaseVolume(){
		System.out.println("Start of decreaseVolume()");
			if(isConnected==true){
				if(currentVolume>minVolume){
					
					currentVolume=currentVolume-1;
					System.out.println("Current Volume :"+currentVolume);
				}else{
					System.out.println("Turn on Mobile first");
				}
				
			}else{
				System.out.println("First Mobile on madu gube");
			}
			System.out.println("end of increaseVolume()");
	}
}
