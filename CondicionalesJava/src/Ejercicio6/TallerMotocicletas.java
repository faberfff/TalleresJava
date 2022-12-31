package Ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TallerMotocicletas {


    Scanner lector = new Scanner(System.in);

    private int repuesto;
    private int cilindraje;
    private String placa;
    private String marca;
    private String fechaIngreso;
    private String fechaSalida;
    private String novedadUsuario;
    private String novedadTecnico;
    private String entrada;
    private String salida;
    private List<String> entradas = new ArrayList<>();


    public int getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(int repuesto) {
        this.repuesto = repuesto;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNovedadUsuario() {
        return novedadUsuario;
    }

    public void setNovedadUsuario(String novedadUsuario) {
        this.novedadUsuario = novedadUsuario;
    }

    public String getNovedadTecnico() {
        return novedadTecnico;
    }

    public void setNovedadTecnico(String novedadTecnico) {
        this.novedadTecnico = novedadTecnico;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void menuServicio() {
        System.out.println("\tBienvenido a su Taller el Maquinista \n");
        System.out.println(" Servicios que te ofrecemos :");
        System.out.println("Mantenimiento General");
        System.out.println("Sistema elctrico");
        System.out.println("Mantenimiento Preentivo");
    }

    public void menuInicio() {
        System.out.println("");
        System.out.println("\t Menú ");
        System.out.println(" ");
        System.out.println("1.Registrar Ingreso");
        System.out.println("2.Mostrar Servicios Ingresados");
        System.out.println("3.Entregar motocicleta");
        System.out.println("4.Salir");
    }

    public String optenerPlaca(){
        System.out.println("Ingresa el número de placa ");
        placa = lector.next();
        return placa;
    }

    public String optenerMarca(){
        System.out.println("Ingresa la marca ");
        marca = lector.next();
        return marca;
    }

    public String optenerNovedadUsuario(){
        System.out.println("Ingresa novedad de la moto ");
        novedadUsuario = lector.next();
        return novedadUsuario;
    }

    public String optenerFechaIngreso(){
        System.out.println("Ingresa la fecha del ingreso al taller ");
        fechaIngreso = lector.next();
        return fechaIngreso;
    }

    public String optenerFechaSalida(){
        System.out.println("Ingresa la fecha de entrega de la motocicleta al usuario ");
        fechaSalida = lector.next();
        return fechaSalida;
    }

    public Boolean registraCilindraje() {
        Boolean respuesta;
        int cilindro;
        System.out.println("Ingresa el cilindraje de tu moto");
        cilindro = lector.nextInt();

        if(cilindro >= 500 ){
            respuesta = true;
            System.out.println("Bienvenido a su taller de confianza el Maquinista ");

        }else {
            respuesta = false;
            System.out.println("Lo sentimos el taller aún no realiza ese servicio, hasta la proxima vez ");
        }

        return respuesta;
    }

    public String novedadPorMecanico(String novedad){
        String respuesta;
        System.out.println("Además de las fallas mencionadas por el usuario" +
                "nuestro tecnico encontro  : " + novedad);
        respuesta = lector.nextLine();
        return respuesta;
    }

    public String registrarSalida(String placa, String fechaSalida){
        String registro;
        System.out.println(" ");
        System.out.println("EL registro de entrada con numero de placa " + placa +
                  " se realizo el día " + fechaSalida);
        registro = lector.nextLine();
        return registro;

    }

    public int inventarioRepuestos(){
        System.out.println("Digita la cantidad de repuestos utilizados ");
        repuesto = lector.nextInt();
        return repuesto;
    }

    public String optenerNovedad(){
        String novedad;
        System.out.println("Ingresa la novedad ");
        novedad = lector.next();
        return novedad;
    }

    public void mostrarRegistros(){
        System.out.println("   Lista de motocicletas ingresadas al sistema de el taller el maquinista");
        System.out.println("");
        System.out.println(" Los datos de registro son : " );
    }

    public String registrarEntrada( int numero, String dato, String dato1, String dato2, String dato3){

        String entrada;
        lector.nextLine();
        entrada = numero  +" Entrada con numero de placa " + dato + " de maraca " + dato1 + " y fecha de ingreso "
                + dato2 + " El usuario reporta la siguiente novedad " + dato3 ;


        numero = numero++;
        return entrada;
    }


    public List<String> ingresarEntrada(String dato){
        entradas.add(dato);
        return entradas;
    }

    public void mostrarEntradas(ArrayList<String> listas){

        for(String cadena :entradas) {
            System.out.println(cadena);
        }
    }

}
