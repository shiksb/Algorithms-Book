public class mergeSort {

	public static void merge(int[] a, int l, int r) {
		int m = (l+r)/2;
		int[] temp = new int[a.length];
		for(int i = l; i <= r; i++) {
			temp[i] = a[i];
		}


		int i = l, j = ((l+r)/2) + 1, k = l;

		while(i <= ((l+r)/2) && j <= r) {
			if(temp[i] <= temp[j]){
				a[k] = temp[i];
				i++;
			} else {
				a[k] = temp[j];
				j++;
			}
			k++;
		}

		while(i <= (l+r)/2) {
			a[k] = temp[i];
			k++;
			i++;
		}
	}

	public static void mergesort(int[] a, int l, int r){
		if(l < r) {
			mergesort(a, l, (l+r)/2);
			mergesort(a, ((l+r)/2) + 1, r);
			merge(a, l, r);
		}
	}

	public static void main(String[] args) {
		int[] array = {5,1,7,2,9,4,6,3,8};
		mergesort(array, 0, array.length - 1);
		for(int i : array)
		System.out.print(i);
		System.out.println();
	}
}