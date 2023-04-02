import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queueSamples(); // FIFO buffer
		//stackSamples(); // FILO buffer
		setSamples();
		//listSamples();
	}

	private static void listSamples() {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		List<Integer> q = new Stack<>();
		
		
		
	}

	private static void setSamples() {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		int[] arr1 = {1,2,3,4,5,6,6,6,6};
		for (int e:arr1) {
			set1.add(e);
		}
		
		int[] arr2 = {4,5,6,7,8,9,10,10,10};
		for (int e:arr2) {
			set2.add(e);
		}
		
		System.out.println(set1);
		System.out.println(set2);
		
		Set<Integer> set3 = new HashSet<>();
		set3.addAll(set1);
		System.out.println(set3);
		set3.addAll(set2);
		System.out.println(set3);
		System.out.println("==================");
		
		set3.clear();
		set3.addAll(set1);
		System.out.println(set3);
		set3.retainAll(set2);
		System.out.println(set3);
		System.out.println("=================");
		
		set3.clear();
		set3.addAll(set1);
		set3.removeAll(set2);
		System.out.println(set3);
		System.out.println("====================");
		
	}

	private static void stackSamples() {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}

	private static void queueSamples() {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}
