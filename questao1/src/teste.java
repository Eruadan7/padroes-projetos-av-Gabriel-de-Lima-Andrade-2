public class teste {
    public static void main(String[] args) {
        iFabricaPassagem fabrica = new FabricaAerea("gabriel", 100.00, true, false);
        Consumidor.consumir(fabrica);

        iFabricaPassagem fabrica2 = new FabricaRodoviaria("gabriel", 500.00, true);
        Consumidor.consumir(fabrica2);

        iFabricaPassagem fabrica3 = new FabricaFerroviaria("gabriel", 300.00, true, true);
        Consumidor.consumir(fabrica3);


    }
}
