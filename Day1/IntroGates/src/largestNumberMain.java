
public class largestNumberMain {

	public static void main(String[] args) {
		largestNumberMain main = new largestNumberMain();
		System.out.println(main.largestNumber(2));
	}
	
	int largestNumber(int n) {
	    
	    int result = 0;
	    String resultToString = "";
	    
	    for(int i=0; i<n; i++){
	        resultToString += "9";
	    }
	    result = Integer.parseInt(resultToString);
	    
	    return result;
	}

}
