package com.app.godphotos;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class ViewActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imageView;
    FloatingActionMenu floatingActionMenu;
    FloatingActionButton btn_set,btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        floatingActionMenu = findViewById(R.id.floatingActionMenu);

        btn_set = findViewById(R.id.setWallpaper);
        btn_share = findViewById(R.id.shareWallpaper);


        btn_set.setOnClickListener(this);
        btn_share.setOnClickListener(this);

        imageView = findViewById(R.id.fullImage);

        Picasso.get().load(getIntent().getStringExtra("images")).into(imageView);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.setWallpaper:

                setBackground();
                floatingActionMenu.close(true);
                break;

            case R.id.shareWallpaper:
                shareImage();
                floatingActionMenu.close(true);
                break;

        }

    }

    private void shareImage() {
        Bitmap bitmap = getBitmapFromView(imageView);
        try {
            File file = new File(this.getExternalCacheDir(), "black.png");
            FileOutputStream fOut = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,fOut);
            fOut.flush();
            fOut.close();
            file.setReadable(true,false);
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(Intent.EXTRA_STREAM, FileProvider.getUriForFile(ViewActivity.this, BuildConfig.APPLICATION_ID + ".provider",file));
            intent.setType("image/*");
            startActivity(Intent.createChooser(intent,"Share Image Via"));
            Toast.makeText(this, "Share Wallpaper", Toast.LENGTH_SHORT).show();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    private Bitmap  getBitmapFromView(@NotNull View view) {

        Bitmap returnBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(returnBitmap);
        Drawable bgDrawable = view.getBackground();

        if (bgDrawable !=null)
        {
            bgDrawable.draw(canvas);
        }
        else {
            canvas.drawColor(Color.WHITE);
        }

        view.draw(canvas);
        return returnBitmap;
    }

    private void setBackground()
    {
        Bitmap bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());

        try {
            manager.setBitmap(bitmap);
            Toast.makeText(this, "Set Wallpaper Successfully", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, "Something Went Wrong.", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }
}
