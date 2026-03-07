# Proyecto Final — Netflix Analytics (Java Collections + Streams)

## Contexto

Una plataforma de streaming tipo **Netflix** desea analizar el comportamiento de visualización de sus usuarios.  
Para este proyecto se desarrollará una **aplicación Java por consola** que simule un sistema de análisis de visualizaciones de películas.

El sistema **no utilizará base de datos**, pero deberá simular una capa de datos utilizando **colecciones de Java (`List`)**.

El objetivo principal del proyecto es **practicar el uso de Streams y operaciones sobre colecciones** para generar estadísticas sobre el uso de la plataforma.

---

# Objetivos de aprendizaje

En este proyecto deberán aplicar:

- `List`
- `Map`
- `Stream`
- `filter`
- `map`
- `groupingBy`
- `counting`
- `summingInt`
- `averagingInt`
- `sorted`
- `limit`
- `Comparator`
- `Collectors`

Además, deberán organizar el proyecto en **capas simples** simulando la estructura de un servicio real.

---

# Arquitectura del proyecto

El sistema debe implementarse utilizando **cuatro capas principales**:

## 1. Modelos (`model`)

Contienen las clases que representan las entidades del sistema.

Ejemplos:

- Pelicula
- Usuario
- Visualizacion
- Genero

---

## 2. Repositorio (`repository`)

Base de datos en memoria.

Debe contener listas con datos precargados:

- lista de usuarios
- lista de peliculas
- lista de visualizaciones

---

## 3. Servicio (`service`)

Aquí se deben implementar **todas las operaciones utilizando Streams**.

El servicio será responsable de procesar los datos y generar estadísticas.

---

## 4. Interfaz de usuario (`ui`)

Aplicación de **consola** que permita ejecutar las consultas del sistema.

Debe mostrar un **menú interactivo** con las diferentes opciones de análisis.

---

# Estructura de carpetas

El proyecto debe organizarse de la siguiente forma:

```text
netflix-analytics/
│
├── Main.java
│
├── model/
│   ├── Pelicula.java
│   ├── Usuario.java
│   ├── Visualizacion.java
│   └── Genero.java
│
├── repository/
│   └── DataRepository.java
│
├── service/
│   └── AnalyticsService.java
│
└── ui/
    └── ConsoleUI.java
```

---

# Modelos del sistema

El sistema debe incluir los siguientes modelos:

## Usuario

Representa un usuario de la plataforma.

Ejemplo de atributos:

- id
- nombre

---

## Pelicula

Representa una película disponible en la plataforma.

Ejemplo de atributos:

- id
- titulo
- genero
- duracion (en minutos)

---

## Genero

Enum que representa los géneros de las películas.

Ejemplos:

- ACCION
- DRAMA
- COMEDIA
- CIENCIA_FICCION
- TERROR

---

## Visualizacion

Representa cuando un usuario ve una película.

Ejemplo de atributos:

- usuario
- pelicula
- minutosVistos

---

# Datos precargados

El repositorio debe incluir **datos precargados**, por ejemplo:

- varios usuarios
- varias películas de diferentes géneros
- múltiples visualizaciones de películas por distintos usuarios

Estos datos permitirán generar estadísticas utilizando **Streams**.

---

# Funcionalidades que deben implementarse

El servicio de analytics debe permitir realizar las siguientes consults:

---

## 1. Peliculas mas vistas

Mostrar las películas ordenadas según la cantidad de visualizaciones.

Ejemplo de salida:

```text
Avengers -> 5 visualizaciones
Matrix -> 3 visualizaciones
Titanic -> 2 visualizaciones
```

---

## 2. Peliculas por genero

Agrupar todas las películas por su género.

Ejemplo:

```text
ACCION -> Avengers
DRAMA -> Titanic
COMEDIA -> Scary Movie
```

---

## 3. Tiempo total visto por usuario

Calcular cuántos **minutos de contenido ha visto cada usuario**.

Ejemplo:

```text
Ana -> 263 minutos
Carlos -> 335 minutos
Laura -> 223 minutos
```

---

## 4. Top usuarios

Mostrar los usuarios que **más tiempo han pasado viendo películas**.

Los resultados deben estar ordenados de mayor a menor.

Ejemplo:

```text
1. Carlos -> 335 minutos
2. Ana -> 263 minutos
3. Laura -> 223 minutos
```

Para ordenar los resultados se debe utilizar **Comparator**.

---

## 5. Promedio de duración de películas por género

Calcular el promedio de duración de las películas para cada género.

Ejemplo:

```text
ACCION -> 143 minutos
DRAMA -> 195 minutos
COMEDIA -> 90 minutos
```

---

# Interfaz de consola

El sistema debe mostrar un menú similar al siguiente:

```text
=== NETFLIX ANALYTICS ===

1. Peliculas mas vistas
2. Peliculas por genero
3. Tiempo total visto por usuario
4. Top usuarios
5. Promedio duracion por genero
0. Salir
```

Cada opción debe ejecutar la operación correspondiente del servicio.

---

# Requisitos técnicos

El proyecto debe cumplir con lo siguiente:

- Usar **Java Streams** para procesar las colecciones
- Usar **Collectors** para generar agrupaciones y estadísticas
- Usar **Comparator** para ordenar resultados
- Mantener **separación en capas**
- Utilizar **colecciones (`List`, `Map`)**
- Implementar **menú de consola**

---

# Desafío adicional (opcional)

Agregar al sistema nuevas consultas utilizando Streams, por ejemplo:

- Peliculas vistas por un usuario especifico
- Genero mas visto
- Pelicula con mayor tiempo total de reproduccion
- Usuarios que han visto mas de **N** minutos de contenido
- Ranking de peliculas por minutos totales vistos