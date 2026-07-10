# Ejercicio: POO

Se trata de crear un programa que simule una empresa de envío de paquetes. Dicha empresa tiene varias sucursales y puede enviar paquetes con diferente peso y diferente prioridad.

El programa estará formado por 3 clases:

## Clase 1: Clase Sucursal

Encargada de construir objetos de tipo `Sucursal` con las siguientes características:

**Propiedades:**
- Número de sucursal
- Dirección
- Ciudad

**Constructor:**
- Encargado de establecer la dirección, ciudad y nº de sucursal

**Métodos:**
- 3 getters para obtener nº de sucursal, dirección y ciudad
- Método setter que calcula precio. Este método recibe por parámetro un objeto de tipo `Paquete` y calcula el precio del envío del paquete en función del peso del mismo y la prioridad del envío (0, 1 o 2 siendo estos 0=normal, 1=Alta y 2=Urgente). Prioridad 0 el precio no se altera. Prioridad 1 el precio se incrementa 10 €. Prioridad 2 el precio se incrementa 20 €.

## Clase 2: Clase Paquete

Encargada de construir objetos de tipo `Paquete` con las siguientes características:

**Propiedades:**
- Referencia del envío
- Peso
- DNI del remitente
- Prioridad del envío. Esta puede ser 0, 1 y 2 (Normal, Alta, Urgente)

**Constructor:**
- Encargado de establecer las propiedades a los valores elegidos

**Métodos:**
- 2 setters para modificar (si se quiere) peso y prioridad
- 2 getters para obtener peso y prioridad

## Clase 3: Clase Uso_Sucursal_y_Paquetes

Esta es la clase principal. Desde esta clase se piden los datos del programa por teclado. Se deben pedir:

- Nº de sucursal
- Dirección
- Ciudad
- Nº de paquetes a enviar
- Datos de cada uno de los paquetes a enviar, concretamente se ha de pedir por cada paquete:
  - Referencia del envío
  - DNI del remitente
  - Peso del paquete
  - Prioridad del envío (0, 1 o 2)

Una vez introducidos los datos de la sucursal y de cada uno de los paquetes, el programa imprimirá en consola los datos de la sucursal (Nº, Dirección y Ciudad) y los datos de cada paquete (Referencia, Peso, Prioridad y Precio).