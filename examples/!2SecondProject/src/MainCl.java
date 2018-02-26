
public class MainCl {

	public static void main(String[] args) {
		Bird myBird = new Bird();
		myBird.Eat();
		myBird.Move();
		Eagle myEagle = new Eagle();
		myEagle.Eat();
		myEagle.Move();
		myBird.Fly(2);
	}
}
