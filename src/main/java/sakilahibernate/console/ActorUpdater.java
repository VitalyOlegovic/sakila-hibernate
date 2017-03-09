package sakilahibernate.console;

import java.util.Scanner;

import sakilahibernate.dao.ActorDAO;
import sakilahibernate.domain.Actor;

public class ActorUpdater {
	public static void main(String[] args) {
		Actor bean = getUpdateData();
		ActorDAO dao = new ActorDAO();
		dao.update(bean);
		
		System.exit(0);
	}
	
	private static Actor getUpdateData(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire l'identificativo dell'attore da aggiornare: ");
		short id = scanner.nextShort();
		Actor bean = ActorSaver.getActorData();
		scanner.close();
		bean.setActorId(id);
		return bean;
	}
}
