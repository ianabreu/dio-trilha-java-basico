
public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        // System.out.println(smartTv.canal);
        // smartTv.aumentarCanal();
        System.out.println(smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);
        smartTv.mudarCanal(51);
        System.out.println(smartTv.canal);
    }
}
