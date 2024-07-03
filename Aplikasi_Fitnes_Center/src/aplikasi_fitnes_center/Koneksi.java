/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_fitnes_center;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ARI SANDIKA
 */
public class Koneksi {

    // port sql milik ari sandika = localhost:3306 apabila tidak bisa hapus saja bagian ":3306" atau disesuaikan kembali
    private String url = "jdbc:mysql://localhost:3306/db_fitness_java";
    private String mysql_user = "root";
    private String mysql_password = "";
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(url, mysql_user, mysql_password);
//            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

}
