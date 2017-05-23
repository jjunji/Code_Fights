// You are given a two-digit integer  n . Return the sum of its digits.

public class addTwoDigitsMain {

	public static void main(String[] args) {

		addTwoDigitsMain main = new addTwoDigitsMain();
		System.out.println(main.addTwoDigits(29));

	}
	
	int addTwoDigits(int n) {
	    
	    String num_t = n + "";
	    String[] a = num_t.split("");
	    int result = 0;
	    
	    for(int i=0; i<2; i++){
	        result += Integer.parseInt(a[i]);
	    }
	    return result;
	}

}
