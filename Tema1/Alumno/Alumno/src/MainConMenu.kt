//Crear clase Alumno con métodos existe, alta y baja sobre una lista.
fun main() {

    menu()

}

fun menu() {
    var optionMenu = "0"
    val gestorAlumnos = GestorAlumnos()

    while (optionMenu != "5") {
        println(
            """
                ----Menú----
                1. Alta Alumno
                2. Baja Alumno
                3. Listar Alumnos
                4. Comprueba si existe el alumno
                5. Salir
                Selecciona una opción: 
            """.trimIndent()
        )

        optionMenu = operacionesMenu(gestorAlumnos)
    }
}

fun operacionesMenu(gestorAlumnos: GestorAlumnos): String {

    var optionMenu = readln()

    when (optionMenu) {
        "1" -> {
            print("Nombre: ")
            val nombre = readln()

            print("Apellido: ")
            val apellido = readln()

            print("DNI: ")
            val dni = readln()

            val alumno = Alumno(nombre = nombre, apellido =  apellido, dni =  dni)
            gestorAlumnos.altaAlumno(alumno)
        }

        "2" -> {
            print("Introduce el dni del alumno a dar de baja: ")
            val dniAlumno = readln()
            gestorAlumnos.bajaAlumno(dni = dniAlumno)
        }

        "3" -> {
            println("La lista de alumnos es: ")
            gestorAlumnos.listarAlumnos()
        }

        "4" -> {
            print("Introduce el dni del alumno para comprobar si existe: ")
            val dniAlumno = readln()
            val existeAlumno = gestorAlumnos.existeAlumnoPorDni(dniAlumno)
            val alumno = gestorAlumnos.findAlumnoByDni(dniAlumno)
            println(
                if (existeAlumno)
                    "Existe el usuario ${alumno?.nombre} ${alumno?.apellido}."

                else "No existe el usuario con dni: ${dniAlumno}."
            )
        }

        "5" -> {
            optionMenu = "5"
            println("Adios.")
        }

        else -> println("Opción no válida.")
    }
    return optionMenu
}