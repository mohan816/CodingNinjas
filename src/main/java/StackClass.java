import com.stacks.java.ImplementStackUsingArrays;
import com.stacks.java.StackEmptyException;

public class StackClass {

	public static void main(String[] args) throws StackEmptyException {
		ImplementStackUsingArrays sa = new ImplementStackUsingArrays(0);
		sa.push(10);
		int top = sa.pop();
		System.out.println(top);
		System.out.println(sa.size());
		sa.pop();
		System.out.println(top);

	}

}
