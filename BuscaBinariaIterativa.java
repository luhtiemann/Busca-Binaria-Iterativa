/*int busca_binaria(int dado[], int x, int inf, int sup){
        int meio;
        if (inf>sup)
            return (-1);
        meio=(inf+sup)/2;
        if(x==dado[meio])
            return (meio);
        if(x<dado[meio])
            return busca_binaria(dado, x, inf, meio-1);
        else
            return busca_binaria(dado, x, meio+1, sup);
    }

}*/

class BuscaBinariaIterativa {
    public static int busca_binaria(int[] dado, int x) {
        int inf = 0;
        int sup = dado.length-1;
        int meio;

        while (inf<=sup) {
            meio=(inf+sup)/2;
            if(x==dado[meio])
                return meio; //achou
            if(x<dado[meio])
                sup=meio-1; //esquerda
            else
                inf=meio+1; //direita
        }
        return -1; //nao achou
    }

    public static void main(String[] args) {
        int[] dado = {1,2,3,4,5,6,7,8,9,10};
        int x = 10;
        int resultado = busca_binaria(dado, x);

        if (resultado != -1)
            System.out.println("Posição: " + resultado);
        else
            System.out.println("Não encontrado");

    }
}