public class Livro extends Produto{

    private String autor;

    public Livro(String descricao){
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao(){
        return this.descricao + this.autor;
    }

}
