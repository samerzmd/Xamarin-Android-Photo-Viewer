package xamarinandroidphotoviewer;


public class PhotoViewAttacher_MSimpleOnGestureListener
	extends android.view.GestureDetector.SimpleOnGestureListener
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onLongPress:(Landroid/view/MotionEvent;)V:GetOnLongPress_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("XamarinAndroidPhotoViewer.PhotoViewAttacher/MSimpleOnGestureListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PhotoViewAttacher_MSimpleOnGestureListener.class, __md_methods);
	}


	public PhotoViewAttacher_MSimpleOnGestureListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher_MSimpleOnGestureListener.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher/MSimpleOnGestureListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public PhotoViewAttacher_MSimpleOnGestureListener (xamarinandroidphotoviewer.PhotoViewAttacher p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher_MSimpleOnGestureListener.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher/MSimpleOnGestureListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "XamarinAndroidPhotoViewer.PhotoViewAttacher, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onLongPress (android.view.MotionEvent p0)
	{
		n_onLongPress (p0);
	}

	private native void n_onLongPress (android.view.MotionEvent p0);

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
