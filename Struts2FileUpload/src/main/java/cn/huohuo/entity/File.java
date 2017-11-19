package cn.huohuo.entity;

/**
 * Created by lenovo on 2017/10/30.
 */
public class File {
    //具体上传文件的 引用 , 指向临时目录中的临时文件
    private File upload;
    //上传文件的类型， ContentType 固定的写法
    private String uploadContentType;
    // 上传文件的名字 ,FileName 固定的写法
    private String upoadFileName;
    //上传文件的路径
    private String savePath;

    public File getUpload() {
        return upload;
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
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }
}
