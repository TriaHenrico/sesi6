import java.io.*;

public class TryCatchException {
	static BufferedReader input = new BufferedReader ( new InputStreamReader(System.in));
	public static void main(String[] args) {
		try {
			System.out.println("Choose one of the options, (1-3) " + "\n\t1.) Steak " + "\n\t2.) Lobster" + "\n\t3.) CheeseBurger ");
			System.out.println("MAsukkan pilihan anda : ");
			String choose = input.readLine();
			if(choose.equals("1")){
				System.out.println("Anda memilih steak :-)");
			}
			else if(choose.equals("2")) {
				System.out.println("Anda memilih lobster :-)");
			}
			else if(choose.equals("3")) {
				System.out.println("Anda memilih cheese burger :-)");
			}
			else {
				throw new Exception("Pilihan anda tidak ada");
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
	}
