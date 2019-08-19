/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoeletricojava;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kaiphe
 */
public class ConsumoEletricoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qtd, i, conces;
        String conces_str;
        double potencia, tempo, Eel, custo, tensao, valconces, amperes;

        Scanner sc = new Scanner(System.in);

        potencia = 0;
        tempo = 0;
        
        System.out.println("===========================================================");
        System.out.println("                Dimencionamento de Carga Elétrica Thiago ");
        System.out.println("===========================================================");


        System.out.println("Informe a quantidade de aparelhos");
        qtd = Integer.parseInt(sc.nextLine());

        for(i = 1; i <=qtd ; i++){
            System.out.println("Informe o valor da potência do aparelho - watts");
            potencia = Integer.parseInt(sc.nextLine());;
            System.out.println("Informe o tempo de uso do aparelho - minutos");
            tempo = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Informe a concessionária de energia elétrica - ( 1 - Ligth; 2 - Ampla)");
        conces = Integer.parseInt(sc.nextLine());

        System.out.println("Concessionária escolhida: " + conces);
        System.out.println("");
        System.out.println("Informe a tensão da sua área - 110 ou 220 Volts");
        tensao = Integer.parseInt(sc.nextLine());

        tempo = tempo/60;
        potencia = (potencia)*(0.001);
        Eel = potencia * tempo;
        
        if (conces == 1){
             conces_str = "Ligth";
             valconces  = 0.30;
             custo = Eel*valconces*30;
        }else{
             conces_str = "Ampla";
             valconces = 0.50;
             custo = Eel*valconces*30;
             System.out.println(custo);
        }

        amperes = potencia/tensao;
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======================= RESULTADO =======================");
        System.out.println("Potência em Kwats:");
        System.out.println(potencia);
        System.out.println("Para a concessionária:");
        System.out.println(conces_str);
        System.out.println("O valor do custo mensal:");
        System.out.println("R$: " + custo);
        System.out.println("O consumo mensal: ");
        System.out.println(custo + "Kw/h");
        System.out.println("O calculo de corrente da rede: ");
        System.out.println(i + " Amperes");
        System.out.println("Utilize um disjuntor com valor superior ao de tensão da rede");
        System.out.println("no mínimo de :");
        System.out.println(amperes+1 + " Amperes");
        System.out.println("=========================================================");

        sc.close();

    }
    
}




    	
		


		

