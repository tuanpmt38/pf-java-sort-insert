public class SortInsertTest {
    public static void sortInsert(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int curentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > curentElement; j--) {
                System.out.println("\nswap \'" +
                        list[j + 1] + "\' index " +
                        (j + 1) + " with \'" +
                        list[j] + "\' index " + j);
                list[j + 1] = list[j];
            }
            list[j + 1] = curentElement;

            System.out.println("\nlist after the " + i + " sort");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int[] listnumber = {9, 6, 4, 9, 5};
        sortInsert(listnumber);
        for (int i = 0; i < listnumber.length; i++)
            System.out.print(listnumber[i] + " ");
    }
}
