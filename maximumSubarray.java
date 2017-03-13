public class maximumSubarray {

	public static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b,c));
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int maxCrossing(int[] a, int l, int r) {
		int m = (l + r) / 2;

		int maxSumL = -10;
		int sum = 0;
		for(int i = m; i >= l; i --) {
			sum += a[i];
			if(sum > maxSumL) {
				maxSumL = sum;
			} 
		}
		int maxSumR = -10;
		sum = 0;
		for(int i = m + 1; i <= r; i ++) {
			sum += a[i];
			if(sum > maxSumR) {
				maxSumR = sum;
			} 
		}		
		return maxSumL + maxSumR;
	}

	public static int maxSub(int[] a, int l, int r) {
		if(l == r) {
			return a[l];
		} else {
			int m = (l + r)/ 2;
			return max( maxSub(a, l, m),
						maxSub(a, m + 1, r),
						maxCrossing(a, l, r)
				);
		}
	}

	public static void main(String[] args) {
		int[] arr = {13,-3,-25,-20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		System.out.println(maxSub(arr, 0, arr.length - 1));
	}
}