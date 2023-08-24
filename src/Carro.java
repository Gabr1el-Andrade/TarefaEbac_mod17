public class Carro {

    private String Nome;
    private String modelo;

    public Carro(String nome, String modelo) {
        this.Nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return Nome;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + ", Modelo: " + modelo;
    }
}
