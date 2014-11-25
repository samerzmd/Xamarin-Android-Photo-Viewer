package xamarinandroidphotoviewer;


public class FroyoGestureDetector_OnScaleGestureListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ScaleGestureDetector.OnScaleGestureListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onScale:(Landroid/view/ScaleGestureDetector;)Z:GetOnScale_Landroid_view_ScaleGestureDetector_Handler:Android.Views.ScaleGestureDetector/IOnScaleGestureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onScaleBegin:(Landroid/view/ScaleGestureDetector;)Z:GetOnScaleBegin_Landroid_view_ScaleGestureDetector_Handler:Android.Views.ScaleGestureDetector/IOnScaleGestureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onScaleEnd:(Landroid/view/ScaleGestureDetector;)V:GetOnScaleEnd_Landroid_view_ScaleGestureDetector_Handler:Android.Views.ScaleGestureDetector/IOnScaleGestureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XamarinAndroidPhotoViewer.FroyoGestureDetector/OnScaleGestureListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FroyoGestureDetector_OnScaleGestureListener.class, __md_methods);
	}


	public FroyoGestureDetector_OnScaleGestureListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == FroyoGestureDetector_OnScaleGestureListener.class)
			mono.android.TypeManager.Activate ("XamarinAndroidPhotoViewer.FroyoGestureDetector/OnScaleGestureListener, XamarinAndroidPhotoViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onScale (android.view.ScaleGestureDetector p0)
	{
		return n_onScale (p0);
	}

	private native boolean n_onScale (android.view.ScaleGestureDetector p0);


	public boolean onScaleBegin (android.view.ScaleGestureDetector p0)
	{
		return n_onScaleBegin (p0);
	}

	private native boolean n_onScaleBegin (android.view.ScaleGestureDetector p0);


	public void onScaleEnd (android.view.ScaleGestureDetector p0)
	{
		n_onScaleEnd (p0);
	}

	private native void n_onScaleEnd (android.view.ScaleGestureDetector p0);

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
