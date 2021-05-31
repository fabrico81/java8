package concurrency.controllinginterruption;

import java.io.File;

public class FileSearch implements Runnable{

    private String initPath;
    private String fileName;

    FileSearch(String initPath, String fileName) {
        this.fileName = fileName;
        this.initPath = initPath;
    }
    @Override
    public void run() {
        File file = new File(initPath);
        if (file.isDirectory()) {
            try {
                directoryProcess(file);
            } catch (InterruptedException ie) {
                System.out.printf("%s: The Thread hase been interrupted", Thread.currentThread().getName());
            }
        }
    }

    private void directoryProcess(File file) throws InterruptedException {
        File[] fileList = file.listFiles();
        if (fileList != null) {
            for (int i =0; i < fileList.length; i++) {
                if (fileList[i].isDirectory()){
                    directoryProcess(fileList[i]);
                } else {
                    processFile(fileList[i]);
                }
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    private void processFile(File file) throws InterruptedException {
        if (file.getName().equals(fileName)) {
            System.out.printf(
                    Thread.currentThread().getName() +
                    file.getAbsolutePath());
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }

    }
}
