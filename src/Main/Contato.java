/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


public class Contato implements Comparable<Contato> {

    //ATRIBUTOS

    private String nome, telefone, e_mail;

    public Contato() {
    }

    public Contato(String nome, String telefone, String e_mail) {
        this.nome = nome;
        this.telefone = telefone;
        this.e_mail = e_mail;
    }

    public Contato(String nome) {
        this.nome = nome;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return e_mail;
    }

    public void setEmail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int compareTo(Contato outroContato) {
        if (this.getNome().compareTo(outroContato.getNome()) < 0) {
            return -1;
        } else if (this.getNome().compareTo(outroContato.getNome()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
