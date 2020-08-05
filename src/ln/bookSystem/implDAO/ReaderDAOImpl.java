package ln.bookSystem.implDAO;

import java.util.List;

import org.hibernate.SessionFactory;

import ln.bookSystem.DAO.ReaderDAO;
import ln.bookSystem.action.Person;

public class ReaderDAOImpl implements ReaderDAO{

	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateByIds(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePassword(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adds(List<Person> readers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getReaderByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
