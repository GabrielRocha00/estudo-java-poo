public class Cachorro extends Ser {

    String nomeDono;

    public Cachorro(String nome, int idade, String nomeDono) {
        super(nome, idade);
    }

    @Override
    public String saudacao(){
        return "au au";
    }
}
