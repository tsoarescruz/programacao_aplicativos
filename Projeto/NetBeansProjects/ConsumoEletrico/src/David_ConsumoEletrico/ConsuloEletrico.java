package David_ConsumoEletrico;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsuloEletrico {
    	
    public static void main(String[] args) {

        int qtd, i, tempo, potencia, conces, valor_concesionaria, tensao;
        String conces_str;
        double Eel, custo, valconces;

        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================================");
        System.out.println("                Dimencionamento de Carga Elétrica David");
        System.out.println("===========================================================");


        System.out.println("Informe a quantidade de aparelhos");
        qtd = Integer.parseInt(sc.nextLine());

        for(i = 1; i < qtd ; i++){

            System.out.println("Informe o valor da potência do aparelho - watts");
            potencia = Integer.parseInt(sc.nextLine());;
            System.out.println("Informe o tempo de uso do aparelho - minutos");
            tempo = Integer.parseInt(sc.nextLine());;

            i = i+1;
        }

        System.out.println("Informe a concessionária de energia elétrica - ( 1 - Ligth; 2 - Ampla)");
        conces = Integer.parseInt(sc.nextLine());

        System.out.println("Concessioária escolhida: " + conces);
        System.out.println("");
        System.out.println("Informe a tensão da sua área - 110 ou 220 Volts");
        tensao = sc.nextInt();

        Eel = 0;
        potencia = 0;
        tempo = 0;

        if (conces == 1){
             conces_str = "Ligth";
             valconces  = 0.30;
             custo = Eel*valconces*30;
        }else{
             conces_str = "Ampla";
             valconces = 0.50;
             custo = Eel*valconces*30;
        }

        i = potencia/tensao;

        tempo = tempo/60;
        potencia = (potencia)*(10^-3);

        Eel = potencia*tempo;

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
        System.out.println(i+1 + " Amperes");
        System.out.println("=========================================================");

        sc.close();
    }
}
		


		

