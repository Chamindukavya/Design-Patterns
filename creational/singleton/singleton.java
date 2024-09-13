package creational.singleton;

public class singleton {

    private static singleton connection = null;

    // private singleton(){
    //     makeAConnection();
    // }

    //this method is used to make a connection to the database
    private static singleton makeAConnection() {

        if (connection == null)
            connection = new singleton();
    
        return connection;       
    }

    private void makeConnection(){
        System.out.println("Data base connected");
    }
    public static void main(String[] args) {

        singleton newConnection = singleton.makeAConnection();
        newConnection.makeConnection();
        singleton newConnection1 = singleton.makeAConnection();
        newConnection1.makeConnection();
   
        if (newConnection == newConnection1){
            System.out.println("Both are the same connection");
        }
        else{
            System.out.println("They are different");
        }
    }
}
