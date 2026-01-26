public class CuentaBancaria {

        private String nombre;
        private double saldo;

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombreEntrada){
            nombre=nombreEntrada;
        }

        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldoEntrada) {
            saldo=saldoEntrada;
        }

        public void sumaSaldo(double suma){
            saldo=saldo+suma;
        }

        public void restaSaldo(double resta) {
            if (saldo > resta) {
                saldo = saldo - resta;
            }
        }


        public double totalSaldo(double total){
            return saldo;
        }
    }


