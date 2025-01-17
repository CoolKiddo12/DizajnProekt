<<<<<<< HEAD
# DizajnProekt

Ирена Станчева 211200
=======
"# DIZAJN PROEKT" 

Needed technologies:
1.Intelij
2.WebStorm with installed node.js dependencies

To check functionality of the project after running it in Intelij in the browser go to http://localhost:8080/h2-console/login.jsp in the "JDBC URL:" put this "jdbc:h2:file:~/data/demo" in the "User Name:" put "dasdom" and in the "Password:" put "Finki123" (without " " on the password and user name and name of the URL). After connecting to the database run SELECT * FROM ISSUERS and u will get the table for the Issuers. After this if its all correct u will go to http://localhost:8080/api/issuers and u will see all the Issuers in a JSON format. From this point u are ready to go to WebStorm and run the front end u will have to npm install and start the server and it will open ur application on ur default browser. GL (ask questions in discord if smth doesn't work).

1. Clone the repository:
   ```bash
	<repo name>
2.In command prompt
   cd project-root
3.In command prompt
   cd backend
   mvn install
4.In command prompt
   cd frontend
   npm install
5.Start the backend server:
  mvn spring-boot:run
6.Start the frontend development server:
  npm start
  

Contributing
For working on the project use separate branches so its easier for debug:

1.Fork the repository.
2.Create a new branch (git checkout -b feature-branch).
3.Commit your changes (git commit -am 'Add new feature').
4.Push to the branch (git push origin feature-branch).
5.Create a new pull request.
>>>>>>> edb5768 (Fix issues with submodule and line endings)
