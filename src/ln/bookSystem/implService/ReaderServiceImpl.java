package ln.bookSystem.implService;

import java.io.File;
import java.util.List;

import ln.bookSystem.DAO.ReaderDAO;
import ln.bookSystem.action.Person;
import ln.bookSystem.service.ReaderService;

public class ReaderServiceImpl implements ReaderService{

	
	private ReaderDAO readerDao;
	//测试aspect开始
	private String name="aaa";
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReaderDAO getReaderDao() {
		return readerDao;
	}

	public void setReaderDao(ReaderDAO readerDao) {
		this.readerDao = readerDao;
	}
	@Override
	public String aspectFun(String name,int age){
		System.out.println("执行service方法");
//		int[] lens=new int[2];
//		System.out.println(lens[3]);
		return "方法返回值";
	}
	//测试aspect开始结束
	@Override
	public void add() {
		System.out.println("执行service方法");
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
