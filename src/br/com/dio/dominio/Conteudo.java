package br.com.dio.dominio;

public abstract class Conteudo {

    protected static final double XP = 10d;

    private String titulo;
    private String descricao;


    public abstract Double somaXP();

    public Conteudo(){}

    public static double getXp() {
        return XP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    };

    
    
}
