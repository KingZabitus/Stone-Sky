package Controle;
import Modelo.*;
public class Jogador extends Ator {
    private Mapa mapa;
    protected int hp;
    protected int maxHp;
    protected int str;
    protected int dex;
    protected int wis;
    protected int car;
    protected String backstory;

    public Jogador(int x, int y) {
        super(x, y);
        this.hp = 10;
        this.str = 1;
        this.dex = 1;
        this.wis = 1;
        this.car = 1;
        this.maxHp = this.str * 10;
        this.x = 1;
        this.y = 1;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public void moverJogador(String direcao){
        int novoX = x;
        int novoY = y;

        switch (direcao) {
            case "norte" -> novoY--;
            case "sul" -> novoY++;
            case "leste" -> novoX++;
            case "oeste" -> novoX--;
            default -> {
                System.out.println("Direção inválida!");
                return;
            }
        }
        if (mapa != null && mapa.espacoLivre(novoX, novoY)) {
            x = novoX;
            y = novoY;
        } else {
            assert mapa != null;
            System.out.println("Não é possível mover-se para esse espaço. Ele está por " + mapa.getEspaco(novoX, novoY));
        }
    }




    public String getBackstory() { return backstory; }

    public void setBackstory(String backstory) { this.backstory = backstory; }
    public int getMaxHp() { return maxHp; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    public int getStr() { return str; }
    public void setStr(int str) { this.str = str; }
    public int getDex() { return dex; }
    public void setDex(int dex) { this.dex = dex; }
    public int getWis() { return wis; }
    public void setWis(int wis) { this.wis = wis; }
    public int getCar() { return car; }
    public void setCar(int car) { this.car = car; }
}
