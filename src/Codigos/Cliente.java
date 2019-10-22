package Codigos;
import java.util.*;
/**
 *
 * @author Leonardo Flores
 */
public class Cliente
{
	String nome,estado;
	long cpf;
	Scanner digita = new Scanner(System.in);
	
	public void Cadastro()
	{               
		System.out.print("Digite seu nome: ");
		nome = digita.next();
                System.out.print("\nOlá "+nome+", Seja Bem Vindo!!\n");
                System.out.print("\nPor favor, preencha o campo do seu CPF abaixo;");
		System.out.print("\nCpf: ");
		cpf = digita.nextLong();
                System.out.print("\nDigite apenas a Sigla do seu Estado abaixo\n");
                System.out.print("Atendemos apenas os Estados de RS,SC e PR\n");
		System.out.print("Estado: ");
		estado = digita.next();
	}
	
}