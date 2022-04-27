package progate_lesson2;

public class Car {
	private String name,color;
	  private int distance = 0;
	  private int fuel = 100;
	  
	  Car(String name, String color) {
	    this.name = name;
	    this.color = color;
	  }
	  
	  public void printData() {
	    System.out.println("【車の情報】");
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離：" + this.distance + "km");
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
	  
	  public void run(int distance) {
	    System.out.println(distance + "km走ります");
	    if (distance <= this.fuel) {
	      this.distance += distance;
	      this.fuel -= distance;
	      System.out.println("走行距離：" + distance + "km");
	      System.out.println("ガソリン量：" + fuel + "L");
	    } else {
	      System.out.println("ガソリンが足りません");
	      System.out.println("走行距離：" + this.distance + "km");
	      System.out.println("ガソリン量：" + this.fuel + "L");
	    }
	  }
	  
	  public void charge(int refueling) {
	    System.out.println(refueling + "L給油します");
	    if (refueling <= 0) {
	      System.out.println("給油できません");
	      System.out.println("ガソリン量：" + fuel + "L");
	    } else if (refueling + fuel >= 100) {
	      System.out.println("満タンまで給油します");
	      fuel = 100;
	      System.out.println("ガソリン量：" + fuel + "L");
	    } else {
	      fuel += refueling;
	      System.out.println("ガソリン量：" + fuel + "L");
	    }
	  }
}
