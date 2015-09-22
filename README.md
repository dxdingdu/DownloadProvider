This project ports the DownloadProvider of Android 2.3.7. It supports Android 2.2 and above. 

It is standard Eclipse project, which could be open by Eclipse with the Andoird Development Tools.

To illustrate how to use it, I also provide a simple demo.

1. com.mozillaonline.downloadprovider
A simple demo shows how to schedule a download and list all downloads.

2. com.mozillaonline.providers
The package of the Android DownloadProvider. I modified the original code to let it work without root permission. 
I also remove redundant code respective to RM, MediaScanner and system caches.

"com.mozillaonline.providers.DownloadManager", as name suggests, is where you manage the downloads. 
Most of work could be done with this class. For convenience, I add methods of pausing and resuming a download.

3. Remarks
com.mozillaonline.providers.downloads.Downloads.AUTHORITY defines the authority of the DownloadProvider. 
Change the authority both in the code and the AndroidManifest.xml file to avoid conflict with other applicaitons.

4. License
Apache License, Version 2.0 
