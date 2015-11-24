package com.example.natashaszulzik.trabalho02_dm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by natashaszulzik on 11/24/15.
 */
public class GameScene extends View {

    Paint paint;
    public GameScene(Context context) {
        super(context);
        paint = new Paint();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(Color.rgb(220, 220, 220));

        for(int i = 0; i <= canvas.getHeight(); i+=10){
            canvas.drawLine(i,0,i,canvas.getHeight(),paint);
            canvas.drawLine(0,i,canvas.getWidth(),i,paint);
        }


        //canvas.drawPaint(paint);

        paint.setColor(Color.BLUE);
        canvas.drawRect(200, 50, 300, 70, paint);


        //Escrever texto
        paint.setColor(Color.BLACK);
        paint.setTextSize(100);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("teste de texto",canvas.getWidth()/2,50,paint);
        //final ImageView character = (ImageView) findViewById(R.id.character);
        //Drawable d = getResources().getDrawable(R.drawable.tile,null);
        //d.setBounds(left, top, right, bottom);

        //Draw bitmap
        Resources res = getResources();
        Bitmap bitmap = BitmapFactory.decodeResource(res, R.drawable.tile);
        canvas.drawBitmap(bitmap, 0, 0, paint);

    }
}
