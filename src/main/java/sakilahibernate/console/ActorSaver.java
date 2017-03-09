package sakilahibernate.console;

import java.util.Scanner;

import sakilahibernate.dao.ActorDAO;
import sakilahibernate.domain.Actor;


public class ActorSaver {
	
	public static void main(String[] args) {
		Actor bean = getActorData();
		ActorDAO dao = new ActorDAO();
		dao.save(bean);
		
		System.exit(0);
	}
	
	public static Actor getActorData(){
		Scanner scanner = new Scanner(System.in);
		Actor bean = new Actor();
		System.out.println("Inserire il nome dell'attore: ");
		String firstName = scanner.next();
		bean.setFirstName(firstName);
		System.out.println("Inserire il cognome dell'attore: ");
		String lastName = scanner.next();
		bean.setLastName(lastName);
		scanner.close();
		return bean;
	}
	
}
