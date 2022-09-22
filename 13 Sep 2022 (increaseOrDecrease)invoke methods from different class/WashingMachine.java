class WashingMachine{
	static boolean isConnected;
	static int minSpeed;
	static int maxSpeed=5;
	static int currentSpeed;
	
public static boolean onOrOff(){
	if(isConnected==false){
		isConnected=true;
		System.out.println("WashingMachine is turned on");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("WashingMachine is turned off");	
	}
	return isConnected;
	}
	public static void increaseSpeed(){
		System.out.println("Start of increaseSpeed()");
		if(isConnected==true){
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("Current Speed :"+currentSpeed);
			}else{
				System.out.println("Max Speed reached");
			}
		}else{System.out.println("Turn on WashingMachine first");
		}
		System.out.println("end of increaseSpeed()");
	}
	
	public static void decreaseSpeed(){
		System.out.println("Start of increaseSpeed()");
			if(isConnected==true){
				if(currentSpeed>minSpeed){
					
					currentSpeed=currentSpeed-1;
					System.out.println("Current Speed :"+currentSpeed);
				}else{
					System.out.println("Turn on WashingMachine first");
				}
				
			}else{
				System.out.println("First WashingMachine on madu gube");
			}
			System.out.println("end of increaseSpeed()");
	}
}