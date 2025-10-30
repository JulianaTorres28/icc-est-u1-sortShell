public class SortShell {

    public SortShell(){
        System.out.println("Metodo Shell");
    }

    public void sort(int[] numeros, boolean asc ){
        int n = numeros.length;
        int comparaciones = 0;
        int cambios = 0;


        for (int gap = n/2 ; gap > 0 ; gap /= 2) {
            //Insercion
            for (int i = gap; i < n; i++) {
                int temp = numeros[i];
                int j = i;
                boolean swap = false;

                while (j >= gap && numeros[j - gap] > temp) {
                    comparaciones++;
                    numeros[j] = numeros[j - gap];
                    j -= gap;
                    cambios++;
                    swap = true;
                }
                

                if (j >= gap) {
                    comparaciones++;
                }

                if (swap) {
                    numeros[j] = temp;
                }
            }
        
        }


        System.out.println("Acciones(comparaciones+cambios)= " + (comparaciones+cambios));
    }
}
