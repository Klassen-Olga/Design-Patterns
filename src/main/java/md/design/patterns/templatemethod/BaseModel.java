package md.design.patterns.templatemethod;


import java.sql.*;

public abstract class BaseModel {

	protected String SQL;

	protected Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIB?useSSL=false", "debian-sys-maint", "G65C1J4iIxMIxVgF");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}

	protected abstract void insertOperation(PreparedStatement preparedStatement) throws SQLException;

	public void insert() {
		Connection connection;
		connection = getConnection();
		try (PreparedStatement preparedStatement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

			this.insertOperation(preparedStatement);


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeConnection(connection);
		}
	}

	private void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	protected long getId(PreparedStatement preparedStatement) {
		long id = 0;
		try (ResultSet rs = preparedStatement.getGeneratedKeys()) {
			if (rs.next()) {
				id = rs.getLong(1);
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return id;

	}
}


