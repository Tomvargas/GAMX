package com.example.gamx
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.TextClock
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException

class MainActivity : AppCompatActivity() {
    /* init open gallery option*/
    lateinit var mImageView : ImageView
    companion object{
        val SELECT_IMAGE_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* code init */
        /*Instance clock for activity main xml file*/
        findViewById<TextClock>(R.id.hora) as TextClock

        /*open gallery instance*/
        mImageView= findViewById(R.id.img1)
        }

    fun openG(v:View)
    {
        val intent = Intent()
        intent.type="image/*"
        intent.action= Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent,"Select Picture..."), SELECT_IMAGE_CODE)
    }

    override fun onActivityResult(requestCode: Int,resultCode: Int, data: Intent?){
        if(requestCode == SELECT_IMAGE_CODE && resultCode == Activity.RESULT_OK)
        {
            if(data != null){
                try{
                    val bitmap : Bitmap = MediaStore.Images.Media.getBitmap(application.contentResolver,data.data)
                    mImageView.setImageBitmap(bitmap)
                }
                catch(exp:IOException){
                    exp.printStackTrace()
                }
            }
        }
        else if(resultCode == Activity.RESULT_CANCELED){
            Toast.makeText(applicationContext,"Canceled",Toast.LENGTH_LONG).show()
        }
    }
}
