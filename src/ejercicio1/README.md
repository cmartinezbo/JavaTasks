<h2> ✏ Reto #2 </h2>

Una empresa de transporte requiere para su software crear una serie de opciones que le permitan gestionar y controlar la información acerca de los proveedores y los clientes socios de la empresa.

Para ello requiere una opción que le permita crear ya sea el proveedor o el socio, poder llevar el inventario de los proveedores o socios y poder visualizarlos.

Para ello el arquitecto de software ha diseñado el siguiente diagrama de clases que les va a permitir cumplir con las necesidades del cliente.


- Descripción de los métodos de la clase Gestión:

      Inicializacion(): Inicializa las variables relacionada al array ó list tipo Persona.

      AgregarPersona(Persona persona): recibe como parámetro un objeto tipo persona y lo adiciona al array ó list tipo persona.

      ListarPersona(): debe recorrer el array ó list tipo Persona y mostrar los registros con el toString().

      ProcesarComando(): debe poder realizar la lectura desde consola con la siguiente estructura:

          - opción&tipoPersona&nombre&identificación&teléfono&dirección&elemento

- Donde:

Opción 1: añadir nueva “Persona”

     El “tipoPersona” pueden ser “Proveedor” o “Socio”.

Ejemplo para Proveedor:

     1&Proveedor&Oscar&4565454&4456465&av siempre viva&llanta

Ejemplo para Socio:

    1&Socio&Oscar&4565454&4456465&av siempre viva&16

 
Opción 2: listar datos ingresados:

    (ejemplo de entrada -- > 2)


Opción 3: Salir

    (ejemplo de entrada  -- > 3)

 

- Nota 1: Observe que el único comando que tiene salida es el listar.

- Nota 2: En este ejercicio se requiere subir cuatro archivos. 

      Uno correspondiente a la clase Persona llamado Persona.java.
      otro correspondiente al Persona Proveedor llamado Proveedor.java.
      otro correspondiente al Persona Socio llamado Socio.java.
      otro correspondiente al Gestion llamado Gestion.java (aquí va el main).
      Recuerde eliminar la línea de package al hacer el envío y utilizar el botón de [+] para agregar más de un archivo de código fuente.
      
<table class="default">
<tr>
<th>ENTRADA</th>
<th>SALIDA</th>
</tr>
<tr>
<td>

    1&Proveedor&Carlos&123456&55555&avenida siempre viva 45&llantas

    1&Socio&Manuel&789456&777777&calle 10 N 4-25&23

    2

    3
  
</td>
<td>


        ***Inventario de Personas***
  
              Persona Proveedor - Nombre: Carlos

              Identificación: 123456

              Teléfono: 55555

              Dirección: avenida siempre viva 45

              Producto: llantas
  
              Persona Socio - Nombre: Manuel

              Identificación: 789456

              Teléfono: 777777

              Dirección: calle 10 N 4-25

              Antigüedad: 23 años

</td>
</tr>
</table>
