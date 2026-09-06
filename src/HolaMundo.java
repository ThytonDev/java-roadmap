public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
        System.out.println("Israel");
        System.out.println("Java 25");

        int edad = 32;
        double altura = 1.78;
        boolean aprendiendoJava = true;
        String nombre = "Israel";

        System.out.println(edad);
        System.out.println(altura);
        System.out.println(aprendiendoJava);
        System.out.println(nombre);

        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y mido " + altura + " metros.");

        int a = 10;
        int b = 3;

        System.out.println(a/b);

        double c = 10.0;
        double d = 3.0;

        System.out.println(c/d);

        if (edad >= 18) {
            System.out.println("Mayor de edad.");
        } else {
            System.out.println("Menor de edad");
        }

        if (aprendiendoJava) {
            System.out.println("Estas en buenas manos.");
        }

        if (altura >= 1.80) {
            System.out.println("Eres alto.");
        } else if (altura >= 1.70) {
            System.out.println("Eres medio.");
        } else {
            System.out.println("Eres bajo.");
        }

        if (edad >= 18 && aprendiendoJava) {
            System.out.println("Buscas un cambio de trabajo.");
        } else {
            System.out.println("Aun es tu hobbie.");
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println(esMayorDeEdad(edad));
        for (int i = 1; i <= 20; i++){
            System.out.println(evaluarNumero(i));
        }

        Producto mouse = new Producto();
        mouse.setNombre("Mouse Razer Naga Trinity");
        mouse.setPrecio(112.50);
        mouse.setStock(10);

        Producto sillaGamer = new Producto();
        sillaGamer.setNombre("Silla Gamer Secretlab");
        sillaGamer.setPrecio(220.99);
        sillaGamer.setStock(5);

        System.out.println(mouse.describir());
        System.out.println(sillaGamer.describir());

        mouse.vender(15);
        System.out.println(mouse.describir());
        System.out.println(mouse.calcularValorTotal());


    }

    static String esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return "Eres mayor de edad";
        } else {
            return  "Eres menor de edad";
        }
    }

    static String evaluarNumero(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(numero);
        }
    }

}
