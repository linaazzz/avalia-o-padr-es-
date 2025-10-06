class Curriculo implements Documento {
    private String conteudo;

    public Curriculo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Documento clonar() {
        try {
            return (Documento) super.clone();
        } catch(CloneNotSupportedException e) {
            return null;
        }
    }

    public void personalizar(String cliente) {
        this.conteudo += " - Personalizado para: " + cliente;
    }

    public void mostrar() {
        System.out.println(conteudo);
    }
}