package car;

public class Car {
	
	    // 定义属性
	    private String brand;
	    private String model;
	    private int power; // 动力，假设以马力为单位
	    private String color;
	    private double price;

	    // 构造方法，用于初始化汽车属性
	    public Car(String brand, String model, int power, String color, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.power = power;
	        this.color = color;
	        this.price = price;
	    }

	    // 显示汽车信息的方法
	    public void displayCarInfo() {
	        System.out.println("品牌：" + this.brand);
	        System.out.println("型号：" + this.model);
	        System.out.println("动力：" + this.power + "马力");
	        System.out.println("颜色：" + this.color);
	        System.out.println("价格：" + this.price + "元");
	    }

}