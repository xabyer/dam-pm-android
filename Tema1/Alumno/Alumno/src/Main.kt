// Crear clase Alumno con métodos existe, alta y baja sobre una lista.

fun main() {
    val juanPerez = Alumno(nombre = "Juan", apellido =  "Pérez", dni =  "12345678C")
    val martaSanchez = Alumno(nombre = "Marta", apellido = "Sanchez", dni =  "98765432T")
    val franRodriguez = Alumno(nombre = "Fran", apellido =  "Rodríguez", dni =  "25364896G")

    val gestorAlumnos = GestorAlumnos()

    gestorAlumnos.listarAlumnos()

    gestorAlumnos.altaAlumno(juanPerez)
    gestorAlumnos.altaAlumno(martaSanchez)
    gestorAlumnos.altaAlumno(franRodriguez)
    gestorAlumnos.altaAlumno(juanPerez)

    println("Existe el alumno Marta Sanchez: ${gestorAlumnos.existeAlumno(martaSanchez)}")

    println("--------------------------------------------------------------------------------------")


    println("Listado de alumnos: ")
    gestorAlumnos.listarAlumnos()

    println("--------------------------------------------------------------------------------------")

    gestorAlumnos.bajaAlumno(franRodriguez)
    println("--------------------------------------------------------------------------------------")

    println("Listado de alumnos: ")
    gestorAlumnos.listarAlumnos()
    println("--------------------------------------------------------------------------------------")

    println("Existe el Alumno Fran Rodriguez: ${gestorAlumnos.existeAlumno(franRodriguez)}")

    println("--------------------------------------------------------------------------------------")
    val pedroPicapiedra = Alumno(nombre = "Pedro", apellido = "Picapiedra", dni="77777777G")
    gestorAlumnos.altaAlumno(pedroPicapiedra)

    println("listado de alumnos: ")
    gestorAlumnos.listarAlumnos()
}