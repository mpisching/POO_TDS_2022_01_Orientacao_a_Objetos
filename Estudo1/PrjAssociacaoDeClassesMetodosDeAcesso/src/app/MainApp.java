/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Bairro;
import domain.Cidade;
import domain.Departamento;
import domain.Endereco;
import domain.Funcionario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mpisc
 */
public class MainApp {

    public static void main(String[] args) {
        Departamento d1 = new Departamento();
        d1.setCodigo(1);
        d1.setLocal("Bloco central");
        d1.setNome("Vendas");

        Departamento d2 = new Departamento();
        d2.setCodigo(2);
        d2.setLocal("Bloco A");
        d2.setNome("Almoxarifado");

        Cidade cidade = new Cidade();
        cidade.setNome("Florianopolis");
        cidade.setUf("SC");

        Bairro bairro = new Bairro();
        bairro.setNome("Trindade");

        Endereco endereco1 = new Endereco();
        endereco1.setBairro(bairro);
        endereco1.setCidade(cidade);
        endereco1.setLogradouro("Rua palmeiras");
        endereco1.setNumero(66);
        endereco1.setComplemento("Casa");

        Endereco endereco2 = new Endereco();
        endereco2.setBairro(bairro);
        endereco2.setCidade(cidade);
        endereco2.setLogradouro("Rua Acácia");
        endereco2.setNumero(876);
        endereco2.setComplemento("Apto 999");

        Funcionario f1 = new Funcionario();
        f1.setMatricula(100);
        f1.setNome("Mauro");
        //f1.salario = -2200.0f;
        try {
            f1.setSalario(2000.0F);
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        f1.setDepartamento(d1);
        f1.setEndereco(endereco1);

        Funcionario f2 = new Funcionario();
        f2.setMatricula(101);
        f2.setNome("Maiara");
        try {
            f2.setSalario(-2500.0F);
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        f2.setDepartamento(d1);
        f2.setEndereco(endereco2);

        imprimir(f1);
        imprimir(f2);
//        System.out.println("Dados do " + f1.getNome());
//        System.out.println("Matricula...: " + f1.getMatricula());
//        System.out.println("Salario.....: " + f1.getSalario());
//        System.out.println("Departamento: " + f1.getDepartamento().getNome() + " - "
//                + f1.getDepartamento().getLocal());
//
//        System.out.println("Dados do " + f2.getNome());
//        System.out.println("Matricula...: " + f2.getMatricula());
//        System.out.println("Salario.....: " + f2.getSalario());
//        System.out.println("Departamento: " + f2.getDepartamento().getNome() + " - "
//                + f2.getDepartamento().getLocal());

        //o código abaixo é possível, 
        //mas não é uma boa prática...é P E R I G O S O
        //Porque as variáveis não possuem vínculo algum com o funcionário,
        //elas estão sendo tratadas isoladamente.
        System.out.println("Nome do funcionario: " + f1.getNome());
        System.out.println("Endereco: " + endereco1.getLogradouro());
        System.out.println("Cidade: " + cidade.getNome());
        System.out.println("Bairro: " + bairro.getNome());
        System.out.println("Depto: " + d1.getNome());

    }

    public static void imprimir(Funcionario f) {
        System.out.println("Dados do " + f.getNome());
        System.out.println("Matricula...: " + f.getMatricula());
        System.out.println("Salario.....: " + f.getSalario());
        System.out.println("Departamento: " + f.getDepartamento().getNome() + " - "
                + f.getDepartamento().getLocal());
        System.out.println("Endereco: " +
                f.getEndereco().getLogradouro() + " Cidade " + 
                f.getEndereco().getCidade().getNome() + " Bairro " +
                f.getEndereco().getBairro().getNome());
    }

}
