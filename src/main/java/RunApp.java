public class RunApp {
    public static void main(String[] args) {
        ArrPlusArr arr = new ArrPlusArr();

        int[] arr1 = {1,2,3,4,5,6};
        for (int element:arr1
             ) {
            System.out.print(element+" ");
        }
        System.out.println("\n");
        int[] arr2 = {7,8,9,10,11,12};
        for (int element:arr2
        ) {
            System.out.print(element+" ");
        }
        System.out.println("\n");
        int[] newArr = arr.addArr(arr1,arr2);
        for (int b: newArr) {
            System.out.print(b + " ");
        }
    }
}
