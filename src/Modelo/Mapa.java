package Modelo;

public abstract class Mapa {
    private final String[][] espacos;
    public Mapa(int altura, int largura, int pontoInicialX, int pontoInicialY){
        this.espacos = new String[largura][altura];
    }
    public boolean espacoLivre(int x, int y){
        return espacos[x][y] == "vazio";
    }

    public abstract void preencherMapa();

    public String getEspaco(int x, int y){
        return espacos[x][y];
    }

    public void setEspaco(int x, int y, String conteudo){
        espacos[x][y] = conteudo;
    }
}
