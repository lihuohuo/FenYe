package cn.huohuo.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by QiuShao on 2017/10/25.
 */
public class FileDownAction extends ActionSupport {
    //文件路径
    private String inputPath;
    //提交过来的name
    private String fileName;

    private InputStream inputStream;
    //提交过来的file的MIME类型
    private String contentType;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //返回inputstream，文件下载关键方法
    public InputStream getInputStream() throws Exception {
        String path= ServletActionContext.getServletContext().getRealPath(inputPath);
        return new BufferedInputStream(new FileInputStream(path+"\\"+fileName));
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

}
