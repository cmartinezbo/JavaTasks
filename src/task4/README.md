<h2> ✏ Reto #4 </h2>

Una tienda de elementos generales quiere que usted le ayude a crea su base de datos, en la cual pueda almacenar, consultar, borrar y actualizar los registros que bien dispongan.

Ellos quieren tener el registro de productos, clientes, ventas y proveedor. Para ello el hermano del dueño de la tienda que es administrador de BD, le diseñó el modelo Entidad-Relación, que usted debe codificar y posteriormente insertar, actualizar ,borrar y consultar los registros designados para cada tabla.



- Modelo Entidad - Relación:

    <img src="https://docs.google.com/drawings/d/e/2PACX-1vQwlNJjZ6jELl0cAdFx_C2HsTfc--uSJaAWd0GsllpH8KR85CBc882aicJO0bdxYUsasECt9BLkI-9r/pub?w=960&h=720" alt="Girl in a jacket" width="600" height="450">
 
 Se deben insertar los siguientes registros para la tabla ``cliente``:
 
<table class="default">
<tr>

<th>Identificación</th>
<th>Nombre</th>
<th>Apellido</th>
<th>Dirección</th>
<th>Teléfono</th>
<th>Fecha Nacimiento</th>
</tr>
<tr>

<td>  1 </td>
<td> Juan </td>
<td> Rogers </td>
<td> calle 13 # 12 - 32 </td>
<td> 	2111201450 </td>
<td> 1998-10-01 </td>
</tr>

<td>  2 </td>
<td> Joselin </td>
<td> 	Martin </td>
<td> carrera 1 # 2 - 19 </td>
<td> 	310524875 </td>
<td> 1975-07-12 </td>
</tr>

<td>  3 </td>
<td> Pedro </td>
<td> China </td>
<td> calle 2 # 5 - 23 </td>
<td> 311002547 </td>
<td> 1989-08-05 </td>
</tr>

<td>  4 </td>
<td> Raul </td>
<td> Grande </td>
<td> carrera 23 # 21 - 108 </td>
<td> 200457895 </td>
<td> 1994-01-07 </td>
</tr>

<td>  5 </td>
<td> Caudia </td>
<td> Pizarro </td>
<td> calle 56 # 90 - 45 </td>
<td> 2100023458 </td>
<td> 1977-10-08 </td>
</tr>

<td>  6 </td>
<td> Omar </td>
<td> Drinvet </td>
<td> carrera 11 # 102 - 13 </td>
<td> 2019852252 </td>
<td> 1988-08-10 </td>
</tr>

<td>  7 </td>
<td> Daniela </td>
<td> Vita </td>
<td> transversal 3 # 9 - 1 </td>
<td> 350124583 </td>
<td> 1991-05-25 </td>
</tr>
</table>

Debe insertar los siguientes registros en la tabla ``proveedor``:

<table class="default">
<tr>

<th>Código</th>
<th>Nombre</th>
<th>Dirección</th>
<th>Teléfono</th>
<th>País</th>
<th>Ciudad</th>
</tr>
<tr>

<td> 123 </td>
<td> productos s.a. </td>
<td> av la belleza # 3 - 21 </td>
<td> 3211456 </td>
<td> Colombia </td>
<td> Cali </td>
</tr>

<td> 124 </td>
<td> procesos y ventas </td>
<td> calle 16 N 12 -17 </td>
<td> 32444778 </td>
<td> Colombia </td>
<td> Bogotá </td>
</tr>

<td> 125 </td>
<td> la natural ltda </td>
<td> car principal # 23s - 11 </td>
<td> 65478523 </td>
<td> Colombia </td>
<td> Cúcuta </td>
</tr>

<td> 126 </td>
<td> lo mejor ltda </td>
<td> diag. a la alcaldía # 39w - 23 </td>
<td> 35715946 </td>
<td> Colombia </td>
<td> Barranquilla </td>
</tr>

<td> 127 </td>
<td> la altura s.a. </td>
<td> trans 7 # 32 - 1 </td>
<td> 12457896 </td>
<td> Colombia </td>
<td> Cartagena </td>
</tr>

<td> 128 </td>
<td> los cocos </td>
<td> av la caracas # 34c - 221 </td>
<td> 3217894 </td>
<td> Colombia </td>
<td> Sopó </td>
</tr>

<td> 129 </td>
<td> el mejor </td>
<td> carrera 30 # 12 - 9 </td>
<td> 3215487 </td>
<td> Colombia </td>
<td> Medellín </td>
</tr>

<td> 130 </td>
<td> solo cosas s.a. </td>
<td> calle la noche # 32a - 12 </td>
<td> 85521459 </td>
<td> Colombia </td>
<td> la vega </td>
</tr>
</table>

Debe insertar los siguientes registros en la tabla ``productos``:

<table class="default">
<tr>

<th>Código</th>
<th>Nombre</th>
<th>Valor</th>
<th>Cantidad</th>
<th>Material</th>
</tr>
<tr>

<td> 2001 </td>
<td> super cuerdas </td>
<td> 11000 </td>
<td> 12 </td>
<td> nylon </td>
</tr>

<td> 2002 </td>
<td> los tenis </td>
<td> 210000 </td>
<td> 2 </td>
<td> tela </td>
</tr>

<td> 2003 </td>
<td> las medias </td>
<td> 5000 </td>
<td> 1 </td>
<td> tela </td>
</tr>

<td> 2004 </td>
<td> pantalonetas cuerdas </td>
<td> 10000 </td>
<td> 23 </td>
<td> nylon </td>
</tr>

<td> 2005 </td>
<td> camisetas </td>
<td> 9000 </td>
<td> 33 </td>
<td> nylon </td>
</tr>

<td> 2006 </td>
<td> zapatos </td>
<td> 320000 </td>
<td> 1 </td>
<td> tela </td>
</tr>

<td> 2007 </td>
<td> bicicletas </td>
<td> 980000 </td>
<td> 3 </td>
<td> acero </td>
</tr>

<td> 2008 </td>
<td> telas </td>
<td> 2500 </td>
<td> 1 </td>
<td> nylon </td>
</tr>
</table>

Debe insertar los siguientes registros en la tabla ``factura``:

<table class="default">
<tr>

<th>Nro. Factura</th>
<th>Valor Compra </th>
<th>Fecha Compra </th>
<th>Sucursal</th>
<th>Nombre Vendedor </th>
</tr>
<tr>

<td> 7001 </td>
<td> 251320 </td>
<td> 2021-02-12 </td>
<td> las maletas </td>
<td> Jesús Daniel </td>
</tr>

<td> 7002 </td>
<td> 51350 </td>
<td> 2021-02-13 </td>
<td> las nubes </td>
<td> Pedro Banco </td>
</tr>

<td> 7003 </td>
<td> 23000 </td>
<td> 2021-02-14 </td>
<td> las maletas </td>
<td> Oscar Marx </td>
</tr>

<td> 7004 </td>
<td> 120000 </td>
<td> 2021-02-15 </td>
<td> las ciudadela </td>
<td> Petrona Daniel </td>
</tr>

<td> 7005 </td>
<td> 231000 </td>
<td> 2021-02-16 </td>
<td> las maletas </td>
<td> Jesús Daniel </td>
</tr>

<td> 7006 </td>
<td> 19000 </td>
<td> 2021-02-17 </td>
<td> las nubes </td>
<td> Claudio Rodri </td>
</tr>

<td> 7007 </td>
<td> 25000 </td>
<td> 2021-02-18 </td>
<td> las maletas </td>
<td> Jesús Daniel </td>
</tr>
</table>

Debe insertar los siguientes registros en la tabla ``ofrece``:

<table class="default">
<tr>

<th> Prov_codigo</th>
<th> Prod_codigo </th>
</tr>
<tr>

<td> 123 </td>
<td> 2001 </td>
</tr>

<td> 124 </td>
<td> 2002 </td>
</tr>

<td> 125 </td>
<td> 2003 </td>
</tr>

<td> 126 </td>
<td> 2004 </td>
</tr>

<td> 127 </td>
<td> 2005 </td>
</tr>

<td> 128 </td>
<td> 2006 </td>
</tr>

<td> 129 </td>
<td> 2007 </td>
</tr>

<td> 130 </td>
<td> 2008 </td>
</tr>
</table>

Debe insertar los siguientes registros en la tabla ``compra``:

<table class="default">
<tr>

<th> Cli_id</th>
<th> Ven_nro_factura </th>
</tr>
<tr>

<td> 1 </td>
<td> 7001 </td>
</tr>

<td> 3 </td>
<td> 7001 </td>
</tr>

<td> 4 </td>
<td> 7001 </td>
</tr>

<td> 1 </td>
<td> 7003 </td>
</tr>

<td> 2 </td>
<td> 7003 </td>
</tr>

<td> 1 </td>
<td> 7004 </td>
</tr>

<td> 2 </td>
<td> 7004 </td>
</tr>

<td> 7 </td>
<td> 7005 </td>
</tr>

<td> 1 </td>
<td> 7006 </td>
</tr>

<td> 1 </td>
<td> 7007 </td>
</tr>

<td> 5 </td>
<td> 7007 </td>
</tr>

<td> 6 </td>
<td> 7007 </td>
</tr>
</table>

Debe insertar los siguientes registros en la tabla ``vendido``:

<table class="default">
<tr>

<th> Prod_codigo</th>
<th> Ven_nro_factura </th>
</tr>
<tr>

<td> 2001 </td>
<td> 7001 </td>
</tr>

<td> 2002 </td>
<td> 7001 </td>
</tr>

<td> 2003 </td>
<td> 7001 </td>
</tr>

<td> 2004 </td>
<td> 7001 </td>
</tr>

<td> 2003 </td>
<td> 7002 </td>
</tr>

<td> 2003 </td>
<td> 7003 </td>
</tr>

<td> 2005 </td>
<td> 7004 </td>
</tr>

<td> 2001 </td>
<td> 7005 </td>
</tr>

<td> 2001 </td>
<td> 7006 </td>
</tr>

<td> 2006 </td>
<td> 7007 </td>
</tr>
</table>

Debe actualizar el siguiente registro en la tabla ``proveedor``:

  
    - Para el código 126 el nombre debe ser “la superior ltda”.
    
    
Debe actualizar el siguiente registro en la tabla ``cliente``:

  
    - Para el código 4 el teléfono debe ser: 5556565;
   
  
Debe actualizar el siguiente registro en la tabla ``proveedor``:

  
    - Eliminar el registro del código: 130.
   
   
Debe realizar las siguientes consultas:  

  1. Consultar los registros y columnas de la tabla proveedor.
  
  2. Consultar todos los registros y columnas de la tabla cliente.
  
  3. Consultar todos los registros y columnas de la tabla producto cuyo valor sea mayor a 10000.
  
  4. Consultar todos los registros y columnas de la tabla factura cuyo vendedor es “Jesús Daniel”.
  Consultar todos los registros y columnas de los compra-cliente (Producto cartesiano o join) que han realizado compras ordenado por cli_id de forma ascendente.
  
  5. Consultar los registros mostrando la concatenación (usar  ||) del nombre y el apellido separado por espacio y en otra columna la cantidad de compras realizadas, se debe ordenar por la cantidad de compras(count(*)) y cli_nombre de forma  descendente.
  
  
    NOTA: Generar un archivo script sql para las consultas. 
    Antes de cada consulta escribir SELECT 'Consulta #';  donde # es el número de la consulta.
    
        - Ejemplo:
        
        Select 'Consulta 1';
        Select titulo from ....;
        Select 'Consulta 2';
        Select .....;
        Select 'Consulta 3';
        Select .....;
  
  Entrega:  

  1. Subir cada uno de los archivos .sql en orden de ejecución. Es decir, primero se suben las tablas que no tienen Referencias (Llaves foráneas) y luego las demás. 
  
  2. Luego de subir los scripts de sql de creación e inserción de datos, se debe subir el de actualizaciones y por último el de consultas. 
  
  3. Luego se evalúa, igual que con los retos anteriores. Si todo esta correcto, tanto las inserciones, coo las modificaciones y las consultas, se obtendrá una nota de 5/5. Si hay un error la evaluación será 0. Por lo que será necesario que revisen hasta que las salidas sean las correctas
  
