import java.sql.*;
public class InsertData  {
    Connection connection=null;
    PreparedStatement  statement= null;
    DbHelper dbHelper= new DbHelper();
    public void insert() throws SQLException {

        connection = dbHelper.getConnection();
        statement = connection.prepareStatement("INSERT INTO actor (first_name, last_name) VALUES ('Muhammed Alperen', 'YILMAZ');");
        int result = statement.executeUpdate();
        System.out.println("Actor has been inserted");
    }
    public void insertVersion2() throws SQLException {
        String sql ="INSERT INTO actor (first_name, last_name) VALUES (?, ?)";
        statement = connection.prepareStatement(sql);
        statement.setString(1,"John");
        statement.setString(2,"Doe");
        int result = statement.executeUpdate();
        System.out.println("Actor has been inserted");
    }
}
