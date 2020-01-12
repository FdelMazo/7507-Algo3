" 7507/9502 | 2017 2C | TP0 | Enunciado 1 "

| error precios panaderia pedido precio |

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

precio := pedido calcularPrecio. " 24.99 + 29.99 * 2 = 84.97 "
(precio closeTo: 84.97) ifFalse: [ 
	Transcript show: 'Error: el precio del primer pedido debe ser 84.97.'; cr.
	error := true.
].

panaderia := Panaderia new.

panaderia agregarPedido: pedido.

((panaderia mayorVenta) closeTo: 84.97) ifFalse: [ 
	Transcript show: 'Error: la venta más grande debe ser de 84.97.'; cr.
	error := true.
].

((panaderia menorVenta) closeTo: 84.97) ifFalse: [ 
	Transcript show: 'Error: la venta más chica debe ser de 84.97.'; cr.
	error := true.
].

pedido := Pedido new.
pedido agregar: 'Kilo de pan' cantidad: 2.
pedido agregar: 'Kilo de chipa' cantidad: 1.
pedido agregar: 'Docena de medialunas' cantidad: 2.
pedido precios: precios.

precio := pedido calcularPrecio. " 24.99 * 2 + 89.99 + 59.99 * 2 = 259.95"
(precio closeTo: 259.95) ifFalse: [ 
	Transcript show: 'Error: el precio del segundo pedido debe ser 259.95.'; cr.
	error := true.
].

panaderia agregarPedido: pedido.
((panaderia mayorVenta) closeTo: 259.95) ifFalse: [ 
	Transcript show: 'Error: la venta más grande fue de 259.95.'; cr.
	error := true.
].

((panaderia menorVenta) closeTo: 84.97) ifFalse: [ 
	Transcript show: 'Error: la venta más chica fue de 84.97.'; cr.
	error := true.
].

pedido := Pedido new.
pedido agregar: 'Kilo de pan' cantidad: 2.
pedido agregar: 'Torta de chocolate' cantidad: 1.
pedido agregar: 'Docena de facturas surtidas' cantidad: 1.
pedido precios: precios.

precio := pedido calcularPrecio. " 24.99 * 2 + 55.99 + 79.99 = 185.96"
(precio closeTo: 185.96) ifFalse: [ 
	Transcript show: 'Error: el precio del tercer pedido debe ser 185.96.'; cr.
	error := true.
].

panaderia agregarPedido: pedido.
((panaderia mayorVenta) closeTo: 259.95) ifFalse: [ 
	Transcript show: 'Error: la venta más grande fue de 259.95.'; cr.
	error := true.
].

((panaderia menorVenta) closeTo: 84.97) ifFalse: [ 
	Transcript show: 'Error: la venta más chica fue de 84.97.'; cr.
	error := true.
].

error ifTrue: [  
	Transcript show: 'Resultado final: ERROR'.
]
ifFalse: [
	Transcript show: 'Resultado final: OK'.
].