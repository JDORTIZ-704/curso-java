# Ejercicio POO en Java: Gestión de Colegios y Alumnos

## Contexto

Ejercicio de práctica de Programación Orientada a Objetos (POO) en Java.

## Clases requeridas

1. **`Colegio`** – construye objetos de tipo colegio.
2. **`Alumno`** – construye objetos de tipo alumno. Cada alumno pertenece a un colegio concreto.
3. **`UsoColegio`** – clase principal, contiene el método `main`.

## Requisitos funcionales

### 1. Crear colegios

Desde la clase principal se deben poder crear tantos colegios como se quiera. Al construir un colegio se debe indicar:

- Nombre del colegio.
- Número de alumnos que puede tener ese colegio (capacidad).

Ejemplo (tal cual se plantea en el vídeo):

```java
Colegio sanJavier = new Colegio("San Javier", 200);
Colegio cervantes = new Colegio("Cervantes", 200);
```

### 2. Añadir alumnos a un colegio

Un colegio se crea con una capacidad determinada, pero sin alumnos matriculados todavía. Debe existir un método (en el vídeo se llama `nuevoAlumno`) que permita ir matriculando alumnos uno a uno, indicando:

- Nombre del alumno.
- Nota media que trae de cursos anteriores.

No hace falta rellenar el colegio hasta el límite de capacidad; se puede matricular solo a los alumnos que se quiera.

Ejemplo:

```java
sanJavier.nuevoAlumno("Juan", 8.5);
sanJavier.nuevoAlumno("Sara", 9);

cervantes.nuevoAlumno("Ana", 5);
cervantes.nuevoAlumno("Antonio", 7);
cervantes.nuevoAlumno("Maria Rosa", 3);
```

### 3. Listar todos los alumnos de un colegio

Debe existir un método (`getTodosAlumnos` en el vídeo) que devuelva/imprima la información de todos los alumnos matriculados en un colegio concreto.

Por cada alumno se debe poder consultar:

- Nombre del alumno.
- Colegio al que pertenece.
- Un número identificador que se le asigna de forma consecutiva.
- Su nota media.

> ⚠️ **Importante**: el número identificador **no se reinicia por colegio**. Es un contador global del programa: si los dos primeros alumnos matriculados (en cualquier colegio) tienen los números 1 y 2, el siguiente alumno que se matricule en cualquier otro colegio (aunque sea el primero de ese colegio) seguirá con el número 3, y así sucesivamente.

### 4. Obtener los datos de un alumno concreto

Además de listar a todos, debe existir un método (`getDatosAlumno` en el vídeo) que reciba el nombre de un alumno y devuelva/imprima únicamente los datos de ese alumno.

Ejemplo:

```java
sanJavier.getDatosAlumno("Sara");
```

### 5. Expulsar a un alumno

Debe existir un método (`expulsaAlumno` en el vídeo) que reciba el nombre de un alumno y lo elimine del colegio. Al volver a listar todos los alumnos de ese colegio, el expulsado ya no debe aparecer.

Ejemplo:

```java
cervantes.expulsaAlumno("Antonio");
```

### 6. Modificar la nota media de un alumno

Debe existir un método (`setNotaMedia` en el vídeo) que reciba dos parámetros:

- Nombre del alumno.
- Nueva nota media.

Y actualice la nota media de ese alumno.

Ejemplo:

```java
cervantes.setNotaMedia("Maria Rosa", 8);
```

## Notas del profesor

- El programa **no tiene una única solución correcta**; cada quien lo puede resolver como mejor entienda.
- Qué atributos exactos tiene cada clase, y cómo `Colegio` almacena internamente a sus alumnos, **no se especifica en el vídeo**: eso es parte de lo que hay que diseñar.
- Los nombres de métodos usados en el vídeo (`nuevoAlumno`, `getTodosAlumnos`, `getDatosAlumno`, `expulsaAlumno`, `setNotaMedia`) son orientativos, tal como los usó el profesor al hacer la demo en pantalla.
- El profesor pide enviar la solución por correo o pegarla en la zona de dudas del curso para revisión.