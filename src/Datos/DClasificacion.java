//Conexión del código a la base de datos para guardar todas las variables
package Datos;


public class DClasificacion {  
    public String TipoT;
    public double PrecioMin;

    public String getTipoT() {
        return TipoT;
    }

    public void setTipoT(String TipoT) {
        this.TipoT = TipoT;
    }

    public double getPrecioMin() {
        return PrecioMin;
    }

    public void setPrecioMin(double PrecioMin) {
        this.PrecioMin = PrecioMin;
    }
}
