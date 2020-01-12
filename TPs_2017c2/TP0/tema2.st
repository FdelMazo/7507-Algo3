" 7507/9502 | 2017 2C | TP0 | Enunciado 2 "

| error precios panaderia pedido precio1 precio2 precio3 |

error := false.
Transcript clear.

precios := Precios new.
precios agregar: 'Kilo de pan' a: 24.99.
precios agregar: 'Docena de medialunas' a: 59.99.
precios agregar: 'Docena de facturas surtidas' a: 79.99.
precios agregar: 'Torta de chocolate' a: 55.99.
precios agregar: 'Cremona' a: 29.99.
precios agregar: 'Kilo de chipa' a: 89.99.

pedido := Pedido new.
pedido agregar: 'Kilo de pan' cantidad: 1.
pedido agregar: 'Cremona' cantidad: 2.
pedido precios: precios.

precio1 := pedido calcularPrecio. " 24.99 + 29.99 * 2 = 84.97 "
(precio1 closeTo: 84.97) ifFalse: [ 
	Transcript show: 'Error: el precio del primer pedido debe ser 84.97.'; cr.
	error := true.
].

panaderia := Panaderia new.

panaderia agregarPedidoALaCola: pedido.

precios agregar: 'Kilo de pan' a: 29.99. " Tarifazo "

pedido := Pedido new.
pedido agregar: 'Kilo de pan' cantidad: 2.
pedido agregar: 'Kilo de chipa' cantidad: 1.
pedido agregar: 'Docena de medialunas' cantidad: 2.
pedido precios: precios.

precio2 := pedido calcularPrecio. " 29.99 * 2 + 89.99 + 59.99 * 2 = 269.95"
(precio2 closeTo: 269.95) ifFalse: [ 
	Transcript show: 'Error: el precio del segundo pedido debe ser 269.95.'; cr.
	error := true.
].

panaderia agregarPedidoALaCola: pedido.

pedido := Pedido new.
pedido agregar: 'Kilo de pan' cantidad: 2.
pedido agregar: 'Torta de chocolate' cantidad: 1.
pedido agregar: 'Docena de facturas surtidas' cantidad: 1.
pedido precios: precios.

precio3 := pedido calcularPrecio. " 29.99 * 2 + 55.99 + 79.99 = 185.96"
(precio3 closeTo: 195.96) ifFalse: [ 
	Transcript show: 'Error: el precio del tercer pedido debe ser 185.96.'; cr.
	error := true.
].

panaderia agregarPedidoALaCola: pedido.

((panaderia cobrar) closeTo: precio1) ifFalse: [
    Transcript show: 'Error: Se debe cobrar el primer pedido primero.'; cr.
    error := true.
].

((panaderia cobrar) closeTo: precio2) ifFalse: [
    Transcript show: 'Error: Se debe cobrar el segundo pedido después del primero.'; cr.
    error := true.
].

((panaderia cobrar) closeTo: precio3) ifFalse: [
    Transcript show: 'Error: Se debe cobrar el tercer pedido después del segundo.'; cr.
    error := true.
].

((panaderia cobrar) = nil) ifFalse: [
    Transcript show: 'Error: Si no quedan pedidos por cobrar no se debería devolver nada.'; cr.
    error := true.
].

error ifTrue: [  
	Transcript show: 'Resultado final: ERROR'.
]
ifFalse: [
	Transcript show: 'Resultado final: OK'.
].