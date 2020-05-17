/**
 * 演示运行时异常
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {34, 12, 67};
        int num = ArrayTools.getElement(arr, 4);
        System.out.println("num=" + num);
        System.out.println("over");
    }
}
 class ArrayTools {
     //对给定的数组通过给定的角标获取元素。
     public static int getElement(int[] arr, int index) {
         int element = arr[index];
         return element;
     }
 }
