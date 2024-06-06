public class SearchDriver implements SearchDriverInterface {

    @Override
    public int[] getListOfNumbers() {
        int[] listOfNumbers = new int[10000000];
        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i] = i + 1;
        }
        return listOfNumbers;
    }

    @Override
    public int[] getTargets() {
        int[] targets = {500, 10000, 100000, 1000000, 5000000, 7500000, 10000000};
        return targets;
    }

    @Override
    public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
        LinearSearch linearSearch = new LinearSearch();
        TestTimes testTimes = new TestTimes();

        while (numberOfTimes > 0) {
            long startTime = System.nanoTime();
            linearSearch.search(listOfNumbers, target);
            long endTime = System.nanoTime();
            testTimes.addTestTime(endTime - startTime);

            numberOfTimes--;
        }

        return testTimes;
    }

    @Override
    public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
        BinarySearch binarySearch = new BinarySearch();
        TestTimes testTimes = new TestTimes();

        while (numberOfTimes > 0) {
            long startTime = System.nanoTime();
            binarySearch.search(listOfNumbers, target);
            long endTime = System.nanoTime();
            testTimes.addTestTime(endTime - startTime);

            numberOfTimes--;
        }

        return testTimes;
    }

    public static void main(String[] args) {
        
    }
}
