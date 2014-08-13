package simplefactory03;

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

class Toyota implements Car{
	public void run(){
		System.out.println("Toyota开始启动了。。。");
	}
	public void stop(){
		System.out.println("Toyota停车了。。。。");
	}
}

class Factory{
	public static Car getCarInstance(String type){
		Car c=null;
		try {
			c=(Car)Class.forName("org.jzkangta.factorydemo03."+type).newInstance();
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
public class SimpleFactory {
	/**
	 * 简单工厂模式
	 * @param args
	 */
	public static void main(String[] args) {
		Car c=Factory.getCarInstance("Toyota");
		if(c!=null){
			c.run();
			c.stop();
		}else{
			System.out.println("造不了这种汽车。。。");
		}
	}
}
