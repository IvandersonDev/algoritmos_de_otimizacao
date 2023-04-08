package Model;

public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particiona(arr, inicio, fim);
            quickSort(arr, inicio, posicaoPivo - 1);
            quickSort(arr, posicaoPivo + 1, fim);
        }
    }

    private static int particiona(int[] arr, int inicio, int fim) {
        int pivo = arr[inicio];
        int i = inicio + 1;
        int j = fim;

        while (i <= j) {
            if (arr[i] <= pivo) {
                i++;
            } else if (arr[j] > pivo) {
                j--;
            } else {
                troca(arr, i, j);
                i++;
                j--;
            }
        }

        troca(arr, inicio, j);
        return j;
    }

    private static void troca(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

