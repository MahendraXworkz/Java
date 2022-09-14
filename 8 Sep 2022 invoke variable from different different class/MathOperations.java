class MathOperations{
  public static void main(String arts[]){
    add(45,879,45);
    add(46,564,45);
    add(89,87,23);
    add(49,88,65);
    add(47,98,69);
    
    sub(945,879);
    sub(496,56);
    sub(89,87);
    sub(49,14);
    sub(47,98);
    
    mul(45,54);
    mul(46,86);
    mul(89,89);
    mul(49,56);
    mul(47,89);
    
    div(45,45);
    div(30,46);
    div(89,54);
    div(49,56);
    div(47,98);
  }
  
  public static void add(int a,int b,int c){
  System.out.println(a+"+"+b+"+"+c+" = "+a+b+c);
  }
  public static void sub(int a,int b){
    System.out.println(a+"-"+b+" = "+ (a-b));
  }
  public static void div(double a,double c){
    double div=Math.round((a/c)*100);
    System.out.println(a+"/"+c+" = "+(div/100));
  }  
  public static void mul(int a,int c){
    System.out.println(a+"*"+c+" = "+ (a*c));
  }
  
}