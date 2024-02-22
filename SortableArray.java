import java.util.Arrays;

class SortableArray {

	private long[] array; // ref to array a
	private int numElements; // number of data items

	public SortableArray(int max) // constructor
	{
		array = new long[max]; // create the array
		numElements = 0; // no items yet
	}

	public void insert(long value) // put element into array
	{
		array[numElements] = value; // insert it
		numElements++; // increment size
	}

	public void display() // displays array contents
	{
		for (int j = 0; j < numElements; j++) // for each element,
			System.out.print(array[j] + " "); // display it
		System.out.println("");
	}

	
	public long median() {
		bubbleSort();
		return array[numElements/2];
	}
	
	public void bubbleSort() {
		int out, in;

		for (out = numElements - 1; out > 1; out--) // outer loop (backward)
			for (in = 0; in < out; in++) // inner loop (forward)
				if (array[in] > array[in + 1]) // out of order?
					swap(in, in + 1); // swap them
	} // end bubbleSort()

	private void swap(int one, int two) {
		long temp = array[one];
		array[one] = array[two];
		array[two] = temp;
	}

	public void insertionSort() {
		int in, out;

		for (out = 1; out < numElements; out++) // out is dividing line
		{
			long temp = array[out]; // remove marked item
			in = out; // start shifts at out
			while (in > 0 && array[in - 1] >= temp) // until one is smaller,
			{
				array[in] = array[in - 1]; // shift item to right
				--in; // go left one position
			}
			array[in] = temp; // insert marked item
		} // end for
	} // end insertionSort()

	public void selectionSort() {
		int out, in, min;

		for (out = 0; out < numElements - 1; out++) // outer loop
		{
			min = out; // minimum
			for (in = out + 1; in < numElements; in++) // inner loop
				if (array[in] < array[min]) // if min greater,
					min = in; // we have a new min
			swap(out, min); // swap them
		} // end for(out)
	} // end selectionSort()
	
	
	public String toString() // get array contents as String
	{
		return  "Capacity: " + array.length +
				"\nElements: " + numElements + 
				"\nContent:" + Arrays.toString(array);
	}
	
	
	public void oddEvenSort() {
		boolean sorted = false;

		while (!sorted) {
			sorted = true;

			// Sorting Odd
			for (int i = 1; i < numElements - 1; i += 2) {
				if (array[i] > array[i + 1]) {
					swap(i, i + 1);
					sorted = false;
				}
			}

			// Sorting Even
			for (int i = 0; i < numElements - 1; i += 2) {
				if (array[i] > array[i + 1]) {
					swap(i, i + 1);
					sorted = false;
				}
			}

		}
	}
	

	

}