package t2;

class MyClass2<T, V> {
	private T t;
	private V v;
	
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	} 
}

public class Test2 {
	public static void main(String[] args) {
		//MyClass2<String, Integer> mc1= new MyClass2<String, Integer>();   //<> int 안됨 인티져써야함
		MyClass2<String, Integer> mc1= new MyClass2<>();
		//mc1.setT(100);
		mc1.setT("안녕하세요");
		//mc1.setV("안녕");
		mc1.setV(100);
		System.out.println("key : " + mc1.getT() + ", value : " + mc1.getV());
		System.out.println();
		
		MyClass2<Integer, String> mc2= new MyClass2<>();
		mc2.setT(404);
		mc2.setV("Page Not Found(요청한 페이지를 찾을 수 없습니다.)");
		System.out.println("key : " + mc2.getT() + ", value : " + mc2.getV());
		System.out.println();
	}
}
