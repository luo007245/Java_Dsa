/**
 * ReArrange Positive And Negartive Arrays
 */
public class ReArrangeArrays {
    public static void reArrange(int[]arr)
    {
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j]= temp;
                }
                j++;
            }
        }
    } // end of arrays()

    public static void main(String args[]) {

        int[] arr = {3, 4, -7, 8, -6, -11};
    
        System.out.print("Array before re-arranging: ");
        for(int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");
        System.out.println();

        reArrange(arr);
            System.out.print("Array after rearranging: ");
            for(int i = 0; i < arr.length; i++)
              System.out.print(arr[i] + " ");
          }
        }
        