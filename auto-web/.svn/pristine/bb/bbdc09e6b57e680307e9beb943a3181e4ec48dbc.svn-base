/**
 * 
 */
package com.ccigmall.auto.test.utils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.constant.Constant;

/**
 * @author jianping.gao
 * 
 */
public class DataProvider {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(DataProvider.class);

	private static MemcachedClient memcachedClient;

	private static int catchTime = 5 * 60 * 60;

	private static String ip;

	static {
		InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
			ip = addr.getHostAddress().toString();// 获得本机IP
		} catch (UnknownHostException e) {
			logger.error("Unknown host exception ", e);
			ip = "127.0.0.1";
		}
	}

	/**
	 * init properties
	 * 
	 * @param path
	 */
	public static ResourceBundle initProperty(String path) {
		ResourceBundle bundle = null;
		try {
			bundle = ResourceBundle.getBundle(path);
			logger.info("load ResourceFile　: {}", path + ".properties");
		} catch (Exception e) {
			logger.info("ResourceFileNotFound　: {}", path + ".properties");
			return bundle;
		}
		return bundle;
	}

	/**
	 * true:被测试系统
	 * false：本系统
	 * 
	 * @param memcachedClient
	 * @param key
	 * @return
	 */
	public static Object getMemcacheVal(MemcachedClient memcachedClient, String key,boolean isCaptcha) {
		Object val = null;
		try {
			if (memcachedClient == null) {
				reConnectMemcache();
				memcachedClient = Constant.memcachedClient;
			}
			if(isCaptcha){			
				val = memcachedClient.get(key);
				logger.debug("memcached : key=[{}]    val=[{}]", key, val);
			}else{
				val = memcachedClient.get(key+ip);
				logger.debug("memcached : key=[{}]    val=[{}]", key + ip, val);
			}			
		} catch (TimeoutException e) {
			logger.debug("Memcache TimeoutException  : {}", e);
			reConnectMemcache();
			val = getMemcacheVal(Constant.memcachedClient, key, isCaptcha);
			return val;
		} catch (InterruptedException e) {
			logger.debug("Memcache InterruptedException  : {}", e);
			reConnectMemcache();
			val = getMemcacheVal(Constant.memcachedClient, key, isCaptcha);
			return val;
		} catch (MemcachedException e) {
			logger.debug("Memcache MemcachedException  : {}", e);
			reConnectMemcache();
			val = getMemcacheVal(Constant.memcachedClient, key, isCaptcha);
			return val;
		}
		return val;
	}

	/**
	 * 
	 */
	private static void reConnectMemcache() {
		ResourceBundle tempbundle = ResourceBundle.getBundle("selenium");
		Constant.memcachedClient = initMemcachedClient(tempbundle
				.getString("env"));
		logger.info("重新连接Memcache ");
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static void setMemcacheVal(MemcachedClient memcachedClient,
			String key, Object value) {
		try {
			memcachedClient.set(key + ip, catchTime, value);
			logger.info("set memcached : key=[{}]    val=[{}]",key+ip,value);
			return;
		} catch (MemcachedException e) {
			logger.info("Memcache MemcachedException  : {}", e);
			reConnectMemcache();
			setMemcacheVal(Constant.memcachedClient, key, value);
			return;
		} catch (TimeoutException e) {
			reConnectMemcache();
			setMemcacheVal(Constant.memcachedClient, key, value);
		} catch (InterruptedException e) {
			reConnectMemcache();
			setMemcacheVal(Constant.memcachedClient, key, value);
		}
	}

	/**
	 * 
	 * @param env
	 * @return
	 */
	public static MemcachedClient initMemcachedClient(String env) {
		ResourceBundle bundle = null;
		try {
			bundle = ResourceBundle.getBundle("env/" + env+"/memcached");
			logger.info("load ResourceFile　: {}", "memcached/" + env
					+ ".properties");
		} catch (Exception e) {
			logger.info("ResourceFileNotFound　: {}", "memcached/" + env
					+ ".properties");
		}

		MemcachedClientBuilder builder = new XMemcachedClientBuilder(
				AddrUtil.getAddresses(bundle
						.getString("memcached.server1.host")
						+ ":"
						+ bundle.getString("memcached.server1.port")
						+ " "
						+ bundle.getString("memcached.server2.host")
						+ ":"
						+ bundle.getString("memcached.server2.port")),
				new int[] { 4, 3 });
		try {
			memcachedClient = builder.build();
		} catch (IOException e) {
			logger.error("memcachedClient　Exception : {}", e);
			try {
				memcachedClient = builder.build();
			} catch (IOException e1) {
				logger.error("memcachedClient　Exception : {}", e);
			}
		}
		return memcachedClient;
	}

	/**
	 * memcached shut down
	 */
	public static void shutDown(MemcachedClient memcachedClient) {
		try {
			memcachedClient.shutdown();
		} catch (IOException e) {
			logger.info("Memcache IOException  : {}", e);
		}
	}
}
