package com.abc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JdbcConnection {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			// Step2. Establish the connection
			// Syntax of URL:: jdbc:dbengine:ipaddress:portno/Databasename
			String url = "jdbc:mysql:///abc";
			// varies from user to user
			String user = "root";
			String password = "root123";
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				// Step3. Create a Statement object and send the query to DBE
				statement = connection.createStatement();
				if (statement != null) {
					String sqlSelectQuery = "select * from student";
					resultSet = statement.executeQuery(sqlSelectQuery);
					if (resultSet != null) {
						System.out.println(
								"Implementation class name of ResultSet is ::" + resultSet.getClass().getName());

						// Step4. process the resultSet using encapsulation rules
						System.out.println("SID\t SNAME\t SAGE\t SADDRESS");
						while (resultSet.next()) {
							// Get the record using getter method
							System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t"
									+ resultSet.getInt(3) + "\t" + resultSet.getString(4));
						}

					}

				}

			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (resultSet != null)

			{
				try {
					resultSet.close();

				} catch (SQLException se)

				{
					se.printStackTrace();
				}
			}
			if (statement != null)

			{
				try {
					statement

							.close();

				} catch (SQLException se)

				{
					se.printStackTrace();
				}
			}
			if (connection != null)

			{
				try {
					connection.close();

				} catch (SQLException se)

				{
					se.printStackTrace();
				}
			}

		}
	}
}