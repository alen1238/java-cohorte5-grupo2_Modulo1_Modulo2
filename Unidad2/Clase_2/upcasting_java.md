# Polimorfismo por Upcasting en Java

## 1. Interfaz Piloto

``` java
public interface Piloto {
    void usarHabilidadEspecial();
}
```

## 2. Implementaciones: Mario, Luigi y Peach

``` java
public class Mario implements Piloto {
    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Mario usa su Turbo Rojo!");
    }

    // Método exclusivo de Mario
    public void saludarComoMario() {
        System.out.println("¡It's-a me, Mario!");
    }
}
```

``` java
public class Luigi implements Piloto {
    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Luigi lanza una Bola Verde!");
    }
}
```

``` java
public class Peach implements Piloto {
    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Peach activa su Corazón Protector!");
    }
}
```

## 3. Polimorfismo y Upcasting

Cuando declaramos:

``` java
Piloto p1 = new Mario();
Piloto p2 = new Luigi();
Piloto p3 = new Peach();
```

Esto se llama **upcasting** o **polimorfismo por sustitución**.

-   La **referencia** es del tipo general `Piloto`.
-   El **objeto real** es una clase concreta como `Mario`, `Luigi` o
    `Peach`.

## 4. Método que usa Polimorfismo

``` java
public static void iniciarHabilidad(Piloto piloto) {
    piloto.usarHabilidadEspecial();
}
```

Ejemplo:

``` java
iniciarHabilidad(p1);
iniciarHabilidad(p2);
iniciarHabilidad(p3);
```

Salida:

    Mario usa su Turbo Rojo!
    Luigi lanza una Bola Verde!
    Peach activa su Corazón Protector!

## 5. Acceso a métodos exclusivos de la clase concreta

``` java
Piloto p1 = new Mario();
p1.saludarComoMario(); // ❌ ERROR
```

Error:

    error: cannot find symbol

### Downcasting:

``` java
((Mario) p1).saludarComoMario(); // ✔️ Funciona
```

## 6. Nota final

-   **Upcasting**: tratar un objeto específico como su tipo general.
-   **Polimorfismo**: diferentes clases responden distinto al mismo
    método.
-   **La referencia** limita qué métodos puedes usar.
-   **El objeto concreto** define la implementación ejecutada.
