# Modelado Avanzado de Clases -- Composición, Agregación y Relaciones Complejas

Cuando desarrollamos software profesional en empresas de videojuegos,
fintech, salud, comercio electrónico o educación es indispensable que
nuestros modelos reflejen correctamente cómo interactúan los objetos del
mundo real. Las decisiones que tomamos al modelar las relaciones entre
clases determinan:

-   La claridad del código.
-   Su mantenibilidad.
-   Su extensibilidad.
-   Qué tan fácil es agregar nuevas funciones en el futuro.

Hoy estudiaremos tres conceptos clave en diseño orientado a objetos:

1.  **Agregación**
2.  **Composición**
3.  **Relaciones bidireccionales y restricciones**

------------------------------------------------------------------------

## 1. Agregación: "Tiene un, pero sin dependencia vital"

### Definición

La **agregación** representa una relación débil de pertenencia: una
clase *tiene* otra clase, pero la existencia del objeto contenido **no
depende** del objeto contenedor.

### Ejemplo de la industria -- Plataforma de cursos online

Ejemplo estilo Plataforma estudiantil:

``` java
class Instructor {
    private String nombre;
}

class Curso {
    private String titulo;
    private Instructor instructor; // Agregación
}
```

-   Un Instructor puede existir sin un Curso.
-   Un Curso puede tener o cambiar de Instructor libremente.

------------------------------------------------------------------------

## 2. Composición: "Forma parte de", dependencia total

### Definición

La **composición** es una relación fuerte: una clase contiene a otra y
la clase interna **no puede existir sin** la clase externa.

### Ejemplo -- Desarrollo de videojuegos (Unity/Godot)

``` java
class Inventario {
    private List<String> items = new ArrayList<>();
}

class Personaje {
    private Inventario inventario; // Composición

    public Personaje() {
        this.inventario = new Inventario();
    }
}
```

-   Si el Personaje "muere", el Inventario desaparece también.
-   El Inventario no se comparte entre personajes.

------------------------------------------------------------------------




## 3. Relaciones Bidireccionales

### Definición

Ambas clases necesitan conocerse entre sí.

### Ejemplo -- Sistema de órdenes (Amazon, Rappi, MercadoLibre)

``` java
class Cliente {
    private String nombre;
    private List<Orden> ordenes = new ArrayList<>();
}

class Orden {
    private Cliente cliente;
}
```

**Usos reales:** - El Cliente necesita ver su historial de órdenes. - La
Orden necesita saber quién la generó.

**Riesgos reales:** - Ciclos infinitos al serializar. - Manejo más
complejo de la memoria.

------------------------------------------------------------------------

## 4. Restricciones en las Relaciones

### Ejemplo -- Sistema bancario

``` java
class Cliente {
    private List<CuentaBancaria> cuentas = new ArrayList<>();
}

class CuentaBancaria {
    private final Cliente propietario;

    public CuentaBancaria(Cliente propietario) {
        if (propietario == null)
            throw new IllegalArgumentException("La cuenta necesita un propietario.");
        this.propietario = propietario;
    }
}
```

Restricciones típicas: - Una cuenta no puede existir sin cliente. - No
puede cambiar de propietario después de creada.

------------------------------------------------------------------------

## 5. Cómo se aplican estos conceptos al diseñar soluciones reales

Preguntas clave:

1.  **¿Qué pasa si elimino el objeto principal?**
    -   Si los secundarios dejan de tener sentido → composición.
    -   Si pueden sobrevivir → agregación.
2.  **¿Necesitan conocerse ambas clases?**
    -   Sí → bidireccional.
    -   No → unidireccional (preferible para mantener simplicidad).
3.  **¿Hay reglas obligatorias?**
    -   Ejemplo: una factura no cambia de cliente.


