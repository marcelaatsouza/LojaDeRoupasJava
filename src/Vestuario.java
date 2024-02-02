public abstract class Vestuario{
    private String nome;
    private String cor;
    private float valor;
    private String fabricante;
    private int estoque;
    private int vendas;
    private int codigo;
    private String lote;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Vestuario(){

    }

    public Vestuario(String n, String c, float vl, String f, int e, int v, int cdg, String l){

    }

    public String toString() {
        return "Vestuario [nome=" + nome + ", cor=" + cor + ", valor=" + valor + ", fabricante=" + fabricante
                + ", estoque=" + estoque + ", vendas=" + vendas + ", codigo=" + codigo + ", lote=" + lote + "]";
    }
}