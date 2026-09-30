public class Cachorro implements Domestico {

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void brincar() {
        System.out.println("O cachorro está brincando.");
    }
}
