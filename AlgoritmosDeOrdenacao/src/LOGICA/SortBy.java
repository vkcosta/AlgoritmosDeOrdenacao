/*
 * Copyright (C) 2018 mgarcia
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package LOGICA;

import static LOGICA.Util.Vetores.imprime;
import javax.swing.JOptionPane;

/**
 * Esta classe contem métodos estáticos para ordenar sequencias numéricas. Os
 * métodos implementam os algoritmos solicitados.
 *
 * @author mgarcia
 */
public class SortBy {

    /**
     * Este método utiliza o algoritmo BubbleSort<br>
     * Utilize este método para ordenar sequências numéricas pequenas na ordem
     * escolhida<br>
     * Complexidade: O(n²)
     *
     * @author Mateus garcia
     * @param nums Array de Inteiros contendo a sequencia numerica a ser
     * ordenada pelo algoritmo Bubble Sort
     */
    public static void BubbleSort(int[] nums) {
        int aux;
        /*posição de memória para um inteiro que será utilizada para
        armazenar o valor temporário entre uma troca e outra. */

        for (int z = 0; z < nums.length; z++) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    //troca as posições dos dois numeros comparados
                    aux = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = aux;
                }
            }
        }
    }

    /**
     * Este método utiliza o algoritmo InsertionSort<br>
     * Utilize este método para ordenar sequências numéricas pequenas em ordem
     * crescente<br>
     * Complexidade: O(n²)
     *
     * @author Mateus garcia
     * @param nums Array de Inteiros contendo a sequencia numerica a ser
     * ordenada
     */
    public static void InsertionSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int aux = nums[i];
            int z = i;

            while ((z > 0) && (nums[z - 1] > aux)) {
                nums[z] = nums[z - 1];
                z--;
            }

            nums[z] = aux;
        }

    }

    /**
     * Este método utiliza o algoritmo SelectionSort<br>
     * Utilize este método para ordenar sequências numéricas pequenas em ordem
     * crescente<br>
     * Complexidade: O(n²)
     *
     * @author Mateus garcia
     * @param nums Array de Inteiros contendo a sequencia numerica a ser
     * ordenada
     */
    public static void SelectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int menorPosicao = i;
            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[j] < nums[menorPosicao]) {
                    menorPosicao = j;
                }
            }
            if (nums[i] != nums[menorPosicao]) {
                int temp = nums[i];
                nums[i] = nums[menorPosicao];
                nums[menorPosicao] = temp;
            }
        }

    }

    /**
     * Algoritmo auxiliar para o MergeSort, ele intercala vetores menores <br>
     * Complexidade: O(log n) (eu acho...)
     *
     * @author Mateus Garcia
     *
     * @param subvetor vetor a ser intercalado
     * @param inicio posição inicial da intercalação
     * @param meio posição central da intercalação
     * @param fim posição final da intercalação
     */
    private static void intercala(int[] subvetor, int inicio, int meio, int fim) {
        int[] aux = new int[fim - inicio + 1];
        int a = inicio;
        int b = meio + 1;
        int h = 0;
        while (a <= meio && b <= fim) {
            if (subvetor[a] < subvetor[b]) {
                aux[h++] = subvetor[a++];
            } else {
                aux[h++] = subvetor[b++];
            }
        }
        while (a <= meio) {
            aux[h++] = subvetor[a++];
        }
        while (b <= fim) {
            aux[h++] = subvetor[b++];
        }
        for (h = 0; h < aux.length; h++) {
            subvetor[inicio++] = aux[h];
        }
    }

    /**
     * Algoritmo MergeSort. Utilize este método para ordenar sequencias
     * numéricas grandes<br>
     * Complexidade: O(n log n)
     *
     * @author Mateus Garcia
     * @param vetor Array de inteiros a ser ordenado
     * @param inicio posição inicial da ordem
     * @param fim posição final da ordem
     */
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        int q = (inicio + fim) / 2;
        if (inicio < fim) {
            mergeSort(vetor, inicio, q);
            mergeSort(vetor, q + 1, fim);
            intercala(vetor, inicio, q, fim);
        }
    }

    public static void main(String[] args) {
        //testes aqui
        int[] x = {9, 6, 2, 8, 7, 1, 0, 3, 4, 5};
        mergeSort(x, 0, 9);
        imprime(x);
    }
}
