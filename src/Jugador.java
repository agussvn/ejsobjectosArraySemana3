public class Jugador {

    private String nombre;
    private int vida;

    public Jugador(String nombre,int vida){
        this.nombre=nombre;
        this.vida=vida;
    }

    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }

    boolean estaVivo(){
        return vida>0;
    }

    boolean estaMuerto(){
        return vida <=0;
    }

    public void recibirDanho(){
        if(vida <=0){
            vida=0;
        } else {
            vida=vida-10;
        }
    }

}
