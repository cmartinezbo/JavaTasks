<h2> ✏ Reto #3 </h2>

La tienda de la esquina necesita ciertas funcionalidades para automatizar su proceso de venta por internet, para ello requiere que los siguientes métodos le permitirán identificar, procesar y llevar el inventario de sus productos y así poder ofrecer un mejor servicio:

``Nombre de la Clase: Tienda``

- Métodos:

    ``1) met_filtrar_productos(list):`` se requiere que el método permita recibir una lista con productos y debe retornar otra lista con los mismos productos sin repeticiones.

  - Ejemplo:

        Input: (arroz, sal, miel, lentejas, frijol, leche, lentejas, arroz, miel, sal, banano)

        Output: (arroz, sal, miel, lentejas, frijol, leche, banano).

 
 
 
   ``2) met_productos_faltantes(posiciones, faltantes, elemento):`` El método debe recibir dos listas y un producto, la primera lista con las posiciones que debe buscar en la lista 2 y un producto que debe consultarse en esa búsqueda, debe retornar una lista con las posiciones que contienen el producto buscado.

  - Ejemplo:

        Inputs: 
        
        -> (0,3,4,2,1,5,6,8,11)

        -> (arroz, sal, miel, lentejas, frijol, leche, lentejas, arroz, miel, sal, banano, arroz)

        -> arroz

        Output: (0,11)

   ``3) met_encontrar_faltantes(l_pedido, l_mis_productos):`` Método que debe permitir recibir la lista de los productos solicitados en el pedido y la lista de mis productos, se requiere encontrar la lista de los productos que no tenemos a disposición para vender.

  - Ejemplo: 

        Input:
        
        -> (arroz, sal, miel, lentejas, banano, frijol)

        -> (sal, miel, ajo, frijol, leche)

        Output: (arroz, lentejas, banano)

 

   ``4) met_obtener_intercambiables(l_sobrantes_otros, l_sobrantes_mios):`` Método que debe permitir recibir la lista de los productos sobrantes del otro y la lista de mis productos sobrantes. Se deben recorrer las dos listas y encontrar la cantidad de productos de c/u que se puedan intercambiar y retornar la cantidad máxima que pueden intercambiar:

  - Ejemplo:

        Inputs:
        
        -> (arroz, sal, miel, lentejas, banano, frijol, papa, cebolla, aceite)

        -> (sal, miel, ajo, frijol, leche, garbanzo, lechuga, papa)

        Find: 
        
        -> productos_lista_1(ajo, leche, garbanzo. Lechuga) = 4

        -> Productos_lista_2(arroz, lentejas, banano, cebolla, aceite) = 5

        Output: (el menor de las dos cantidades)  4

 

- Observaciones:

    - El programa no tiene entrada ni salida de datos, sólo se debe implementar la clase pedida.

    - Se debe crear una clase con el nombre “Tienda”

    - Tener presente que la clase y los métodos se debe mantener para que no haya errores en la evaluación.

    - El orden de los argumentos de los métodos se debe mantener tal como se menciona en el enunciado.

    - La calificación se dará de la siguiente manera: 1 Punto si se puede encontrar la clase y 1 punto por el correcto funcionamiento de cada método.
      
