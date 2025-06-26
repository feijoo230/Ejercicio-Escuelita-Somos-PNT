## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Ejercicio: Supermercado de Barrio

## Enunciado:

Imaginemos un supermercado de barrio.

Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:

Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo

=============================
Producto más caro: Frutillas
Producto más barato: Coca-Cola

La solución debe cumplir con los siguientes requisitos:
- Diseñar una solución orientada a objetos.
- La salida es por consola y exactamente como se requiere.
- Usar solamente las clases provistas por Java 8.
- Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
- El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.
- Para mostrar el mayor / menor, utilizar la interfaz Comparable.
- Para imprimir por pantalla, sobrescribir el método toString().

---

## Resolución

La solución se implementó en Java siguiendo el paradigma orientado a objetos:

- Se creó una clase abstracta `Producto` que implementa la interfaz `Comparable` para comparar productos por precio.
- Se definieron subclases para cada tipo de producto: `Bebida`, `Shampoo` y `Fruta`, cada una sobrescribiendo el método `toString()` para mostrar la información requerida.
- Los productos se cargan en una lista mediante el método estático `cargarProductos()` de la clase `CargadorProductos`.
- En el método `main` de la clase `App`, se imprime la lista de productos y se determina el producto más caro y el más barato usando `Collections.max` y `Collections.min`.
- Toda la salida se realiza por consola y cumple exactamente con el formato solicitado.

Para compilar y ejecutar:

```sh
# Compilar desde la raíz del proyecto
javac -d bin src\productos\*.java src\App.java

# Ejecutar
java -cp bin App
```
