package trabalhopoo3;
public class Canal {
    private int num;
    private String nome;
    private boolean HD = false;
    
    public Canal (int num , String nome, boolean HD){
        this.num = num;
        this.nome = nome;
        this.HD = HD;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isHD() {
        return HD;
    }

    public void setHD(boolean HD) {
        this.HD = HD;
    }
    
    
}
