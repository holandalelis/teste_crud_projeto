package br.com.agenda.Aplicacao;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        ContatoDAO contatoDAO = new ContatoDAO();
        Contato contato = new Contato();
        contato.setNome("Luciano Filho");
        contato.setIdade(28);
        contato.setDataCadastro(new Date());
        contatoDAO.save(contato);
        for(Contato c : contatoDAO.getContatos()){
            System.out.println("Contato: " + c.getNome());
        }
    }
}
