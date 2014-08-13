package FactoryDemo;
interface Car{
	public void start();
	public void stop();
}

class Benz implements Car{
	public void start(){
		System.out.println("Benz开动了。。。。");
	}
	public void stop(){
		System.out.println("Benz停车了。。。");
	}
}

class Ford implements Car{
	public void start(){
		System.out.println("Ford开动了。。。。");
	}
	public void stop(){
		System.out.println("Ford停车了。。。");
	}
}

class BigBus implements Car{
	public void start(){
		System.out.println("大巴开车了。。。。");
	}
	public void stop(){
		System.out.println("大巴停车了。。。。");
	}
}

class MiniBus implements Car{
	public void start(){
		System.out.println("小巴开车了。。。。");
	}
	public void stop(){
		System.out.println("小巴停车了。。。。");
	}
}

interface AbstractFactory{
	
}
class CarFactory implements AbstractFactory{
	public Car getCar(String type){
		Car c=null;
		try {
			c=(Car)Class.forName("org.jzkangta.factorydemo02."+type).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}
class BusFactory implements AbstractFactory{
	public Car getBus(String type){
		Car c=null;
		try {
			c=(Car)Class.forName("org.jzkangta.factorydemo02."+type).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
}

public class FactoryDemo {
	/**
	 * 工厂模式
	 * @param args
	 */
	public static void main(String[] args) {
		//CarFactory cf=new CarFactory();
		BusFactory bf=new BusFactory();
		Car c=null;
		//c=cf.getCar("Benz");
		c=bf.getBus("BigBus");
		c.start();
		c.stop();
	}

}
