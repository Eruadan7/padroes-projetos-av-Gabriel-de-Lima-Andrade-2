public class teste {
    public static void main(String[] args) {
        iFabricaMatricula fabrica1 = new FabricaBr();
        Consumidor.consumir(fabrica1, 500.00);

        iFabricaMatricula fabrica2 = new FabricaChile();
        Consumidor.consumir(fabrica2, 400.00);
    }
}
