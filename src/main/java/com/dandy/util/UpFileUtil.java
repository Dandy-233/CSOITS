package com.dandy.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 上传图片工具类
 * @author 李旦
 * @date 2020/3/2,11:13
 */
public class UpFileUtil {

    public static final String PRE = "/images/";

    public static final String DIR = "D:\\IDEAdata\\csoits\\src\\main\\resources\\static\\images";

    public static String getFile(MultipartFile multipartFile) {
        String oldName = multipartFile.getOriginalFilename();
        if (!"".equals(oldName) && oldName != null) {
            String rName = UUID.randomUUID().toString();
            String sufOldName = oldName.substring(oldName.lastIndexOf("."));
            String fileName = rName + sufOldName;
            File dirFile = new File(DIR);
            if (!dirFile.exists()) {
                dirFile.mkdir();
            }
            File newDirFile = new File(dirFile + "\\" + fileName);
            try {
                multipartFile.transferTo(newDirFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return PRE + fileName;
        } else {
            return null;
        }
    }
}
