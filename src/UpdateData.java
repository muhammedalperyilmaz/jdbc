import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateData {
    public void update() throws SQLException {
        Connection connection=null;
        PreparedStatement statement= null;
        DbHelper dbHelper= new DbHelper();
        connection = dbHelper.getConnection();
        String sql ="update actor set last_name='Doe' where first_name='John'";
        statement = connection.prepareStatement(sql);
        int result = statement.executeUpdate();
        System.out.println("Actor has been updated");
    }
}
