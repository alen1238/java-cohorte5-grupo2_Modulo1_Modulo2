# Ejercicios -- Uso de Logs en Java en Casos de Negocio

## Ejercicio 1 -- Sistema de Procesamiento de Pagos

### Contexto de negocio

Una empresa ofrece un servicio para procesar pagos de sus clientes.\
Cada vez que un cliente intenta realizar un pago, el sistema debe
validar la información y decidir si la transacción puede continuar o no.

El proceso de pago debe cumplir las siguientes reglas de negocio:

-   El monto del pago debe ser mayor que cero.
-   El cliente debe contar con saldo suficiente para realizar el pago.
-   Si el pago es válido y el saldo es suficiente, la transacción se
    aprueba.
-   Si alguna validación falla, el pago debe ser rechazado.

### Objetivo del ejercicio

Implementar la lógica necesaria para procesar un pago y utilizar
correctamente los niveles de logging (`DEBUG`, `INFO`, `ERROR`) para
registrar:

-   El inicio y fin del proceso de pago.
-   Los datos relevantes del pago durante su procesamiento.
-   Los errores que impidan completar la transacción.

El estudiante debe justificar el uso de cada nivel de log según el
contexto del negocio.

------------------------------------------------------------------------

## Ejercicio 2 -- Sistema de Gestión de Pedidos

### Contexto de negocio

Una tienda necesita un sistema para gestionar los pedidos realizados por
sus clientes.\
Cada pedido debe ser evaluado antes de ser confirmado, siguiendo una
serie de reglas de negocio claras.

Un pedido debe cumplir las siguientes condiciones:

-   El cliente debe estar activo.
-   El pedido debe contener al menos un producto.
-   El stock del producto debe ser suficiente para cubrir la cantidad
    solicitada.
-   El total del pedido no puede ser negativo.
-   Si todas las validaciones se cumplen, el pedido se confirma
    exitosamente.

### Objetivo del ejercicio

Implementar la lógica de validación y procesamiento de pedidos,
integrando mensajes de log que permitan:

-   Registrar el inicio del procesamiento de un pedido.
-   Mostrar información relevante del pedido y sus cálculos internos.
-   Reportar errores cuando alguna regla de negocio no se cumpla.
-   Confirmar correctamente los pedidos válidos.

El uso de logs debe permitir entender claramente qué ocurrió con cada
pedido durante su procesamiento.
