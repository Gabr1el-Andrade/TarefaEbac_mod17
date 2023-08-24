import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();


        listaCarros.add(new CarroDeFirma("Uno", "De Escada"));
        listaCarros.add(new CarroPopular("Gol", "Sapão"));
        listaCarros.add(new CarroEsportivo("Chevett", "Turbo"));


        for (Carro carro : listaCarros) {
            System.out.println(carro);
        }
    }

    }
