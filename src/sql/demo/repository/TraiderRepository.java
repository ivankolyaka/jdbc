package sql.demo.repository;

import java.sql.SQLException;

public class TraiderRepository extends BaseTable implements TableOperation{

    public TraiderRepository() throws SQLException {
        super("traiders");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS traiders(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "sfreqTick INTEGER NOT NULL," +
                "cash DECIMAL(8,2)," +
                "traidingMethod INTEGER NOT NULL," +
                "changeProbability INTEGER NOT NULL," +
                "about VARCHAR(255) NOT NULL)", "Созданная таблица " + getTableName());

    }

    @Override
    public void createForeignKeys() throws SQLException {

    }
}
