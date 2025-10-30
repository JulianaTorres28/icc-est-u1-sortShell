public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {5, 0, 8, 4, 9 , 6, 7, 2, 3};
        View view = new View();
        SortShell sortShell = new SortShell();

        System.out.println("Arreglo Original: ");
        view.printArray(numeros);
        sortShell.sort(numeros, false);
        System.out.println("Ordenado: ");
        view.printArray(numeros);
    }
}
