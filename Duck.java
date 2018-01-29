
public class Duck {
	String color;
	String name; 
	
	public Duck (String color){
		this.color= color;
	}
public static void main(String[] args) {
	Duck quack = new Duck("yellow");
	System.out.println(quack.color);
	
}
}
