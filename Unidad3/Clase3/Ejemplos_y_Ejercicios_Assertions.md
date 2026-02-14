#  Ejercicios asistidos con JUnit 5 y Assertions

En este documento encontrarás ejemplos y luego **ejercicios para resolver** con los métodos más comunes de la clase `Assertions` en **JUnit 5**.

---

## 1. `assertEquals(expected, actual)`
**Ejemplo:**  
```java
assertEquals(4, 2 + 2); // pasa porque 2+2 es igual a 4
```
**Ejercicio:**  
Verifica que la suma de `7 + 8` sea igual a `15`.

---

## 2. `assertNotEquals(unexpected, actual)`
**Ejemplo:**  
```java
assertNotEquals(10, 5 + 3); // pasa porque 5+3 es 8, no 10
```
**Ejercicio:**  
Prueba que la resta de `20 - 4` **no sea igual** a `30`.

---

##  3. `assertTrue(condition)`
**Ejemplo:**  
```java
assertTrue(6 > 2); // pasa porque 6 es mayor que 2
```
**Ejercicio:**  
Verifica con una prueba que el número `12` es mayor que `5`.

---

##  4. `assertFalse(condition)`
**Ejemplo:**  
```java
assertFalse(3 > 5); // pasa porque 3 NO es mayor que 5
```
**Ejercicio:**  
Verifica con una prueba que `8` **no es menor** que `2`.

---

##  5. `assertNull(object)`
**Ejemplo:**  
```java
String texto = null;
assertNull(texto); // pasa porque el objeto es null
```
**Ejercicio:**  
Crea un método que devuelva `null` si recibe una cadena vacía y valida este comportamiento.

---

##  6. `assertNotNull(object)`
**Ejemplo:**  
```java
String mensaje = "Hola mundo";
assertNotNull(mensaje); // pasa porque el objeto no es null
```
**Ejercicio:**  
Crea un método que devuelva el texto `"JUnit Rocks!"` y verifica que el resultado **no sea null**.

---

##  7. `assertThrows(exception, executable)`
**Ejemplo:**  
```java
assertThrows(ArithmeticException.class, () -> {
    int x = 10 / 0; // lanzar excepción
});
```
**Ejercicio:**  
Prueba que dividir `100 / 0` lance una excepción `ArithmeticException`.

---

## 8. `assertDoesNotThrow(executable)`
**Ejemplo:**  
```java
assertDoesNotThrow(() -> {
    int resultado = 5 * 5; // no lanza excepción
});
```
**Ejercicio:**  
Crea una prueba que verifique que calcular `50 - 25` se ejecuta sin lanzar ninguna excepción.

---

