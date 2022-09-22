class BurgerKing{

public static void main(String args[]){
	/* String arr[]={"String""String""String""String""String""String""String"};



double can hold byte, short, int, long, double, float

long can hold byte, short, int, long 

	 System.out.printl(arr[0]); 

	 */
	String name="Burger King";
	String type="5 Star Hotel"; 
	String address ="Commercial Street, Shivajinagar";
	String managerNames[] ={"Lakshmi","Sangeeta","Ganesha","Sumanth"};
 	int noOfManagers= managerNames.length;
	String foodMenu[]={"Crisy Chicken","crispy veg","Classic Chicken","Classic veg","Veg Makhani Burst","Chicken makhani burst","Spicy grill","Big Smoky Grilled Chicken","King Egg","Chicken Whopper","Chicken Whopper Jr","Veg Whopper Jr","Mutton Whopper","Crispy chicken wrap","Crunchy Chicken Volcano", "Fiery Chicken",  "Tandoori Chicken", "Masala Veg Whopper","Masala Chicken Whopper","Masala Mutton Whopper"};

	System.out.println("Restaurant Name  :"+name+"\n");
	System.out.println("Destination  :"+address+"\n");

System.out.println("Welcome to "+name+"\n"+
					"What would you like to have Sir/madam, ");
for(int i=0;i<foodMenu.length;i++){
System.out.println(foodMenu[i]);
}
System.out.println("No of Managers  :"+noOfManagers+"\n");
System.out.println("Name list of Managers  :");

for(int i=0;i<managerNames.length;i++){
System.out.println(managerNames[i]);
}
}
}
