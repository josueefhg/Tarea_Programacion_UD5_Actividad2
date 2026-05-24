# Tarea_Programacion_UD5_Actividad2

Actividad 2 de la UD5: jerarquia de clases para coches de combustion.

## Estructura

- `Salesianos/src/app/App.java`: clase ejecutable.
- `Salesianos/src/modelo/Vehiculo.java`: clase abstracta base.
- `Salesianos/src/modelo/CocheCombustion.java`: clase hija con la logica de combustible, arranque, parada y movimiento.

## Compilar y ejecutar

Desde la carpeta `Salesianos`:

```bash
javac -d bin src/app/App.java src/modelo/Vehiculo.java src/modelo/CocheCombustion.java
java -cp bin app.App
```
