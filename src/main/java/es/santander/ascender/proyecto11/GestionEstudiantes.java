package es.santander.ascender.proyecto11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionEstudiantes implements IGestionEstudiantes {
    public boolean agregarEstudiante(String nombre, int calificacion) {
        return true;
    }
    public Integer obtenerCalificacion(String nombre) {
        return 123;
    }
    public Map<String, Integer> obtenerEstudiantesYCalificaciones() {
        return new HashMap<String, Integer>();
    }
    public boolean existeEstudiante(String nombre) {
        return false;
    }
    public boolean eliminarEstudiante(String nombre) {
        return true;
    }
    public void agregarEstudiantes(Set<String> nuevosEstudiantes, Map<String, Integer> nuevasCalificaciones) {

    }
}

