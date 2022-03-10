class ejemplo1 {
    
    public static void main(String[] args) {

        String nombre;
        System.out.print("Por favor, dime tu nombre: ");  //cout

        nombre = System.console().readLine();  //cin
                                               // este metodo solo funciona bajo consola

        System.out.println("Hola " + nombre + ", ¡bienvenido a Java desde Cero!");

    }
}