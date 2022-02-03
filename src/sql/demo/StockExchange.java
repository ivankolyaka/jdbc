package sql.demo;

import sql.demo.repository.ActionRepository;
import sql.demo.repository.ShareRateRepository;
import sql.demo.repository.ShareRepository;
import sql.demo.repository.TraiderRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class StockExchange {

    //public static final String DB_URL = "jdbc:h2:C:\\Projects\\java\\itea\\JDBC\\db\\StockExchange";
    //public static final String DB_URL = "jdbc:h2:./db/StockExchange";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mystockexchange";

    //public static final String DB_Driver = "org.h2.Driver";
    //public static final String DB_Driver = "com.mysql.jdbc.Driver";
    public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";

    private static Connection connection;

    private ShareRepository shareRepository;
    private ShareRateRepository shareRateRepository;
    private TraiderRepository traiderRepository;
    private ActionRepository actionRepository;

    public StockExchange() throws ClassNotFoundException, SQLException{
        Class.forName(DB_Driver);

        this.shareRepository = new ShareRepository();
        shareRateRepository = new ShareRateRepository();
        traiderRepository = new TraiderRepository();
        actionRepository = new ActionRepository();
    }

    public static void main(String[] args) {
        try{
            StockExchange stockExchange = new StockExchange();
            stockExchange.createTable();

//            Connection connection = DriverManager.getConnection(DB_URL);
//            System.out.println("conn good");
//            connection.close();
//            System.out.println("disconeted from subd");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("jdbc err");
        } catch (SQLException throwables) {
            //e.printStackTrace();
            throwables.printStackTrace();
            System.out.println("sql err");
        }
    }

    public static Connection getConnection() throws SQLException {
        if (connection==null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите логин");
            String userName = scanner.next();
            System.out.println("введите пароль");
            String userPassword = scanner.next();

            connection = DriverManager.getConnection(DB_URL, userName, userPassword);
        }
        System.out.println("coon ok");
        return connection;
        //return DriverManager.getConnection(DB_URL);
    }


    private void createTable() throws SQLException{
        shareRepository.createTable();
        shareRateRepository.createTable();
        traiderRepository.createTable();
        actionRepository.createTable();

        shareRateRepository.createForeignKeys();
        actionRepository.createForeignKeys();
    }
}
