package Dimezis.BlurView;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;

public class NoOpBlurAlgorithm implements BlurAlgorithm{
    @Override
    public Bitmap blur(Bitmap bitmap, float blurRadius) {
        return bitmap;
    }

    @Override
    public void destroy() {
    }

    @Override
    public boolean canModifyBitmap() {
        return true;
    }

    @NonNull
    @Override
    public Bitmap.Config getSupportedBitmapConfig() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override
    public float scaleFactor() {
        return 1;
    }
}
