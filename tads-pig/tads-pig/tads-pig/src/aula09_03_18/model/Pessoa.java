package aula09_03_18.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javafx.scene.input.KeyCode;

public class Pessoa {

    private String nome;
    private String cpf;
    private char sexo;
    private Calendar nascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, char sexo, Calendar nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(nascimento.getTime());
  
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public long getIdade(){
        Calendar hoje=Calendar.getInstance();
        
        //long milis=hoje.getTimeInMillis()-nascimento.getTimeInMillis();
        //long idade = milis/(86400000*365);
        
        SimpleDateFormat formatador=new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(formatador.format(hoje.getTime()));
        
        System.out.println(formatador.format(nascimento.getTime()));
        
        long ano1=nascimento.get(Calendar.YEAR);
        long ano2=hoje.get(Calendar.YEAR);
        int  idade = (int) (ano2 - ano1);
        System.out.println(ano2-ano1);
        
        return idade; 
    }

    public void setNascimento(Date dataSimples) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
