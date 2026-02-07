# Proyecto de Cierre: Plataforma de Gestión de Cursos en Línea

## Enunciado del Proyecto

El objetivo de este proyecto es desarrollar una **Plataforma de Gestión de Cursos en Línea** utilizando **Java** y aplicando los conceptos aprendidos durante el curso: **POO, manejo de excepciones, propagación de errores, logging con Log4j 2 y pruebas unitarias con JUnit**.

### Requerimientos del proyecto:

1.  **Gestión de Cursos:**

    -   Crear cursos con código, nombre y capacidad máxima de
        estudiantes.
    -   Listar todos los cursos disponibles.
    -   Buscar cursos por código.

2.  **Gestión de Estudiantes:**

    -   Crear estudiantes con ID, nombre y correo.

3.  **Gestión de Inscripciones:**

    -   Inscribir estudiantes a cursos.
    -   Controlar la capacidad máxima de los cursos.
    -   Listar inscripciones por estudiante.

4.  **Manejo de Excepciones Personalizadas:**

    -   `CursoLlenoException`: cuando un curso no tiene cupos
        disponibles.
    -   `EstudianteNoEncontradoException`: cuando un estudiante no tiene inscripciones o no se encuentra.

5.  **Logging con Log4j 2:**

    -   Registrar eventos importantes: creación de cursos, inscripciones
        exitosas, errores, advertencias.

6.  **Pruebas Unitarias con JUnit 5:**

    -   Validar la creación de cursos, inscripciones y manejo de
        excepciones.


------------------------------------------------------------------------

## Estructura de Carpetas del Proyecto

``` plaintext
plataforma-cursos/
│── pom.xml                     # Archivo de configuración Maven
│
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── plataforma
    │   │           └── cursos
    │   │               ├── App.java               # Clase principal
    │   │               │
    │   │               ├── model                  # Clases del dominio
    │   │               │   ├── Curso.java
    │   │               │   ├── Estudiante.java
    │   │               │   └── Inscripcion.java
    │   │               │
    │   │               ├── exception              # Excepciones personalizadas
    │   │               │   ├── CursoLlenoException.java
    │   │               │   └── EstudianteNoEncontradoException.java
    │   │               │
    │   │               ├── service                # Lógica de negocio
    │   │               │   ├── CursoService.java
    │   │               │   └── InscripcionService.java
    │   │               │
    │   │               └── util                   # Utilidades (opcional)
    │   │                   └── LoggerConfig.java
    │   │
    │   └── resources
    │       └── log4j2.xml                          # Configuración Log4j 2
    │
    └── test
        └── java
            └── com
                └── plataforma
                    └── cursos
                        ├── CursoServiceTest.java         # Pruebas unitarias JUnit
                        └── InscripcionServiceTest.java   # Pruebas unitarias JUnit
```

------------------------------------------------------------------------

## Notas finales

-   Los estudiantes deben **manejar las excepciones con try-catch** y
    propagar errores donde corresponda.
-   Se recomienda **registrar eventos importantes con Log4j 2** para
    tener trazabilidad de las operaciones.
-   Las pruebas unitarias deben cubrir la creación de cursos,
    inscripciones, y validación de excepciones.
-   Este proyecto puede **escalar** en el futuro agregando: base de
    datos, interfaz gráfica, reportes o integración web.
