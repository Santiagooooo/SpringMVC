package util;

import java.util.UUID;

public class UploadUtils {
    //为上传的文件命名一个唯一的名字
    public static String getUUIDName(String filename){
        int index = filename.lastIndexOf(".");
        //文件后缀
        String suffix = filename.substring(index);
        String uuid = UUID.randomUUID().toString();
        return uuid + suffix;
    }
}
