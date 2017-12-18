
public class Main {

	public static void main(String[] args) {
		int[][] data1 = new int[][] {
			{1, 2, 3}, 
			{4, 5, 6}
		};
		
		int[][] data2 = new int[][] {
			{7, 8},
			{9, 10},
			{11, 12}
		};
		
		Matrix A = new Matrix(data1);
		System.out.println("A: ");
		A.print();
		
		Matrix B = new Matrix(data2);
		System.out.println("B ");
		B.print();
		
		Matrix C = A.times(B);
		System.out.println("C: ");
		C.print();
		
	}
}
