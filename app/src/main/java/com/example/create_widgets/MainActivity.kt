package com.example.create_widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// right click on com.example.create_widgets and click on new
// and click on widgets option and add app widgets.
// now it will build gradle again.
//xml and .kt file for widgets will be autogenerated
// in drawable the picture for widgets is autogenerated in
// appwidgets.png folder.
// in res/xml folder there we can change updation time and other xml files
// linked with that folder.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
