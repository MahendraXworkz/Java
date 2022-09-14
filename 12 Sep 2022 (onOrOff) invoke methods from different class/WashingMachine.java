class WashingMachine{
	static boolean isConnected;
	
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
}