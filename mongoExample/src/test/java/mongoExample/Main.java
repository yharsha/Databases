package mongoExample;

import com.mongodb.DBCursor;

import config.MongoContext;

public class Main {
	/**
	*
	*/
	public static void main(String[] args) {
		DBCursor result = MongoContext.get().connectDb("test").findByKey("Employee", "age", 32,
				(value) -> new Integer(value));
		while (result.hasNext()) {
			System.out.println(result.next());
		}
	}
}
