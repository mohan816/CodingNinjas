import com.stacks.java.StackUsingArrays;

public class StackClass {

	public static void main(String[] args) {
		StackUsingArrays sa = new StackUsingArrays();
		sa.push(10);
		int top = sa.top();
		System.out.println(top);
		System.out.println(sa.size());
		sa.pop();
		System.out.println(top);

	}

}
