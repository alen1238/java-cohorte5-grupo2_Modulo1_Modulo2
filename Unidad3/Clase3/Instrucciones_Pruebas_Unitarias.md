# Ejecución de pruebas unitarias con Maven y VS Code

Este documento explica cómo ejecutar **método por método** las pruebas unitarias con JUnit 5 en un proyecto **Maven** usando **VS Code**.

---

## 🔹 1. Ejecutar método por método desde VS Code
1. Asegúrate de tener instalada la extensión **Java Test Runner** (Microsoft).
2. Abre tu clase de pruebas `CalculadoraTest`.
3. Encima de cada método anotado con `@Test` verás un icono ▶️ (**Run Test**).
4. Haz clic en ese icono y se ejecutará únicamente ese método.
5. Si quieres correr todos los métodos de la clase, usa el icono ▶️ en la parte superior de la clase.

---

## 🔹 2. Ejecutar método por método con Maven en la terminal
Desde la raíz del proyecto, puedes correr solo un método así:

```bash
mvn -Dtest=CalculadoraTest#testSuma test
```

Esto ejecuta únicamente el método `testSuma()` dentro de la clase `CalculadoraTest`.

Si deseas ejecutar varios métodos específicos, sepáralos con `+`:

```bash
mvn -Dtest=CalculadoraTest#testSuma+testDivision test
```

---

## 🔹 3. Interpretación de los resultados
Al ejecutar una prueba unitaria verás un reporte en la terminal o en el panel de pruebas de VS Code:

- ✅ **Verde / Passed** → La prueba pasó exitosamente. El resultado obtenido coincide con el esperado.
- ❌ **Rojo / Failed** → La prueba falló. Significa que el valor esperado no coincide con el obtenido o se lanzó una excepción no prevista.
- ⚠️ **Error** → Hubo un problema en la ejecución (ejemplo: configuración, compilación, dependencia faltante).

Ejemplo de interpretación:

- Si ejecutas `testDivision()` y el resultado es verde, significa que `dividir(6,3)` devolvió `2` como se esperaba.  
- Si ejecutas `testDivisionPorCero()` y pasa, significa que el método lanzó correctamente la excepción `IllegalArgumentException` con el mensaje *"No se puede dividir por cero"*.  
- Si alguna prueba marca en rojo, significa que tu implementación de `Calculadora` no cumple con el comportamiento esperado y deberías revisarla.

