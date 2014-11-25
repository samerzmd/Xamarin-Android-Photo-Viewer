using System;
using Android.Content;

namespace XamarinAndroidPhotoViewer
{
	public class IcsScroller:GingerScroller
	{
		public IcsScroller(Context context):base(context) {

		}
		public override bool ComputeScrollOffset ()
		{
			return mScroller.ComputeScrollOffset();
		}
	}
}

