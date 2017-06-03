package com.zls.db;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnDB {

	private static final String DATABASENAME = "webservice";
	private static MongoClient mongoClient;
	private static String host = "127.0.0.1";// mongo���ݿ��������ַ,����Ϊ127.0.0.1
	private static int port = 27017;// mongoĬ��Ϊ27017�˿�

	/**
	 * ��ȡ���ݿ⼯��
	 * 
	 * 
	 * @param databaseName
	 *            ���ݿ�����
	 * @param collectionName
	 *            ��������
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
	 * ��ȡ���ݿ�
	 * 
	 * @return
	 */
	public static MongoDatabase getDB() {
		MongoDatabase db = null;
		try {
			mongoClient = new MongoClient(host, port);
			db = mongoClient.getDatabase(DATABASENAME);
		} catch (Exception e) {
			System.out.println("��ȡ���ݿ�ʧ��");
			e.printStackTrace();
		}
		return db;
	}



	/**
	 * �رտͻ�������
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
