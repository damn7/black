package org.wizindia.black.jpa;

import org.springframework.web.multipart.MultipartFile;
import org.wizindia.black.common.Configs;

import java.util.List;

/**
 * Created by nischal.k on 07/12/15.
 */
public class LocalFileSystem implements FileSystem {
    @Override
    public String save(String path, MultipartFile file) {
        return null;
    }

    @Override
    public List<MultipartFile> get(String path, boolean isOnlyFileNameRequired) {
        return null;
    }

    @Override
    public int delete(String path) {
        return 0;
    }

    @Override
    public boolean rename(String path) {
        return false;
    }

    @Override
    public boolean move(String currentPath, String destination) {
        return false;
    }

    @Override
    public String getFileSavePath(String context, String filePath) {
        return Configs.primaryPath + context.replace(",", "/") + filePath;
    }

    @Override
    public String getDownloadLink(String fileName) {
        return null;
    }
}
