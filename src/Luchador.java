public class Luchador {

    private String nombre;
    private int ataque;
    private int vida;
    private int defensa;
    private boolean vivo;

    public Luchador(String nombre, int ataque, int vida, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.defensa = defensa;
        this.vivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVida() {
        return vida;
    }

    public boolean getVivo() {
        return vivo;
    }


    public int ataca() {
        double multiplicador = 0.8 + Math.random() * (1.4 - 0.8);
        return (int) (ataque * multiplicador);
    }


    public boolean recibeDanho(int danhoRecibido) {
        int danhoFinal = danhoRecibido - defensa;

        if (danhoFinal < 0) {
            danhoFinal = 0;
        }

        vida -= danhoFinal;

        if (vida <= 0) {
            vida = 0;
            vivo = false;
            return true;
        }

        return false;
    }
}
