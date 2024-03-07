class App {
    public static void main(String[] args) {
        int[] myArray = { -100, 2, 23, 24, 30, 288, 944, 1000 };
        int lookFor = 9;
        System.out.println(binarySearch(myArray, lookFor));
        lookFor = 944;
        System.out.println(binarySearch(myArray, lookFor) + "\n\n");

        String[] foodArray = { "apple", "banana", "cake", "carrot", "pecan" };
        String food = "donut";
        System.out.println(binarySearch(foodArray, food));
        food = "apple";
        System.out.println(binarySearch(foodArray, food));
    }

    // Instructions

    // 1. Create a binary search function that takes a sorted array of ints
    // and an int to look for. It should return the index of the element
    // in the array, or -1 if the element is not in the array.

    // 2. Create a binary search function that takes a sorted array of Strings
    // (sorted alphabetically) and a String to look for. It should return the
    // index of the element in the array, or -1 if the element is not in the array.

    public static int binarySearch(int[] arr, int x) {
        // Your code here
        return -1;
    }

    public static int binarySearch(String[] arr, String x) {
        // Your code here
        return -1;
    }
}