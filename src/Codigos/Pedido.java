package Codigos;
/**
 *
 * @author Leonardo Flores
 */
import java.util.*;
public class Pedido 
{
	Cliente cliente = new Cliente();
	Produto produto = new Produto();
	Scanner digita = new Scanner(System.in);
	
	int quantidade;
	float desconto=0;
	int escolha;
	float precoTotal=0;
	int escolhaPrestacao;
	
    public void Escolha()
    {
    	
    	cliente.Cadastro();
    	System.out.println("\nEscolha o produto:\n1 - CANECA IF COFFEE\n2 - CANECA IOS DEVELOPER\n3 - CANECA ANÁLISTA DE SISTEMA\n4 - CANECA DBA\n5 - CANECA SISTEMA DA INFORMAÇÃO");
    	System.out.print("Digite aqui: ");
    	escolha = digita.nextInt();
    	while(escolha<1 || escolha >5)
    	{
    		System.out.println("Ocorreu um erro ao digitar, digite apenas as opções acima!");
    		System.out.println("\nEscolha o produto:\n1 - CANECA IF COFFEE\n2 - CANECA IOS DEVELOPER\n3 - CANECA ANÁLISTA DE SISTEMA\n4 - CANECA DBA\n5 - CANECA SISTEMA DA INFORMAÇÃO");
                System.out.print("Digite aqui: ");
                escolha = digita.nextInt();
    	}//while
    	Quantidade();
    	switch (escolha) 
    	{
			case 1:
				if(cliente.estado.equalsIgnoreCase("RS"))
				{
					precoTotal = ((produto.Produto1()-desconto)*quantidade)+100;
				}
				else if(cliente.estado.equalsIgnoreCase("SC"))
				{
					precoTotal = ((produto.Produto1()-desconto)*quantidade)+200;
				}
				else
				{
					precoTotal = ((produto.Produto1()-desconto)*quantidade)+300;
				}
			break;
			case 2:
				if(cliente.estado.equalsIgnoreCase("RS"))
				{
					precoTotal = ((produto.Produto2()-desconto)*quantidade)+100;
				}
				else if(cliente.estado.equalsIgnoreCase("SC"))
				{
					precoTotal = ((produto.Produto2()-desconto)*quantidade)+200;
				}
				else
				{
					precoTotal = ((produto.Produto2()-desconto)*quantidade)+300;
				}
			break;
			case 3:
				if(cliente.estado.equalsIgnoreCase("RS"))
				{
					precoTotal = ((produto.Produto3()-desconto)*quantidade)+100;
				}
				else if(cliente.estado.equalsIgnoreCase("SC"))
				{
					precoTotal = ((produto.Produto3()-desconto)*quantidade)+200;
				}
				else
				{
					precoTotal = ((produto.Produto3()-desconto)*quantidade)+300;
				}
			break;
			case 4:
				if(cliente.estado.equalsIgnoreCase("RS"))
				{
					precoTotal = ((produto.Produto4()-desconto)*quantidade)+100;
				}
				else if(cliente.estado.equalsIgnoreCase("SC"))
				{
					precoTotal = ((produto.Produto4()-desconto)*quantidade)+200;
				}
				else
				{
					precoTotal = ((produto.Produto4()-desconto)*quantidade)+300;
				}
			break;
			case 5:
				if(cliente.estado.equalsIgnoreCase("RS"))
				{
					precoTotal = ((produto.Produto5()-desconto)*quantidade)+100;
				}
				else if(cliente.estado.equalsIgnoreCase("SC"))
				{
					precoTotal = ((produto.Produto5()-desconto)*quantidade)+200;
				}
				else
				{
					precoTotal = ((produto.Produto5()-desconto)*quantidade)+300;
				}
			break;
			
		}//switch

    	System.out.println("\nValor total com o frete: "+String.format("R$ %.2f", precoTotal));
    	Prestacao();
    	quantidade = 0;
    }
    
	public void Quantidade()
	{
                System.out.print("\nComprando 5 ou mais produtos, ganha um desconto de 10% !!\n");
		System.out.print("\nQuantidade: ");
		this.quantidade = digita.nextInt();
		if(quantidade > 5)
		{
			switch (escolha) 
			{
				case 1:
					desconto = produto.Produto1()*0.1f;
				break;	
				case 2:
					desconto = produto.Produto2()*0.1f;
				break;
				case 3:
					desconto = produto.Produto3()*0.1f;
				break;	
				case 4:
					desconto = produto.Produto4()*0.1f;	
				break;
				case 5:
					desconto = produto.Produto5()*0.1f;
				break;
			}//switch
		}
	}
	
	public void Prestacao()
	{       
                System.out.print("\nAceitamos Boleto Bancário, Mercado Pago e Cartões Visa, Elo, MasterCard, HiperCard.\n");
		System.out.println("\nEscolha como pagar:\n\n1 - À Vista\n2 - 2x no cartão sem juros\n3 - 3x no cartão sem juros\n4 - 4x no cartão sem juros\n5 - 5x no cartão sem juros\n6 - 6x no cartão sem juros\n7 - 7x no cartão sem juros\n8 - 8x no cartão sem juros\n9 - 9x no cartão sem juros\n10 - 10x no cartão sem juros");           
		System.out.print("Digite aqui: ");
		escolhaPrestacao = digita.nextInt();
		while(escolhaPrestacao<1 || escolhaPrestacao >10)
    	{
                System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    		System.out.println("! Ocorreu um erro ao digitar, digite apenas as opções acima !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
                System.out.print("\nAceitamos Boleto Bancário, Mercado Pago e Cartões Visa, Elo, MasterCard, HiperCard.\n");
    		System.out.println("\nEscolha como pagar:\n\n1 - À Vista\n2 - 2x no cartão sem juros\n3 - 3x no cartão sem juros\n4 - 4x no cartão sem juros\n5 - 5x no cartão sem juros\n6 - 6x no cartão sem juros\n7 - 7x no cartão sem juros\n8 - 8x no cartão sem juros\n9 - 9x no cartão sem juros\n10 - 10x no cartão sem juros");               
		System.out.print("Digite aqui: ");
		escolhaPrestacao = digita.nextInt();
    	}//while
		
		switch (escolhaPrestacao) 
		{
			case 1:
				System.out.println("\nValor da prestação é R$ 0,00, pois será pago à vista.");
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
			break;
			case 2:
				System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/2));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
			break;
			case 3:
				System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/3));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
			break;
                        case 4:
                               System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/4));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
                        break;
                        case 5:
                               System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/5));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
                        break;
                        case 6:
                               System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/6));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
                        break;
                        case 7:
                               System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/7));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
                        break;
                        case 8:
                               System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/8));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
                        break;
                        case 9:
                               System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/9));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
                        break;
                        case 10:
                                System.out.println("\nValor da prestação será "+String.format("R$ %.2f", precoTotal/10));
                                System.out.print("\nSeu pedido foi realizado com sucesso!\n");
                                System.out.print("\nAguarde o prazo de entrega de 7 dias\n");
                                System.out.print("\n======================================================\n");
                                System.out.print("=      Caneca do Dev, agradece pela preferência!     =");
                                System.out.print("\n======================================================\n");
                        break;		
		}//switch
	}
	
	
}
