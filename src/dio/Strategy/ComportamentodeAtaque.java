package dio.Strategy;

public class ComportamentodeAtaque implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Em modo de ATAQUE");
    }
}
