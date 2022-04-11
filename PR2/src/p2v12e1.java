/*Найти максимальный элемент в одномерном массиве х. Затем
каждый элемент в массиве разделить на максимальный элемент.*/

public class p2v12e1 {
    public static void main(String[] args) {
        int max = -100;
        int[] array = {1, 4, 7, 4, 8, 9, 6};
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        for (float a : array) {
            System.out.println(a / max);
        }
    }
}
