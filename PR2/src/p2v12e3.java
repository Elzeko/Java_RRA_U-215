/*Определить матрицу (двумерный массив) и ее заполнить случайными
значенияами.Построить вектор В, которой возвращает — произведение
положительных элементов в каждом столбце матрицы.*/

public class p2v12e3 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array;
        array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        int temp = 0;
        int m = 1;
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] > 0){
                    temp = array[j][i];
                    m = m * temp;
                }
            }
            System.out.println("Произведение столбца " + (i + 1) + " матрицы:" + m);
            m = 1;
        }
        System.out.println("");
    }
}