
public class seatsInTheaterMain {

	public static void main(String[] args) {
		seatsInTheaterMain main = new seatsInTheaterMain();
		System.out.println(main.seatsInTheater(16, 11, 5, 3));

	}
	
	int seatsInTheater(int nCols, int nRows, int col, int row) {

	    int result = 0;
	    
	    result = (nRows-row) * (nCols-col+1);
	    
	    return result;
	}


}
