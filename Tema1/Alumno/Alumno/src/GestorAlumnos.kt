class GestorAlumnos {

    private val listaAlumnos = mutableListOf<Alumno>()

    fun altaAlumno(alumno: Alumno) {
        if(existeAlumnoPorDni(alumno.dni)){
            println("Ese dni ya existe y debe ser único.")
        }
        else if(alumno.nombre.isEmpty() || alumno.apellido.isEmpty() || alumno.dni.isEmpty()){
            println("No se permite introducir datos vacíos. Vuelva a intentarlo.")
        }
        else if(existeAlumno(alumno)){
            println("El alumno ${alumno.nombre} ${alumno.apellido} ya existe.")

        } else {
            listaAlumnos.add(alumno)
            println("Alumno ${alumno.nombre} ${alumno.apellido} dado de alta con éxito.")
        }
    }

    fun  bajaAlumno(alumno: Alumno) {
        if(existeAlumno(alumno)) {
            listaAlumnos.remove(alumno)
            println("Alumno ${alumno.nombre} ${alumno.apellido} dado de baja con éxito")

        } else {
            println("El alumno  ${alumno.nombre} ${alumno.apellido}  no se puede dar de baja porque no existe.")
        }
    }
    fun bajaAlumno(dni: String) {
        val alumnoBorrado = listaAlumnos.removeIf { it.dni == dni }
        if (alumnoBorrado) {

            println("El alumno con dni ${dni} se dio de bja con éxito")

        } else {
            println("No se encontró el alumno con dni: ${dni}")
        }
    }

    fun existeAlumno(alumno: Alumno): Boolean {
        return listaAlumnos.any { it.dni == alumno.dni }
    }

    fun existeAlumnoPorDni(dni: String): Boolean {
        return listaAlumnos.any { it.dni == dni }
    }

    fun listarAlumnos() {
        if (listaAlumnos.isEmpty()) {
            println("La lista de Alumnos está vacía.")

        } else {
            listaAlumnos.forEach { println("Nombre: ${it.nombre}, apellido: ${it.apellido}, dni: ${it.dni}") }
        }
    }
}