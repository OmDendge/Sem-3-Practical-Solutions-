# Module 5 – Question 3: Create database to store username and password

This solution creates a SQLite database and a `users` table with a unique username. The password column is named `password_hash` to emphasize that production apps must store a salted, slow password hash, never the raw password.

## Java
`UserDbHelper.java` creates the table and provides an insert method and a query method. For a classroom demonstration, call:
```java
UserDbHelper helper = new UserDbHelper(this);
boolean saved = helper.insertUser("student1", "DEMO_HASH_VALUE");
```
Replace `DEMO_HASH_VALUE` with a real password hash produced by a trusted authentication design; do not store a plaintext password.

## Table
`users(id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT UNIQUE NOT NULL, password_hash TEXT NOT NULL)`

The helper demonstrates database creation and basic insert/read access. SQLite is local storage, not a substitute for secure server-side authentication.
