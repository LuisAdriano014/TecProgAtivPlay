package AtividadePlay;

public class PlayDoLuis extends Play{

		public void start() {

                        System.out.println("Tocando agora!");

		}

		public void stop() {

			System.out.println("Reprodução parada!");
			
		}

		public void next(int quantidade) {
			
                        System.out.println("Avançando para a próxima música!");
			
		}

		public void back(int quantidade) {
			
                        System.out.println("Voltando para a música anterior !");
			
		}

		public void pause() {

			System.out.println("Reprodução pausada!");
		
		}
		
		public String fabricante() {

			return "Alexa do Luis";

		}
	}
