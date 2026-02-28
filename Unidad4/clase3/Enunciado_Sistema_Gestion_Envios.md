# Proyecto: Sistema Inteligente de Gestión de Envíos

## Contextualización de negocio

Una empresa de logística internacional desea optimizar el análisis de
sus envíos diarios.\
Cada envío registrado en el sistema contiene información relevante sobre
su operación y estado actual.

Cada envío cuenta con los siguientes atributos:

-   Código de envío
-   Ciudad de destino
-   Peso en kilogramos
-   Costo del envío
-   Estado (ENTREGADO, EN_TRANSITO, CANCELADO)

La dirección necesita un sistema de consultas que permita analizar
rápidamente los envíos aplicando transformaciones encadenadas usando la
API de Streams de Java.


Buscamos desarrollar una estructura de servicio que permita ejecutar consultas
avanzadas sobre la colección de envíos, utilizando múltiples operaciones
en cascada (`filter`, `map`, `sorted`, conversiones y cálculos
estadísticos).

------------------------------------------------------------------------

## Requerimientos funcionales

El sistema debe permitir:

1.  Obtener los códigos de los envíos entregados cuyo peso sea mayor a
    un valor determinado.
2.  Consultar los envíos con destino a una ciudad específica y
    ordenarlos por costo de menor a mayor.
3.  Calcular una lista de costos aplicando un incremento porcentual por
    recargo logístico.
4.  Obtener los códigos en mayúsculas de los envíos que estén en
    tránsito y superen cierto costo.
5.  Calcular el costo promedio de los envíos entregados.
6.  Obtener una lista de ciudades únicas a las que se hayan enviado
    paquetes (sin repetir).

------------------------------------------------------------------------

## Requisitos técnicos

-   Utilizar Java Streams.
-   Aplicar múltiples operaciones encadenadas en cada consulta.
-   Implementar una clase de servicio que centralice la lógica.
-   Crear métodos auxiliares para imprimir resultados.
-   Mantener una estructura limpia y organizada del proyecto.

------------------------------------------------------------------------

## Meta del ejercicio para los estudiantes

Consolidar el dominio de:

-   Transformaciones en cascada.
-   Encadenamiento de múltiples `filter()` y `map()`.
-   Conversión de tipos dentro de Streams.
-   Uso de `sorted()`, `distinct()` y estadísticas.
-   Separación de responsabilidades mediante una capa de servicio.
