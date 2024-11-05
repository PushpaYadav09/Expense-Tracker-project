# Expense-Tracker-project
Overview

Project Name: Expense Tracker

Technologies Used: Java, Java Swing, JDBC, MySQL

Objective

The primary objective of the Expense Tracker project is to provide users with an efficient and user-friendly application to track their daily expenses. This tool helps individuals categorize expenses, set budgets, and analyze spending habits to promote better financial management.

Key Features

-User Authentication: Secure login functionality to ensure that only authorized users can access their data.

-Add Expense: Users can add new expenses with details like amount, category, date, and description.

-View Expenses: A feature to view all recorded expenses in a clear and organized manner, with options to sort and filter.

-Update and Delete: Users can modify or remove existing expenses as needed.

-Search Functionality: A robust search feature allowing users to filter expenses by date range, category, or amount.

-Budgeting: Users can set monthly budgets and track their spending against these budgets.
Architecture

The application follows a three-tier architecture:

-Presentation Layer: Built with Java Swing, providing a graphical user interface for interaction.

-Business Logic Layer: Implements core functionalities, handling user input and processing data.

-Data Access Layer: Uses JDBC to connect to a MySQL database, performing all database operations.
Data Structure

The database consists of a table for expenses with the following columns:

ExpenseID (Primary Key)

Amount

Category

Date

Description
UserID (to associate expenses with users)
Implementation Highlights
Data Integrity: Used constraints in MySQL to maintain data integrity, including primary keys and foreign keys.
Efficiency: Implemented connection pooling in JDBC to enhance performance by reusing database connections.
User-Centric Design: Iterated the UI design based on user feedback to ensure usability and accessibility.
Challenges Faced
Database Connection Management: Initially faced performance issues due to poor connection management, which I resolved by implementing connection pooling.
User Interface Design: It took multiple iterations to create an intuitive UI, but user testing helped refine the design.
Future Improvements
Enhancing UI: Transitioning to JavaFX for a more modern and responsive user interface.
Web Version: Considering developing a web application using Spring Boot and RESTful APIs to increase accessibility.
Data Visualization: Adding graphical representations of spending habits, such as charts and graphs, to help users understand their financial behavior better.
Conclusion
This Expense Tracker project has provided me with hands-on experience in application development, database management, and user-centered design. It highlights my ability to create functional, efficient software solutions that address real-world problems.



