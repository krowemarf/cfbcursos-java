public class Condicoes{
	public static void main(String[] args){
		String nome = "Mercy";
		
		switch (nome) {
			case "Mercy":
				System.out.printf("%s: Heroes never die!%n", nome);
				break;
			case "Pharah":
				System.out.printf("%s: The justice comes from above!%n", nome);
				break;
			case "Medic":
				System.out.printf("%s: The healing is as rewarding as the hurting!%n", nome);
				break;
			default:
				System.out.println("[ERROR] -- Unknown character.%n");
				break;
		}
		
		System.out.println("FIM DO PROGRAMA! :D");
	}
}
