# Reserva-Canchas
README para Sistema-Reservas API

Índice

Descripción

Características

Requisitos

Instalación

Uso

Rutas de la API en https://drive.google.com/drive/folders/1L-gvJHszgeUs6EaBPsW1Gt1E9cnnR21F?usp=sharing

Descripción

Nombre de la API: Sistema-Reservas

Sistema-Reservas permite a los usuarios realizar reservas de canchas de fútbol 5 y 7 en el predio Las Canchas. Los usuarios pueden registrarse, iniciar sesión y reservar canchas de manera sencilla y sin necesidad de contactar directamente con el predio. El sistema permite a los administradores gestionar las reservas, incluyendo la capacidad de ver, agregar, editar o borrar las reservas existentes.

Horarios de apertura: 15:00 a 23:00.

Canchas disponibles: Fútbol 5 y Fútbol 7.

Tecnologías utilizadas: Spring Boot, Maven, Lombok, JDK 22+, PostgreSQL 16, Dbeaver

Características

Registro de usuarios.

Inicio de sesión.

Realización de reservas de canchas. PENDIENTE

Gestión de reservas por parte del administrador (ver, agregar, editar, borrar). PENDIENTE

Requisitos

Entorno de ejecución: Intellij IDEA.

Dependencias principales:

Java

Spring Boot

Maven 3.9.6

Instalación

Links a descargar de los instaladores

Java JDK - https://www.oracle.com/ar/java/technologies/downloads/

Maven - https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/

Postgresql - https://www.postgresql.org/download/

Dbvear - https://dbeaver.io/download/

Lombock - https://projectlombok.org/download

Postman - https://www.postman.com/downloads/

IntellijIDEA - https://www.jetbrains.com/idea/download/

Realizar la instalación de los archivos requeridos para el sistema.
-Tener en cuenta que maven y lombok se instalan en la carpeta Java.

Instalar variables de entorno MAVEN_HOME y JAVA_HOME
En Buscar, busque y seleccione: Sistema (Panel de control)

Haga clic en el enlace Configuración avanzada del sistema.

Haga clic en Variables de entorno. En la sección Variables del sistema busque la variable de entorno PATH y selecciónela. Haga clic en Editar. Si no existe la variable de entorno PATH haga clic en Nuevo.

En la ventana Editar la variable del sistema (o Nueva variable del sistema), debe especificar el valor de la variable de entorno PATH. Haga clic en Aceptar. Cierre todas las demás ventanas haciendo clic en Aceptar.

Vuelva a abrir la ventana del indicador de comandos y ejecute el código de java.

ACLARACIÓN: en el PATH debe ir para JAVA_HOME el bin de Java, y en MAVEN_HOME el bin de Maven.

BASE DE DATOS
Conexión de la base Postgres - localhost:5432

Usuario:postgres , password:1234

Realizar en Dbvear la creación de la base de datos, y restaurar con la imagen “SistemaReservas.sql”

Uso

Utilizar Postman para pribar la Apí

Rutas de la API

Estan en la colection verlas ahi mismo.

Correr el proyecto desde Intelij
