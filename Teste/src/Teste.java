import java.util.Observable;
import java.util.Observer;

public class Teste implements Observer {
	
	static Conexao c;
	
	public static void main(String[] args) {
		c = new Conexao("192.168.0.", 5000);
	}
	
	@Override
    public void update(Observable o, Object arg) {
        System.out.println(c.getMensagem());
    }
}
