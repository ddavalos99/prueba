# Coopeuch
Prueba Coopeuch(Spring Boot + JPA + Swagger + Mysql)

Instalar cualquier cliente de Mysql (Ampp o Xampp)

-Levantar Base de datos y cliente Mysql.

BackEnd Tareas(instalación):

Abrir Eclipse 2019:

1.-Importar proyecto "Maven" en Eclipse

2.-En carpeta de proyecto coopeuch boton derecho Run As Spring Boot App(Maven Install y Maven Clean)

3.-Revisar Api de servicios en navegador o Postman: 

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