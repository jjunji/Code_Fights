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
			i = i*2;  //  i ���� 1->2 , 3 -> 6,  7 -> 14 �� �ǹǷ� for�� �������� i--�� ����.
			result = result + n/i;
			System.out.print("i : " + i + " ");
			System.out.println("r : " + result);
			i--;
		}
		
		return result;
	}

/*	�ٸ� ����� �ҽ�.
// while���� �̿��ϸ� for�� �ȿ� i���� �ٷ� �ʿ䰡 ���⿡ �� ���ߴٴ� ���� Ȯ��.

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
