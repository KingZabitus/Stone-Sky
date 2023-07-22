package Modelo;

public abstract class Ator {
        protected int x;
        protected int y;
        protected String nome;

        public Ator(int x, int y) {
            this.x = x;
            this.y = y;
        }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getY() {
        return y;
    }
    public int getX() {
            return x;
        }
}
