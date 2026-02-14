# Sistema de Gestión de Pedidos

## Contexto

Una tienda necesita un sistema para gestionar los pedidos realizados por sus clientes.
Cada pedido puede contener varios productos, y un cliente puede realizar múltiples pedidos.

El sistema debe garantizar:
- Que los productos existan antes de agregarlos a un pedido.
- Que un pedido no tenga productos duplicados.
- Que se pueda consultar el historial de pedidos de un cliente.
- Que el sistema sea fácil de mantener y escalar.

## Requerimientos

1. Registrar productos en el sistema.
2. Registrar clientes.
3. Crear pedidos para un cliente.
4. Agregar productos a un pedido.
5. Evitar productos duplicados en un pedido.
6. Consultar los pedidos de un cliente.
7. Calcular el total de un pedido.

## Restricciones

- Usar Java.
- Usar Programación Orientada a Objetos.
- Usar colecciones del Framework de Java.
- No usar base de datos.
- No usar interfaces gráficas.

## Objetivo

Comprender el uso real de List, Set y Map dentro de una arquitectura básica profesional.


# Sistema de Control de Turnos y Citas

## Contexto

Una entidad de atención al público necesita un sistema para gestionar los turnos de sus usuarios.
Cada usuario puede solicitar uno o varios turnos, pero no puede tener dos turnos en el mismo horario.

El sistema debe permitir organizar, consultar y controlar los turnos de forma eficiente,
garantizando el orden de atención y evitando inconsistencias en la asignación de citas.

Este proyecto simula un escenario real donde el programador debe tomar decisiones correctas
sobre estructuras de datos y diseño orientado a objetos.

## Requerimientos Funcionales

1. Registrar usuarios en el sistema.
2. Crear turnos para un usuario en una fecha y hora específicas.
3. Evitar que un usuario tenga dos turnos en el mismo horario.
4. Mantener el orden de atención de los turnos.
5. Consultar los turnos asignados a un usuario.
6. Mostrar la agenda completa de turnos.

## Restricciones Técnicas

- Usar Java.
- Usar Programación Orientada a Objetos.
- Usar colecciones del Framework de Java.
- No usar base de datos.
- No usar interfaces gráficas.
- Toda la información se maneja en memoria.

## Objetivo Pedagógico

Comprender el uso real de List, Set y Map para resolver un problema cotidiano
presente en múltiples sistemas profesionales.