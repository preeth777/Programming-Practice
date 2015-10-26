package arrays.example;

public class LocateAndSort {

	public static void main(String[] args) {
		
				
	}

		void sortByOneSwap(int arr[], int n)
		{
		    // Travers the given array from rightmost side
		    for (int i = n-1; i > 0; i--)
		    {
		        // Check if arr[i] is not in order
		        if (arr[i] < arr[i-1])
		        {
		            // Find the other element to be
		            // swapped with arr[i]
		            int j = i-1;
		            while (j>=0 && arr[i] < arr[j])
		                j--;
		 
		            // Swap the pair
		            swap(arr[i], arr[j+1]);
		            break;
		        }
		    }

	}

		private void swap(int i, int j) {
			// TODO Auto-generated method stub
			
		}

}
