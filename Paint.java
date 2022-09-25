class Paint{
	static int paintId;
	static String name;
	static String brandName;
	static String color;
	
		 static void setPaintId(int id){
			paintId =id;
		 } 
		 static int getPaintId(){
			return paintId;
		 }
		 public static void setName(String nm){
			name=nm;
		 }
		 static String getName(){
			return name;
		 }
		 static void setBrandName(String brandNm){
			brandName =brandNm;
		 }
		 public static String getBrandName(){
			return brandName;
		 }
		 public static void setColor(String colour){
			color=colour;
		 }
		 public static String getColor(){
			return color;
		 }
} 