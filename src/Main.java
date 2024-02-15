import java.sql.*;
public class Main {

    public static void main(String[] args) throws SQLException {
        try {
          ReadData rf= new ReadData();
          rf.readData();
          InsertData  insertData= new InsertData();
          insertData.insert();
          insertData.insertVersion2();
          UpdateData ud= new UpdateData();
          ud.update();
          DeleteData dd= new DeleteData();
          dd.delete();
        }
        catch (SQLException exception) {
            DbHelper dbHelper = new DbHelper();
            dbHelper.showErrorMessage(exception);
        }
    }
}