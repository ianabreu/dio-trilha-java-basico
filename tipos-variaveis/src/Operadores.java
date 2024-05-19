
import java.util.Date;

public class Operadores {

    public static void main(String[] args) {
        String nome = "GLEYSON"; //Strings de texto
        int idade = 22; //Numeros inteiros
        double peso = 68.5; //Numeros de ponto flutuante
        char sexo = 'M'; //Unico caractere
        boolean doadorOrgao = false; //Valor booleano
        Date dataNascimento = new Date(); //Instancia de objeto Date
        System.out.print(nome + idade + peso + sexo + doadorOrgao + dataNascimento);
    }
}
