package net.ausiasmarch.tanque.modelo;

/**
 *
 * @author a071768530c
 */
public class ControlRiego {

    String mensaje;
    int sequia, humedad;
    EstadoTanque estado;

    public ControlRiego(EstadoTanque estado) {

        this.estado = estado;

    }

    public ControlRiego() {
    }

    public int permitidoLLenar() {

        if (sequia > 10 || sequia < 0) {

            mensaje = "El valor de la sequía no puede ser mayor que 10 o menor que 0.";
            return 1;

        }

        if (estado == EstadoTanque.LLENO) {

            mensaje = "No se puede llenar el tanque si está lleno.";
            return 2;

        }

        if (sequia == 10) {

            mensaje = "No se puede llenar si la sequía es 10.";
            return 3;

        }

        if (sequia >= 7 && estado == EstadoTanque.MEDIO) {

            mensaje = "No se puede llenar más de la mitad si la sequía es mayor o igual a 7.";
            return 4;

        }

        return 0;

    }
    
    public int permitidoVaciar() {
    
        if (humedad > 10 || humedad < 0) {

            mensaje = "El valor de la humedad del suelo no puede ser mayor que 10 o menor que 0.";
            return 1;

        }

        if (estado == EstadoTanque.VACIO) {

            mensaje = "No se puede vaciar NADA para regar si el tanque ya está vacío.";
            return 2;

        }

        if (humedad >=7) {

            mensaje = "No se puede vaciar nada para regar si la humedad del suelo es mayor o igual a 7";
            return 3;

        }

        if ((humedad<7 && humedad>=3) && estado == EstadoTanque.MEDIO) {

            mensaje = "No se puede vaciar más allá de la mitad para regar si la\n" +
            "humedad del suelo es mayor o igual a 3 y menor que 7.";
            return 4;

        }

        return 0;

    }

    public String getMensaje(){
        
        return mensaje;
        
    }

    public int getSequia() {
        return sequia;
    }

    public void setSequia(int sequia) {
        this.sequia = sequia;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public EstadoTanque getEstado() {
        return estado;
    }

    public void setEstado(EstadoTanque estado) {
        this.estado = estado;
    }
    
    
    
}
