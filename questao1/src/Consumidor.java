public class Consumidor {
    public static void consumir(iFabricaPassagem fabrica) {
        iPassagem passagem = fabrica.criarPassagem();
        System.out.println("RESUMO:");
        System.out.println(passagem.getResumo());
    }
}
