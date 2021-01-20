import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Towary.txt"))){

		for (int i = 0; i < 11000; i++) {
				writer.write(String.valueOf((int)(Math.random()*255)));
				writer.write(' ');
				writer.write(String.valueOf((int)(Math.random()*255)));
				writer.write('\n');

		}
		}catch (IOException e){
			e.printStackTrace();
		}
	}


}
