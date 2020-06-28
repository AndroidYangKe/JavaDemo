public class FindNumberDemo {

    public static void main(String[] args) {
        int[] ary = {};

        int index = binarySearch(ary, 1);
        System.out.println("index---->" + index);
    }

    /**
     * 二分法查找，必须基于有序数组
     * @return 待查找数据下标
     */
    public static int binarySearch(int[] arys, int num) {
        int rightIndex = arys == null ? -1 : arys.length - 1;
        int leftIndex = 0;

        while(leftIndex <= rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            if(arys[mid] == num) {
                return mid;
            } else if(arys[leftIndex] < num) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid -1;
            }
        }
        return -1;
    }

}