<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
.screenshot {
      display: flex;
      justify-content: space-around;
      flex-wrap: wrap;
    }
.screenshot img {
      width: 45%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }
  </style>
</head>
<body>
  <header>
    <h1>Employee Management System</h1>
  </header>
  <main>
    <section>
      <h2>Overview</h2>
      <p>
        The <strong>Employee Management System</strong> is a Java-based project designed to manage employee information efficiently. This system provides essential CRUD (Create, Read, Update, Delete) operations and helps small to medium-sized organizations maintain organized employee records.
      </p>
    </section>

  <section>
      <h2>Features</h2>
      <ul>
        <li><strong>Add Employee:</strong> Easily add new employee details, including name, ID, department, and role.</li>
        <li><strong>Update Employee:</strong> Modify existing employee records with a seamless interface.</li>
        <li><strong>View Employee:</strong> Search and display employee information by ID or department.</li>
        <li><strong>Remove Employee:</strong> Delete employees securely, with confirmation to prevent accidental deletions.</li>
      </ul>
    </section>

  <section>
      <h2>Technologies Used</h2>
      <ul>
        <li><strong>Java:</strong> Core application logic.</li>
         <li><strong>MySQL:</strong> Database for persistent storage of employee records.</li>
        <li><strong>File Handling/Database Integration:</strong> Persistent data storage options (text files or SQLite).</li>
        <li><strong>CLI/GUI:</strong> Command-line interface or simple graphical user interface using Java Swing.</li>
      </ul>
    </section>

  <section>
      <h2>How to Run</h2>
      <ol>
        <li>Clone this repository:
          <pre>git clone https://github.com/shubhmrwt/Employee-Management-System.git</pre>
        </li>
        <li>Open the project in your preferred IDE or compile with:
          <pre>javac EmployeeManagementSystem.java</pre>
        </li>
        <li>Run the application:
          <pre>java EmployeeManagementSystem</pre>
        </li>
      </ol>
    </section>
    <section>
      <h2>Screenshots</h2>
      <div class="screenshot">
        <img style=" width: 75%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" src="src/icons/splash.png" alt="Splash Screen">
        <img style=" width: 75%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" src="src/icons/login.png" alt="Login Screen">
        <img style=" width: 75%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" src="src/icons/home.png" alt="Home Screen">
        <img style=" width: 75%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" src="src/icons/addEmployee.png" alt="Add Employee Screen">
        <img style=" width: 75%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" src="src/icons/viewEmployee.png" alt="View Employee Screen">
        <img style=" width: 75%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" src="src/icons/updateEmoloyee.png" alt="Update Employee Screen">
        <img style=" width: 75%;
      height: auto;
      border-radius: 8px;
      margin: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" src="src/icons/removeEmployee.png" alt="Remove Employee Screen">
      </div>
    </section>

    
   <section>
      <h2>Future Enhancements</h2>
      <ul>
        <li>Advanced search and filters for better navigation of employee records.</li>
        <li>Enhanced UI using JavaFX for a modern graphical interface.</li>
        <li>Role-based access control for secure operations.</li>
        <li>Cloud integration for scalability.</li>
      </ul>
    </section>

   <section>
      <h2>Contributing</h2>
      <p>
        Contributions are welcome! Please fork the repository and submit a pull request with your enhancements. Ensure code quality and add comments for clarity.
      </p>
    </section>

  <section>
      <h2>License</h2>
  </section>
  </main>

  <footer>
    <p>© 2024 Employee Management System Project by Shubham Rawat</p>
  </footer>
</body>
</html>
