import java.util.ArrayList;

public class Main {
    public String name;

    static String Agradecimentos = "Este eh meu 8ª dia aprendendo java";

    protected int salary;

    public static void main(String[] args) {
        Ser meuSerAnimal = new Cachorro( "Mel", 2, "Gabriel");
        Ser meuSerHumano = new Pessoa("Gabriel", 24, "Rocha");
        meuSerAnimal.setNome("Gabriel");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());
        System.out.println(Agradecimentos);
    }

    private void atualizaSalario() {
        this.salary = 4000;
    }

    public int getSalary() {
        this.atualizaSalario();
        return this.salary;

    }

}
