/*Дан массив с(п) Переписать в массив х ненулевые элементы
массива сразделенные на 5. (со сжатием. без пустых элементов
внутри). Затем упорядочить методом «выбора и перестановки» по
возрастанию новый массив.*/

public class p2v12e2 {
    public static void main(String[] args) {
        int[] array = {4, 5, 0, 6, 1, 7, 9, 0, 2, 3, 8};
        int[] arrayx;
        int n = 0;
        for (int a : array) {
            if (a != 0) {
                n++;
            }
        }
        arrayx = new int[n];
        n = 0;
        for (int a : array) {
            if (a != 0){
                arrayx[n] = a;
                n++;
            }
        }
        for (int i = 0; i < arrayx.length-1; i++){
            for (int j = i + 1; j < arrayx.length; j++){
                if (arrayx[i] > arrayx[j]){
                    int t = arrayx[i];
                    arrayx[i] = arrayx[j];
                    arrayx[j] = t;
                }
            }

        }
        for (int a : arrayx) {
            System.out.print(a/5);
        }
        System.out.println("");
    }
}