using System;

using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Graphics;
using Android.Graphics.Drawables;
using Java.IO;

namespace XamarinAndroidPhotoViewer
{
	[Activity (Label = "XamarinAndroidPhotoViewer", MainLauncher = true, Icon = "@drawable/icon")]
	public class MainActivity : Activity
	{
		static readonly String PHOTO_TAP_TOAST_STRING = "Photo Tap! X: %.2f %% Y:%.2f %% ID: %d";
		static readonly String SCALE_TOAST_STRING = "Scaled to: %.2ff";

		private TextView mCurrMatrixTv;

		private PhotoViewAttacher mAttacher;

		private Toast mCurrentToast;

		private Matrix mCurrentDisplayMatrix = null;

		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Main);
			PhotoView mImageView = FindViewById<PhotoView>(Resource.Id.iv_photo);
			mCurrMatrixTv = FindViewById<TextView>(Resource.Id.tv_current_matrix);

			Drawable bitmap = Resources.GetDrawable(Resource.Drawable.wallpaper);
			mImageView.SetImageDrawable(bitmap);

			// The MAGIC happens here!
			mAttacher = new PhotoViewAttacher(mImageView);

			// Lets attach some listeners, not required though!
			mAttacher.SetOnMatrixChangeListener(new MatrixChangeListener(this));
			mAttacher.SetOnPhotoTapListener(new PhotoTapListener(this));
		}

		public override bool OnCreateOptionsMenu (IMenu menu)
		{
			MenuInflater.Inflate (Resource.Menu.main_menu, menu);
			return base.OnCreateOptionsMenu (menu);
		}

		protected override void OnDestroy ()
		{
			base.OnDestroy ();
			// Need to call clean-up
			mAttacher.Cleanup();
		}
		public override bool OnPrepareOptionsMenu (IMenu menu)
		{
			IMenuItem zoomToggle = menu.FindItem(Resource.Id.menu_zoom_toggle);
			zoomToggle.SetTitle(mAttacher.CanZoom() ? "menu_zoom_disable" : "menu_zoom_enable");

			return base.OnPrepareOptionsMenu (menu);
		}
		public override bool OnOptionsItemSelected (IMenuItem item)
		{
			switch (item.ItemId) {
			case Resource.Id.menu_zoom_toggle:
				mAttacher.SetZoomable(!mAttacher.CanZoom());
				return true;

			case Resource.Id.menu_scale_fit_center:
				mAttacher.SetScaleType(Android.Widget.ImageView.ScaleType.FitCenter);
				return true;

			case Resource.Id.menu_scale_fit_start:
				mAttacher.SetScaleType(Android.Widget.ImageView.ScaleType.FitStart);
				return true;

			case Resource.Id.menu_scale_fit_end:
				mAttacher.SetScaleType(Android.Widget.ImageView.ScaleType.FitEnd);
				return true;

			case Resource.Id.menu_scale_fit_xy:
				mAttacher.SetScaleType(Android.Widget.ImageView.ScaleType.FitXy);
				return true;

			case Resource.Id.menu_scale_scale_center:
				mAttacher.SetScaleType(Android.Widget.ImageView.ScaleType.Center);
				return true;

			case Resource.Id.menu_scale_scale_center_crop:
				mAttacher.SetScaleType(Android.Widget.ImageView.ScaleType.CenterCrop);
				return true;

			case Resource.Id.menu_scale_scale_center_inside:
				mAttacher.SetScaleType(Android.Widget.ImageView.ScaleType.CenterInside);
				return true;

			case Resource.Id.menu_scale_random_animate:
			case Resource.Id.menu_scale_random:
				Random r = new Random();

				float minScale = mAttacher.GetMinimumScale();
				float maxScale = mAttacher.GetMaximumScale();
				float randomScale = minScale + (float.Parse(r.NextDouble().ToString()) * (maxScale - minScale));
				mAttacher.SetScale(randomScale, item.ItemId == Resource.Id.menu_scale_random_animate);

				ShowToast(SCALE_TOAST_STRING+" "+randomScale);

				return true;
			case Resource.Id.menu_matrix_restore:
				if (mCurrentDisplayMatrix == null)
					ShowToast("You need to capture display matrix first");
				else
					mAttacher.SetDisplayMatrix(mCurrentDisplayMatrix);
				return true;
			case Resource.Id.menu_matrix_capture:
				mCurrentDisplayMatrix = mAttacher.GetDisplayMatrix();
				return true;
			case Resource.Id.extract_visible_bitmap:
				return true;
			}
			return base.OnOptionsItemSelected (item);
		}
		private class MatrixChangeListener:XamarinAndroidPhotoViewer.PhotoViewAttacher.IOnMatrixChangedListener
		{
			MainActivity context;
			#region IOnMatrixChangedListener implementation
			public MatrixChangeListener(MainActivity context)
			{
				this.context=context;
			}
			public void OnMatrixChanged (RectF rect)
			{
				context.mCurrMatrixTv.Text=(rect.ToString());
			}

			#endregion


		}
		private class PhotoTapListener : XamarinAndroidPhotoViewer.PhotoViewAttacher.IOnPhotoTapListener {
			MainActivity context;
			#region IOnPhotoTapListener implementation
			public PhotoTapListener(MainActivity context){
				this.context=context;
			}
			public void OnPhotoTap (View view, float x, float y)
			{
				float xPercentage = x * 100f;
				float yPercentage = y * 100f;

				context.ShowToast(PHOTO_TAP_TOAST_STRING+" "+ xPercentage+" "+yPercentage+" "+ view == null ? "0" : view.Id.ToString());
			}

			#endregion

		}
		public void ShowToast(String text) {
			if (null != mCurrentToast) {
				mCurrentToast.Cancel();
			}

			mCurrentToast = Toast.MakeText(this, text, ToastLength.Short);
			mCurrentToast.Show();
		}
	}
}


