public class RepeatedNumber {
    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{1,2,3,4,5,6,7,7,8,8,9,10,11,12,13,31};

        System.out.println("Repeated Elements in the Arrays are: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
