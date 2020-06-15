package ln.struts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUp extends ActionSupport{

	private String title;
	private String UploadContentType;
	private File upload;
	private String uploadFileName;
	private String savePath;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUploadContentType() {
		return UploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		UploadContentType = uploadContentType;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	public String execute() {
		System.out.println("文件上传");
			FileOutputStream out=null;
			FileInputStream read=null;
			if(getUpload()!=null&&getUploadFileName()!=null) {
			try {
				out =new FileOutputStream(new File("E:/test/"+getUploadFileName()));
				read=new FileInputStream(upload);
				int len;
				byte[] b=new byte[1024];
				while((len=read.read(b))!=-1) {
					out.write(b);
					out.flush();
				}
			} catch (IOException e) {
				return "error";
			}finally {
				if(out!=null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(read!=null) {
					try {
						read.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			return "success";
		}else {
			return "error";
		}
	}
}
