package com.zls.db;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnDB {

	private static final String DATABASENAME = "webservice";
	private static MongoClient mongoClient;
	private static String host = "127.0.0.1";// mongo数据库服务器地址,本地为127.0.0.1
	private static int port = 27017;// mongo默认为27017端口

	/**
	 * 获取数据库集合
	 * 
	 * 
	 * @param databaseName
	 *            数据库名称
	 * @param collectionName
	 *            集合名称
	 * @return MongoCollection<Document>
	 */
	public static MongoCollection<Document> getCollection(String collectionName) {
		MongoCollection<Document> collection = null;
		try {
			collection = getDB().getCollection(collectionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return collection;
	}

	/**
	 * 获取数据库
	 * 
	 * @return
	 */
	public static MongoDatabase getDB() {
		MongoDatabase db = null;
		try {
			mongoClient = new MongoClient(host, port);
			db = mongoClient.getDatabase(DATABASENAME);
		} catch (Exception e) {
			System.out.println("获取数据库失败");
			e.printStackTrace();
		}
		return db;
	}



	/**
	 * 关闭客户端连接
	 */
	public static void close() {
		try {
			if (mongoClient != null) {
				mongoClient.close();
			}
		} catch (Exception e) {
			System.out.println("close the mongoDB failed !");
			e.printStackTrace();
		}
	}

}
