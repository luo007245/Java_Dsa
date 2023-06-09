public class RightRotate_Array {

    public static void rotateArray(int[] arr)
    {
        int lastElement = arr[arr.length-1];
        for(int i = arr.length -1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }
    // rotate arays ensd

    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 1 , 8,  4, };
        System
        .out.print("Arrys before rotation ");

        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");    
        }
        System.out.println();

        rotateArray(arr);

        System.out.print("Arrys after rotation ");
        for(int i= 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

}
