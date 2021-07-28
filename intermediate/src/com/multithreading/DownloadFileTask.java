package com.multithreading;

public class DownloadFileTask implements Runnable {
	private DownloadStatus status;
public DownloadStatus getStatus() {
	return status;
}
	public DownloadFileTask() {
		this.status = new DownloadStatus();
	}

	@Override
	public void run() {
		System.out.println("Downloading a File" + Thread.currentThread().getName());
		for (int i = 0; i < 10_000; i++) {
			if (Thread.currentThread().isInterrupted())
				return;
			status.incrementTotalBytes();
		}
		//System.out.println("process complete" + Thread.currentThread().getName());

	}

}
