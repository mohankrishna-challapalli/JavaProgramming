
public class ObjectDemo {
		
		static void method() {
			System.out.println("Hello ");
		}
		public void method2() {
			System.out.println("Hello ");
		}
		public static void main(String [] args) {
			method();
			ObjectDemo a=new ObjectDemo();
			a.method2();
		}
		
	}

