package org.ecom.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.MoneyDetail;


public class MoneyDetailRepository {

	public static List<MoneyDetail> getAllMoneyDetail(Connection con) {

		System.out.println("-----------getAllMoneyDetail------------");

		Statement stmt = null;
		ResultSet rs = null;

		List<MoneyDetail> MoneyDetailList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(" select * from MoneyDetail ");

			if (rs != null) {

				while (rs.next()) {

					MoneyDetail moneydet = new MoneyDetail();
					moneydet = new MoneyDetail();
					moneydet.setId(rs.getInt(1));
					moneydet.setUserid(rs.getInt(2));
					moneydet.setBalance(rs.getDouble(3));
					moneydet.setCreatedate(rs.getDate(4));
					moneydet.setUpdatedate(rs.getDate(5));
					MoneyDetailList.add(moneydet);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return MoneyDetailList;
	}

	public static List<MoneyDetail> findMoneyDetailByUserId(Connection con, long userId) {

		System.out.println("-----------findMoneyDetailByUserId userid: " + userId);

		ResultSet rs = null;

		List<MoneyDetail> MoneyDetailList = new ArrayList<>();
		PreparedStatement pStatement = null;

		try {
			String query = " select * from MoneyDetail where userid=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			rs = pStatement.executeQuery();

			if (rs != null) {

				while (rs.next()) {
					MoneyDetail moneydet = new MoneyDetail();
					moneydet.setId(rs.getInt(1));
					moneydet.setUserid(rs.getInt(2));
					moneydet.setBalance(rs.getDouble(3));
					moneydet.setCreatedate(rs.getDate(4));
					moneydet.setUpdatedate(rs.getDate(5));
					MoneyDetailList.add(moneydet);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return MoneyDetailList;
	}

	// Create method MoneyDetail
	public static void createMoneyDetail(Connection con, MoneyDetail moneydet) {

		System.out.println("-----------createMoneyDetail------------");

		PreparedStatement pStatement = null;

		try {

			// conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlCreatDate = new java.sql.Date(moneydet.getCreatedate().getTime());
			java.sql.Date sqlUpdatDate = new java.sql.Date(moneydet.getUpdatedate().getTime());

			String query = "INSERT INTO MoneyDetail(balance, createdate , updatedate ) " + " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setDouble(1, moneydet.getBalance());
			pStatement.setDate(2, sqlCreatDate);
			pStatement.setDate(3, sqlUpdatDate);

			int executeUpdate = pStatement.executeUpdate();

			if (executeUpdate > 0) {
				System.out.println("data created successfully: " + executeUpdate);
			} else {
				System.out.println("failed to insert data: " + executeUpdate);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
 //Update MoneyDetail
	public static void updateMoneyDetail(Connection con, MoneyDetail moneydet) {

		System.out.println("-----------updateMoneyDetail------------");

		PreparedStatement pStatement = null;

		try {

			// conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlCreatDate = new java.sql.Date(moneydet.getCreatedate().getTime());
			java.sql.Date sqlUpdatDate = new java.sql.Date(moneydet.getUpdatedate().getTime());

			String query = 	  " update MoneyDetail set balance=?, createdate=?, updatedate=?"
					+ " where id=? ";
			
			pStatement = con.prepareStatement(query);
			pStatement.setDouble(1, moneydet.getBalance());
			pStatement.setDate(2, sqlCreatDate);
			pStatement.setDate(3, sqlUpdatDate);

			int executeUpdate = pStatement.executeUpdate();

			if (executeUpdate > 0) {
				System.out.println("data created successfully: " + executeUpdate);
			} else {
				System.out.println("failed to insert data: " + executeUpdate);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//Delete MoneyDetail
	public static void deleteMoneyDetail(Connection con, MoneyDetail moneydet) {

		System.out.println("-----------deleteMoneyDetailByID MoneyDetailid: "+moneydet);

		PreparedStatement pStatement = null;

		try {

			// conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlCreatDate = new java.sql.Date(moneydet.getCreatedate().getTime());
			java.sql.Date sqlUpdatDate = new java.sql.Date(moneydet.getUpdatedate().getTime());

			String query = "delete from MoneyDetail where id=?";
			
			pStatement = con.prepareStatement(query);
			pStatement.setDouble(1, moneydet.getBalance());
			pStatement.setDate(2, sqlCreatDate);
			pStatement.setDate(3, sqlUpdatDate);

			int executeUpdate = pStatement.executeUpdate();

			if (executeUpdate > 0) {
				System.out.println("data created successfully: " + executeUpdate);
			} else {
				System.out.println("failed to insert data: " + executeUpdate);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
	