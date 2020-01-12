" 7507/9502 | 2017 2C | TP0 | Enunciado 3 "

| error curso1 curso2 alumno1 alumno2 inscriptos |

error := false.
Transcript clear.

curso1 := Curso new.
curso1 establecerNombre: 'Algebra II'.
curso1 establecerVacantes: 3.

curso2 := Curso new.
curso2 establecerNombre: 'Fisica II'.
curso2 establecerVacantes: 2.

alumno1 := Alumno new.
alumno1 establecerNombre: 'Daenerys'.
alumno1 inscribirseA: curso1.

((curso1 vacantesDisponibles) = 2) ifFalse: [
    Transcript show: 'Error: Las vacantes disponibles del curso 1 deben ser 2.'; cr.
	error := true.
].

alumno2 := Alumno new.
alumno2 establecerNombre: 'Tyrion'.
alumno2 inscribirseA: curso1.
alumno2 inscribirseA: curso2.

((curso1 vacantesDisponibles) = 1) ifFalse: [
    Transcript show: 'Error: Debería quedar una única vacante en el curso 1.'; cr.
	error := true.
].

((curso2 vacantesDisponibles) = 1) ifFalse: [
    Transcript show: 'Error: Debería quedar una única vacante en el curso 2.'; cr.
	error := true.
].

inscriptos := curso1 inscriptos.

((inscriptos at: 1) = 'Daenerys') ifFalse: [
    Transcript show: 'Error: Daenerys fue la primera inscripta a Algebra II.'; cr.
	error := true.
].

((inscriptos at: 2) = 'Tyrion') ifFalse: [
    Transcript show: 'Error: Tyrion fue el segundo inscripto a Algebra II.'; cr.
	error := true.
].

inscriptos := curso2 inscriptos.
((inscriptos at: 1) = 'Tyrion') ifFalse: [
    Transcript show: 'Error: Tyrion fue el primer inscripto a Fisica II.'; cr.
	error := true.
].

error ifTrue: [  
	Transcript show: 'Resultado final: ERROR'.
]
ifFalse: [
	Transcript show: 'Resultado final: OK'.
].