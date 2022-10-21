public class SelectionSort {
    public void selectionsort(int[] array){
        int n = array.length;
        for (int i = 0 ; i < n - 1 ; i++){
            int min_element = i;
            for( int j = i + 1 ; j < n ; j++ ){
                if (array[j] < array[min_element]){
                    min_element = j;               //here is the index of the smallest element found
                }
            }
            int temp = array[min_element];      //save the minimum element to temp
            array[min_element] = array[i];      //get the array[i] to where min element stays
            array[i] = temp;                    //put the minimum element where it belongs

        }

    }

}
