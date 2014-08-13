package simplefactory;
interface Car{
	public void run();
	public void stop();
}

class Benz implements Car{
	public void run(){
		System.out.println("Benz开始启动了。。。。。");
	}
	public void stop(){
		System.out.println("Benz停车了。。。。。");
	}
}

class Ford implements Car{
	public void run(){
		System.out.println("Ford开始启动了。。。");
	}
	public void stop(){
		System.out.println("Ford停车了。。。。");
	}
}

class Factory{
	public static Car getCarInstance(){
		return new Ford();
	}
}
public class SimpleFactory {

	/**简单工厂模式
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=Factory.getCarInstance();
		c.run();
		c.stop();
	}

}
