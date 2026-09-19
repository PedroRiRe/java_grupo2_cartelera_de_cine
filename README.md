# Rama más actualizada MASTER.# 🎬 Proyecto Cartelera de Cine (Film Billboard Project)

Aplicación web desarrollada en equipo como proyecto final / transversal del curso de **Desarrollo Web con Java** (Fundación Adecco)[cite: 17, 19]. Permite la gestión integral de una cartelera de cine, con control de usuarios, salas, películas y proyecciones.

---

## 🚀 Tecnologías y Herramientas (Built with)

* **Backend:** Java SE, Spring Framework, Spring Security
* **Frontend:** HTML5, CSS3, Bootstrap
* **Gestión de Bases de Datos:** Maven
* **Control de versiones:** Git, GitHub
* **Entorno de desarrollo:** IntelliJ IDEA
* **Gestión de proyecto:** Trello

---

## 🏗️ Arquitectura de la Aplicación

La aplicación sigue un diseño modular estructurado en capas:
* **Entities & Enums:** Modelado de datos relacional.
* **Repositories:** Interacción con la base de datos.
* **Services & Implementations:** Lógica de negocio.
* **Controllers:** Gestión de peticiones HTTP y redirecciones.
* **Security:** Configuración de accesos y roles de usuario.

### Entidades principales:
* Dirección
* Cine
* Película (Film)
* Género
* Clasificación
* Sala (Room)
* Usuario (User)

---

## 👥 Autores y Contribuciones

* **Javier Guerra:** Coordinación, planificación, Trello, revisión de funcionalidades, seguridad de la aplicación, entidad de usuarios y direcciones.
* **Pedro Rivas:** Gestión del repositorio de Git/GitHub, desarrollo de las entidades de cine y sala (con todas sus funciones, relaciones y lógica de borrado).
* **Eduardo González:** Diseño UI/CSS, desarrollo de la entidad de películas, estructura de usuario, listado de películas y documentación general.
* **Dawid Lempicki:** Estructura de la entidad de salas (room), soporte en el listado de películas y presentación del proyecto.

---

## ⚙️ Cómo poner en marcha el proyecto

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone [https://github.com/PedroRiRe/java_grupo2_cartelera_de_cine.git](https://github.com/PedroRiRe/java_grupo2_cartelera_de_cine.git)