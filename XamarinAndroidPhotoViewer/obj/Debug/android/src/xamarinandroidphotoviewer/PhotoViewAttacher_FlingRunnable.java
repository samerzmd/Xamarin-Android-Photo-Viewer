package xamarinandroidphotoviewer;


public class PhotoViewAttacher_FlingRunnable
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XamarinAndroidPhotoViewer.PhotoViewAttacher/FlingRunnable, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PhotoViewAttacher_FlingRunnable.class, __md_methods);
	}


	public PhotoViewAttacher_FlingRunnable () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher_FlingRunnable.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher/FlingRunnable, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public PhotoViewAttacher_FlingRunnable (xamarinandroidphotoviewer.PhotoViewAttacher p0, android.content.Context p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher_FlingRunnable.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher/FlingRunnable, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "XamarinAndroidPhotoViewer.PhotoViewAttacher, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
