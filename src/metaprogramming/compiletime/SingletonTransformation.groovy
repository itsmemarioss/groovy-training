@groovy.lang.Singleton
class DatabaseConnection {

}

//DatabaseConnection db = new DatabaseConnection() //java.lang.RuntimeException: Can't instantiate singleton DatabaseConnection. Use DatabaseConnection.instance
DatabaseConnection db = DatabaseConnection.instance

