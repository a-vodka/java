
public class MainCl {
	public static void main(String[] args) {
    Triangle T = new Triangle();
    T.SetA(9);
    T.h=5;
    double areaT = T.Area();
    T.GetName();
    System.out.println("Площадь = " + areaT);
	}
}