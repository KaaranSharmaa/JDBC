JDBC connectivity steps
1. Import package
2. Load and register //optional step after java 8(Class.forName("com.mysql.cj.jdbc.Driver");)
3. Craete connection //Connection conn =DriverManager.getConnection(url,username,password);
4. Create statement
5. Execute statement 
6. Process and result
7. Close    conn.close();
