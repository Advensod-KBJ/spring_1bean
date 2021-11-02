package day1;

public class Main {
	public static void main(String[] args) {
		BoardController controller = new BoardController();
		BoardService service = new BoardService();
		service.setDao(new BoardDao());
		controller.setService(service);
		controller.dataRead();
		
	}

}
