package ch2_Working_With_Java_Data_Types;

public class ex11 {

	DBConfiguration configureDB(String uname, String password) {
        
		DBConfiguration x=new DBConfiguration();
		//return new DBConfiguration();
		return x;
    }
    public static void main(String[] args) {
        ex11 r = new ex11();
        DBConfiguration dbConf = r.configureDB("manager", "manager");
    }

}
class DBConfiguration {
	 
    String user;
    String password;
}
/*

Given the code format:

class DBConfiguration {
 
    String user;
    String password;
}
And,

public class DBHandler {
    DBConfiguration configureDB(String uname, String password) {
        // insert code here
    }
    public static void main(String[] args) {
        DBHandler r = new DBHandler();
        DBConfiguration dbConf = r.configureDB("manager", "manager");
    }
}
Which code fragment must be inserted at line 6 to enable the code to compile?

A.

DBConfiguration f;
return f;
B.

return DBConfiguration;
C.

return new DBConfiguration();
D.

retutn 0;



*/