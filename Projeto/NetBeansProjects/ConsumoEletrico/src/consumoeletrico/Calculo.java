package consumoeletrico;

import java.text.DecimalFormat;

public class Calculo {

    int qtd, i, tensao, potencia, tempo, conces;
    double eel, custo, valconces;
    String consec;
    Calculo calculo;
                
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat dec = new DecimalFormat("#,###.00");

    public Calculo(int qtd, int potencia, int tempo, int conces, int tensao) {
        this.qtd = qtd;
        this.potencia = potencia;
        this.tempo = tempo;
        this.conces = conces;
        this.tensao = tensao;
    }

    private void escolha_concessionaria(int conces, String consec) {

        if (conces == 1) {
            consec = "Ligth";
        } else {
            consec = "Ampla";
        }
    }

    //Procedimento que verifica qual é a concessionária elétrica
    //Atribui o valor de gasto para cada concessionária.
    private void calc_concessionaria(int conces, double eel, double custo, double valconces) {

        if (conces == 1) {
            //conces ="Ligth"
            valconces = 0.30;
            custo = (eel * valconces * 30);
        } else {
            //conces ="Ampla"
            valconces = 0.50;
            custo = eel * valconces * 30;
        }
    }

    //Procedimento que utiliza a lei de Ohm i=p/U
    //para fazer o cálculo de corrente total
    //onde i=corrente nominal do circuito
    //potência é a soma das potências do circuito
    //tensao é a soma da tensão nominal da rede;
    private void calc_disjuntor(double i, double potencia, int tensao) {
        i = (potencia) / tensao;
    }

    //Procedimento que calcula os dados usados
    //faz a convesao do tempo de minutos para horas
    //faz a conversão da potência em watts para kwatts
    private void calculo_dados(double tempo, double potencia, double eel, double custo, double valconces, int i, int tensao, String consec) {

        tempo = tempo / 60;
        potencia = (potencia) * (10 ^ -3);

        eel = (potencia * tempo);

        calc_concessionaria(conces, eel, custo, valconces);
        calc_disjuntor(potencia, i, tensao);
    }

    public void imprimir() {

        escolha_concessionaria(conces, consec);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======================= RESULTADO =======================");
        System.out.println("Potência em Kwats:");
        System.out.println(potencia);
        System.out.println("Para a concessionária:");
        System.out.println(consec);
        System.out.println("O valor do custo mensal:");
        System.out.println("R$: " + dec.format(custo));
        System.out.println("O consumo mensal: ");
        System.out.println(dec.format(custo) + "Kw/h");
        System.out.println("O calculo de corrente da rede: ");
        System.out.println(df.format(i) + " Amperes");
        System.out.println("Utilize um disjuntor com valor superior ao de tensão da rede");
        System.out.println("no mínimo de :");
        System.out.println(df.format(i + 1) + " Amperes");
        System.out.println("=========================================================");

    }

}
