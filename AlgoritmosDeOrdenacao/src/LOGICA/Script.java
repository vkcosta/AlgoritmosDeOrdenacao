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

import LOGICA.Util.Files;

/**
 *
 * @author mgarcia
 */
public class Script extends Thread {

    /**
     * Esta Thread executa os testes e registra os resultados no banco de dados
     *
     * @author Mateus Garcia
     */
    public void run() {
        /*
        ################## INICIO: apontando os arquivos #####################
        Criarei vetores de Strings, nesses vetores, cada posição armazena
        uma string contendo o patch para cada arquivo isolado. cada bateria de 
        testes acessa 11 arquivos diferentes, a quantidade de elementos no 
        arquivo apontado por cada indice é a seguinte:
        
        indice [0] -  100.000 
        indice [1] -  160.000
        indice [2] -  220.000
        indice [3] -  280.000
        indice [4] -  340.000
        indice [5] -  400.000
        indice [6] -  460.000
        indice [7] -  520.000
        indice [8] -  580.000
        indice [9] -  640.000
        indice [10] - 700.000
        
        ######################################################################
         */
        //construindo o vetor para os Aleatorios distintos
        String[] AleatoriosDistintos = new String[11];
        AleatoriosDistintos[0] = "Test-inputs/aleatorios/distintos/ale-dist-100.txt";
        AleatoriosDistintos[1] = "Test-inputs/aleatorios/distintos/ale-dist-160.txt";
        AleatoriosDistintos[2] = "Test-inputs/aleatorios/distintos/ale-dist-220.txt";
        AleatoriosDistintos[3] = "Test-inputs/aleatorios/distintos/ale-dist-280.txt";
        AleatoriosDistintos[4] = "Test-inputs/aleatorios/distintos/ale-dist-340.txt";
        AleatoriosDistintos[5] = "Test-inputs/aleatorios/distintos/ale-dist-400.txt";
        AleatoriosDistintos[6] = "Test-inputs/aleatorios/distintos/ale-dist-460.txt";
        AleatoriosDistintos[7] = "Test-inputs/aleatorios/distintos/ale-dist-520.txt";
        AleatoriosDistintos[8] = "Test-inputs/aleatorios/distintos/ale-dist-580.txt";
        AleatoriosDistintos[9] = "Test-inputs/aleatorios/distintos/ale-dist-640.txt";
        AleatoriosDistintos[10] = "Test-inputs/aleatorios/distintos/ale-dist-700.txt";

        //construindo o vetor para os Crescentes distintos
        String[] CrescentesDistintos = new String[11];
        CrescentesDistintos[0] = "Test-inputs/crescentes/distintos/cre-dist-100.txt";
        CrescentesDistintos[1] = "Test-inputs/crescentes/distintos/cre-dist-160.txt";
        CrescentesDistintos[2] = "Test-inputs/crescentes/distintos/cre-dist-220.txt";
        CrescentesDistintos[3] = "Test-inputs/crescentes/distintos/cre-dist-280.txt";
        CrescentesDistintos[4] = "Test-inputs/crescentes/distintos/cre-dist-340.txt";
        CrescentesDistintos[5] = "Test-inputs/crescentes/distintos/cre-dist-400.txt";
        CrescentesDistintos[6] = "Test-inputs/crescentes/distintos/cre-dist-460.txt";
        CrescentesDistintos[7] = "Test-inputs/crescentes/distintos/cre-dist-520.txt";
        CrescentesDistintos[8] = "Test-inputs/crescentes/distintos/cre-dist-580.txt";
        CrescentesDistintos[9] = "Test-inputs/crescentes/distintos/cre-dist-640.txt";
        CrescentesDistintos[10] = "Test-inputs/crescentes/distintos/cre-dist-700.txt";

        //construindo o vetor para os Decrescentes distintos
        String[] DecrescentesDistintos = new String[11];
        DecrescentesDistintos[0] = "Test-inputs/decrescentes/distintos/dec-dist-100.txt";
        DecrescentesDistintos[1] = "Test-inputs/decrescentes/distintos/dec-dist-160.txt";
        DecrescentesDistintos[2] = "Test-inputs/decrescentes/distintos/dec-dist-220.txt";
        DecrescentesDistintos[3] = "Test-inputs/decrescentes/distintos/dec-dist-280.txt";
        DecrescentesDistintos[4] = "Test-inputs/decrescentes/distintos/dec-dist-340.txt";
        DecrescentesDistintos[5] = "Test-inputs/decrescentes/distintos/dec-dist-400.txt";
        DecrescentesDistintos[6] = "Test-inputs/decrescentes/distintos/dec-dist-460.txt";
        DecrescentesDistintos[7] = "Test-inputs/decrescentes/distintos/dec-dist-520.txt";
        DecrescentesDistintos[8] = "Test-inputs/decrescentes/distintos/dec-dist-580.txt";
        DecrescentesDistintos[9] = "Test-inputs/decrescentes/distintos/dec-dist-640.txt";
        DecrescentesDistintos[10] = "Test-inputs/decrescentes/distintos/dec-dist-700.txt";
        
        
        
        
        
        
        
        

        /*
        ######################## PARTE 1 ########################
        ################ TESTES DO BUBBLE SORT ##################
        
        
         */
    }

}
