public class App {
    public static void main(String[] args) throws Exception {
        double resultado = 30;
        for(int i = 29 ; i>=1; i--){
            System.out.println(resultado+ " x "+i+"="+(resultado*i));
            resultado=resultado*i;
        }
        System.out.println("FATORIAL DE 30: "+resultado);
        System.out.println("==========FIM DO PROGRAMA==========");
    }
}
