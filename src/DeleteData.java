import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteData {
    public void delete() throws SQLException {
        Connection connection = new DbHelper().getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM actor WHERE first_name = ?");
            statement.setString(1, "John");
            int result = statement.executeUpdate();
            System.out.println("Actor has been deleted");
    }
}
