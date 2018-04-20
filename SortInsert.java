public class SortInsert {
    public static void sortInsert(int[] list) {
        //insert list[i] into a sorted sublist list[0...i-1]
        // so that list[0..i] is sorted
        for (int i = 1; i < list.length; i++) {
            int curentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > curentElement; j--) {
                list[j + 1] = list[j];
            }
            //insert the current element into list[j+1]
            list[j + 1] = curentElement;
        }
    }

    public static void main(String[] args) {
        int[] listnumber = {9, 6, 4, 9, 5, 2, 67, 45, 34, 99, 78};
        sortInsert(listnumber);
        for (int i = 0; i < listnumber.length; i++)
            System.out.print(listnumber[i] + " ");
    }
}
