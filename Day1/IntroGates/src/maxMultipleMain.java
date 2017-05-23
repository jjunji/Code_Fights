/*
Given a  divisor  and a  bound , find the largest integer  N  such that:
N  is divisible by  divisor .
N  is less than or equal to  bound .
N  is greater than  0 .
 */
public class maxMultipleMain {

	public static void main(String[] args) {
		maxMultipleMain main = new maxMultipleMain();
		System.out.println(main.maxMultiple(3, 10));

	}

	int maxMultiple(int divisor, int bound) {

	    int result = 0;
	    
	    int tmp = bound / divisor;
	    
	    result = divisor * tmp;
	    
	    return result;
	}
}
