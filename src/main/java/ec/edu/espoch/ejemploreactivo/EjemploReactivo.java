package ec.edu.espoch.ejemploreactivo;

import reactor.core.publisher.Flux;

public class EjemploReactivo {

    public static void main(String[] args) {
        Flux.just("Java", "C++", "SQL", "Python")
                .filter(l -> l.length() > 3)
                .subscribe(System.out::println);
    }
}
