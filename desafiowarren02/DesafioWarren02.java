package desafiowarren02;

import java.util.Scanner;

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
