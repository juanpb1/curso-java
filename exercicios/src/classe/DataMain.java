package classe;

public class DataMain {
    public static void main(String[] args){
        Data data1 = new Data();
        Data data2 =  new Data();
        Data data3 = new Data();

        data1.dia = 26;
        data1.mes = 03;
        data1.ano = 2056;
        System.out.println(data1.obterDataFormatada());

        data2.dia = 13;
        data2.mes = 11;
        data2.ano = 2015;
        System.out.println(data2.obterDataFormatada());

        System.out.println(data3.obterDataFormatada());
        
    }
}
