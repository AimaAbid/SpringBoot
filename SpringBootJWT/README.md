
# SpringBoot API

RESTAPI Using Spring Boot, this project follows MVC architecture


## Usage/Examples
In order to use the Project you have to copy the git link and past paste that in the terminal of your system you can use the following command for that

    git clone repo-link


or else you can use the download zip option



## Run Locally

You can use any codeEditor or IDE but Vscode is recommended 

Firstly install SpringBoot Dashboard ,SpringBoot Tools and java 

Now navigate to the directory where you have downloaded the project , use the SpringBoot Dashboard to run the project (run the main App)



## APIs

The whole Project contains various RESTFUL apis

GET requests
1. /api/getbus
2. /route/getRoutes
3. /route/Route/{routename}
4. /route/city/{cityName}

POST requests
1. /api/addbus
2. /api/addRoute

GET requests can be performed by either using the Browser or using the postman

POST requests can be performed by using POSTMAN

You can download POSTMAN from the internet(Browser) and after installing it you will get an interface where you can select the type of request you want to perform ,While creating a POST request you have to send a payload in the form of JSON.
## Environment Variables

#Database

For the Database we have used the mongoDB and the mongoDB Connection String and DatabaseString is declared in Application.properties, you can replace the connectionString with your own connectionString.

