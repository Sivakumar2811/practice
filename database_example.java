import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class database_example {

    Scanner sc = new Scanner(System.in);

    public void  database() throws SQLException{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","7558");

        Statement s = c.createStatement();

        System.out.print("Enter the database name :");
        String name = sc.next();

        String query = String.format("Create database %s",name);

        s.executeUpdate(query);

        c.close();
    }

    public void table() throws SQLException{
        System.out.print("Enter the database name :");
        String database = sc.next();
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","7558");

        Statement s = c.createStatement();

        System.out.print("Enter table name :");
        String name = sc.next();

        String query = String.format("Create table %s (Id integer not null primary key, Name varchar(50), LapBrand varchar(50), " +
                "OperatingSystem varchar(50), StorageSize integer, Price long)",name);

        s.executeUpdate(query);

        c.close();
    }

    public void insert() throws SQLException{
        System.out.print("Enter the database name :");
        String database = sc.next();
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","7558");

        System.out.print("Enter the Table name :");
        String table = sc.next();

        Statement s = c.createStatement();

        String q = String.format("select*from %s",table);
        ResultSet r =  s.executeQuery(q);

        ResultSetMetaData m = r.getMetaData();

        List<String> column = new ArrayList<>();

        for (int i=1;i<=m.getColumnCount();i++)
        {
            column.add(m.getColumnName(i));
        }

        char e = 'y';
        while (e=='y' || e=='Y')
        {
            System.out.println("\nInput the string value into '...' :");
            String query = "insert into "+ table +" values (";

            for (int i=0;i<column.size();i++)
            {
                System.out.print("Enter the "+column.get(i)+"=");
                String value = sc.next();

                if (i==(column.size()-1)) {
                    query += value+")";
                }
                else {
                    query += value+", ";
                }
            }
            s.executeUpdate(query);

            System.out.print("Do you add more y or n :");
            e=sc.next().charAt(0);
        }
        c.close();
    }

    public void remove() throws SQLException{
        System.out.print("Enter the database name :");
        String database = sc.next();
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","7558");

        System.out.print("Enter the Table name :");
        String table = sc.next();

        Statement s = c.createStatement();

        System.out.print("Enter the Id :");
        String value = sc.next();

        String query = "delete from "+table+" where id="+value;

        s.executeUpdate(query);

        c.close();
    }

    public void deletetable() throws SQLException{
        System.out.print("Enter the database name :");
        String database = sc.next();
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","7558");

        Statement s = c.createStatement();

        System.out.print("Enter the Table name :");
        String name = sc.next();

        s.executeUpdate("drop table "+name);

        c.close();
    }

    public static void main(String[] args) throws SQLException{

        char c = 'y';
        while (c=='y' || c=='Y')
        {
            System.out.println("\n1.Create database \n2.Create Table \n3.Insert record \n4.Remove Record \n5.Delete table");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the your Option :");
            int choice = sc.nextInt();

            database_example obj = new database_example();

            switch (choice)
            {
                case 1:
                    obj.database();
                    break;
                case 2:
                    obj.table();
                    break;
                case 3:
                    obj.insert();
                    break;
                case 4:
                    obj.remove();
                    break;
                case 5:
                    obj.deletetable();
                    break;
            }

            System.out.print("Do you want continue y or n :");
            c = sc.next().charAt(0);
        }
    }
}
