# carnivalAutomation

Configuracion de Ruta del WebDriver
En el archivo serenity.properties se encuentra una configuración por defecto de esta ruta:

Compilar proyecto antes de realizar Pull Request
Es importante compilar el proyecto antes de realizar un Pull Request, para esto, ejecutar alguno de los siguientes comandos. Ejecutar por consola

```bash
$ gradle clean assemble
$ gradle compileJava
```

Ejecución de los test
Se debe ejecutar los runners del proyecto -> CruiseSearchTest.Java

Configurar IntelliJ para que navegar de los pasos del .Feature a su respectivo Definition
Ir a las siguietes opciones FILE -> SETTINGS -> PLUGINS
Ubicar el campo de busqueda y en la opción Show seleccionar "All Plugins" 2.1 en la lupa Buscar: "Cucumber for Java" y verificar que este instalado. 2.2 Buscar el plugin "Gherkin" y verificar que este instalado. 2.3 Buscar el plugin Substeps IntellIj Plugin, si este se encuentra instalado DESINSTALAR

Si el plugin de "Cucumber for Java" o "Gherkin" falta, Seleccionar en la parte inferior la opcion "Browse Repositories" e instalar ambos plugins.

Reiniciar IntelliJ y probar desde un .feature navegar al paso en el Definition.
Para solucionar la NO navegabilidad por los Definitions desde el paso definido en un escenario (Cucumber); se presenta la siguiente opción: 1. Estando en el IDE de IntelliJ y con el proyecto abierto se debe ingresar a la opción: "Settings..." del menú: "File" 2. En la ventana que se abre: seleccionar la opción "Gradle" del menú: "Build, Execution, Deployment" 3. En el panel de la parte derecha se debe hallar y deshabilitar la casilla de verificación "Create separate module per source set" Nota: Lo descrito anteriormente ha funcionado en algunos de los casos; por este motivo se presenta como una posible solución.
