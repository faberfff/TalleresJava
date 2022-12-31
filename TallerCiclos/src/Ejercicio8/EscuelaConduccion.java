package Ejercicio8;

import Ejercicio6.Contacto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscuelaConduccion {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private Usuario[] usuarios;

    public EscuelaConduccion(){
        this.usuarios = new Usuario[3];
    }

    public EscuelaConduccion(int tamanio) {
        this.usuarios = new Usuario[tamanio];
    }

    public void registrarCurso(Usuario user) {

        System.out.println("");

        if(existeUsuario(user)) {
            System.out.println("El Usuario ya se encuentra registrado");
        }else if(evaluarCuposDisponibles()) {
            System.out.println("Los cupos se encuentran ocupados, no es posible registrar mas usuarios");
        }else{
            boolean existe = false;

            for(int i = 0; i < usuarios.length && !existe; i++){
                if(usuarios[i] == null){
                    usuarios[i] = user;
                    existe = true;
                }
            }

            if(existe){
                System.out.println("Se ha registrado el usuario con exito");
            }else{
                System.out.println("Lo siento el usuario no se puede registrar");
            }
        }

    }


    public void listarPresentesEnCurso() {

        System.out.println("");

        boolean encontrado = false;
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null) {
                System.out.println("El Usuario " + usuarios[i].getNombre() +
                       " asistio al curso de conducción" ) ;
                encontrado = true;
            }
        }

        if(!encontrado) {
            System.out.println("El usuario no asistio al curso de conduccuón");
        }

    }

    public void presentarPrueba(Usuario user) throws IOException {

        System.out.println("  Bienvenido a la prueba del curso ");
        System.out.println("Ingresa la calificacion que sacaste ");
        int nota = Integer.parseInt(bfr.readLine());
        user.setCalificacion(nota);
        for (int i = 0; i < usuarios.length; i++) {
            if (user.getCalificacion() >= 3 && user.getCalificacion() <= 5) {

                System.out.println("Señor(a) " + user.getNombre() + " Usted aprobo el curso ");

            } else {

                System.out.println("Señor(a) " + user.getNombre() + " Usted no aprobo el curso, por favor vuelvalo a intentar ");
            }
        }

    }

    public boolean existeUsuario(Usuario user) {
        for(int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && user.equals(usuarios[i])){
                return true;
            }
        }
        return false;
    }
    public boolean evaluarCuposDisponibles(){

        System.out.println("");

        for(int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] == null){
                return false;
            }
        }
        return true;
    }
}
