package com.grameenphone.hello.Utils;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.grameenphone.hello.R;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * Created by HP on 7/7/2017.
 */

public class PopUp extends AppCompatActivity {
    File direct;
    ProgressDialog progressBar;

    private static final int PERMISSION_REQUEST_STORAGE = 1034;
    Bitmap bitmapreceived;
    private ImageView mDialog;
    String  photoUrl;
    private ProgressBar progressBar1;
    private Toolbar toolbar;
    String root_sd = Environment.getExternalStorageDirectory().toString();
    // Set the URL to download image
    String PhotoPictureDownLoadPath;
   private Bitmap bitmap;
    private Context mcontext;
    private String yesOrNo;
    File wallpaperDirectory;
    ArrayList<String> toBeScanned = new ArrayList<String>();
    public static void start(Context context) {
        Intent intent = new Intent(context, PopUp.class);

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        context.startActivity(intent);
    }
public PopUp()
{

}

    public PopUp(Context context){

        this.mcontext = context;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_dialog);

        progressBar1=(ProgressBar)findViewById(R.id.popuploader);


        Intent intent = getIntent();
mcontext=PopUp.this;



    // Glide.with(this).load(photoUrl).into(mDialog);

        //finish the activity (dismiss the image dialog) if the user clicks
        //anywhere on the image


    }







}