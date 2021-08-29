/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

public class Agenda {
    //ATRIBUTOS

    private ArrayList<Contato> listaDeContato;

    //CONSTRUTOR
    public Agenda() {
        listaDeContato = new ArrayList<>();
    }

    public ArrayList<Contato> getListaDeContato() {
        return listaDeContato;
    }

    public int getTotContatos() {
        return listaDeContato.size();
    }

    public boolean adicionaContatos(Contato novoContato) {
        if (getContato(novoContato) == null) {
            listaDeContato.add(novoContato);
            return true;
        }//armazenado com sucesso
        else {
            return false;
        } //Contato já cadastrado
    }

    public Contato getContato(Contato contato) {
        for (int pos = 0; pos < listaDeContato.size(); pos++) {
            if (listaDeContato.get(pos).getNome().equals(contato.getNome())) {
                return listaDeContato.get(pos);
            }
        }
        return null;
    }

    public boolean alteraContatos(Contato novoContato) {
        if (novoContato != null) {
            Contato contato = getContato(novoContato);
            if (contato != null) {
                int pos = posContato(contato);
                if (pos != -1) {
                    listaDeContato.set(pos, novoContato);
                    return true;
                }
            }
        }
        return false;
    }

    public int posContato(Contato contato) {
        return listaDeContato.indexOf(contato);//-1 caso o contato não seja encontrado
    }

    public Contato getContato(int posicao) {
        return listaDeContato.get(posicao);
    }

    public int primeiro() {
        if (listaDeContato.size() > 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public int ultimo() {
        if (listaDeContato.size() > 0) {
            return listaDeContato.size() - 1;
        } else {
            return -1;
        }
    }

    public boolean removeContato(Contato contato) {
        boolean removeu = false;
        if (contato != null) {
            Contato contatoRemovido = getContato(contato);
            if (contatoRemovido != null) {
                removeu = listaDeContato.remove(contatoRemovido);
            }
        }
        return removeu;
    }

    public ArrayList<String[]> contatosToString() {
        ArrayList<String[]> contatos = new ArrayList<>();
        for (Contato contato : listaDeContato) {
            String tupla[] = {contato.getNome(), contato.getTelefone(), contato.getEmail()};
            contatos.add(tupla);
        }
        return contatos;
    }

}
