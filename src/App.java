import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tBem-vindo(a) ao programa!\n"
        +"***********************************************");

        Camiseta[] camisetas = new Camiseta[50];
        int countCamisetas = 0;
        Jaqueta[] jaquetas = new Jaqueta[50];
        int countJaquetas = 0;
        Calcado[] calcados = new Calcado[50];
        int countCalcados = 0;

        int opcoes;
        char resposta = 'S';

        while(resposta == 'S'){
        System.out.println("Selecione a opção para continuar:\n"
        +"1- Cadastrar\n"
        +"2- Consultar\n"
        +"3- Editar\n"
        +"4- Excluir\n"
        +"5- Sair\n"
        +"***********************************************");
        opcoes = sc.nextInt();

            switch (opcoes){
                case 1:
                    int produtos;
                    System.out.println("***********************************************");
                    System.out.println("Qual produto deseja cadastrar?:\n"
                    +"1- Camisetas\n"
                    +"2- Jaquetas\n"
                    +"3- Calçados");
                    System.out.println("***********************************************");
                    produtos = sc.nextInt();
                        switch(produtos){
                            case 1:
                                System.out.println("***********************************************");
                                Camiseta camiseta = new Camiseta();
                                System.out.println("Insira o nome do produto:");
                                camiseta.setNome(sc.next());
                                System.out.println("Insira a cor do produto:");
                                camiseta.setCor(sc.next());
                                System.out.println("Insira o tamanho do produto:");
                                camiseta.setTamanho(sc.next());
                                System.out.println("Insira o valor do produto:");
                                camiseta.setValor(sc.nextFloat());
                                System.out.println("Insira o fabricante do produto:");
                                camiseta.setFabricante(sc.next());
                                System.out.println("Insira o estoque do produto:");
                                camiseta.setEstoque(sc.nextInt());
                                System.out.println("Insira o número de vendas do produto:");
                                camiseta.setVendas(sc.nextInt());
                                System.out.println("Insira o código do produto:");
                                camiseta.setCodigo(sc.nextInt());
                                System.out.println("Insira o lote do produto:");
                                camiseta.setLote(sc.next());
                                System.out.println("***********************************************");
                                camisetas[countCamisetas] = camiseta;
                                countCamisetas = countCamisetas + 1;
                                break;
                            case 2:
                                System.out.println("***********************************************");
                                Jaqueta jaqueta = new Jaqueta();
                                System.out.println("Insira o nome do produto:");
                                jaqueta.setNome(sc.next());
                                System.out.println("Insira a cor do produto:");
                                jaqueta.setCor(sc.next());
                                System.out.println("Insira o tamanho do produto:");
                                jaqueta.setTamanho(sc.next());
                                System.out.println("Insira o valor do produto:");
                                jaqueta.setValor(sc.nextFloat());
                                System.out.println("Insira o fabricante do produto:");
                                jaqueta.setFabricante(sc.next());
                                System.out.println("Insira o estoque do produto:");
                                jaqueta.setEstoque(sc.nextInt());
                                System.out.println("Insira o número de vendas do produto:");
                                jaqueta.setVendas(sc.nextInt());
                                System.out.println("Insira o código do produto:");
                                jaqueta.setCodigo(sc.nextInt());
                                System.out.println("Insira o lote do produto:");
                                jaqueta.setLote(sc.next());
                                System.out.println("***********************************************");
                                jaquetas[countJaquetas] = jaqueta;
                                countJaquetas = countJaquetas + 1;
                                break;
                            case 3:
                                System.out.println("***********************************************");
                                Calcado calcado = new Calcado();
                                System.out.println("Insira o nome do produto:");
                                calcado.setNome(sc.next());
                                System.out.println("Insira a cor do produto:");
                                calcado.setCor(sc.next());
                                System.out.println("Insira o tamanho do produto:");
                                calcado.setTamanho(sc.nextInt());
                                System.out.println("Insira o valor do produto:");
                                calcado.setValor(sc.nextFloat());
                                System.out.println("Insira o fabricante do produto:");
                                calcado.setFabricante(sc.next());
                                System.out.println("Insira o estoque do produto:");
                                calcado.setEstoque(sc.nextInt());
                                System.out.println("Insira o número de vendas do produto:");
                                calcado.setVendas(sc.nextInt());
                                System.out.println("Insira o código do produto:");
                                calcado.setCodigo(sc.nextInt());
                                System.out.println("Insira o lote do produto:");
                                calcado.setLote(sc.next());
                                System.out.println("***********************************************");
                                calcados[countCalcados] = calcado;
                                countCalcados = countCalcados + 1;
                                break;
                            default:
                                System.out.println("***********************************************");
                                System.out.println("Alternativa inválida, por favor, tente novamente.");
                                System.out.println("***********************************************");
                                break;
                        }
                    break;
                case 2:
                    int consulta;
                    System.out.println("***********************************************");
                    System.out.println("Qual produto deseja consultar?\n"
                    +"1- Camisetas\n"
                    +"2- Jaquetas\n"
                    +"3- Calçados");
                    System.out.println("***********************************************");
                    consulta = sc.nextInt();
                        switch(consulta){
                            case 1:
                                for(int i = 0; 1 < camisetas.length; i = i+1){
                                    if(camisetas[i] != null){
                                        System.out.println(camisetas[i].toString());
                                    }
                                }
                                break;
                            case 2:
                                for(int i = 0; 1 < jaquetas.length; i = i+1){
                                    if(jaquetas[i] != null){
                                        System.out.println(jaquetas[i].toString());
                                    }
                                }
                                break;
                            case 3:
                                for(int i = 0; 1 < calcados.length; i = i+1){
                                    if(calcados[i] != null){
                                        System.out.println(calcados[i].toString());
                                    }
                                }        
                                break;
                            default:
                                System.out.println("Alternativa inválida, por favor, tente novamente.");
                                break;
                        }
                    break;
                case 3:
                        int editP;
                        System.out.println("***********************************************");
                        System.out.println("Qual produto deseja editar?\n"
                        +"1- Camisetas\n"
                        +"2- Jaquetas\n"
                        +"3- Calçados");
                        System.out.println("***********************************************");
                        editP = sc.nextInt();
                            switch(editP){
                                case 1:   
                                    System.out.println("***********************************************");
                                    System.out.println("Digite o indice do produto que deseja editar (obs de 1 a "+camisetas.length+"):");
                                    int indiceEditar = sc.nextInt();
                                    indiceEditar = indiceEditar - 1;

                                    int editA;
                                    System.out.println("***********************************************");
                                    System.out.println("Qual item deseja editar?\n"
                                    +"1- Nome\n"
                                    +"2- Cor\n"
                                    +"3- Tamanho\n"
                                    +"4- Valor\n"
                                    +"5- Fabricante\n"
                                    +"6- Estoque\n"
                                    +"7- Vendas\n"
                                    +"8- Código\n"
                                    +"9- Lote\n"
                                    );
                                    System.out.println("***********************************************");

                                    editA = sc.nextInt();
                                        switch(editA){
                                            case 1: 
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o nome do produto:");
                                                camisetas[indiceEditar].setNome(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 2:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira a cor do produto:");
                                                camisetas[indiceEditar].setCor(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 3:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o tamanho do produto:");
                                                camisetas[indiceEditar].setTamanho(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 4:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o valor do produto:");
                                                camisetas[indiceEditar].setValor(sc.nextFloat());
                                                System.out.println("***********************************************");
                                                break;
                                            case 5:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o fabricante do produto:");
                                                camisetas[indiceEditar].setFabricante(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 6:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o estoque do produto:");
                                                camisetas[indiceEditar].setEstoque(sc.nextInt());
                                                System.out.println("***********************************************");
                                                break;
                                            case 7:
                                                System.out.println("***********************************************"); 
                                                System.out.println("Insira o número de vendas do produto:");
                                                camisetas[indiceEditar].setVendas(sc.nextInt());
                                                System.out.println("***********************************************");
                                                break;
                                            case 8:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o código do produto:");
                                                camisetas[indiceEditar].setCodigo(sc.nextInt());
                                                System.out.println("***********************************************");
                                                break;
                                            case 9:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o lote do produto:");
                                                camisetas[indiceEditar].setLote(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            default:
                                                System.out.println("***********************************************");
                                                System.out.println("Alternativa inválida, por favor, tente novamente.");
                                                System.out.println("***********************************************");
                                                break;
                                        }
                                    break;
                                case 2:    
                                    System.out.println("***********************************************");
                                    System.out.println("Digite o indice do produto que deseja editar (obs de 1 a "+camisetas.length+"):");
                                    indiceEditar = sc.nextInt();
                                    indiceEditar = indiceEditar - 1;

                                    int editB;
                                    System.out.println("***********************************************");
                                    System.out.println("Qual item deseja editar?\n"
                                    +"1- Nome\n"
                                    +"2- Cor\n"
                                    +"3- Tamanho\n"
                                    +"4- Valor\n"
                                    +"5- Fabricante\n"
                                    +"6- Estoque\n"
                                    +"7- Vendas\n"
                                    +"8- Código\n"
                                    +"9- Lote\n"
                                    );
                                    System.out.println("***********************************************");
                                    editB = sc.nextInt();
                                        switch(editB){
                                            case 1:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o nome do produto:");
                                                jaquetas[indiceEditar].setNome(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 2:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira a cor do produto:");
                                                jaquetas[indiceEditar].setCor(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 3:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o tamanho do produto:");
                                                jaquetas[indiceEditar].setTamanho(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 4:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o valor do produto:");
                                                jaquetas[indiceEditar].setValor(sc.nextFloat());
                                                System.out.println("***********************************************");
                                            case 5:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o fabricante do produto:");
                                                jaquetas[indiceEditar].setFabricante(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            case 6:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o estoque do produto:");
                                                jaquetas[indiceEditar].setEstoque(sc.nextInt());
                                                System.out.println("***********************************************");
                                                break;
                                            case 7:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o número de vendas do produto:");
                                                jaquetas[indiceEditar].setVendas(sc.nextInt());
                                                System.out.println("***********************************************");
                                                break;
                                            case 8:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o código do produto:");
                                                jaquetas[indiceEditar].setCodigo(sc.nextInt());
                                                System.out.println("***********************************************");
                                                break;
                                            case 9:
                                                System.out.println("***********************************************");
                                                System.out.println("Insira o lote do produto:");
                                                jaquetas[indiceEditar].setLote(sc.next());
                                                System.out.println("***********************************************");
                                                break;
                                            default:
                                                System.out.println("***********************************************");
                                                System.out.println("Alternativa inválida, por favor, tente novamente.");
                                                System.out.println("***********************************************");
                                                break;
                                        }
                                    break;
                                case 3:
                                    System.out.println("***********************************************");
                                    System.out.println("Digite o indice do produto que deseja editar (obs de 1 a "+camisetas.length+"):");
                                    indiceEditar = sc.nextInt();
                                    indiceEditar = indiceEditar - 1;

                                    int editC;
                                        System.out.println("***********************************************");
                                        System.out.println("Qual item deseja editar?\n"
                                        +"1- Nome\n"
                                        +"2- Cor\n"
                                        +"3- Tamanho\n"
                                        +"4- Valor\n"
                                        +"5- Fabricante\n"
                                        +"6- Estoque\n"
                                        +"7- Vendas\n"
                                        +"8- Código\n"
                                        +"9- Lote\n"
                                        );
                                        System.out.println("***********************************************");
                                        editC = sc.nextInt();
                                            switch(editC){
                                                case 1:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o nome do produto:");
                                                    calcados[indiceEditar].setNome(sc.next());
                                                    System.out.println("***********************************************");
                                                    break;
                                                case 2:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira a cor do produto:");
                                                    calcados[indiceEditar].setCor(sc.next());
                                                    System.out.println("***********************************************");
                                                    break;
                                                case 3:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o tamanho do produto:");
                                                    calcados[indiceEditar].setTamanho(sc.nextInt());
                                                    System.out.println("***********************************************");
                                                    break;
                                                case 4:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o valor do produto:");
                                                    calcados[indiceEditar].setValor(sc.nextFloat());
                                                    System.out.println("***********************************************");
                                                case 5:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o fabricante do produto:");
                                                    calcados[indiceEditar].setFabricante(sc.next());
                                                    System.out.println("***********************************************");
                                                    break;
                                                case 6:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o estoque do produto:");
                                                    calcados[indiceEditar].setEstoque(sc.nextInt());
                                                    System.out.println("***********************************************");
                                                    break;
                                                case 7:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o número de vendas do produto:");
                                                    calcados[indiceEditar].setVendas(sc.nextInt());
                                                    System.out.println("***********************************************");
                                                    break;
                                                case 8:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o código do produto:");
                                                    calcados[indiceEditar].setCodigo(sc.nextInt());
                                                    System.out.println("***********************************************");
                                                    break;
                                                case 9:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Insira o lote do produto:");
                                                    calcados[indiceEditar].setLote(sc.next());
                                                    System.out.println("***********************************************");
                                                    break;
                                                default:
                                                    System.out.println("***********************************************");
                                                    System.out.println("Alternativa inválida, por favor, tente novamente.");
                                                    System.out.println("***********************************************");
                                                    break;
                                            }
                                    break;
                            }
                    break;
                case 4:
                    int excluirP;
                    System.out.println("***********************************************");
                    System.out.println("Qual produto deseja excluir?\n"
                        +"1- Camisetas\n"
                        +"2- Jaquetas\n"
                        +"3- Calçados");
                    System.out.println("***********************************************");
                    excluirP = sc.nextInt();
                    switch(excluirP){
                        case 1:
                            System.out.println("\n***********************************************\n");
                            System.out.println("Digite o índice do produto que excluir (obs de 1 a " + camisetas.length +"):");
                            int indiceExcluir = sc.nextInt();
                            indiceExcluir --;
                            for(int i=0; i<camisetas.length; i++){
                                if(i >= indiceExcluir && i< camisetas.length-1) {
                                    camisetas[i] = camisetas[i+1];
                                } else if(i == camisetas.length - 1){
                                    camisetas[i] = null;
                                }
                            }
                            countCamisetas--;
                            break;
                        case 2:
                            System.out.println("\n***********************************************\n");
                            System.out.println("Digite o índice do produto que excluir (obs de 1 a " + jaquetas.length +"):");
                            indiceExcluir = sc.nextInt();
                            indiceExcluir --;
                            for(int i=0; i<jaquetas.length; i++){
                                if(i >= indiceExcluir && i< jaquetas.length-1) {
                                    jaquetas[i] = jaquetas[i+1];
                                } else if(i == jaquetas.length - 1){
                                    jaquetas[i] = null;
                                }
                            }
                            countJaquetas--;
                            break;
                        case 3:
                            System.out.println("\n***********************************************\n");
                            System.out.println("Digite o índice do produto que excluir (obs de 1 a " + calcados.length +"):");
                            indiceExcluir = sc.nextInt();
                            indiceExcluir --;
                            for(int i=0; i<calcados.length; i++){
                                if(i >= indiceExcluir && i< calcados.length-1) {
                                    calcados[i] = calcados[i+1];
                                } else if(i == calcados.length - 1){
                                    calcados[i] = null;
                                }
                            }
                            countCalcados--;
                            break;
                    }
                    break;
                case 5:
                    do{ 
                        System.out.println("\n***********************************************\n");
                        System.out.println("Deseja continuar a executar o programa? (S/N)");
                        resposta = sc.next().toUpperCase().charAt(0);
                        System.out.println("\n***********************************************\n");
                    } while(resposta != 'S' && resposta != 'N');
                    break;
                default:
                    System.out.println("***********************************************");
                    System.out.println("Alternativa inválida, por favor, tente novamente.");
                    System.out.println("***********************************************");
                        break;
            }
        }

        System.out.println("\t\tFim do programa!");
        sc.close();
    }
}