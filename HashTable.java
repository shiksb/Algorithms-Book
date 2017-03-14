public class HashTable<T> {

	private static final int TABLE_SIZE = 101;
	private List<T>[] theLists;
	private int currentSize;

	private void rehash() {
		
	}

	private int myhash(T x) {
		int hashVal = x.hashCode();
		hashVal %= theLists.length;
		if( hashVal < 0 ) {
			hashVal += theLists.length;
		}
		return hashVal;
	}

	private static int nextPrime(int n) {
		return 0;
	}

	private static boolean isPrime(int n) {
		return false;
	}


	public HashTable() {
		this(TABLE_SIZE);
	}

	public HashTable(int size) {
		for(int i = 0; i < theLists.length; i++) {
			theLists[i] = new LinkedList<>();
		}
	}

	public void insert(T x) {
		List<T> whichList = theLists[myhash(x)];
		if(!whichList.contains(x)) {
			whichList.add(x);
			if(++currentSize > theLists.length) {
				rehash();
			}
		}
	}

	public void remove(T x) {
		List<T> whichList = theLists[myhash(x)];
		if(whichList.contains(x)) {
			whichList.remove(x);
			currentSize--;
		}
	}

	public boolean contains(T x) {
		List<T> whichList = theLists[myhash(x)];
		return whichList.contains(x);
	}

	public void makeEmpty() {
		for(int i = 0; i < theLists.length; i++) {
			theLists[i].clear();
		}
		currentSize = 0;
	}

}