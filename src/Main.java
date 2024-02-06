import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vinicius",20);
        pessoa.nome = "Rafael";
        System.out.println(pessoa);
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa("Dmitri");
        System.out.println(pessoa3);
        Pessoa pessoa4 = new Pessoa("Rayanne");
        System.out.println(pessoa4);
        Pessoa pessoa5 = new Pessoa();
        System.out.println(pessoa5);
        /*
        pessoa.nome = "Vinicius";
        pessoa.idade = 20;
        */
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        System.out.println(pessoas);
    }

}
