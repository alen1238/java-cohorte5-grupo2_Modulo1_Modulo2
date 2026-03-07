# Ejercicios de Java Streams con `Map.Entry`

## Clases y métodos implicados

Para resolver los ejercicios se utilizarán las siguientes clases e interfaces del JDK:

### 1. `Map<K,V>`
Representa una estructura de datos que almacena pares **clave → valor**.

Métodos importantes:

- `put(K key, V value)` → inserta un par clave-valor.
- `entrySet()` → devuelve un `Set<Map.Entry<K,V>>` con todos los pares del mapa.

---

### 2. `Map.Entry<K,V>`
Representa **un par clave-valor** dentro de un `Map`.

Métodos importantes:

- `getKey()` → devuelve la clave.
- `getValue()` → devuelve el valor.
- `Map.Entry.comparingByKey()` → crea un `Comparator` que ordena por clave.
- `Map.Entry.comparingByValue()` → crea un `Comparator` que ordena por valor.

---

### 3. `Stream<T>`
Representa un flujo de datos sobre el cual se pueden aplicar operaciones funcionales.

Métodos utilizados en los ejercicios:

- `stream()` → convierte una colección en un Stream.
- `sorted()` → ordena los elementos del stream.
- `limit(n)` → deja pasar solo los primeros `n` elementos.
- `forEach()` → recorre los elementos.
- `toList()` → convierte el stream en una lista.

---

## Ejercicio 1 — Convertir un Map en Stream de `Map.Entry`

### Objetivo
Transformar un `Map` en un stream de pares clave-valor usando `entrySet()`.

### Mapa de ejemplo

```java
Map<String, Integer> edades = new HashMap<>();

edades.put("Ana", 25);
edades.put("Carlos", 30);
edades.put("Laura", 28);
```

### Ejemplo 1 - Stream de Entryset 
Recorre el mapa utilizando `entrySet()` y `stream()` e imprime cada persona con su edad en el formato:
```text
Nombre -> edad
```
### Resultado esperado
```text
Ana -> 25
Carlos -> 30
Laura -> 28
```
### Solución
```java
edades.entrySet()
      .stream()
      .forEach(e -> 
          System.out.println(e.getKey() + " -> " + e.getValue())
      );
```

### Ejemplo 2 — Ordenar por clave
Ordena el mapa alfabéticamente por nombre.
#### Resultado esperado
```console
Ana -> 25
Carlos -> 30
Laura -> 28
```
#### Solución
```java
edades.entrySet()
      .stream()
      .sorted(Map.Entry.comparingByKey())
      .forEach(e ->
          System.out.println(e.getKey() + " -> " + e.getValue())
      );
```

#### Concepto nuevo
```java
Map.Entry.comparingByKey()
```
Crea un Comparator basado en la clave del Entry.


### Ejemplo 3 — Ordenar por valor
Ordena las personas por edad (menor a mayor).
#### Resultado esperado
```text
Ana -> 25
Laura -> 28
Carlos -> 30
```
#### Solución
```java
edades.entrySet()
      .stream()
      .sorted(Map.Entry.comparingByValue())
      .forEach(e ->
          System.out.println(e.getKey() + " -> " + e.getValue())
      );
```
#### Concepto nuevo
```java
Map.Entry.comparingByValue()
```
#### Compara usando:
```java
entry.getValue()
```
#### Ejemplo 4 — Orden descendente + Top N
Mostrar las 2 personas de mayor edad.
#### Resultado esperado
```text
Carlos -> 30
Laura -> 28
```
#### Solución
```java
edades.entrySet()
      .stream()
      .sorted(
          Map.Entry.<String,Integer>comparingByValue()
                  .reversed()
      )
      .limit(2)
      .forEach(e ->
          System.out.println(e.getKey() + " -> " + e.getValue())
      );
```
### Ejemplo 5
Dado un mapa de productos y ventas:
```java
Map<String,Integer> ventas = Map.of(
    "Laptop", 15,
    "Mouse", 40,
    "Teclado", 25,
    "Monitor", 10
);
```
Mostrar los 3 productos más vendidos.
#### Resultado esperado
```text
Mouse -> 40
Teclado -> 25
Laptop -> 15
```
#### Solución
```java
ventas.entrySet()
      .stream()
      .sorted(
          Map.Entry.<String,Integer>comparingByValue()
                  .reversed()
      )
      .limit(3)
      .forEach(e ->
          System.out.println(e.getKey() + " -> " + e.getValue())
      );
```
