package ln.bookSystem.DAO;

import java.util.List;

import ln.bookSystem.action.Person;

public interface ReaderDAO {

	public void add();
	public void deleteById(int id);
	public List<Person> showAll();
	public void updateById(int id);
	public void updateByIds(String ids);
	public void updatePassword(int id);
	public void adds(List<Person> readers);
	public Person getReaderByName(String name);
}
