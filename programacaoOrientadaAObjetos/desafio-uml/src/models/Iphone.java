package models;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private String numeroSerie;
    private String modelo;
    private int anoLancamento;

    public Iphone(String numeroSerie, String modelo, int anoLancamento) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo pagina " + pagina + "...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + "...");
    }
}
