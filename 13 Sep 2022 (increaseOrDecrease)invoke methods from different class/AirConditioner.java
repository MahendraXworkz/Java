class AirConditioner{
	static boolean isConnected;
	
public static boolean onOrOff(){
	if(isConnected==false){
		isConnected=true;
		System.out.println("AirConditioner is turned on");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("AirConditioner is turned off");	
	}
	return isConnected;
}
}