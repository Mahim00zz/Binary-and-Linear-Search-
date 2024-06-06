class LinearSearch  {
    
    public int search(int[] input, int number) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == number) { 
                return i;
            }
        }
        return -1; 
    }
}
