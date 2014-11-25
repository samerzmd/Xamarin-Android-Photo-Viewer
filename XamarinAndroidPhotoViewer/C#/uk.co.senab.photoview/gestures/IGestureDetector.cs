using System;
using Android.Views;

namespace XamarinAndroidPhotoViewer
{
	public interface IGestureDetector
	{
		 bool OnTouchEvent(MotionEvent ev);

		 bool IsScaling();

		 void SetOnGestureListener(IOnGestureListener listener);
	}
}

