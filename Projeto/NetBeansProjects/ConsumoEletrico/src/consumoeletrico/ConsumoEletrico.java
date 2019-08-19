/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoeletrico;
import java.util.Scanner;
public class ConsumoEletrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int qtd, i, tensao, potencia, tempo, conces;
        double eel, custo, valconces;
        String consec;
        Calculo calculo;
        potencia = 0;
        tempo = 0;
        
	    try {
	    
				Scanner sc = new Scanner(System.in);
			
				System.out.println("===========================================================");
				System.out.println("                Dimencionamento de Carga Elétrica");
				System.out.println("===========================================================");
					
				System.out.println("Informe a quantidade de aparelhos");
				
				qtd = sc.nextInt();
				
				i=1;

				for (i=1; i <qtd; i++) {
					System.out.println("Informe o valor da potência do aparelho - watts");
					
					potencia = sc.nextInt();
					System.out.println("Informe o tempo de uso do aparelho - minutos");
					
					tempo = sc.nextInt();
				}

				System.out.println ("Informe a concessionária de energia elétrica - ( 1 - Ligth; 2 - Ampla)");
				conces = sc.nextInt();

				System.out.println ("");
				System.out.println ("Informe a tensão da sua área - 110 ou 220 Volts");
				tensao = sc.nextInt();
	   

			   	calculo = new Calculo (qtd, potencia, tempo, conces, tensao);
			   	calculo.imprimir();
		   

	    } catch (Exception ex) {
	        System.out.println(ex.getMessage());
    		}



    }
    
}
