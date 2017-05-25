/*
Given a positive integer  n , calculate the following
sum:  n + n/2 + n/4 + n/8 + ... . All divisions are integer.
 */
public class halvingSumMain {

	public static void main(String[] args) {
		
		halvingSumMain main = new halvingSumMain();
		System.out.println(main.halvingSum(25));
		

	}
	
	int halvingSum(int n) {

		int result = n;
		
		for(int i=1; i < n; i++){
			i = i*2;  //  i 값이 1->2 , 3 -> 6,  7 -> 14 가 되므로 for문 마지막에 i--를 해줌.
			result = result + n/i;
			System.out.print("i : " + i + " ");
			System.out.println("r : " + result);
			i--;
		}
		
		return result;
	}

/*	다른 사람의 소스.
// while문을 이용하면 for문 안에 i값을 다룰 필요가 없기에 더 편했다는 것을 확인.

	int halvingSum(int n) {
	    
	    int sum = 0;
	    
	    while(n!=0){
	        sum=sum+n;
	        n=n/2;
	    }
	    
	    return sum;

	}
*/
}
