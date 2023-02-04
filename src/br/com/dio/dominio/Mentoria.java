package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate date;

    public Mentoria(){};

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }   

    @Override
    public Double somaXP() {        
        return XP * 20d;
    };

     @Override
    public String toString() {
        return "Mentoria [date= " + date +" Titulo: " + getTitulo() + " Descrição: " + getDescricao() +" ]";
    }

    

}
