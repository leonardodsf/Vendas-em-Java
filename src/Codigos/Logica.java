package Codigos;
import java.util.*;
/**
 *
 * @author Leonardo Flores
 */
public class Logica {
    
    Scanner digita = new Scanner(System.in);
	private String login = "Gas";
	private String senha = "123";
	public String digita_login,digita_senha;
	
	public String getLogin() 
	{
		return login;
	}
	
	public String getSenha() 
	{
		return senha;
	}
	
	public void digitar()
	{
                System.out.print("===========================================================\n");
                System.out.print("=  Bem Vindo a Prova N2, Desenvolvido por Leonardo Flores =");
                System.out.print("\n===========================================================\n");
		System.out.print("Digite seu Login: ");
		digita_login = digita.next();
		System.out.print("Digite sua Senha: ");
		digita_senha = digita.next();
	}	       
        
}//class
