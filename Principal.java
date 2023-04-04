public class Principal {
    
    public static void main(String[] args) {
        Filme f=new Filme();
        
        
        f.setCodigo(13);

        f.setValor(25);

        f.setNome("Whiplash");

        f.setDisponivel(true);
        if(f.isDisponivel()){
            System.out.println(" "+f.getCodigo());
        } else {
            System.out.println("Filme não disponível");
        }
    }
}
