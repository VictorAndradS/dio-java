public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Canal atual: "   + smartTv.canal);

        smartTv.mudarCanal(11);
        
        System.out.println("Canal atual: "   + smartTv.canal);
        
        System.out.println("Volume atual: "  + smartTv.volume);

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Volume atual: "  + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);


        smartTv.desligar();
        System.out.println("Novo Status -> Tv desligada ? " + smartTv.ligada);

    }
}
