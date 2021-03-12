package com.example.booksellinganimations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_book_img_splash_screen.*

class bookImgSplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_img_splash_screen)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN   // HERE TOOL BAR AND STATUS BAR IS GONE

        /***************************************************************************************************************************************/

                                            // splash screen book logo         (splash screen )


        ic_logo.startAnimation(AnimationUtils.loadAnimation(this , R.anim.splash_in))

        Handler().postDelayed(
            {
                ic_logo.startAnimation(AnimationUtils.loadAnimation(this , R.anim.splash_out))

                Handler().postDelayed(
                    {
                        ic_logo.visibility = View.GONE

                        startActivity(Intent(this , MainActivity :: class.java))

                        finish()

                    }, 500)

            }, 1500)

        /***************************************************************************************************************************************/

                                             // visionary ZoomIn amination         (splash screen )

        val visionaryZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        visionary.startAnimation(visionaryZoomIn)

        /***************************************************************************************************************************************/

                                               // visionary slide down                ( splash screen )

        val visionarySlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down)
        visionary.startAnimation(visionarySlideDown)

        /***************************************************************************************************************************************/

                                           // buy sell your book .. slide down animation (splash screen)

        val buySellSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down)
        buySell.startAnimation(buySellSlideDown)

        /***************************************************************************************************************************************/

                                 // if you want a animation in the list of books after clicking on the " view book "
                                // you can use following syntax :

        /**
         *      idViewAll.setOnClickListener {

                       IDRecyclerView.startLayoutAnimation()
                     }
         */

        /***************************************************************************************************************************************/

    }
}