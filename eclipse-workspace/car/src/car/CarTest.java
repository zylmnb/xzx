package car;

public class CarTest {

	 // 测试汽车类
    public static void main(String[] args) {
        // 实例化一个汽车对象，并给属性赋值
        Car myCar = new Car("Toyota", "Corolla", 150, "红色", 150000.0);

        // 调用显示汽车信息的方法
        myCar.displayCarInfo();
    }
}