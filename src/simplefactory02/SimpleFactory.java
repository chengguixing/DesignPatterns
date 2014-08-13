package simplefactory02;
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
	public static Car getCarInstance(String type){
		Car c=null;
		if("Benz".equals(type)){
			c=new Benz();
		}
		if("Ford".equals(type)){
			c=new Ford();
		}
		return c;
	}
}
public class SimpleFactory {

	/**简单工厂模式
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=Factory.getCarInstance("jzkangta");
		if(c!=null){
			c.run();
			c.stop();
		}else{
			System.out.println("造不了这种汽车。。。");
		}
	}

}
