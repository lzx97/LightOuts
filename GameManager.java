
public class GameManager {
	private Matrix matrix;
	
	public GameManager(String direction, int M, int N) {
		
		if (direction.equals("empty")) {
			matrix = new Matrix();
		}
		else if (direction.equals("random")) {
			matrix = Matrix.random(M, N);
		}
	}
	
	public void toggle (int M, int N) {
		if (matrix.M <= M || matrix.N <= N) {
			throw new RuntimeException();
		}
		
		Matrix toggleMatrix = generateToggleMatrix(M, N);
		for (int i = 0; i < matrix.M; i++) {
			for (int j = 0; j < matrix.N; j++) {
				matrix = matrix.plus(toggleMatrix);
				matrix.matrix[i][j] = matrix.matrix[i][j] % 2;
			}
		}
	}
	
	private Matrix generateToggleMatrix(int M, int N) {
		return null;
	}
}
