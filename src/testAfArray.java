public class testAfArray {
    public static void main(String[] args) {
        int[] testArray = {0,4,5,6,91,5,4};

        for (int i = 0; i < testArray.length; i++) {
            for (int j = i+1; j < testArray.length; j++) {
                if (testArray[i]<testArray[j]) {
                    testArray[0] = testArray[j];
                }
            }
        }

        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i]+" ");
        }
    }
}
