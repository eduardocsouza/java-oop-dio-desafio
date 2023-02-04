package br.com.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    };

    public void progredindo() {
        Optional<Conteudo> op = this.conteudoInscrito.stream().findFirst();
        if (op.isPresent()) {
            this.conteudoConcluido.add(op.get());
            this.conteudoInscrito.remove(op.get());
        } else {
            System.err.println("Você não está matriculado.");
        }
    };

    public Double calcularTotal() {
        return this.conteudoConcluido.stream().mapToDouble(conteudo -> conteudo.somaXP()).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getconteudoConcluido() {
        return conteudoConcluido;
    }

    public void setconteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((conteudoInscrito == null) ? 0 : conteudoInscrito.hashCode());
        result = prime * result + ((conteudoConcluido == null) ? 0 : conteudoConcluido.hashCode());
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
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (conteudoInscrito == null) {
            if (other.conteudoInscrito != null)
                return false;
        } else if (!conteudoInscrito.equals(other.conteudoInscrito))
            return false;
        if (conteudoConcluido == null) {
            if (other.conteudoConcluido != null)
                return false;
        } else if (!conteudoConcluido.equals(other.conteudoConcluido))
            return false;
        return true;
    };

}
