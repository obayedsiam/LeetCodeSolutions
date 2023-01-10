package Heap;

public class Heapify {

        public int[] numbers = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
//    public int[] numbers = {4, 10, 3, 5, 1};

    public int lastIndex = numbers.length - 1;

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void heapify() {
        int index = 0;
        heapify(index);

    }

    private int findMax(int index) {
        int leftIndex = leftIndex(index);
        int rightIndex = rightIndex(index);

        if (!(isIndexPresent(leftIndex) && isIndexPresent(rightIndex))) return numbers[index];
        else if (isIndexPresent(leftIndex) && !isIndexPresent(rightIndex)) return findMax(leftIndex);
        else return Math.max(numbers[index],Math.max(findMax(leftIndex), findMax(rightIndex)));

    }

    private int getIndex(int number) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }

    private void heapify(int index) {
        while (index <= lastIndex) {
            int maxIndexValue = findMax(index);
            int maxIndex = getIndex(maxIndexValue);
            if (numbers[index] < numbers[maxIndex]) swap(index, maxIndex);
            index++;
        }
        print();
    }


    public void swap(int index, int swapIndex) {
        int temp = numbers[index];
        numbers[index] = numbers[swapIndex];
        numbers[swapIndex] = temp;
    }

    public int leftIndex(int index) {
        int ret = index * 2 + 1;
        return ret;
    }

    public int rightIndex(int index) {
        int ret = index * 2 + 2;
        return ret;
    }


    public boolean isIndexPresent(int index) {
        return index <= lastIndex;
    }


}
