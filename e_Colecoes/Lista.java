package e_Colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Mia"));
		
		System.out.println(lista.get(1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
