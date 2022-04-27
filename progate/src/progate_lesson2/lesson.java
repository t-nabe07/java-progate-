package progate_lesson2;

import java.util.Scanner;

public class lesson {
	public static void main(String[] args) {
	    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
	    Car car = new Car("フェラーリ", "赤");
	    Scanner scanner = new Scanner(System.in);
	    
	    bicycle.printData();
	    System.out.println("-----------------");
	    
	    System.out.print("走る距離を入力してください：");
	    int bicycleDistance = scanner.nextInt();
	    bicycle.run(bicycleDistance);
	    
	    System.out.println("=================");
	    car.printData();
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    int carDistance = scanner.nextInt();
	    car.run(carDistance);
	    
	    System.out.println("-----------------");
	    System.out.print("給油する量を入力してください：");
	    int carRefueling = scanner.nextInt();
	    car.charge(carRefueling);
	  }
}
