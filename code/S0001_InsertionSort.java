class S0001_InsertionSort {

    void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int k = array[i + 1];
            int j = i - 1;
            while (j >= 0 && k < array[j]) {
                array[j + 1] = array[i];
                j = j - 1;
            }

            array[j + 1] = k;
        }
    }

}