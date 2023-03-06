package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> meses = new ArrayList<>();

        list.add(33.71);
        list.add(30.24);
        list.add(29.43);
        list.add(27.31);
        list.add(32.19);
        list.add(29.95);

        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        double somaTemp = list.stream().mapToDouble(Double::doubleValue).sum();
        double media = somaTemp / list.size();

        System.out.println(df.format(somaTemp));
        System.out.println(df.format(media));

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > media){
                System.out.println("No mês de " + meses.get(i) + " tivemos uma temperatura maior que a média dos seis meses.");
            }
        }
    }
}