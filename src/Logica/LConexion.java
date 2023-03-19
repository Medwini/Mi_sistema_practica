
package Logica;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class LConexion {
    
    Connection con;
    
    Statement stSentencesSQL;
    ResultSet MisDatos;
    PreparedStatement psPrepararSentences;
    

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/empresa";

    // Funcion que va conectarse a mi bd de mysql
    public Connection getConexion () {
        // Reseteamos a null la conexion a la bd
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            stSentencesSQL = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        //Y se cierra el software
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
            int i = 0;
            System.exit(i);
        }
        return con;
    }

    public ResultSet consulta (String sql){
        try{
            MisDatos = stSentencesSQL.executeQuery(sql);
        }catch (Exception e){
            
        }
        
        return MisDatos;
    }
}
