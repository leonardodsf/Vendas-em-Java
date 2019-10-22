package Codigos;
import java.util.*;
/**
 *
 * @author Leonardo Flores
 */
public class Executora 
{
    	public static void main(String[] args) 
	{               
                Scanner digita = new Scanner(System.in);

		Logica L = new Logica();
        
		L.digitar();
		
		if(L.digita_login.equalsIgnoreCase(L.getLogin()) && L.digita_senha.equalsIgnoreCase(L.getSenha()))
		{
                        System.out.println("\n******************************************************");
			System.out.println("*               Você entrou no Sistema               *");
                        System.out.println("******************************************************");
		}
		else
		{
			System.out.println("\nVocê não está cadastrado no Sistema\n");
                        System.out.println("Digite Login e Senha que já esteja cadastrado\n");
                        L.digitar();
                    if(L.digita_login.equalsIgnoreCase(L.getLogin()) && L.digita_senha.equalsIgnoreCase(L.getSenha()))
                    {
                        System.out.println("\n******************************************************");
			System.out.println("*               Você entrou no Sistema               *");
                        System.out.println("******************************************************");
                    }
		}  
                
                Pedido pedido = new Pedido();
		
                char volta = '1';
		
		System.out.println("======================================================");
		System.out.println("=                 Loja Caneca do Dev                 =");
		System.out.println("======================================================\n\n");
		
		while(volta == '1')
		{
			pedido.Escolha();
			
			System.out.println("\nDeseja realizar novo pedido?\n1 - SIM\n2 - NÃO");
			System.out.print("Digite aqui: ");
                        volta = digita.next().charAt(0);
		}	
                System.out.println("\n©2019 Caneca do Dev. Todos os direitos reservados. Desenvolvido por Leonardo Flores\n");
	}//main
}//clas
