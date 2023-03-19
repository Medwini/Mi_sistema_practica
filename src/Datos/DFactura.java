//Conexión del código a la base de datos para guardar todas las variables
package Datos;

//Uso de la varible date
import java.sql.Date;

public class DFactura {
    
    public String NumFact;
    public String Nombre;
    public Date Fecha;
    public String TipoT;
    public double PrecioMax;
    public double Total;
    public String RefPago;

    
    

    public String getNumFact() {
        return NumFact;
    }

    public void setNumFact(String NumFact) {
        this.NumFact = NumFact;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipoT() {
        return TipoT;
    }

    public void setTipoT(String TipoT) {
        this.TipoT = TipoT;
    }

    public double getPrecioMax() {
        return PrecioMax;
    }

    public void setPrecioMax(double PrecioMax) {
        this.PrecioMax = PrecioMax;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    public String getRefPago() {
        return RefPago;
    }

    public void setRefPago(String RefPago) {
        this.RefPago = RefPago;
    }   
}
