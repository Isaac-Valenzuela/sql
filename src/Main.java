//import java.sql.*;
//public class Main {
//    public static void main(String[] args) throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/esfotventas";
//        String user = "root";
//        String password = "123456";
//
//        Connection connection = DriverManager.getConnection(url,user,password);
//            System.out.println("Conectada la base de datos");
//            String query = "SELECT * FROM cliente WHERE nombre LIKE 'P%'";
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while(resultSet.next()){
//                System.out.print(resultSet.getString("nombre"));
//                System.out.print(" ");
//                System.out.print(resultSet.getString("correo"));
//                System.out.print(" ");
//                System.out.print(resultSet.getString("password"));
//                System.out.println(" ");
//            }
//        connection.close();
//
//        }
//
//}

public class Main {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.setVisible(true);
    }
}