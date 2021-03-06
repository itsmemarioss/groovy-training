//docker run --rm -d -e MYSQL_DATABASE=db -e MYSQL_ROOT_PASSWORD=root mysql

@Grapes(
        @Grab(group='mysql', module='mysql-connector-java', version='8.0.22')
)
@GrabConfig(systemClassLoader=true)

import java.sql.DriverManager
import groovy.sql.Sql

DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver())

//com.mysql.jdbc.Driver

String username = "root"
String password = "root"
String uri = "jdbc:mysql://localhost:3306/db?autoReconnect=true&useSSL=false"

def sql = Sql.newInstance(uri, username, password, "com.mysql.cj.jdbc.Driver")

sql.execute "drop table if exists users"

sql.execute '''
    create table users (
        id int not null,
        username varchar(45) not null,
        primary key(id)
    );
'''

sql.eachRow("select * from users") { row ->
    println row.username
}

sql.close()