public class Main {

    public static void main(String[] args) {

        Animal animal = new Cachorro();

        animal.emitirSom();

        Cachorro cachorro = (Cachorro) animal;

        cachorro.latir();
    }
}
