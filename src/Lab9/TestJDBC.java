package Lab9;

import java.sql.*;
class Employee{
   private int id;
   private String name;
   private String position;
   private double salary;

   //constructor

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
public class TestJDBC {
    public static void main (String[]args) throws ClassNotFoundException, SQLException {
        //step 1:load daiver
        Class.forName("org.sqlite.JDBC");
        System.out.println("Load Driver successfully.");

        //step 2: create connection
        String SQCONN ="Jdbc:sqlite:D:OOP358411110013/src/company.sqlite";
        Connection conn = null;
        try {
            conn =DriverManager.getConnection(SQCONN);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn == null){
            System.out.println("Could not connect to DB.");
        }else{
            System.out.println("Connected to DB.");
        }
        //step 3 : create statement,result set
        Statement stmt = conn.createStatement();
                String sql = "select * from employee";
        ResultSet rs = stmt.executeQuery(sql);

        //step 4 : viewing data
        while (rs.next()){
           int id = rs.getInt(1);
           String name = rs.getString(2);
           String position = rs.getString(3);
           double salary = rs.getDouble(4);
//           System.out.println("ID:"+id);
//           System.out.println("Name:"+name);
//           System.out.println("Position:"+position);
//           System.out.println("Salary:"+salary);
//           System.out.println("-------------------");
            emp.add (new Employee(id,name,position,));
        }
         //step 5 : close connection
        rs.close();
        stmt.close();
        conn.close();
        // viewing data via object
        for (Employee e: emp){
            System.out.println("ID:"+e.getID());
            System.out.println("Name:"+e.getName());
        }
}//class
