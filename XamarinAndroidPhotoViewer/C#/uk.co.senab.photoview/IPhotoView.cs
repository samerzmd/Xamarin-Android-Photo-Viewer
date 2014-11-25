using System;
using Android.Graphics;
using Android.Widget;
using Android.Views;

namespace XamarinAndroidPhotoViewer
{
	public interface IPhotoView
	{

		bool CanZoom();


		RectF GetDisplayRect();

		bool SetDisplayMatrix(Matrix finalMatrix);

		Matrix GetDisplayMatrix();


		[Obsolete]
		float GetMinScale();


		float GetMinimumScale();


		[Obsolete]
		float GetMidScale();

		float GetMediumScale();


		[Obsolete]
		float GetMaxScale();


		float GetMaximumScale();


		float GetScale();


		ImageView.ScaleType GetScaleType();

		void SetAllowParentInterceptOnEdge(bool allow);

		[Obsolete]
		void SetMinScale(float minScale);

		void SetMinimumScale(float minimumScale);


		[Obsolete]
		void SetMidScale(float midScale);


		void SetMediumScale(float mediumScale);


		[Obsolete]
		void SetMaxScale(float maxScale);


		void SetMaximumScale(float maximumScale);

	
		void SetOnLongClickListener(Android.Views.View.IOnLongClickListener listener);


		void SetOnMatrixChangeListener(PhotoViewAttacher.IOnMatrixChangedListener listener);


		void SetOnPhotoTapListener(PhotoViewAttacher.IOnPhotoTapListener listener);


		PhotoViewAttacher.IOnPhotoTapListener GetOnPhotoTapListener();


		void SetOnViewTapListener(PhotoViewAttacher.IOnViewTapListener listener);


		void SetRotationTo(float rotationDegree);


		void SetRotationBy(float rotationDegree);

		PhotoViewAttacher.IOnViewTapListener GetOnViewTapListener();

		void SetScale(float scale);

	
		void SetScale(float scale, bool animate);

	
		void SetScale(float scale, float focalX, float focalY, bool animate);

		void SetScaleType(ImageView.ScaleType scaleType);

	
		void SetZoomable(bool zoomable);

	
		void SetPhotoViewRotation(float rotationDegree);

	
		Bitmap GetVisibleRectangleBitmap();

		void SetZoomTransitionDuration(int milliseconds);

	
		IPhotoView GetIPhotoViewImplementation();

	
		void SetOnDoubleTapListener(GestureDetector.IOnDoubleTapListener newOnDoubleTapListener);
	}
}

