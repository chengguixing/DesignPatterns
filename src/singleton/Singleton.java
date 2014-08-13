package singleton;
class Single{
	private Single(){}
	
	private static final Single s1=new Single();
	public static Single getSingleInstance(){
		return s1;
	}
	public void Say(){
		System.out.println("我开始说话了。。。。");
	}	
}
public class Singleton {

	/**
	 * 单例模式，饿汉模式
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s=Single.getSingleInstance();
		s.Say();
	}
}
