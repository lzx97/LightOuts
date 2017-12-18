
public class Matrix {
	protected final int M;
	protected final int N;
	protected final int[][] matrix;
	
	public Matrix() {
		M = 0;
		N = 0;
		matrix = null;
	}
	
	public Matrix(int M, int N) {
		this.M = M;
		this.N = N;
		this.matrix = new int[M][N];
	}
	
	public Matrix(int[][] data) {
		M = data.length;
		N = data[0].length;
		matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = data[i][j];
			}
		}
	}
	
	public static Matrix random(int M, int N) {
		Matrix result = new Matrix(M, N);
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				result.matrix[i][j] = Math.round((float)Math.random());
			}
		}
		return result;
	}
	
	public Matrix plus(Matrix other) {
		if (this.M != other.M || this.N != other.N) {
			throw new IllegalArgumentException("Illegal dimension for adding");
		}
		
		Matrix result = new Matrix(M, N);
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
			}
		}
		return result;
	}
	
	public Matrix minus(Matrix other) {
		if (this.M != other.M || this.N != other.N) {
			throw new IllegalArgumentException("Illegal dimension for substracting");
		}
		
		Matrix result = new Matrix(M, N);
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				result.matrix[i][j] = this.matrix[i][j] - other.matrix[i][j];
			}
		}
		return result;
	}
	
	public Matrix times(Matrix other) {
		if (this.N != other.M) {
			throw new IllegalArgumentException("Illegal dimentsion for multiplying");
		}
		
		Matrix result = new Matrix(this.M, other.N);
		for (int i = 0; i < result.M; i++) {
			for (int j = 0; j < result.N; j++) {
				for (int k = 0; k < this.N; k++) {
					result.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
				}
			}
		}
		return result;
	}
	
	public boolean equals(Matrix other) {
		if (this.M != other.M || this.N != other.N) {
			return false;
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (this.matrix[i][j] != other.matrix[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void print() {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
