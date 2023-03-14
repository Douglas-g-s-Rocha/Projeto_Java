package Perfis;

import Cadastro.CadastroDeMotorista;
import Cadastro.CadastroDeMultas;
import Cadastro.CadastroDeVeiculo;
import Entidades.*;
import Outros.BancoDeDados;
import Outros.MenuPrincipal;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfilGerente {


    public void visualizacaoGerente() {

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        BancoDeDados bancoDeDados = new BancoDeDados();
        CadastroDeMotorista cadastroDeMotorista = new CadastroDeMotorista();
        CadastroDeVeiculo cadastroDeVeiculo = new CadastroDeVeiculo();
        CadastroDeMultas cadastroDeMultas = new CadastroDeMultas();

        ArrayList<Motorista> motoristas = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();
        ArrayList<Automovel> automoveis = new ArrayList<>();
        ArrayList<Caminhao> caminhoes = new ArrayList<>();
        ArrayList<Multa> multas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);




        System.out.println("Digite a opção: ");
        System.out.println("1 - Cadastrar motorista \n " +
                "2 - Cadastrar moto \n" +
                "3 - Cadastrar automóvel \n" +
                "4 - Cadastrar caminhão \n" +
                "5 - Cadastrar multa \n" +

                "0 - Voltar para o menu anterior");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 0:
                menuPrincipal.executarMenuPrincipal();
            break;
            case 1:
                motoristas.add(cadastroDeMotorista.cadastrarMotorista());
                break;
            case 2:
                motos.add(cadastroDeVeiculo.cadastrarMoto());
                break;
            case 3:
                automoveis.add(cadastroDeVeiculo.cadastrarAutomovel());
                break;
            case 4:
                caminhoes.add(cadastroDeVeiculo.cadastrarCaminhao());
                break;
            case 5:
                multas.add(cadastroDeMultas.cadastrarMulta(motoristas, motos, caminhoes, automoveis));
                break;

                // ...........
        }
    }
}
