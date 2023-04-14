package autowired;
import org.springframework.beans.factory.annotation.Autowired;
public class MyClass {
	@Autowired
	public MyDependency myDependency;
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	public MyClass(MyDependency myDependency) {
		this.myDependency = myDependency;
	}
	public void doSomething() {
		System.out.println("hi");
		System.out.println(myDependency.getMessage());
	}
}
