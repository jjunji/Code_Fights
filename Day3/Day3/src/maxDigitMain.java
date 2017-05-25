
public class maxDigitMain {

	public static void main(String[] args) {
		
		maxDigitMain main = new maxDigitMain();
		System.out.println(main.maxDigit(132));
	}
	
	int maxDigit(int n) {
		int result = 0;
		String num_t = n + "";  // 1, 3, 2 
		String[] a = num_t.split("");

		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++){
			b[i] = Integer.parseInt(a[i]);
		}
		for(int i=0; i<b.length-1; i++){
			if(b[i] >= b[i+1]){
				result = b[i];
			}
		}
					
		return result;
	}
	
/*	Arrays.sort 함수 : 입력된 배열을 오름차순으로 정렬
 
	int maxDigit(int n) {
		    
		    String given = n+"";
		    int length = given.length();
		    int[] saving = new int[length];
		    for(int i=0; i<length; i++){
		        saving[i] = Integer.parseInt(given.charAt(i)+ "");
		    }
		    Arrays.sort(saving);
		 
		    
		    return saving[length-1];
	
		}
*/

}
