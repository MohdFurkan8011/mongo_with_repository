# Mongo Repository



#### Configuration

database name **repository** and there are two collections named **employee** and **student**.



This demo has two controllers one for Employee with basic CUUD operation, second for Student with embedded documents.



#### Employee API

1. localhost:8080/employee (Get API)   **returns all employee list**

2. localhost:8080/employee/id (Get API) **returns employee by id** 

3. localhost:8080/employee  (Post API) **saves and returned persistent employee**

   **Payload**

   {

   ​	"firstName": "firstName",

   ​	"lastName": "lastName",

   ​	"address": "address"

   }

4. localhost:8080/employee/id (Put API) - **updates and returns persistent employee**

   **Payload**

   {

   ​	"firstName": "firstName",

   ​	"lastName": "lastName",

   ​	"address": "address"

   }

5. localhost:8080/employee/id (Delete API) - **deletes employee by id**

   

#### Student API

1. localhost:8080/student (Get API) - **returns all student list**

2. localhost:8080/student/id (Get API) - **returns student by id**

3. localhost:8080/student (Post API) - **saves student with embedded document address**

   **Payload**

   {

   ​	"firstName": "firstName",

   ​	"lastName": "lastName",

   ​	"gender" : 'M'

   ​	"address" : {

   ​		"address1" : "address1",

   ​		"city": "city",

   ​		"state": "state",

   ​		"pincode" : "pincode"	

   ​	},

   ​	"courses": [

   ​		{"courseName": "course1"},

   ​		{"courseName": "course2"}

   ​	]

   }
