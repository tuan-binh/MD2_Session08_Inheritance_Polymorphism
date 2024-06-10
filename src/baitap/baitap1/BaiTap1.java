package baitap.baitap1;

public class BaiTap1 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(3.5);
		circle.setColor("RED");
		System.out.println("Diện tích hình tròn: " + circle.getArea());
		System.out.println(circle);
		// khởi tạo đối tượng hình trụ Cylinder
		Cylinder cylinder = new Cylinder(3, "blue", 5);
		System.out.println("Thể tích hình trụ = " + cylinder.getVolume());
		System.out.println(cylinder);
		
	}
}
