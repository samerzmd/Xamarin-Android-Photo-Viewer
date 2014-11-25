package xamarinandroidphotoviewer;


public class PhotoViewAttacher
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnTouchListener,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnTouch_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnTouchListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XamarinAndroidPhotoViewer.PhotoViewAttacher, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PhotoViewAttacher.class, __md_methods);
	}


	public PhotoViewAttacher () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public PhotoViewAttacher (android.widget.ImageView p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == PhotoViewAttacher.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.PhotoViewAttacher, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Widget.ImageView, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public boolean onTouch (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onTouch (p0, p1);
	}

	private native boolean n_onTouch (android.view.View p0, android.view.MotionEvent p1);


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

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
