package baitap.baitap3;

public class BaiTap3 {
	public static void main(String[] args) {
		Point point = new Point(1, 2);
		System.out.println(point);
		
		MoveablePoint moveablePoint = new MoveablePoint(2, 3, -1, 2);
		System.out.println("Before: " + moveablePoint);
		moveablePoint.move();
		System.out.println("After: " + moveablePoint);
		
	}
}
