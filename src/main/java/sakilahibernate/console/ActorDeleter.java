package sakilahibernate.console;

import java.util.Scanner;

import sakilahibernate.dao.ActorDAO;

public class ActorDeleter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire l'identificativo dell'attore da eliminare:");
		short id = scanner.nextShort();
		scanner.close();
		ActorDAO actorDAO = new ActorDAO();
		actorDAO.delete(id);
		
		System.exit(0);
	}
}
