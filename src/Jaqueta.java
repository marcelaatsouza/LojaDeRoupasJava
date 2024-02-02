public class Jaqueta extends Vestuario{
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Jaqueta(){

    }

    public Jaqueta(String t){

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