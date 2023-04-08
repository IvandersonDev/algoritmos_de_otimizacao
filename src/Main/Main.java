package Main;

import Model.BinarySearch;
import Model.BinaryTree;
import Model.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um array de inteiros para utilizar no algoritmo de busca binária
        int[] arr = {1, 3, 4, 6, 8, 9, 11, 13, 14};

        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo para o usuário digitar o número a ser buscado
        System.out.print("Digite o número que você deseja buscar no array: ");
        int numero = scanner.nextInt();

        // Chamando o método estático da classe BuscaBinaria para realizar a busca
        int posicaoElemento = BinarySearch.busca(arr, numero);

        // Verificando se o elemento foi encontrado
        if (posicaoElemento == -1) {
            System.out.println("O elemento não foi encontrado no array.");
        } else {
            System.out.println("O elemento foi encontrado na posição " + posicaoElemento + " do array.");
        }

        // Criando um array de inteiros para utilizar no algoritmo de ordenação quicksort
        int[] arr2 = {8, 4, 2, 6, 1, 3, 5, 7};

        // Chamando o método estático da classe QuickSort para ordenar o array
        QuickSort.sort(arr2);

        // Imprimindo o array ordenado
        System.out.println("Array ordenado pelo algoritmo quicksort: " + Arrays.toString(arr2));

        // Criando uma árvore binária e inserindo elementos
        BinaryTree arvore = new BinaryTree();
        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(14);
        arvore.inserir(4);
        arvore.inserir(7);
        arvore.inserir(13);

        // Imprimindo a árvore em ordem crescente
        System.out.println("Árvore binária em ordem crescente: " + arvore.emOrdem());
    }

}
