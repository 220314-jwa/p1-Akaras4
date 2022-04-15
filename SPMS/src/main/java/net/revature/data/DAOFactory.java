package net.revature.data;

public class DAOFactory {
	private static PersonDAO personDAO = null;
	
	
	public static PersonDAO getPersonDAO() {
		if (personDAO == null)
			personDAO = new PersonPostgres();
		return personDAO;
	}

}
