package chapter03;

public class Question9B {

	public static void main(String[] args) {
		int count = 0;

		BUNNY: for (int row = 1; row <= 3; row++)
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0)
					//continue BUNNY; 
					break;
				count++;
			}
		System.out.println(count); //9
	}
	
	// count    row      col  (col+row)
	//     0      1        0         1
	//     1
	//                     1         2      
	
	//     ************************************
	//     1      2        0         2  
	//     *************************************
	//     1      3        0         3
	//     2
	//                     1         4   
    //     *************************************
	//            4
	
	
}