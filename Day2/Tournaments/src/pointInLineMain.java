// Check if the given point belongs to the given line.

public class pointInLineMain {

	public static void main(String[] args) {
		pointInLineMain main = new pointInLineMain();
		int[] point = {1,0};
		int[] line = {1,1,0};
		System.out.println(main.pointInLine(point, line));

	}
	
	boolean pointInLine(int[] point, int[] line) {
	    
	    int calculate = point[0]*line[0] + point[1]*line[1] + line[2];
	    
	    if(calculate == 0){
	        return true;
	    } else {
	        return false;
	    }

	}

}
