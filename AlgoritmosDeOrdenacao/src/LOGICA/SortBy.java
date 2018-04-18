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
     * Utilize este método para ordenar sequências numéricas pequenas
     * Complexidade: O(n²)
     *
     * @author Mateus garcia
     * @param nums Array de Inteiros contendo a sequencia numerica a ser
     * ordenada pelo algoritmo Bubble Sort
     * @param quant quantidade de numeros a ser ordenada. esta quantidade
     * representa o pedaço do vetor que este algoritmo irá processar
     */
    public static void BubbleSort(int[] nums, int quant) {
        int aux;
        /*posição de memória para um inteiro que será utilizada para
        armazenar o valor temporário entre uma troca e outra. */
        int tamanho = 0; // tamanho do pedaço de vetor a ser organizado

        //esta verificação define o pedaço do vetor a ser ordenado
        if (quant == 0) {
            tamanho = nums.length;
        } else if (quant > 0 && quant <= nums.length) {
            tamanho = quant;
        } else {
            System.out.println("BubleSort: Valor invalido para a quantidade");
            System.exit(1);
        }

        for (int z = 0; z < tamanho; z++) {
            for (int i = 1; i < tamanho; i++) {
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
     * @param quant quantidade de numeros a ser ordenada. esta quantidade
     * representa o pedaço do vetor que este algoritmo irá processar
     */
    public static void InsertionSort(int[] nums, int quant) {

        int tamanho = 0; // tamanho do pedaço de vetor a ser organizado
        //esta verificação define o pedaço do vetor a ser ordenado
        if (quant == 0) {
            tamanho = nums.length;
        } else if (quant > 0 && quant <= nums.length) {
            tamanho = quant;
        } else {
            System.out.println("BubleSort: Valor invalido para a quantidade");
            System.exit(1);
        }

        for (int i = 1; i < tamanho; i++) {
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
     * @param quant quantidade de numeros a ser ordenada. esta quantidade
     * representa o pedaço do vetor que este algoritmo irá processar
     */
    public static void SelectionSort(int[] nums, int quant) {

        int tamanho = 0; // tamanho do pedaço de vetor a ser organizado
        //esta verificação define o pedaço do vetor a ser ordenado
        if (quant == 0) {
            tamanho = nums.length;
        } else if (quant > 0 && quant <= nums.length) {
            tamanho = quant;
        } else {
            System.out.println("BubleSort: Valor invalido para a quantidade");
            System.exit(1);
        }

        for (int i = 0; i < tamanho; i++) {
            int menorPosicao = i;
            for (int j = (i + 1); j < tamanho; j++) {
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
    public static void MergeSort(int[] vetor, int inicio, int fim) {
        int q = (inicio + fim) / 2;
        if (inicio < fim) {
            MergeSort(vetor, inicio, q);
            MergeSort(vetor, q + 1, fim);
            intercala(vetor, inicio, q, fim);
        }
    }

    /**
     * Algoritmo auxiliar do QuickSort, responsável por fazer as quebras do
     * vetor em partes menores
     *
     * @author Mateus Garcia
     * @param vetor array de inteiros a ser dividido
     * @param cantoEsquerdo posição da extrema esquerda, onde tudo começara.
     * geralmente é 0.
     * @param cantoDireito posição da extrema direita (#Bolsonaro2018!) onde
     * tudo termina (profético...)
     * @return devolve um inteiro representando a posição do indice
     */
    public static int quebrar(int[] vetor, int cantoEsquerdo, int cantoDireito) {

        int i = cantoEsquerdo, j = cantoDireito;

        int aux;

        int pivo = vetor[(cantoEsquerdo + cantoDireito) / 2];

        while (i <= j) {

            while (vetor[i] < pivo) {
                i++;
            }

            while (vetor[j] > pivo) {
                j--;
            }

            if (i <= j) {

                aux = vetor[i];

                vetor[i] = vetor[j];

                vetor[j] = aux;

                i++;

                j--;

            }

        }

        return i;

    }

    /**
     * Algoritmo QuickSort, geralmente o melhor para a maioria dos casos. <br>
     * Complexidade: O(n log n)
     *
     * @author Mateus Garcia
     * @param vetor array de inteiros a ser ordenado
     * @param cantoEsquerdo posição da extrema esquerda, onde tudo começara.
     * geralmente é 0.
     * @param cantoDireito posição da extrema direita (#Bolsonaro2018!) onde
     * tudo termina (profético...)
     */
    public static void QuickSort(int[] vetor, int cantoEsquerdo, int cantoDireito) {

        int indice = quebrar(vetor, cantoEsquerdo, cantoDireito);

        if (cantoEsquerdo < indice - 1) {
            QuickSort(vetor, cantoEsquerdo, indice - 1);
        }

        if (indice < cantoDireito) {
            QuickSort(vetor, indice, cantoDireito);
        }

    }

    /**
     * O algoritmo HeapSort foi um dos mais complexos para ser compreendido e
     * contém partes adaptadas de outras fontes na internet <br>
     * Complexidade: O(n log n)
     *
     * @param vetor Array de inteiros a ser ordenado
     * @param quant quantidade de numeros a ser ordenada. esta quantidade
     * representa o pedaço do vetor que este algoritmo irá processar
     */
    public static void HeapSort(int[] vetor, int quant) {
        //adaptação para a quantidade a ser ordenada
        int tamanho = vetor.length;
        if (quant == 0) {
            tamanho = vetor.length;
        } else if (quant < 0 || quant > vetor.length) {
            System.out.println("HeapSort: Quantidade invalida");
            JOptionPane.showMessageDialog(null, "HeapSort: Quantidade invalida");
        } else {
            tamanho = quant;
        }

        // constroi a pilha remanejando o array
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            empilha(vetor, tamanho, i);
        }

        // pega um elemento da pilha um por um
        for (int i = tamanho - 1; i >= 0; i--) {
            // move a raiz para o final
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            empilha(vetor, i, 0);
        }
    }

    /**
     * Método auxiliar do Heap Sort
     */
    private static void empilha(int[] subvetor, int n, int i) {
        int maior = i;  // inicializa o maior como a raiz da arvore
        int l = 2 * i + 1;  // esquerda = 2*i + 1
        int r = 2 * i + 2;  // direita = 2*i + 2

        // se o filho da esquerda for maior que a raiz
        if (l < n && subvetor[l] > subvetor[maior]) {
            maior = l;
        }

        // se o filho da direita for maior do que o maior atual
        if (r < n && subvetor[r] > subvetor[maior]) {
            maior = r;
        }

        // se o maior nao é a raiz
        if (maior != i) {
            int swap = subvetor[i];
            subvetor[i] = subvetor[maior];
            subvetor[maior] = swap;

            //empilha recursivamente a sub-arvore afetada
            empilha(subvetor, n, maior);
        }
    }

    /**
     * Counting Sort, assim como o HeapSort foi um dos mais complexos para ser
     * compreendido e contém partes adaptadas de outras fontes na internet <br>
     * Não consegui adaptar uma quantidade a ser organizada como nos outros
     * algoritmos sem causar prejuizos ao desempenho, portanto o método só está
     * trabalhando em modo FULL <br>
     * Complexidade: O(n+k)
     *
     * @param vetor sequencia a ser ordenada
     * @return retorna um novo vetor com os dados já ordenados
     */
    public static int[] CountingSort(int[] vetor) {

        //os dados serão ordenados neste vetor auxiliar, 
        //que será devolvido como resultado do algoritmo
        int[] aux = new int[vetor.length];

        // encontra o menor e o maior valor
        int min = vetor[0];
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            } else if (vetor[i] > max) {
                max = vetor[i];
            }
        }

        // monta o vetor das frequências
        int[] frequencias = new int[max - min + 1];

        // inicializa ele
        for (int i = 0; i < vetor.length; i++) {
            frequencias[vetor[i] - min]++;
        }

        // recalcula o vetor - cria o vetor de ocorrencias
        frequencias[0]--;
        for (int i = 1; i < frequencias.length; i++) {
            frequencias[i] = frequencias[i] + frequencias[i - 1];
        }

        //ordena o vetor da direita pra esquerda
        for (int i = vetor.length - 1; i >= 0; i--) {
            aux[frequencias[vetor[i] - min]--] = vetor[i];
        }

        return aux;
    }
}
