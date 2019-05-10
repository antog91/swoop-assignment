This project was created in Spring Tools Suite 4, which is basically a version of Eclipse.

When you open it in Spring Tools Suite 4 right click on the top level folder and "run as" and select "spring boot app".
This will start up a built in Tomcat server and you will be able to run the endpoints required on localhost:8080.

Running this endpoint "http://localhost:8080/math/add?n1=<numeric param 1>&n2=<numeric param 2>" with for example 
"http://localhost:8080/math/add?n1=4&n2=5" will produce a result of 9 in this example.

Running this endpoint "http://localhost:8080/math/add (allow for form params 1&2 in a POST body)" 
This endpoint will display a form where you can enter two different numbers and when you hit submit the response will be the addition of
the two numbers you entered.

Running this endpoint http://localhost:8080/airports will return all active airports in JSON format from the third party api suggested.

The Junits are located in src/test/java ControllerTests.java. These can be run with Spring Tools Suite 4.
