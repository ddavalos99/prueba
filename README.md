# prueba
$ tree ./src/main/java/com/tareas/prueba/

./src/main/java/com/tareas/prueba/
├── PruebaApplication.java
├── config
│   ├── CORSFilter.java
│   └── ExceptionAdvice.java
├── controller
│   └── TareaController.java
├── domain
│   └── User.java
├── dao (repository)
│   └── TareaDao.java
├── model
│   └── Tarea.java
│   └── TareaDto.java
│   └── ApiResponse.java
└── service
    └── TareaService.java
    └── impl
        └── TareaServiceimpl.java

Prueba (Spring Boot + JPA + Swagger + Mysql)

Instalar cualquier cliente de Mysql (Ampp o Xampp)

-Levantar Base de datos y cliente Mysql.

BackEnd Tareas(instalación):

Abrir Eclipse 2019:

1.-Importar proyecto "Maven" en Eclipse

2.-Actualizar Dependencias POM de Maven

 -En carpeta de proyecto ******* boton derecho Maven Update Project (ó Alt + F5)

3.-Compilar Proyecto y correr:

 -En carpeta de proyecto ******** boton derecho (Maven Install)
 -En carpeta de proyecto ******** boton derecho Run As Spring Boot App

4.-Revisar Api de servicios en navegador o Postman: 

API Servicio Tareas
http://localhost:8080/tareas/

Documentación Swagger
http://localhost:8080/swagger-ui.html#/

Front End Tareas(instalación):

1.-Abrir cmd en modo administrador:

>npx create-react-app my-tarea-app
>cd my-tarea-app

2.-Dentro de capeta my-tarea-app , agregar Material UI a proyecto react:

>npm install @material-ui/core
>npm install @material-ui/icons

3.-Incorporar libreria de ruteo a proyecto:

>npm add react-router-dom

4.-Incorporar Servicio Axios para las llamadas a la API Rest a proyecto:

>npm add axios

5.-Correr App:

>npm start

6.- Revisar App en Cualquier navegador (Chrome o Firefox o Edge):

http://localhost:8080/tareas
