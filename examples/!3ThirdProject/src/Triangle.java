
public class Triangle extends Shape {
	private int a;
	public int h;
	public int GetA(){
		return a;
	}
	public void SetA (int A){
		this.a = A;
	}
	public int Area(){
	if (h>0){
	   return a*h;
		}
		else { 
			System.out.println("Error");
		}
		return a*0;
	}
	
	public void GetName(){
		System.out.println("Triangle");
	}
	}

