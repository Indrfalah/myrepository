import java.util.Scanner;

public class bubble{
	public static void main(String[] args){
		// instansiasi variabel scanner
		Scanner i = new Scanner(System.in);
		
		int[] angka = new int[10];
		for(int a = 0; a <= 9; a++){
			System.out.print("Masukan angka ke-"+(a+1)+" : ");
			angka[a] = i.nextInt();
		}

		for (int x = 0; x <= 8; x++) {
			for (int y = x+1; y<= 9; y++) {
				if(angka[x] > angka[y]){

					int temp = angka[x];
					angka[x] = angka[y];
					angka[y] = temp;

				}
			}
		}

		for (int t = 0;t < angka.length ; t++ ) {
			System.out.println("Angka ke-"+(t+1)+" : "+angka[t]);
		}
	}
	
}