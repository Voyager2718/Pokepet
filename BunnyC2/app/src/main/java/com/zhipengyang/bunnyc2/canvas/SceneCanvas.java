package com.zhipengyang.bunnyc2.canvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import com.zhipengyang.bunnyc2.R;

import java.util.ArrayList;
import java.util.List;

public class SceneCanvas extends View {
    List<Bitmap> bitmaps = new ArrayList<Bitmap>();

    public SceneCanvas(Context context) {
        super(context);
        init();
    }

    public SceneCanvas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.c2));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.LTGRAY);
        canvas.drawBitmap(bitmaps.get(0), canvas.getWidth() / 2, 0, null);
    }
}