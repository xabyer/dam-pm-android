// Crear clase Alumno con métodos existe, alta y baja sobre una lista.

fun main() {
    val juanPerez = Alumno("Juan", "Pérez", "12345678C")
    val martaSanchez = Alumno("Marta", "Sanchez", "98765432T")
    val franRodriguez = Alumno("Fran", "Rodríguez", "25364896G")

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
}