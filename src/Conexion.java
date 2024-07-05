import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Conexion extends JFrame {
    private JButton boton1;
    private JPanel panel1;
    private JLabel datos;

    public Conexion(){
        setTitle("si");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/esfotventas";
                String user = "root";
                String password = "123456";

                try(Connection connection = DriverManager.getConnection(url,user,password)) {
                    System.out.println("Conectada la base de datos");
                    String query = "SELECT * FROM cliente limit 2";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    StringBuilder datoss = new StringBuilder("<html>");
                    while (resultSet.next()){
                        datoss.append("<b>Nombre<b>").append(resultSet.getString("nombre")).append("<br>");
                        datoss.append("<b>Correo<b>").append(resultSet.getString("correo")).append("<br>");
                        datoss.append("<b>Password<b>").append(resultSet.getString("password")).append("<br>");
                    }
                    datoss.append("</html>");
                    datos.setText(datoss.toString());
                }
                catch (SQLException ex){
                    datos.setText("Error: " + ex.getMessage());
                }


            }
        });
    }

}

