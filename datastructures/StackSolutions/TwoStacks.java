package datastructures.StackSolutions;

import java.rmi.UnexpectedException;
import java.util.Arrays;
import java.util.Scanner;

class stacks{
		
	    int size; 
	    int top1, top2; 
	    int arr[]; 
	  
	    
	    @Override
		public String toString() {
			return "stacks [arr=" + Arrays.toString(arr) + "]";
		}

		stacks(int n) 
	    { 
	        arr = new int[n]; 
	        size = n; 
	        top1 = -1; 
	        top2 = size; 
	    } 
	  
	    void push1(int x) throws UnexpectedException 
	    { 

	        if (!isFull1()) { 
	            top1++; 
	            arr[top1] = x; 
	        } 
	        else { 
		        throw new UnexpectedException("End of Stack");
	        } 
	    } 
	  
	    void push2(int x) throws UnexpectedException 
	    { 
	        if (!isFull2()) { 
	            top2--; 
	            arr[top2] = x; 
	        } 
	        else { 
		        throw new UnexpectedException("End of Stack");
	        } 
	    } 
	  
 
	    int pop1() throws UnexpectedException 
	    { 
	        if (!isEmpty1()) { 
	            int x = arr[top1]; 
	            arr[top1]=0;
	            top1--; 
	            return x; 
	        } 
	        else { 
		        throw new UnexpectedException("End of Stack");
	        } 
	    } 
	  
	    int pop2() throws UnexpectedException 
	    { 
	        if (!isEmpty2()) { 
	            int x = arr[top2]; 
	            arr[top2]=0;
	            top2++; 
	            return x; 
	        } 
	        else { 
		        throw new UnexpectedException("End of Stack");
	        } 
	    } 
	    public boolean isFull1() {
	    	if(top1 > top2 -1)
	    		return true;
	    	return false;
	    			
	    }
	    public boolean isFull2() {
	    	if(top1 > top2 - 1)
	    		return true;
	    	return false;
	    }
	    public boolean isEmpty1() {
	    	if(top1 < 0)
	    		return true;
			return false;
	    	
	    }
	    public boolean isEmpty2() {
	    	if(top2 > size)
	    		return true;
			return false;
	    	
	    }
	    public void print() {
	    	System.out.println(Arrays.toString(arr));
	    }
	  
}


public class TwoStacks {
	public static void main(String[] args) {
		int num;
		System.out.println("enter the stack size");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		stacks stack = new stacks(num);
		try {
			stack.push1(100);
			stack.push1(200);
			stack.push2(200);
			stack.push2(50);
			stack.print();
			stack.pop2();
			stack.pop1();
			stack.print();
		} catch (UnexpectedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
