package baitap.baitap2;

import java.util.Arrays;

public class BaiTap2 {
	public static void main(String[] args) {
		Point2D point2D = new Point2D(2, 3);
		System.out.println(Arrays.toString(point2D.getXY()));
		
		Point3D point3D = new Point3D(1.1F,2.0F,3.1F);
		System.out.println(Arrays.toString(point3D.getXYZ()));
	}
}
