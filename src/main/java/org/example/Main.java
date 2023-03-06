package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercicio Listas 1

//        DecimalFormat df = new DecimalFormat("0.00");
//
//        ArrayList<Double> list = new ArrayList<>();
//        ArrayList<String> meses = new ArrayList<>();
//
//        list.add(33.71);
//        list.add(30.24);
//        list.add(29.43);
//        list.add(27.31);
//        list.add(32.19);
//        list.add(29.95);
//
//        meses.add("Janeiro");
//        meses.add("Fevereiro");
//        meses.add("Março");
//        meses.add("Abril");
//        meses.add("Maio");
//        meses.add("Junho");
//
//        System.out.println(list);
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//
//        double somaTemp = list.stream().mapToDouble(Double::doubleValue).sum();
//        double media = somaTemp / list.size();
//
//        System.out.println(df.format(somaTemp));
//        System.out.println(df.format(media));
//
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) > media){
//                System.out.println("No mês de " + meses.get(i) + " tivemos uma temperatura maior que a média dos seis meses.");
//            }
//        }


        // Exercícios Listas 2

        Scanner sc = new Scanner(System.in);

        int count = 0;
        String str = "";

        // Primeira pergunta

        System.out.println("Responda apenas com s ou n");
        System.out.println("Telefonou para a vítima?");

        str = sc.nextLine();

        if(str.compareTo("s") == 0){
            count += 1;
        }
        str = "";

        // Segunda Pergunta

        System.out.println("Esteve no local do crime?");

        str = sc.nextLine();

        if(str.compareTo("s") == 0){
            count += 1;
        }
        str = "";

        // Terceira Pergunta

        System.out.println("Mora perto da vítima?");

        str = sc.nextLine();

        if(str.compareTo("s") == 0){
            count += 1;
        }
        str = "";

        // Quarta pergunta

        System.out.println("Devia para a vítima?");

        str = sc.nextLine();

        if(str.compareTo("s") == 0){
            count += 1;
        }
        str = "";

        // Quinta pergunta

        System.out.println("Já trabalhou com a vítima?");

        str = sc.nextLine();

        if(str.compareTo("s") == 0){
            count += 1;
        }
        str = "";

        System.out.println(count);

        if(count > 1 && count < 3) {
            System.out.println("A pessoa é Suspeita");
        }else if(count > 2 && count < 5){
            System.out.println("A pessoa é Cúmplice");
        }else if(count == 5){
            System.out.println("A pessoa é Assassina");
        }else{
            System.out.println("A pessoa é inocente");
        }

    }
}