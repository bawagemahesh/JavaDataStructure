public class BinerySearch {
    public static void main(String[] args) {
        int[] arry = {5, 6, 7, 8, 9, 11, 13, 14, 15, 16};
        System.out.println(implementBinerySearch(arry, 16));
    }

    static int implementBinerySearch(int[] sortedArrey, int e) {

        int[] arry = sortedArrey;
        int l = arry.length;
        int lowIndex = 0;
        int upperIndex = l;

        while (lowIndex <= upperIndex) {
            int mid = lowIndex + (upperIndex - 1) / 2;
            if (arry[mid] == e) {
                return mid;
            }
            if (arry[mid] < e) {
                lowIndex = mid + 1;
            } else {
                upperIndex = mid - 1;
            }
        }
        return 0;
    }
}
