package xamarinandroidphotoviewer;


public class DefaultOnDoubleTapListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.GestureDetector.OnDoubleTapListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onDoubleTap:(Landroid/view/MotionEvent;)Z:GetOnDoubleTap_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onDoubleTapEvent:(Landroid/view/MotionEvent;)Z:GetOnDoubleTapEvent_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z:GetOnSingleTapConfirmed_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XamarinAndroidPhotoViewer.DefaultOnDoubleTapListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DefaultOnDoubleTapListener.class, __md_methods);
	}


	public DefaultOnDoubleTapListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DefaultOnDoubleTapListener.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.DefaultOnDoubleTapListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public DefaultOnDoubleTapListener (xamarinandroidphotoviewer.PhotoViewAttacher p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == DefaultOnDoubleTapListener.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.DefaultOnDoubleTapListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "XamarinAndroidPhotoViewer.PhotoViewAttacher, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public boolean onDoubleTap (android.view.MotionEvent p0)
	{
		return n_onDoubleTap (p0);
	}

	private native boolean n_onDoubleTap (android.view.MotionEvent p0);


	public boolean onDoubleTapEvent (android.view.MotionEvent p0)
	{
		return n_onDoubleTapEvent (p0);
	}

	private native boolean n_onDoubleTapEvent (android.view.MotionEvent p0);


	public boolean onSingleTapConfirmed (android.view.MotionEvent p0)
	{
		return n_onSingleTapConfirmed (p0);
	}

	private native boolean n_onSingleTapConfirmed (android.view.MotionEvent p0);

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
