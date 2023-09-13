package com.example.toasty

import android.content.Context
import android.widget.Toast

public class SimpleToaster {

    companion object{
        fun showToast(context: Context,message:String){
          Toast.makeText(context,message,Toast.LENGTH_LONG).show()
        }
    }
}