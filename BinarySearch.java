class BinarySearch  {


    public int search(int[] input, int number) {
        int first = 0;
        int last = input.length - 1;
        
        while (first <= last) {
            int middle = (first + last) / 2; 

            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) { 
                return middle;
            } else {
                last = middle - 1;
            }
        }

        return -1; 
    }
}