/*
You are given two positive integers  a  and  b .
If you write them down next to each other on a piece of paper with no space between them,
you'll get a new number. Return that number. 
*/
public class concatenateNumbersMain {

	public static void main(String[] args) {
		
		concatenateNumbersMain main= new concatenateNumbersMain();
		System.out.println(main.concatenateNumbers(12, 34));
	}
	
	int concatenateNumbers(int a, int b) {


	    String tot = a+""+b;
	    
	    int result = Integer.parseInt(tot);
	    
	    return result;
	}

}
