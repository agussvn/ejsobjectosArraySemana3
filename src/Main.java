//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//----------------C.BANCARIA EJ17-----------------------

        System.out.println("\n\n--EJ17--");
        System.out.println("-Bienvenido a su cuenta de banco-");

        CuentaBancaria c1 = new CuentaBancaria();
        c1.setNombre("Agustín Varela Neira");
        c1.setSaldo(10000);

        System.out.println("Estimado " + c1.getNombre() +
                " tiene un saldo de " + c1.getSaldo() + " $.");

        System.out.println("\nIntentando comprar en Apple por...");
        c1.restaSaldo(1000);

        if (c1.getSaldo() > 0) {
            System.out.println("Gracias por comprar en Apple, su saldo restante es de "
                    + c1.getSaldo() + " $");
        } else {
            System.out.println("No le queda dinero suficiente para realizar la compra");
        }

        System.out.println("\nTu amigo Yohan te ha mandado 4000$");
        c1.sumaSaldo(4000);

        System.out.println("Saldo actual: " + c1.getSaldo() + " $");

        System.out.println("\nDespués de este día de ganancias y pérdidas tienes en tu cuenta: "
                + c1.totalSaldo(1) + " $");

        System.out.println("---------------------");

//--------------------Personaje EJ18-----------------------------

        System.out.println("--PERSONAJE-EJ18--");

        Personaje p1 = new Personaje();
        p1.setNombre("Impostor");
        p1.setVida(200);

        System.out.println("Bienvenido al mundo, " + p1.getNombre() +
                " tienes un total de " + p1.getVida() + " de vida.");

        p1.recibirDanho(99);
        System.out.println("Ese fusil de asalto te ha dejado a " + p1.getVida() + ".");
        p1.mostrarEstado();

        p1.recibirDanho(100);
        p1.mostrarEstado();

        if (p1.getVida() < 50 && p1.getVida() > 0) {
            System.out.println("Deberías curarte!!");
        }

        p1.recibirCura(50);
        p1.mostrarEstado();
        System.out.println("------------------");


        //----------------------
    }
}


