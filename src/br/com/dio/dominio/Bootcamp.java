package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dateInicial = LocalDate.now();
    private final LocalDate dateFinal = LocalDate.now().plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDateInicial() {
        return dateInicial;
    }
    public LocalDate getDateFinal() {
        return dateFinal;
    }
    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }
    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dateInicial == null) ? 0 : dateInicial.hashCode());
        result = prime * result + ((dateFinal == null) ? 0 : dateFinal.hashCode());
        result = prime * result + ((devInscritos == null) ? 0 : devInscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dateInicial == null) {
            if (other.dateInicial != null)
                return false;
        } else if (!dateInicial.equals(other.dateInicial))
            return false;
        if (dateFinal == null) {
            if (other.dateFinal != null)
                return false;
        } else if (!dateFinal.equals(other.dateFinal))
            return false;
        if (devInscritos == null) {
            if (other.devInscritos != null)
                return false;
        } else if (!devInscritos.equals(other.devInscritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

    
    
}
