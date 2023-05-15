import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int MAX_ELEMENTOS = 2;
        int opcao = 0;
        int qtdCadastrados = 0;
        int cont = 0;
        String cpf;
        String breve;
        String nome;
        
        Piloto[] lista = new Piloto[MAX_ELEMENTOS];

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo Breve");
            System.out.println("4 - Cadastrar aeronave");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, saio do cadastro
                 if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    
                } Piloto piloto = new Piloto();
                System.out.println("\nInsira o CPF do piloto: ");
                piloto.setCpf(sc.next());
                System.out.println("\nInsira o Nome do piloto: ");
                piloto.setNome(sc.next());
                System.out.println("\nInsira o Breve do piloto: ");
                piloto.setBreve(sc.next());
                lista [cont] = piloto;
                cont++;

                System.out.println("\nPiloto cadastrado com sucesso. Digite C e Enter");
                sc.next();

                //Cadastre seu piloto aqui

                
            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há pilotos cadastrados para exibir.");
                } for (Piloto piloto : lista) {
                    if(piloto!=null){
                    System.out.println(piloto);
                    }
                    
                }

                // Exiba os pilotos aqui

                sc.next();
            } else if (opcao == 3) {
                System.out.println("\nInsira o Breve do piloto: ");
                breve = sc.next();
                for (Piloto piloto : lista) {
                    if(piloto != null && breve.equals(piloto.getBreve())){
                        System.out.println(piloto);

                    }
                    
                }
                 sc.next();

            } else if (opcao == 4) {
                 // Se não tem ninguém cadastrado no vetor, caio fora
                 if (qtdCadastrados == 0) {
                    System.out.println("\nSem pilotos, não há como cadastrar uma aeronave");
                    sc.next();
                 }System.out.println("Informe o nome do piloto para localizar seu nome, cpf e breve. e depois cadastrar sua aeronave!");
                    nome = sc.next();
                    for (Piloto piloto : lista) {
                        if(piloto!=null && nome.equals(piloto.getNome())){
                        System.out.println(piloto);
    
                Aeronave aeronave = new Aeronave();
                System.out.println("\nInsira o modelo da aeronave: ");
                aeronave.setModelo(sc.next());
                System.out.println("\nInsira o numero de serie da Aeronave: ");
                aeronave.setNumeroSerie(sc.next());
                piloto.setAeronave(aeronave);

               //Crie a aeronave vinculando-a ao piloto
                System.out.println("\nAeronave cadastrada com sucesso.");
                //Exiba os dados da aeronave
                sc.next();
                    }
                }
            }
  
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        sc.close();
        

    }

        static void voltarMenu(Scanner sc) throws InterruptedException{
        System.out.println("\nPressione C e ENTER para voltar ao menu.");
        sc.next();
    }
}
