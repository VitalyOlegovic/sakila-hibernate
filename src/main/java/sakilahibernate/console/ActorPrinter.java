package sakilahibernate.console;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sakilahibernate.dao.ActorDAO;
import sakilahibernate.domain.Actor;

public class ActorPrinter {

	private final static Logger logger = LoggerFactory.getLogger(ActorPrinter.class);
	
	public static void main(String[] args) {
		ActorDAO actorDAO = new ActorDAO();
		List<Actor> beans = actorDAO.getActorList();
		
		for( Actor bean : beans ){
			logger.info(bean.toString());
		}
		
		System.exit(0);
	}
	
}
