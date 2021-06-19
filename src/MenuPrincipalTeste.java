import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuPrincipalTeste {

    private static Object Clientes;

    public static void main(String[] args) {

        Gerente geral = new Gerente();

        Menu menu = new Menu();

        System.out.println("*** Banco Mentorama ***");

        Map<Integer, Conta> clientesMentorama = new HashMap<>();
        double[] saldoBancario = new double[100];

        int id = 0;

        boolean continua = true;

        while (continua) {
            menu.imprimeMenu();
            String valorDecisao = menu.decisaoUsuario();

            switch (valorDecisao) {

                //criar cliente e conta
                case "1": {
                    System.out.println("Digite o numero do tipo de conta: " +
                            "\n 1- Conta Corrente" +
                            "\n 2- Conta Poupança" +
                            "\n 3- Conta Salario");

                    Scanner tipoConta = new Scanner(System.in);
                    int nomeCategoria = Integer.parseInt(tipoConta.next());

                    if (nomeCategoria == 1) {

                        System.out.println("Digite o id do cliente: ");
                        id = tipoConta.nextInt();
                        tipoConta.nextLine();

                        System.out.println("Nome do cliente: ");
                        String clienteBanco = tipoConta.nextLine();
                        System.out.println("Cpf do cliente: ");
                        String cpfcliente = tipoConta.nextLine();
                        System.out.println("Numero da conta: ");
                        int numeroConta = tipoConta.nextInt();
                        System.out.println("Numero da agência: ");
                        int agenciaConta = tipoConta.nextInt();
                        tipoConta.nextLine();
                        System.out.println("Nome do banco: ");
                        String bancoConta = tipoConta.nextLine();
                        System.out.println("Saldo inicial: ");
                        double saldoConta = tipoConta.nextDouble();
                        System.out.println("Limite de cheque especial: ");
                        double chequeEspecialConta = tipoConta.nextDouble();

                        ContaCorrente cc = new ContaCorrente(clienteBanco, cpfcliente, numeroConta, agenciaConta, bancoConta, saldoConta, chequeEspecialConta);

                        clientesMentorama.put(id, cc);
                        saldoBancario[id] = clientesMentorama.get(id).saldo;


                    } else if (nomeCategoria == 2) {


                        System.out.println("Digite o id do cliente: ");
                        id = tipoConta.nextInt();
                        tipoConta.nextLine();

                        System.out.println("Nome do cliente: ");
                        String clienteBanco = tipoConta.nextLine();
                        System.out.println("Cpf do cliente: ");
                        String cpfcliente = tipoConta.nextLine();
                        System.out.println("Numero da conta: ");
                        int numeroConta = tipoConta.nextInt();
                        System.out.println("Numero da agência: ");
                        int agenciaConta = tipoConta.nextInt();
                        tipoConta.nextLine();
                        System.out.println("Nome do banco: ");
                        String bancoConta = tipoConta.nextLine();
                        System.out.println("Saldo inicial: ");
                        double saldoConta = tipoConta.nextDouble();
                        System.out.println("Dia aniversario ");
                        int diaAniversario = tipoConta.nextInt();

                        ContaPoupanca cp = new ContaPoupanca(clienteBanco, cpfcliente, numeroConta, agenciaConta, bancoConta, saldoConta, diaAniversario);

                        clientesMentorama.put(id, cp);
                        saldoBancario[id] = clientesMentorama.get(id).getSaldo();

                    } else if (nomeCategoria == 3) {

                        System.out.println("Digite o id do cliente: ");
                        id = tipoConta.nextInt();
                        tipoConta.nextLine();

                        System.out.println("Nome do cliente: ");
                        String clienteBanco = tipoConta.nextLine();
                        System.out.println("Cpf do cliente: ");
                        String cpfcliente = tipoConta.nextLine();
                        tipoConta.nextLine();
                        System.out.println("Numero da conta: ");
                        int numeroConta = tipoConta.nextInt();
                        System.out.println("Numero da agência: ");
                        int agenciaConta = tipoConta.nextInt();
                        tipoConta.nextLine();
                        System.out.println("Nome do banco: ");
                        String bancoConta = tipoConta.nextLine();
                        System.out.println("Saldo inicial: ");
                        double saldoConta = tipoConta.nextDouble();
                        System.out.println("Quantidade saques mensais ");
                        int quantidadeSaques = tipoConta.nextInt();

                        ContaSalario cs = new ContaSalario(clienteBanco, cpfcliente, numeroConta, agenciaConta, bancoConta, saldoConta, quantidadeSaques);


                        clientesMentorama.put(id, cs);
                        saldoBancario[id] = clientesMentorama.get(id).getSaldo();

                    } else
                        System.out.println("Tipo de conta incorreta!!!!");
                    break;
                }

                //sacar
                case "2": {
                    System.out.println("Digite o tipo de conta : " +
                            "\n 1- Conta Corrente" +
                            "\n 2- Conta Poupança" +
                            "\n 3- Conta Salario");

                    Scanner tipoConta = new Scanner(System.in);
                    int nomeCategoria = Integer.parseInt(tipoConta.next());

                    if (nomeCategoria == 1) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor desejado: ");
                        double valorDesejado = tipoConta.nextDouble();

                        clientesMentorama.get(idCliente);

                        if (id > -1) {

                            clientesMentorama.get(idCliente).sacar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());
                        } else {
                            System.out.println();
                        }

                    } else if (nomeCategoria == 2) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor desejado: ");
                        double valorDesejado = tipoConta.nextDouble();

                        clientesMentorama.get(idCliente);

                        if (id > -1) {

                            clientesMentorama.get(idCliente).sacar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());

                        }

                    } else if (nomeCategoria == 3) {

                        System.out.println("Digite o id do cliente : ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor desejado : ");
                        double valorDesejado = tipoConta.nextDouble();

                        clientesMentorama.get(idCliente);

                        if (id > -1) {

                            clientesMentorama.get(idCliente).sacar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());

                        }

                    } else {
                        System.out.println("Tipo de conta incorreta!!!!");
                    }
                    break;
                }

                //depositar
                case "3": {

                    System.out.println("Digite o tipo de conta : " +
                            "\n 1- Conta Corrente" +
                            "\n 2- Conta Poupança" +
                            "\n 3- Conta Salario");

                    Scanner tipoConta = new Scanner(System.in);
                    int nomeCategoria = Integer.parseInt(tipoConta.next());

                    if (nomeCategoria == 1) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor a ser depositado : ");
                        double valorDesejado = tipoConta.nextDouble();

                        clientesMentorama.get(idCliente);

                        if (id > -1) {

                            clientesMentorama.get(idCliente).depositar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());
                        } else {
                            System.out.println();
                        }

                    } else if (nomeCategoria == 2) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor a ser depositado : ");
                        double valorDesejado = tipoConta.nextDouble();

                        clientesMentorama.get(idCliente);

                        if (id > -1) {

                            clientesMentorama.get(idCliente).depositar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());
                        }

                    } else if (nomeCategoria == 3) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor a ser depositado : ");
                        double valorDesejado = tipoConta.nextDouble();

                        clientesMentorama.get(idCliente);

                        if (id > -1) {
                            clientesMentorama.get(idCliente).depositar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());
                        }

                    } else {
                        System.out.println("Tipo de conta incorreta!!!!");
                    }
                    break;
                }

                //trasferir
                case "4": {
                    Scanner tipoConta = new Scanner(System.in);

                    System.out.println("Digite o id do cliente que efetuará a transferencia :  ");
                    int idCliente1 = tipoConta.nextInt();

                    System.out.println("Digite o id do cliente que receberá a transferencia : ");
                    int idCliente2 = tipoConta.nextInt();

                    System.out.println("Digite o valor da transferencia : ");
                    double valorDaTransferencia = tipoConta.nextInt();

                    if (clientesMentorama.get(idCliente1).getSaldo() >= valorDaTransferencia) {
                        clientesMentorama.get(idCliente1).sacar(valorDaTransferencia);
                        System.out.println("Saldo disponivel depois da tranferencia é de : " + clientesMentorama.get(idCliente1).getSaldo());

                        System.out.println("Tranferencia efetuada com sucesso!!!! ");
                        clientesMentorama.get(idCliente2).depositar(valorDaTransferencia);
                        System.out.println("Saldo na conta que recebeu a transferencia: " + clientesMentorama.get(idCliente2).getSaldo());
                    } else if (clientesMentorama.get(idCliente1).getSaldo() < valorDaTransferencia) {
                        System.out.println("Valor acima do saldo disponivel para transferencia");
                    } else {
                        System.out.println("Nenhum valor passado :(");
                    }
                    break;
                }
                //valor total das contas
                case "5": {

                    double montanteTotal = 0;
                    for (int i = 0; i < saldoBancario.length; i++) {
                        montanteTotal += saldoBancario[i];
                    }
                    System.out.println("Montante disponivel das contas: " + montanteTotal);
                    break;
                }

                //saldo
                case "6": {
                    Scanner tipoConta = new Scanner(System.in);

                    if (clientesMentorama.isEmpty()){
                        System.out.println("Não existe nenhuma conta cadastrada no banco ainda!!!!! ");
                    }else {
                        System.out.println("Digite o id do cliente para consulta de saldo:  ");
                        int idCliente = tipoConta.nextInt();

                        System.out.println(" Saldo disponivel R$ " + clientesMentorama.get(idCliente).getSaldo());
                    }

                break;
                }

                case "7": {
                    System.out.println("Seção finalizada!!!");
                    System.exit(0);
                }

                default: {

                    throw new IllegalStateException("Opção invalida!!  " + valorDecisao);
                }


            }
        }
    }
}
