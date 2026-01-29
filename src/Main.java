import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //----------------------Luchador ejs semana 2-------------------
        System.out.println("\n\n\n\n--BIENVENIDO AL COMBATE DEL SIGLO--");

        Luchador pj1 = new Luchador("Epstein", 10, 69, 3);
        Luchador pj2 = new Luchador("Kids", 10, 40, 2);

        System.out.println(pj1.getNombre() + " vs " + pj2.getNombre());
        System.out.println("\nMapa : Little Saint James ");

        boolean turno = true;

        while (pj1.getVivo() && pj2.getVivo()) {

            if (turno) {
                System.out.println("\n¡" + pj1.getNombre() + " ataca a " + pj2.getNombre() + "!");

                int danho = pj1.ataca();
                boolean derrotado = pj2.recibeDanho(danho);

                System.out.println("Daño infligido : " + danho);
                System.out.println("Vida de " + pj2.getNombre() + " : " + pj2.getVida());


                if (derrotado) {
                    System.out.println("\n" + pj2.getNombre() + " ha sido derrotado");
                    break;
                }

            } else {
                System.out.println("\n¡" + pj2.getNombre() + " ataca a " + pj1.getNombre() + "!");

                int danho = pj2.ataca();
                boolean derrotado = pj1.recibeDanho(danho);

                System.out.println("Daño infligido : " + danho);
                System.out.println("Vida de " + pj1.getNombre() + " : " + pj1.getVida());


                if (derrotado) {
                    System.out.println("\n" + pj1.getNombre() + " ha sido derrotado");
                    break;
                }
            }

            turno = !turno;
            System.out.println("------------------");
        }
        System.out.println("---------------");
    //--------------------Luchador Arrays ej3-------------------

                System.out.println("\n--- TORNEO DE LUCHADORES ---\n");

                LuchadorArrays[] luchadores = new LuchadorArrays[10];


                for (int i = 0; i < luchadores.length; i++) {
                    int vida = 80 + (int)(Math.random() * 41);
                    int ataque = 10 + (int)(Math.random() * 11);
                    int defensa = 5 + (int)(Math.random() * 6);

                    luchadores[i] = new LuchadorArrays("Luchador_" + (i + 1), ataque, vida, defensa);

                    System.out.println(luchadores[i].estado());

                    System.out.println("");
                }
                System.out.println("\n---COMIENZAN LAS PELEAS---\n");


           //---------------------arrays1 Alumno(1,2,3,4,5 ejs)----------------------------//

        System.out.println("\n\n\n---Alumno ej1,2,3,4,5 arrays---");

        Random random = new Random();
        Alumno1a5[] alumnos = new Alumno1a5[5];

        alumnos[0] = new Alumno1a5("Floyd", random.nextDouble()*10);
        alumnos[1] = new Alumno1a5("David", random.nextDouble()*10);
        alumnos[2] = new Alumno1a5("Yohan", random.nextDouble()*10);
        alumnos[3] = new Alumno1a5("Sergio" ,random.nextDouble() * 10);
        alumnos[4] = new Alumno1a5("Martín", random.nextDouble()*10);



        System.out.println("-TODOS LOS ALUMNOS-:");
        for (Alumno1a5 a : alumnos){
            a.mostrarDatos();
        }

        System.out.println("\n\n-ALUMNOS APROBADOS-");
        for (Alumno1a5 a : alumnos){
            if(a.getNota()>=5){
                a.mostrarDatos();
            }
        }
        System.out.println("\n MEDIA DE CLASE");
        double suma =0;
        for (Alumno1a5 a :alumnos){
            suma +=a.getNota();
        }
           //MEDIA
        double media = suma/ alumnos.length;
        System.out.printf("Media: %.2f\n", media);
            //4a
        Alumno1a5 alumnoTop = alumnos[0];
        for (Alumno1a5 a : alumnos){
            if(a.getNota() > alumnoTop.getNota()){
                alumnoTop=a;
            }
        }
        System.out.println("\nLa nota más alta es: " );
        alumnoTop.mostrarDatos();

        //4b
        double alumnoMax = alumnos.length;
                for(Alumno1a5 a : alumnos){
                    if(a.getNota() > alumnoMax){
                        alumnoMax=a.getNota();
                    }
                }
                System.out.println("\n\nALUMNOS CON LA NOTA MÁS ALTA (todos los que empaten):");
                for (Alumno1a5 a : alumnos){
                    if(a.getNota() == alumnoMax){
                        a.mostrarDatos();
                    }
                }

                Scanner sc = new Scanner(System.in);

                System.out.println("Introduce el alumno a buscar: ");
                String alumnoEncontrado = sc.nextLine();
                boolean encontrado=false;

                for(Alumno1a5 a: alumnos){
                    if(a.getNombre().equalsIgnoreCase(alumnoEncontrado)){
                        System.out.println("\nAlumno encontrado");
                        a.mostrarDatos();
                        encontrado=true;
                        break;
                    }
                }

                if(!encontrado){
                    System.out.println("Lo sentimos no hemos encontrado a ese usuario");
                }


                System.out.println("\n------------------");

                //-------------------arrays2 ej6,7,8--------------

        System.out.println("\n\n\n ---Jugadores-ej6,7,8---");

        Jugador[] jugador=new Jugador[4];

        jugador[0] = new Jugador("George",100);
        jugador[1] = new Jugador("Sebastian",69);
        jugador[2] = new Jugador("Sergva",-10);
        jugador[3] = new Jugador("Diergva",0);

        System.out.println("Jugadores vivos: ");
        for(Jugador a:jugador){
            if(a.estaVivo()){
                System.out.println("Nombre : " + a.getNombre() + " Nota : " + a.getVida() );
            }
        }

        for(Jugador a: jugador){
            if(a.estaMuerto()){
                System.out.println("Muertos: " + a.getNombre());
            }
        }

        System.out.println("\nVamos a reducir la vida en 10 a ver cuantos sobreviven");
        for(Jugador a: jugador){
            a.recibirDanho();
            System.out.println("Nombre: " + a.getNombre() + "," + " Vida restante: " + a.getVida());
        }


        System.out.println("------------------");

        //------------------------arrays2 ej9,10---------------
        System.out.println("---Producto-ej9,10---");
        Producto[] productos = new Producto[4];
        Scanner scanner =new Scanner(System.in);

        productos[0] =  new Producto("Diddy oil",5);
        productos[1] =  new Producto("Meat",15);
        productos[2] =  new Producto("Ice Cream",8);
        productos[3] =  new Producto("Gummy",1);

        System.out.println("Introduce un precio mínimo: ");
        double precioMin = sc.nextDouble();

        System.out.println("Productos con precio mayor a " + precioMin + " : ");

        for(Producto a: productos){
            if(a.getPrecio() > precioMin){
                System.out.println(a.getNombre() + " - €" + a.getPrecio());
            }
        }

        Producto productoMasCaro = productos[0];

        for(int i=1;i <productos.length;i++){
            if(productos[i].getPrecio() > productoMasCaro.getPrecio()){
                productoMasCaro=productos[i];
            }
        }
        System.out.println("\nProducto más caro:");
        System.out.println(productoMasCaro.getNombre() + " - $" + productoMasCaro.getPrecio());

        sc.close();




    }
        }








