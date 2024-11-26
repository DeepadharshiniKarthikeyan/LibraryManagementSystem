This is a Library Management System application designed to help manage books, users, and borrowing records efficiently. 
The system provides a simple and intuitive interface for library staff and members to perform various tasks.
Features
Add, edit, and delete books from the library catalog. 
Technologies Used 
Java (Spring Boot)
Maven (Build tool) 
Thymeleaf (Template Engine) 
HTML/CSS/JavaScript (Frontend)
How to Run 
1.git clone https://github.com/DeepadharshiniKarthikeyan/libraryManagementSystem.git
2.Navigate to the project folder: cd libraryManagementSystem
3.Build the project: mvn clean install
4.Run the application: mvn spring-boot:run
5.Access the application in your browser at: http://localhost:8081/add 
File Structure 
Deepa [boot] [devtools]
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.demo
│   │   │   │   ├── LibraryApplication.java
│   │   │   │   ├── controller
│   │   │   │   │   └── BookController.java
│   │   │   │   ├── model
│   │   │   │   │   └── Book.java
│   │   │   │   ├── repository
│   │   │   │   │   └── BookRepository.java
│   │   │   │   └── service
│   │   │   │       └── BookService.java
│   │   ├── resources
│   │       ├── static
│   │       ├── templates
│   │       │   ├── add-book.html
│   │       │   └── list-books.html
│   │       └── application.properties
│   ├── test
│       └── java
├── JRE System Library [JavaSE-17]
├── Maven Dependencies
├── target
│   ├── generated-sources
│   │   └── annotations
│   └── generated-test-sources
│       └── test-annotations
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
