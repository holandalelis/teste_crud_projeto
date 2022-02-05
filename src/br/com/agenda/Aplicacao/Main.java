package br.com.agenda.Aplicacao;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        ContatoDAO contatoDAO = new ContatoDAO();
        Contato contato = new Contato();
        contato.setNome("Pedro Holanda");
        contato.setIdade(28);
        contato.setDataCadastro(new Date());
        contatoDAO.save(contato);

        Contato c1 = new Contato();
        c1.setNome("Pedro Holanda Lelis");
        c1.setIdade(29);
        c1.setDataCadastro(new Date());
        c1.setId(1);//numero do id utilizado no banco mysql para testar se estava funcionando
        contatoDAO.update(c1);

        contatoDAO.deleteByID(1);//numero do id utilizado no banco mysql para testar se estava funcionando

        for(Contato c : contatoDAO.getContatos()){
            System.out.println("Contato: " + c.getNome());
        }
    }
}
