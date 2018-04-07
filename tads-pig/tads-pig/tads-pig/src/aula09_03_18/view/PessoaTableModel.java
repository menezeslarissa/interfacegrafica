/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_03_18.view;

import aula09_03_18.model.Pessoa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laris
 */
class PessoaTableModel extends AbstractTableModel {

    //mesma referência
    private List<Pessoa> pessoas;

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    PessoaTableModel(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int getRowCount() {
        return pessoas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int coluna) {
        switch (coluna) {
            case 0:
                return "Nome";
            case 1:
                return "Idade";
            case 2:
                return "Sexo";
        }
        return null;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        //obtem o objeto da linha
        Pessoa pessoa = pessoas.get(linha);

        switch (coluna) {
            case 0:

                return pessoa.getNome();
            case 1:
                return pessoa.getNascimento();
            case 2:
                return pessoa.getSexo();

        }
        return null;
    }
}
//para cada chamada do getValueAt vai retornar o valor da linha e da coluna
//linha representa objeto
//
