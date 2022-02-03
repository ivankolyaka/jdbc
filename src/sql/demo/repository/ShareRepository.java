package sql.demo.repository;

import java.sql.Connection;
import java.sql.SQLException;

public class ShareRepository extends BaseTable implements TableOperation{

    private Connection connection;

    public ShareRepository() throws SQLException {
        super("shares");
    }

//    public ShareRepository(String tableName) throws SQLException {
//        super(tableName);
//    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS shares(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "startPrice DECIMAL(8,2)," +
                "changeProbability INTEGER NOT NULL," +
                "delta INTEGER NOT NULL)", "Созданная таблица " + getTableName());
    }

    @Override
    public void createForeignKeys() throws SQLException {

    }
}
