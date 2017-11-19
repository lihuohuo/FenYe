package cn.huohuo.action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/**
 * Created by lenovo on 2017/10/30.
 */
public class FileUploadAction extends ActionSupport {
    private File upload;
    //上传文件的类型， ContentType 固定的写法
    private String uploadContentType;
    // 上传文件的名字 ,FileName 固定的写法
    private String upoadFileName;
    //上传文件的路径
    private String savePath;

    public String ex() throws Exception {
        byte[] buffer = new byte[1024];
        FileInputStream fis = new FileInputStream(getUpload());
        FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + getUpoadFileName());
        int length = -fis.read(buffer);
        while (length > 0) {
            fos.write(buffer, 0, length);
            length = fis.read(buffer);
        }
        fos.flush();
        fis.close();
        fos.close();
        return SUCCESS;


    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUpoadFileName() {
        return upoadFileName;
    }

    public void setUpoadFileName(String upoadFileName) {
        this.upoadFileName = upoadFileName;
    }

    public String getSavePath() {
        return ServletActionContext.getServletContext().getRealPath(savePath);
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public File getUpload() {
        return upload;
    }


}
