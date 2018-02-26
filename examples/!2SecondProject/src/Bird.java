
public class Bird {
int distance;
	public void Eat() {
		System.out.println ("it depends");
	}
	public void Move () {
		System.out.println ("fly");
	}
	public int Fly (int howlong) {
		distance=howlong*60;
		System.out.println("Ћетаю со скоростью "+distance+" км в час");
		return distance;
	}
}
