public class Personaje {

    private String nombre;
    private int vida;
    private final int VIDA_MAX = 200;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombreEntrada) {
        nombre = nombreEntrada;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vidaEntrada) {
        if (vidaEntrada > VIDA_MAX) {
            vida = VIDA_MAX;
        } else if (vidaEntrada < 0) {
            vida = 0;
        } else {
            vida = vidaEntrada;
        }
    }

    public void recibirCura(int cura) {
        if (vida <= 0) {
            System.out.println("No puedes curar a un personaje muerto.");
            return;
        }

        vida += cura;

        if (vida > VIDA_MAX) {
            vida = VIDA_MAX;
        }
    }

    public void recibirDanho(int danho) {
        if (vida <= 0) {
            System.out.println("El personaje ya está muerto.");
            return;
        }

        if (danho >= vida) {
            vida = 0;
            System.out.println("Has muerto.");
        } else {
            vida -= danho;
        }
    }

    public void mostrarEstado() {
        System.out.println("Personaje: " + nombre + " | Vida: " + vida + "/" + VIDA_MAX);
    }
}
