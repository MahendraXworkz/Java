class Torch{
//3 setting torch 
static int status=1;
	public static int onOrOff(){
	if(status==1){
	System.out.println("Turned on with low light");
	status++;
	}else if(status==2){
	System.out.println("Medium Light");
	status++;
	}else if(status==3){
	System.out.println("high bright Light");
	status++;
	}else if(status==4){
	System.out.println("Torch Turned off");
	status=1;
	}return status;
}
}  