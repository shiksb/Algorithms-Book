public class strassenMatrix {

	public int[][] mult(int[][] a, int[][] b, int i, int j) {
		int len = a[0].length;
		int[][] c = new int[len][len];
		if(len == 1){
			return a[0][0]*b[0][0];
		}
		else {
			
		}

	}



	public static void main(String[] args) {
		int[][] a = {
			{1,2},
			{3,4}
		};
		int[][] b = {
			{5,6},
			{7,8}
		};
		int[][] c = mult(a,b);
	}
}