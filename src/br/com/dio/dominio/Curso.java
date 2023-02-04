package br.com.dio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){};

    public int getCurso(){
        return cargaHoraria;
    }

    public void SetCurso(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public Double somaXP() {
        return XP * cargaHoraria;
    };

     @Override
    public String toString() {
        return "Curso [cargaHoraria= " + cargaHoraria + " Titulo: " +  getTitulo() +" Descrição: "+  getDescricao() +" ]";
    }
}