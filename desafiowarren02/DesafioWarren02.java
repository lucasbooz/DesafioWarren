/*
 * The MIT License
 *
 * Copyright 2022 Lucas Rafael Booz.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package desafiowarren02;

import java.util.Scanner;

/**
 * Desafio Warren 02
 *
 * @author Lucas Rafael Booz
 * @version 1.1
 */
public class DesafioWarren02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alunos = new int[6];
        int limite = 0;
        int atrasos = 0;

        System.out.print("Informe o limite de alunos com atraso: ");
        limite = sc.nextInt();

        for (int i = 1; i < alunos.length; i++) {
            System.out.print("Informe o tempo de chegada do " + i + " aluno: ");
            alunos[i] = sc.nextInt();
            if (alunos[i] > 0) {
                atrasos++;
            }
        }

        if (atrasos > limite) {
            System.out.println("Aula cancelada");
        } else {
            System.out.println("Aula normal");
        }

    }

}
