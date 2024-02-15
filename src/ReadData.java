import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class ReadData{
    public void readData() throws SQLException {
       Connection connection=null;
        Statement statement= null;
        ResultSet resultSet;

        DbHelper dbHelper= new DbHelper();
        connection = dbHelper.getConnection();
        statement=connection.createStatement();
        resultSet=statement.executeQuery("SELECT first_name, last_name FROM sakila.actor;");
        ArrayList<Actor> actors =new ArrayList<Actor>();

        while (resultSet.next()) {
            actors.add(new Actor(resultSet.getString("first_name"),resultSet.getString("last_name")));
        }
            System.out.println("Amount of Person: "+actors.size());
    }
}
