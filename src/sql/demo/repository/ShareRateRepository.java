package sql.demo.repository;

import java.sql.SQLException;

public class ShareRateRepository extends BaseTable implements TableOperation{
    public ShareRateRepository() throws SQLException {
        super("share_rates");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS share_rates(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "operDate DATETIME NOT NULL," +
                "share_id BIGINT NOT NULL," +
                "rate DECIMAL(8,2))", "Созданная таблица " + getTableName());
    }

    @Override  // нужно бы добавить еще проверку на уже наличие вторичного ключа
    public void createForeignKeys() throws SQLException {
        super.executeSqlStatement("ALTER TABLE share_rates ADD FOREIGN KEY  (share_Id) REFERENCES shares(id);",
                 "добавлена связь share_rates(share_Id) - shares(id)" );
    }

}
