package Connexion;

import java.sql.*;

public class Connexion {

    public Connection creeConnexion() {
        String url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/cours3u_java";
        String login = "cours3u_appli";
        String pwd = "Pablo57890";
        Connection maConnexion = null;

        try {
            maConnexion = DriverManager.getConnection(url, login, pwd);
        } catch (SQLException sqle) {
            System.out.println("Erreur connexion" + sqle.getMessage());
        }
        return maConnexion;
    }
}
