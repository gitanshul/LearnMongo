package com.anshul.learnmongo.Connect;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class ConnectRemoteMongo {

	public static void main(String[] args) {
		
		MongoClient mongo;
		try {
			mongo = new MongoClient("54.208.110.37", 27000);
			List<String> dbs = mongo.getDatabaseNames();
			System.out.println(dbs);
			
			DB db = mongo.getDB("paytmexpdb");

			Set<String> collections = db.getCollectionNames();
			System.out.println(collections); 

			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
