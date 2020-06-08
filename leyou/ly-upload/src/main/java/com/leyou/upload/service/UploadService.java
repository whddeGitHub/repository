package com.leyou.upload.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/6/8 21:54
 */
@Service
@Slf4j
public class UploadService {

    private static final List<String> ALLOW_TYPES = Arrays.asList("image/jpeg","image/png","image/bmp");
    public String uploadImage(MultipartFile file) {
        try {
            //校验文件类型
            String contentType = file.getContentType();
            if (!ALLOW_TYPES.contains(contentType)){
                throw new LyException(ExceptionEnum.INVALID_FILE_TYPE);
            }
            //校验文件的内容
            BufferedImage read = ImageIO.read(file.getInputStream());//使用ImageIO读取文件的流
            if (read == null){
                throw new LyException(ExceptionEnum.INVALID_FILE_TYPE);
            }
            //目标路径
            File dest = new File("D:/workspace/repository/repository",file.getOriginalFilename());
            //保存文件到本地
            file.transferTo(dest);
            //返回路径
            return "http://image.leyou.com" + file.getOriginalFilename();
        } catch (IOException e) {

            log.error("上传文件失败",e);
            throw new LyException(ExceptionEnum.FILE_UPLOAD_ERROR);
        }

    }
}
