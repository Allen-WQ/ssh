package ln.bookSystem.implAction;

import com.opensymphony.xwork2.ActionSupport;

import ln.bookSystem.action.Person;
import ln.bookSystem.service.ReaderService;

public class ReaderActionImpl extends ActionSupport implements Person{

	private ReaderService readerService;
	
	
	public ReaderService getReaderService() {
		return readerService;
	}

	public void setReaderService(ReaderService readerService) {
		this.readerService = readerService;
	}

	@Override
	public String add() throws Exception {
		System.out.println("执行action的add方法");
//		readerService.aspectFun("zhangsna",12);
		readerService.add();
		return null;
	}

	@Override
	public String deleteById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String adds() {
		// TODO Auto-generated method stub
		return null;
	}

	public String execute() {
		return null;
	}

	@Override
	public String getReaderByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
