package ojdbc;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCConnection {

    String oracleDbURL="jdbc:oracle:thin:@ec2-18-216-205-214.us-east-2.compute.amazonaws.com:1521:xe";
    String oracleDbPassword="hr";
    String oracleDbUsername="hr";
    @Test
    public void oracleJDBC()  {
        Connection connection= null;
        try {
            connection = DriverManager.getConnection(oracleDbURL ,oracleDbUsername, oracleDbPassword);
            Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);//we opened the white page in sQL developer
            ResultSet resultSet=statement.executeQuery("select first_name, last_name from employees");

            resultSet.next();
            System.out.println("First name: " + resultSet.getObject(1)); //looking for column 1 from employees table
            resultSet.next();
            resultSet.next();
            resultSet.next(); //this will jump to next person in the column
            System.out.println("First name: " + resultSet.getObject(2)); //2 means next column

           ResultSetMetaData metaData=resultSet.getMetaData();
            int columnCount=metaData.getColumnCount();
            System.out.println(columnCount);

            while(resultSet.next()){
                for(int i=1; i<3; i++){
                    System.out.print(resultSet.getObject(i)+ " ");
                }
                System.out.println();
            }

            Map <String, Object>map=new HashMap<>();
            map.put("first_name", "Ellen");
            map.put("last_name", "Abel");

            Map <String, Object>map1=new HashMap<>();
            map1.put("first_name", "Sundar");
            map1.put("last_name", "Ande");

            Map <String, Object>map2=new HashMap<>();
            map2.put("first_name", "Mozhe");
            map2.put("last_name", "Atkinson");

            List<Map<String, Object>> table =new ArrayList<>();
            table.add(map);
            table.add(map1);
            table.add(map2);

            for(Map<String, Object>Map: table){
                System.out.println(Map.get("first_name")+ " " + Map.get("last_name"));
            }




        } catch (SQLException e) {
            System.out.println("Failed to open connection");
        }
       // connection.close();



    }

}
