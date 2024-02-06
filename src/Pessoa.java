import java.math.BigDecimal;
public class Pessoa {
    String nome;
    int idade;
    BigDecimal b1 = BigDecimal.ZERO;
    Pessoa() {
//        this("Teste");
    }
    Pessoa (String nome){
//      this.nome = nome;
        this(nome,20);
    }
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", b1=" + b1 +
                '}';
    }

}
