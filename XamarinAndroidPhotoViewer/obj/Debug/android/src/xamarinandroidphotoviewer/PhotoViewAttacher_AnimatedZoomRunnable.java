package xamarinandroidphotoviewer;


public class PhotoViewAttacher_AnimatedZoomRunnable
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
		mono.android.Runtime.register ("XamarinAndroidPhotoViewer.PhotoViewAttacher/AnimatedZoomRunnable, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PhotoViewAttacher_AnimatedZoomRunnable.class, __md_methods);
	}


	public PhotoViewAttacher_AnimatedZoomRunnable () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher_AnimatedZoomRunnable.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher/AnimatedZoomRunnable, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public PhotoViewAttacher_AnimatedZoomRunnable (xamarinandroidphotoviewer.PhotoViewAttacher p0, float p1, float p2, float p3, float p4) throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher_AnimatedZoomRunnable.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher/AnimatedZoomRunnable, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "XamarinAndroidPhotoViewer.PhotoViewAttacher, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:System.Single, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Single, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Single, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Single, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
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
