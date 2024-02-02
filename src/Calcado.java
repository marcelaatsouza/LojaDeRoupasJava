public class Calcado extends Vestuario{
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Calcado(){

    }

    public Calcado(String t){

    }

    @Override
    public String toString() {
        String mostraDados = "***********************************************";
        mostraDados += "\nNome: "+getNome();
        mostraDados += "\nCor: "+getCor();
        mostraDados += "\nTamanho: "+getTamanho();
        mostraDados += "\nValor: "+getValor();
        mostraDados += "\nFabricante: "+getFabricante();
        mostraDados += "\nEstoque: "+getEstoque();
        mostraDados += "\nVendas: "+getVendas();
        mostraDados += "\nCódigo: "+getCodigo();
        mostraDados += "\nLote: "+getLote();
        mostraDados += "\n***********************************************";
        
        return mostraDados;
    }

}
