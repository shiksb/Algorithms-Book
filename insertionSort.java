public class insertionSort {

	public static int[] sort(int[] array){
		for(int i = 1; i < array.length; i++) {
			for(int j = i; j > 0; j--) {
				if(array[j] < array[j - 1]){
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = {5,1,7,2,9,4,6,3,8};
		int[] a2 = sort(array);
		for(int i : a2)
		System.out.print(i);
		System.out.println();
	}
}