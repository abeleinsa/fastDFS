package com.abelein;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;

public class FSFSTest {

    public static void main(String[] args) {
        TrackerServer trackerServer=null;
        TrackerClient trackerClient=null;
        StorageServer storageServer=null;
        StorageClient storageClient=null;

        try {
            ClientGlobal.init("client.conf");

            trackerClient = new TrackerClient();

            trackerServer = trackerClient.getConnection();

            storageClient = new StorageClient(trackerServer,storageServer);

            String[] jpgs = storageClient.upload_file("E:\\3 图片\\桌面壁纸\\computer-wallpaper-1080p-1920x1200.jpg", "jpg", null);
            for (String jpg : jpgs) {
                System.out.println(jpg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
