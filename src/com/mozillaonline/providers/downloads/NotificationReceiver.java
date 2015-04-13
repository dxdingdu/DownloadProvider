package com.mozillaonline.providers.downloads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.mozillaonline.providers.downloads.ui.DownloadList;

/**
 * 点击下载通知，打开下载列表 监听 DownloadManager.ACTION_NOTIFICATION_CLICKED 广播
 * 
 * @author Administrator
 * 
 */
public class NotificationReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent it = new Intent(context, DownloadList.class);
		it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(it);
	}

}
