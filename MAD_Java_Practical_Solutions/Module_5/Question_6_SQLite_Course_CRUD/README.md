# Module 5 – Question 6: SQLite CRUD for COURSE table

The table contains `ID`, `Name`, `Duration`, and `Description`. `CourseDbHelper.java` implements:
- **Create:** `add(name, duration, description)`
- **Read:** `readAll()`
- **Update:** `update(id, name, duration, description)`
- **Delete:** `delete(id)`

## Example usage
```java
CourseDbHelper db = new CourseDbHelper(this);
long id = db.add("Android Development", "3 Months", "Java and Android basics");
Cursor c = db.readAll();
while (c.moveToNext()) {
    int courseId = c.getInt(0);
    String name = c.getString(1);
    String duration = c.getString(2);
    String description = c.getString(3);
}
c.close();
db.update((int) id, "MAD", "4 Months", "Android with Java");
db.delete((int) id);
```
The update/delete methods use parameterized selection arguments (`id=?`) to avoid SQL injection. Close Cursor after use.
