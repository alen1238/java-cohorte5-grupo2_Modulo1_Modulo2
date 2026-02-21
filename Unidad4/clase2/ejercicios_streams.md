# Ejercicios prácticos sobre Java Streams

## Ejercicio 1: Analizando las estadísticas de una red social universitaria

### Enunciado
Una universidad ha creado una pequeña red social interna para que los estudiantes compartan sus intereses, hobbies y proyectos. Con una lista de usuarios, cada uno con nombre, edad, carrera, número de publicaciones e intereses, realiza las siguientes tareas usando Java Streams:
1. Filtrar a los usuarios mayores de 20 años.
2. Obtener la lista de nombres de los estudiantes de Ingeniería de Sistemas que tienen más de 5 publicaciones.
3. Calcular el promedio de edad de los usuarios que tienen el interés "IA" (Inteligencia Artificial).
4. Listar todos los intereses únicos de los usuarios.
5. Encontrar al usuario con más publicaciones.

### Tips y sugerencias
- Usa `filter` para aplicar varias condiciones.
- Usa `map` para extraer nombres o edades.
- Usa `collect(Collectors.toList())` y `collect(Collectors.toSet())` para recolectar los resultados.
- Usa `flatMap` para manejar listas anidadas de intereses.
- Usa `max(Comparator.comparing(...))` para encontrar al usuario con más publicaciones.

---

## Ejercicio 2: Recomendador de películas personalizadas usando Streams

### Enunciado
Una startup quiere desarrollar un sistema que recomiende películas a sus usuarios. Con una lista de películas que incluye título, género, calificación promedio y año de estreno, realiza lo siguiente:
1. Filtrar las películas con calificación promedio mayor o igual a 8.
2. Filtrar las que correspondan al género preferido del usuario.
3. Ordenar las películas por calificación descendente y año más reciente.
4. Mapear para obtener solo los títulos.
5. Recolectar los 5 títulos más recomendados.

Además:
- Mostrar todos los géneros únicos en la base de datos.
- Calcular el promedio de calificación de todas las películas de los últimos 5 años.

### Tips y sugerencias
- Usa `filter` para aplicar condiciones sobre calificación y género.
- Usa `sorted` con `Comparator.comparing(...).reversed()` para ordenar por calificación y año.
- Usa `limit(n)` para obtener las primeras n películas.
- Usa `map` para transformar objetos en sus títulos.
- Usa `mapToDouble` y `average()` para obtener promedios.

---

## Ejercicio 3: Gestión de gastos personales

### Enunciado
Dispones de una lista de transacciones financieras, cada una con fecha, categoría, monto y tipo (ingreso o gasto). Usando Java Streams:
1. Filtrar las transacciones de tipo "gasto" de los últimos 3 meses.
2. Calcular el total gastado por categoría.
3. Determinar la categoría en la que más se gasta.
4. Calcular el promedio de ingresos en el último mes.

### Tips y sugerencias
- Usa `filter` para seleccionar transacciones recientes y por tipo.
- Usa `collect(Collectors.groupingBy(..., Collectors.summingDouble(...)))` para agrupar y sumar por categoría.
- Usa `max(Comparator.comparing(...))` para encontrar la categoría de mayor gasto.

---

## Ejercicio 4: Análisis de rendimiento académico

### Enunciado
Una universidad tiene un registro de calificaciones de estudiantes, cada una con estudiante, asignatura, nota y periodo académico. Usando Java Streams:
1. Filtrar las calificaciones del último periodo.
2. Calcular el promedio general de cada estudiante.
3. Identificar a los estudiantes con promedio mayor a 4.0.
4. Listar las asignaturas en las que más estudiantes tienen calificación sobresaliente (>=4.5).

### Tips y sugerencias
- Usa `filter` para seleccionar por periodo.
- Usa `collect(Collectors.groupingBy(..., Collectors.averagingDouble(...)))` para calcular promedios.
- Usa `flatMap` y `collect(Collectors.groupingBy(..., Collectors.counting()))` para contar asignaturas sobresalientes.

---

## Ejercicio 5: Análisis de ventas de una tienda en línea

### Enunciado
Una tienda en línea tiene una lista de pedidos, cada uno con cliente, productos, monto total y fecha. Usando Java Streams:
1. Filtrar los pedidos realizados en el último trimestre.
2. Calcular los ingresos totales por cliente.
3. Identificar al cliente con el mayor volumen de compras.
4. Listar los productos más vendidos y su cantidad.

### Tips y sugerencias
- Usa `filter` para seleccionar pedidos recientes.
- Usa `collect(Collectors.groupingBy(..., Collectors.summingDouble(...)))` para sumar ingresos por cliente.
- Usa `flatMap` para descomponer listas de productos y `collect(Collectors.groupingBy(..., Collectors.counting()))` para contar los más vendidos.

