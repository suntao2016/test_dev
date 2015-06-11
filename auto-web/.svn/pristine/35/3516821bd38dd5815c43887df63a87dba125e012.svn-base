/**
 * 
 */
package com.ccigmall.auto.test.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.constant.Constant;

/**
 * @author jianping.gao
 * 
 */
public class UpdateOrderStatus {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UpdateOrderStatus.class);

	static Connection con = null;// 创建一个数据库连接
	static PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	static ResultSet result; // 创建一个结果集对象

	public static synchronized void first(String payId) throws SQLException {		
		List<String> sqls = new ArrayList<String>();
		sqls.add("update  r_order t  set t.status = '31' where  t.pay_id=?");
		sqls.add("update  r_order_item t set t.status = '31'  where t.order_id = (select order_id from r_order where pay_id=?)");
		sqls.add("update  r_order_pay t set t.status = '1' where t.pay_id=?");
		sqls.add("update  r_order_pay_item t set t.status = '1' where t.pay_id=?");
		update(sqls,payId);
		logger.info("首付支付完成 {}", payId);
	}

	public static synchronized void last(String payId) throws SQLException {
		List<String> sqls = new ArrayList<String>();
		sqls.add("update  r_order t  set t.status = '71' where  t.pay_id=?");
		sqls.add("update  r_order_item t set t.status = '71'  where t.order_id = (select order_id from r_order where pay_id=?)");
		sqls.add("update  r_order_pay t set t.status = '3' where t.pay_id=?");
		sqls.add("update  r_order_pay_item t set t.status = '2' where t.pay_id=?");
		update(sqls,payId);
		logger.info("尾付支付完成 {}", payId);
	}

	private static synchronized void update(List<String> sqls,String payId)
			throws SQLException {
		try {
			ResourceBundle temp_bundle = ResourceBundle.getBundle("env/"
					+ DataProvider.getMemcacheVal(Constant.memcachedClient, Constant.ENV, false) + "/jdbc");
			Constant.JDBC_URL = temp_bundle.getString("url");
			Constant.JDBC_NAME = temp_bundle.getString("name");
			Constant.JDBC_PASSWORD = temp_bundle.getString("password");
			Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
			logger.info("开始尝试连接数据库！{}  {}  {}",Constant.JDBC_URL,Constant.JDBC_NAME,Constant.JDBC_PASSWORD);
			con = DriverManager.getConnection(Constant.JDBC_URL,
					Constant.JDBC_NAME, Constant.JDBC_PASSWORD);// 获取连接
			if(!con.isClosed()){
				logger.info("连接成功!");
			}			
			for (int i = 0; i < sqls.size(); i++) {
				logger.info("执行 {}", sqls.get(i));
				pre = con.prepareStatement(sqls.get(i));// 实例化预编译语句
				pre.setString(1, payId);// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
				int result = pre.executeUpdate();
				logger.info("结果 {}",result);
			}
		} catch (SQLException e) {
			throw new SQLException("update order status error", e);
		} catch (ClassNotFoundException e) {
			throw new SQLException("not found oracle driver error", e);
		} finally {
			try {
				// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
				// 注意关闭的顺序，最后使用的最先关闭
				if (result != null)
					result.close();
				if (pre != null)
					pre.close();
				if (con != null)
					con.close();
				logger.info("数据库连接已关闭！");
			} catch (SQLException e) {
				throw new SQLException("close database error", e);
			}
		}
	}
	
	
}
