# Ejercicio: Implementar la aplicación que cumpla los siguientes requerimientos:

Partiendo de una Superclase abstracta Empleado:

Atributos:
- private String nss;
- private String nombre;
- private String fechaNacimiento;
- private Char sexo;

Generar sus métodos get() y set() y una declaración del método abstracto sueldo():
- public float sueldo();

De esta clase heredan:

EmpTemporal:

Atributos:
- private String fechaInicio;
- private String fechaFin;
- private Double precioDia;
- private ArrayList<Ventas>;

EmpFijo:

Atributos:
- private int salario;
- private float irpf;
- private int trienios;

En Empleado temporal, hay que calcular los días a partir de las fechas y multiplicarlo por el precio día. El sueldo será el total que cobra por contrato no por mes.
En Empleado Fijo, se multiplican el nº de trienios por 30 euros, se suman al salario y se resta la retención.

En ambas subclases:
Generar sus métodos get() y set() y aplicar polimorfismo generando una Sobreescritura del método sueldo.

1. Crear desde el método principal dos contenedores uno que será la clase ArrayList del pojo Empleados, que guardará objetos de la clase empleados fijos y temporales en Activo, y otro ArrayList de la misma clase Empleados, que contendrá los empleados dados de baja.

2. Altas de empleados Fijos y temporales: Daremos altas de objetos de empleados fijos y temporales, hasta que el usuario no desee introducir más datos.
   Validaremos el atributo número de la seguridad social para que:
- tenga una longitud de 9 caracteres, que sean números del 0 al 9
- y que el último carácter sea una letra de la A a la z en mayúscula ó minúscula,
- también validaremos la fecha para que el día tenga dos dígitos, luego la /, mes dos dígitos, luego / y el año 4 dígitos.

Altas de ventas de un empleado temporal:
En este método pediremos el nss del empleado temporal que realizó la venta,
- comprobaremos que existe y pediremos conformidad,
- tendremos en cuenta que el usuario puede añadir más ventas al mismo empleado temporal, hasta que responda que no.

3. Bajas: Tendrá un menú para elegir si solo queremos dar de baja ó guardar y dar de baja, esta clase contendrá dos métodos sobrecargados, llamados bajas(), uno recibe como argumento el array de empleados activos y otro el de empleados activos y el de empleados dados de baja:
   En el primero: pediremos el NSS del empleado, lo buscamos comprobamos que existe, pedimos conformidad y lo damos de baja.
   En el segundo: pediremos el NSS del empleado, lo buscamos comprobamos que existe, pedimos conformidad, lo guardamos y luego lo damos de baja.

4. Modificaciones:
- Pediremos el NSS del empleado, lo buscamos comprobamos que existe,
- indicamos si es fijo ó temporal,
- pedimos conformidad y modificamos
    - salarioBase y trienios en el emleado fijo
    - y en el temporal el precio por día.

5. Visualizar: Esta clase incluye métodos que permiten mostrar los datos almacenados en el objeto de la clase en distintos formatos. Por ejemplo, puede haber un método para imprimir los datos en la consola, otro para generar un archivo de texto o un archivo Excel, y otro para crear un gráfico que represente los datos de manera visual.

6. Actualizar: Esta clase debe permitir la actualización de los datos almacenados. Es decir, debe haber métodos que permitan agregar nuevos datos, modificar datos existentes o eliminar datos. También es importante asegurarse de que estos métodos verifiquen la integridad de los datos, evitando la inclusión de datos duplicados o la eliminación de datos necesarios para el correcto funcionamiento del objeto.

7. Persistencia: Finalmente, es importante que esta clase permita la persistencia de los datos, es decir, que permita guardar los datos en algún tipo de almacenamiento para que puedan ser recuperados en futuras ejecuciones del programa. Esto puede lograrse mediante la implementación de métodos que permitan la escritura y lectura de archivos que contengan los datos.

En resumen, una clase para gestionar datos debe ser capaz de almacenar, validar, consultar, visualizar, actualizar y persistir los datos de manera efectiva y eficiente. Cada uno de estos aspectos es esencial para garantizar la integridad y disponibilidad de los datos y para facilitar su manipulación y análisis.
