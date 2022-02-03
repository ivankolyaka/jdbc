package sql.demo.repository;

import java.sql.SQLException;

public class ActionRepository extends BaseTable implements TableOperation {
    public ActionRepository() throws SQLException {
        super("action");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS actions(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "traider_id BIGINT," +
                "share_rate_id BIGINT," +
                "amount DECIMAL(8,2))", "Созданная таблица " + getTableName());
    }

    @Override  // нужно бы добавить еще проверку на уже наличие вторичного ключа
    public void createForeignKeys() throws SQLException {
        super.executeSqlStatement("ALTER TABLE actions ADD FOREIGN KEY (traider_id) REFERENCES traiders(id);",
                "добавлена связь actions(traider_id) - traiders(id)" );
        super.executeSqlStatement("ALTER TABLE actions ADD FOREIGN KEY (share_rate_id) REFERENCES share_rates(id);",
                "добавлена связь actions(share_rate_id) - share_rates(id)" );
    }
}
