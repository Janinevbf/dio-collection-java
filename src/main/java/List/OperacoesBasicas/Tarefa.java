package main.java.List.OperacoesBasicas;

public class Tarefa {

    //aatributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }
}
