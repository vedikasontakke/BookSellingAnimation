package com.example.booksellinganimations

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.transition.Transition
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_to_activity_animation.*


/**
 * for going fom one activity to another
 * or activity ot fragmanet
 *  eg. when you click on the one item of the book then it gieves the book detalis and sellers deltais
 *
 */

class ActivityToActivityAnimation : AppCompatActivity() {

    private lateinit var scene1: Scene
    private lateinit var scene2: Scene
    private lateinit var currentScene: Scene
    private lateinit var transition: Transition

    @RequiresApi(Build.VERSION_CODES.KITKAT)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_activity_animation)

        // Step 1: Create a Scene object for both the starting and ending layout
        scene1 = Scene.getSceneForLayout(sceneRootFrameLayout, R.layout.scene1, this)

        scene2 = Scene.getSceneForLayout(sceneRootFrameLayout, R.layout.scean2, this)

        scene1.enter()
        currentScene = scene1

        // Step 2: Create a Transition object to define what type of animation you want

        /**
         * if you want to try other animations then you can take the example 1 ,2 ,3 ,4 from res -> transistion -> example 1 ,2 ,3 4,
         * on the linw 50 .. same activity
         */

        transition = TransitionInflater.from(this ).inflateTransition(R.transition.example_4)

    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun onClick(view: View)
    {
        // Step 3: Call TransitionManager.go() to run animation

        if(currentScene == scene1)
        {
            TransitionManager.go(scene2 , transition)
            currentScene = scene2
        }
        else
        {
            TransitionManager.go(scene1 , transition)
            currentScene = scene1
        }

    }

}
