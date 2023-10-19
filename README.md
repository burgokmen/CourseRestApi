Course REST API

Course REST API is a Java Spring Boot project designed to manage courses and grades for a student named Alex. The project includes the following features and tasks:

Getting Started:

Create a Spring Boot project using Spring Initializr.
Add the Spring Web dependency.
Install all dependencies using the Maven dependency management system.
Run the application on port 9000.

Define a Grade class with fields:

int coefficient
String note
Create a constructor for the Grade class.

Task 2:

Create a CourseController to manage courses.

Maintain a list of courses in the courses variable.

Use Dependency Injection for LowCourseGpa, MediumCourseGpa, and HighCourseGpa classes.

Implement CRUD operations and endpoints:

[GET] /workintech/courses: List all courses.
[GET] /workintech/courses/{name}: Retrieve a course by name.
[POST] /workintech/courses: Add a course and calculate total GPA.
[PUT] /workintech/courses/{id}: Update a course and calculate total GPA.
[DELETE] /workintech/courses/{id}: Delete a course.

Task 3:

Handle Errors:

Create error classes under the Exceptions package to manage possible error scenarios.
Implement global error handling.
Use @Slf4j for error logging.
Separate validation processes from the controller class.

Task 4:

Test the API:

Send requests to the API using Codepen or a React application.
Solve CORS (Cross-Origin Resource Sharing) errors if they occur.
