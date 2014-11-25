using System;

namespace XamarinAndroidPhotoViewer
{
	public interface IOnGestureListener
	{
		void OnDrag(float dx, float dy);
		void OnFling(float startX, float startY, float velocityX,float velocityY);
		void OnScale(float scaleFactor, float focusX, float focusY);
	}
}

