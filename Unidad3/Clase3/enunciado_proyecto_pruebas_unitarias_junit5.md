# Pruebas Unitarias con JUnit 5 -- Proyecto Integrador

## Contexto

En el desarrollo de software profesional, garantizar la calidad del
código es una responsabilidad fundamental. Las pruebas unitarias
permiten validar que las reglas de negocio se cumplan correctamente y
que los cambios futuros no rompan el comportamiento esperado del
sistema.

En este ejercicio, se trabajará con un **sistema bancario básico**, cuyo
objetivo es practicar la escritura de pruebas unitarias utilizando
**JUnit 5**, siguiendo buenas prácticas de testing en Java.

------------------------------------------------------------------------

## Descripción del sistema

El sistema está compuesto por las siguientes entidades:

-   **Cliente**: representa a un usuario del banco.
-   **CuentaBancaria**: gestiona el saldo y las operaciones financieras.
-   **Banco**: administra el conjunto de cuentas bancarias.
-   **TipoCuenta**: define el tipo de cuenta (ahorros o corriente).

Las clases del sistema ya se encuentran implementadas. El enfoque del
ejercicio es **exclusivamente el desarrollo de las pruebas unitarias**,
no la implementación de las clases.

------------------------------------------------------------------------

## Reglas generales

-   No se deben modificar las clases del sistema.
-   Cada método de prueba debe validar un único comportamiento.
-   Las pruebas deben ser independientes entre sí.
-   No se debe utilizar salida por consola para validar resultados.
-   Se deben usar únicamente las aserciones vistas en clase:
    -   `assertEquals`
    -   `assertThrows`
    -   `assertTrue`
    -   `assertFalse`
    -   `assertNotNull`

------------------------------------------------------------------------

## Estructura del proyecto

El proyecto debe respetar la siguiente estructura:

    src
     ├── main
     │   └── java
     │       └── com.devsenior.banco
     │           ├── Cliente.java
     │           ├── CuentaBancaria.java
     │           ├── Banco.java
     │           └── TipoCuenta.java
     └── test
         └── java
             └── com.devsenior.banco
                 ├── ClienteTest.java
                 ├── CuentaBancariaTest.java
                 └── BancoTest.java

------------------------------------------------------------------------

## Criterios de evaluación

-   Correcto uso de JUnit 5.
-   Claridad y legibilidad de las pruebas.
-   Validación adecuada de reglas de negocio.
-   Uso correcto de aserciones.
-   Ejecución exitosa de las pruebas.

