# Proyecto: Motor de Consultas para Catálogo Comercial

## Contextualización del negocio

Una cadena de tiendas departamentales desea modernizar su sistema
interno de análisis de catálogo.\
Actualmente cuentan con una colección digital que representa todos los
artículos disponibles en sus sucursales físicas y en su tienda en línea.

Cada artículo contiene la siguiente información:

-   Nombre del artículo
-   Categoría a la que pertenece
-   Precio
-   Estado de disponibilidad (disponible o no disponible)

La gerencia necesita desarrollar un **motor de consultas flexible** que
permita realizar transformaciones encadenadas sobre esta colección de
datos utilizando la API de Streams de Java.

--------------------------------------
El objetivo es construir una estructura de servicio que permita ejecutar múltiples
consultas dinámicas sobre el catálogo comercial, aplicando
transformaciones en cascada mediante `filter()`, `map()`, ordenamientos
y operaciones estadísticas.

------------------------------------------------------------------------

## Requerimientos funcionales

El sistema debe permitir:

1.  Obtener los nombres de los artículos disponibles cuyo precio sea
    mayor a un valor determinado.
2.  Consultar los artículos pertenecientes a una categoría específica y
    devolverlos ordenados por precio.
3.  Calcular una lista de precios aplicando un porcentaje de descuento.
4.  Obtener los nombres en mayúsculas de los artículos disponibles
    dentro de una categoría dada.
5.  Calcular el precio promedio de los artículos actualmente
    disponibles.

------------------------------------------------------------------------

## Requisitos técnicos

-   Utilizar Java Streams.
-   Aplicar múltiples operaciones encadenadas (`filter`, `map`,
    `sorted`, etc.).
-   Separar la lógica en una clase de servicio.
-   Implementar métodos auxiliares para imprimir resultados.
-   Mantener una estructura clara y organizada del proyecto.

------------------------------------------------------------------------

## Meta del ejercicio para el estudiante

Comprender y dominar:

-   Transformaciones en cascada.
-   Encadenamiento de múltiples `map()` y `filter()`.
-   Conversión de tipos dentro de Streams.
-   Aplicación de estadísticas sobre colecciones.
-   Organización de lógica en capa de servicio.
