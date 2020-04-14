package trabalhopoo3;
import static java.util.Collections.list;

public abstract class Televisao  {
    private String id;
    private int volume;
    private Canal canalAtual;
    private list<Canal>canaisCadastrados;
    private list<Canal>canaisDisponiveis;
    
    public Televisao(list<Canal> canaisDisponiveis) {
        this.canaisDisponiveis = canaisDisponiveis;
        this.volume = 5;
    }
    
    

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Canal getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(Canal canalAtual) {
        this.canalAtual = canalAtual;
    }
    
    public void alterarVolume(int n){
        int volMax = 10;
        int volMin = 0;
        if (n == 1){
            if (getVolume()==volMax){
                System.out.println("Já está no volume máximo.");
            }else {
                setVolume(getVolume()+1);
                System.out.println(getVolume()+" <- Volume");
            }
        }
        else if(n == 0){
            if(getVolume()==volMin){
                System.out.println("Já está no volume mínimo.");
            }else {
                setVolume(getVolume()-1);
                System.out.println(getVolume()+" <- volume");
            }
        }
        else {
                System.out.println("Para aumentar digite 1 e para diminuir digite 0.");
        }        
    }
    
    public abstract void cadastrarCanais();
    
    //Vou parar por aqui gabigol, Mano os atributos das listas e o construtor da classe televisão,
    //tu tem que dar uma olhada.

    public boolean verificarCanal(){
            
}
